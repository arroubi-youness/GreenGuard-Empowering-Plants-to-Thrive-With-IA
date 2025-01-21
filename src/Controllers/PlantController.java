package Controllers;
import Services.*;
import Models.*;
import Views.AddPlantPanel;
import Views.Dashboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;


public class PlantController {
    private PlantServices plantServices =new PlantServices();


    public plants Save_new_plant_Controller(int  user_Id,String  NamePlant, int Spices_id, String Last_water_Date, String last_feltrizing,byte[] image){


        try{
           return plantServices.Add_new_Palnt(user_Id,NamePlant,Spices_id,Last_water_Date,last_feltrizing,image);

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




    /// ////////front Ineraction
    ///
    ///
    ///
    ///

    public void Dashboard(Dashboard dashboard_panel) {
        dashboard_panel.Overview.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (dashboard_panel.activeLabel != dashboard_panel.Overview) {
                    dashboard_panel.setActiveStyle(dashboard_panel.Overview);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (dashboard_panel.activeLabel != dashboard_panel.Overview) {
                    dashboard_panel.setDefaultStyle(dashboard_panel.Overview);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (dashboard_panel.activeLabel != null) {
                    dashboard_panel.setDefaultStyle(dashboard_panel.activeLabel);
                }
                dashboard_panel.activeLabel = dashboard_panel.Overview;
                dashboard_panel.setActiveStyle(dashboard_panel.Overview);
            }
        });

        dashboard_panel.Add_Plants.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (dashboard_panel.activeLabel != dashboard_panel.Add_Plants) {
                    dashboard_panel.setActiveStyle(dashboard_panel.Add_Plants);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (dashboard_panel.activeLabel != dashboard_panel.Add_Plants) {
                    dashboard_panel.setDefaultStyle(dashboard_panel.Add_Plants);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (dashboard_panel.activeLabel != null) {
                    dashboard_panel.setDefaultStyle(dashboard_panel.activeLabel);
                }
                dashboard_panel.activeLabel = dashboard_panel.Add_Plants;
                dashboard_panel.setActiveStyle(dashboard_panel.Add_Plants);


                //manage the palnt controller Content  in  dashbord
                dashboard_panel.Content_dashboard.removeAll();


                AddPlantPanel addPlantPanel = new AddPlantPanel();
                addPlantPanel.Add_button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Integer spices = Integer.valueOf(addPlantPanel.hiddenValue);
                        Save_new_plant_Controller(UserController.userId,addPlantPanel.Name_plant.getText(),spices,addPlantPanel.last_watred.getText(),addPlantPanel.last_feltrizing.getText(),addPlantPanel.fileBytes);
                        JOptionPane.showMessageDialog(null, "Plant Added Successfully!");
                        addPlantPanel.Name_plant.setText("");
                        addPlantPanel.last_watred.setText("");
                        addPlantPanel.last_feltrizing.setText("");



                    }
                });

                dashboard_panel.Content_dashboard.add(addPlantPanel.AddPlantPanel);


                dashboard_panel.Content_dashboard.revalidate();
                dashboard_panel.Content_dashboard.repaint();
            }
        });

        dashboard_panel.All_Plants.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (dashboard_panel.activeLabel != dashboard_panel.All_Plants) {
                    dashboard_panel.setActiveStyle(dashboard_panel.All_Plants);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (dashboard_panel.activeLabel != dashboard_panel.All_Plants) {
                    dashboard_panel.setDefaultStyle(dashboard_panel.All_Plants);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (dashboard_panel.activeLabel != null) {
                    dashboard_panel.setDefaultStyle(dashboard_panel.activeLabel);
                }
                dashboard_panel.activeLabel = dashboard_panel.All_Plants;
                dashboard_panel.setActiveStyle(dashboard_panel.All_Plants);
            }
        });

        dashboard_panel.Health_tracking.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (dashboard_panel.activeLabel != dashboard_panel.Health_tracking) {
                    dashboard_panel.setActiveStyle(dashboard_panel.Health_tracking);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (dashboard_panel.activeLabel != dashboard_panel.Health_tracking) {
                    dashboard_panel.setDefaultStyle(dashboard_panel.Health_tracking);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (dashboard_panel.activeLabel != null) {
                    dashboard_panel.setDefaultStyle(dashboard_panel.activeLabel);
                }
                dashboard_panel.activeLabel = dashboard_panel.Health_tracking;
                dashboard_panel.setActiveStyle(dashboard_panel.Health_tracking);
            }
        });
    }

}

