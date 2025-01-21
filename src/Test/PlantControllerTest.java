package Test;

import Controllers.UserController;
import Models.plants;
import org.junit.jupiter.api.Test;

import Controllers.PlantController;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlantControllerTest {

//    @Test
//    void Save_new_() {
//        try {
//            PlantController a=new PlantController();
//            a.Save_new_plant_Controller(2,"wargiya",2,"2025-01-06","2024-01-03",);
//        } catch (Exception e) {
//            fail("An exception occurred: " + e.getMessage());
//        }
//
//
//
//    }
    @Test
    void getallplants(){
        try {
            PlantController a=new PlantController();
            List<plants> all=a.Get_All_Controller();

            for (plants plant : all) {
                System.out.println("Plant ID: " + plant.getPlant_id());
                System.out.println("User ID: " + plant.getUser_id());
                System.out.println("Plant Name: " + plant.getPlant_name());
                System.out.println("Species ID: " + plant.getSpecies_id());
                System.out.println("Last Watered Date: " + plant.getLast_watered_date());
                System.out.println("Last Fertilizing Date: " + plant.getLast_fertilizing_date());
                System.out.println("----------------------------");
            }

        } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }

    }

    @Test
    void FindByName(){
        try {
            PlantController a=new PlantController();
            plants plant=a.Find_by_name("wargiya");
            System.out.println("Plant ID: " + plant.getPlant_id());
            System.out.println("User ID: " + plant.getUser_id());
            System.out.println("Plant Name: " + plant.getPlant_name());
            System.out.println("Species ID: " + plant.getSpecies_id());
            System.out.println("Last Watered Date: " + plant.getLast_watered_date());
            System.out.println("Last Fertilizing Date: " + plant.getLast_fertilizing_date());
            System.out.println("----------------------------");


        } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }
    }


    @Test
    void DeletePlant(){
        try {
            PlantController a=new PlantController();
            a.Delete_Plant(1);
         } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }
    }

}