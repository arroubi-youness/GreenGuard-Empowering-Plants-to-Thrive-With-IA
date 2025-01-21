package Controllers;
import Services.*;
import Models.*;
import Views.AddPlantPanel;
import Views.Dashboard;
import Views.Home_logged_In;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
public class Home_logged_InController {

          public void AddEevents(Home_logged_In homeLoggedInController){

              homeLoggedInController.dashbord.addMouseListener(new MouseAdapter() {





                  @Override
                  public void mouseClicked(MouseEvent e) {

                                MainController.showDashboard();

                          }
                      });

          }


}
