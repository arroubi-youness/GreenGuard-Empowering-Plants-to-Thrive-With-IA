package Controllers;

import Views.Login;
import Views.SignUP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {

    private JFrame myFrame;


    public MainController(JFrame frame) {
        this.myFrame = frame;

        myFrame.setTitle("Login and Sign-Up ");
        myFrame.setSize(1000, 730);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.getContentPane().setBackground(new Color(50, 76, 49, 255));


        SignUP signUpPanel = new SignUP(new JPanel());
        Login loginPanel = new Login(new JPanel());

        JPanel mainSignUpPanel = signUpPanel.getMainPanel();
        JPanel mainLoginPanel = loginPanel.getMainPanel();



        UserController userController = new UserController();
        userController.SignUpController(signUpPanel);
        userController.LoginController(loginPanel);

        myFrame.add(mainSignUpPanel);

        signUpPanel.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.getContentPane().removeAll();
                myFrame.add(mainLoginPanel);
                myFrame.revalidate();
                myFrame.repaint();
            }
        });

        myFrame.setVisible(true);

     }
     }

