package Services;
import  Models.*;
import DAOs.*;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


public class PlantServices {

    private PlantDAO plant_Dao=new PlantDAO();

     public  plants  Add_new_Palnt(int  user_Id,String  NamePlant, int Spices_id, String Last_water_Date, String last_feltrizing) throws SQLIntegrityConstraintViolationException {

         try{

             plants Plant_item=new plants(-1,user_Id,NamePlant,Spices_id,Last_water_Date,last_feltrizing);
             return plant_Dao.AddPlant(Plant_item);
         }catch (SQLIntegrityConstraintViolationException e){

             throw new SQLIntegrityConstraintViolationException("error during saving plant"+e);

         }catch (Exception e) {
             System.err.println("Unexpected error during saving the sub in  service section: " + e.getMessage());

         }

         return  null;
     }

    public List<plants> GetAllPlants() throws SQLException {
        List<plants> plantList = null;

        try {
             plantList = plant_Dao.GetAllPlants();

        } catch (SQLException e) {
            System.err.println("Error retrieving plants from database: " + e.getMessage());
        }

        return plantList;
    }

    public plants findPlantByName(String plantName) throws SQLException {
        try {
             plants plant = plant_Dao.FindPlantByName(plantName);

            if (plant != null) {
                System.out.println("Plant found: " + plant.getPlant_name());
                return plant;
            } else {
                System.out.println("Plant with name '" + plantName + "' not found.");
                return null;
            }

        } catch (Exception e) {
            System.err.println("Error in service while finding plant: " + e.getMessage());
            throw new SQLException("error during search plant by  name",e);
        }
    }

    public boolean deletePlantById(int plantId) throws SQLException{
        try {
             boolean isDeleted = plant_Dao.DeletePlantById(plantId);
             return isDeleted;

        } catch (Exception e) {
            System.err.println("Error in service while deleting plant: " + e.getMessage());
            throw new SQLException("error during deleting plant by  Id",e);

         }

    }
}
