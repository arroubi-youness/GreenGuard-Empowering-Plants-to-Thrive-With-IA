package Controllers;
import Services.*;
import Models.*;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;


public class PlantController {
    private PlantServices plantServices =new PlantServices();


    public plants Save_new_plant_Controller(int  user_Id,String  NamePlant, int Spices_id, String Last_water_Date, String last_feltrizing){


        try{
           return plantServices.Add_new_Palnt(user_Id,NamePlant,Spices_id,Last_water_Date,Last_water_Date);

        }catch (SQLException e){

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error during Saving plant ", "Error", JOptionPane.ERROR_MESSAGE);

        }

        return null;
    }




    public List<plants> Get_All_Controller(){


        try{
            return plantServices.GetAllPlants();

        }catch (SQLException e){

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error during retrieving all plant ", "Error", JOptionPane.ERROR_MESSAGE);

        }

        return null;
    }



    public plants Find_by_name(String plantName){

        try{
            plants plant= plantServices.findPlantByName(plantName);
            if (plant == null){
                JOptionPane.showMessageDialog(null, "Error during searching plant ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            return  plant;
        }catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error during Saving plant ", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }


    public boolean Delete_Plant(int IdPalnt){

        boolean IsDeleted=false;

        try{
              IsDeleted= plantServices.deletePlantById(IdPalnt);
            if (IsDeleted == true){
                JOptionPane.showMessageDialog(null, "Plant deleted ! ", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "Error during deleting plant  ", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("error during deleting"+e);
            JOptionPane.showMessageDialog(null, "Error during Saving plant ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return  IsDeleted;

    }

}

