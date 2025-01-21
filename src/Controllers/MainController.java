package Controllers;

import Views.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Utils.static_plan_var;
public class MainController {

     private static JFrame myFrame;


    public MainController(JFrame frame) {
        this.myFrame = frame;

        myFrame.setTitle("Login and Sign-Up ");
        myFrame.setSize(1000, 730);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.getContentPane().setBackground(new Color(50, 76, 49, 255));


        SignUP signUpPanel = new SignUP(new JPanel());
        Login loginPanel = new Login(new JPanel());
        Home homePage=new Home();

        JScrollPane home_scroll=homePage.getMainPanelScroll();
        JPanel mainSignUpPanel = signUpPanel.getMainPanel();
        JPanel mainLoginPanel = loginPanel.getMainPanel();






/// ///
        UserController userController = new UserController();
        userController.SignUpController(signUpPanel);
        userController.LoginController(loginPanel);




        myFrame.add(home_scroll);

        signUpPanel.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.getContentPane().removeAll();
                myFrame.add(mainLoginPanel);
                myFrame.revalidate();
                myFrame.repaint();
            }
        });
        homePage.log_in.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.getContentPane().removeAll();
                myFrame.add(mainLoginPanel);
                myFrame.revalidate();
                myFrame.repaint();
            }
        });


        homePage.getStartFreeBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.getContentPane().removeAll();
                myFrame.add(mainSignUpPanel);
                 static_plan_var.var=1;
                myFrame.revalidate();
                myFrame.repaint();
            }
        });

        homePage.getStartpremuimBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.getContentPane().removeAll();
                myFrame.add(mainSignUpPanel);
                static_plan_var.var=2;
                myFrame.revalidate();
                myFrame.repaint();
            }
        });

        homePage.getStartgoldBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.getContentPane().removeAll();
                myFrame.add(mainSignUpPanel);
                static_plan_var.var=3;

                myFrame.revalidate();
                myFrame.repaint();
            }
        });





        myFrame.setVisible(true);

     }
    public static void Logged_in_home() {
         myFrame.getContentPane().removeAll();
        Home_logged_In homeLoggedIn =new Home_logged_In();
        Home_logged_InController homeLoggedInController =new Home_logged_InController();
        homeLoggedInController.AddEevents(homeLoggedIn);
        JScrollPane DE=homeLoggedIn.getMainPanelScroll();
        myFrame.add(DE);
        myFrame.revalidate();
        myFrame.repaint();
    }
    public static void showDashboard() {
        myFrame.getContentPane().removeAll();
        Dashboard dashboard = new Dashboard();
        JPanel dash = dashboard.GetDashboardPanel();
        PlantController plantController=new PlantController();
        plantController.Dashboard(dashboard);
         myFrame.add(dash);

        myFrame.revalidate();
        myFrame.repaint();
    }


     }

