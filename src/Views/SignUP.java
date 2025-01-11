package Views;

import Utils.RoundedBorder;
import Utils.RoundedButton;
import Utils.RoundedButton_normal;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SignUP {

     private JPanel mainPanel;

    public SignUP(JPanel panel) {
        this.mainPanel = panel;

        mainPanel.setBounds(64, 70, 850, 560);
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(null);
        //define components
        JLabel welcome_title = new JLabel("Welcome !");
        welcome_title.setFont(new Font("Arial", Font.BOLD, 26));
        welcome_title.setForeground(new Color(98, 183, 54, 255));
        welcome_title.setBounds(158, 100, 200, 30);


        JLabel username =new JLabel("Username:");
        username.setFont(new Font("Arial",Font.BOLD , 14));
        username.setForeground(new Color(170,169,174,255));
        username.setBounds(72,143,100,30);







        JTextField username_input = new JTextField();
        username_input.setBounds(70, 175, 315, 40);

        Border customBorder = new RoundedBorder(Color.GRAY, 25, 2);//(intesrface can not  be instantiate so for that we   instatiate with that class RoundedBorder  that extends  drom abstractborder that impolemts the interface )
        username_input.setBorder(customBorder);

        username_input.setFont(new Font("Arial", Font.PLAIN, 14));
        username_input.setBackground(Color.WHITE);




        JLabel email =new JLabel("Email:");
        email.setFont(new Font("Arial",Font.BOLD , 14));
        email.setForeground(new Color(170,169,174,255));
        email.setBounds(72,223,100,30);


/// ///////email field
        JTextField email_input = new JTextField();
        email_input.setBounds(70, 255, 315, 40);
        email_input.setBorder(customBorder);
        email_input.setFont(new Font("Arial", Font.PLAIN, 14));
        email_input.setBackground(Color.WHITE);


        //password

        JLabel password =new JLabel("Password:");
        password.setFont(new Font("Arial",Font.BOLD , 14));
        password.setForeground(new Color(170,169,174,255));
        password.setBounds(72,303,100,30);



        JTextField password_input = new JTextField();
        password_input.setBounds(70, 335, 315, 40);
        password_input.setBorder(customBorder);
        password_input.setFont(new Font("Arial", Font.PLAIN, 14));
        password_input.setBackground(Color.WHITE);

        JLabel password_confirm =new JLabel("Confirm Password:");
        password_confirm.setFont(new Font("Arial",Font.BOLD , 14));
        password_confirm.setForeground(new Color(170,169,174,255));
        password_confirm.setBounds(72,383,200,30);



        JTextField password_input_confirm = new JTextField();
        password_input_confirm.setBounds(70, 415, 315, 40);
        password_input_confirm.setBorder(customBorder);
        password_input_confirm.setFont(new Font("Arial", Font.PLAIN, 14));
        password_input_confirm.setBackground(Color.WHITE);









       /// //////sign up
        RoundedButton_normal sign_up = new RoundedButton_normal("Sign Up");
        sign_up.setFont(new Font("Arial", Font.BOLD, 15));
        sign_up.setForeground(Color.WHITE);
        sign_up.setBackground(new Color(98, 183, 54, 255));
        sign_up.setBounds(70, 495, 316, 40);


        RoundedButton login = new RoundedButton("Log In");
        login.setFont(new Font("Arial", Font.BOLD, 16));
        login.setForeground(Color.WHITE);
        login.setBackground(new Color(0, 0, 0, 0));
        login.setBounds(535, 340, 250, 40);




        //add image
        JLabel image_in_login = new JLabel();
        ImageIcon imageIcon = new ImageIcon("back_plant/adrian-swancar-Y8W7j4ETCsc-unsplash.jpg");


        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(390, 560, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        image_in_login.setIcon(resizedIcon);
        image_in_login.setBounds(460, 0, 390, 560);


        //green log
        JLabel greenLogo = new JLabel();
        ImageIcon imageIconLogoGreen = new ImageIcon("back_plant/greenn_logo_png.png");


        Image imageGreen = imageIconLogoGreen.getImage();
        Image resizedImageGreen = imageGreen.getScaledInstance(75, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIconGreen = new ImageIcon(resizedImageGreen);

        greenLogo.setIcon(resizedIconGreen);
        greenLogo.setBounds(2, 7, 75, 100);

        //white logo
//        JLabel whiteLogo = new JLabel();
//        ImageIcon imageIconLogoWhite = new ImageIcon("back_plant/aaaaaaaa.png");
//
//
//        Image imageWHite = imageIconLogoWhite.getImage();
//        Image resizedImageWhite = imageWHite.getScaledInstance(220, 210, Image.SCALE_SMOOTH);
//        ImageIcon resizedIconWhite = new ImageIcon(resizedImageWhite);
//
//        whiteLogo.setIcon(resizedIconWhite);
//        whiteLogo.setBounds(90, 160, 220, 210);


        JLabel descripption =new JLabel("<html>Join us today and unlock exclusive features or log in if you have  one ! </html>");
        descripption.setForeground(Color.white);
        descripption.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        descripption.setBounds(485,200,355,150);



        JCheckBox check =new JCheckBox("I accecpt terms & conditions ");
        check.setFont(new Font("Arial",Font.BOLD , 12));
        check.setForeground(new Color(98, 183, 54, 255));
         check.setOpaque(false);
        check.setFocusPainted(false);

        check.setBounds(72,465,200,20);

        //add to panel
        mainPanel.add(welcome_title);
        mainPanel.add(password_confirm);
        mainPanel.add(greenLogo);
        mainPanel.add(login);
        mainPanel.add(descripption);
        mainPanel.add(username_input);
        mainPanel.add(password_input);
        mainPanel.add(username);
        mainPanel.add(email);
        mainPanel.add(check);

        mainPanel.add(password);
        mainPanel.add(password_input_confirm);
        mainPanel.add(email_input);
        mainPanel.add(sign_up);
        mainPanel.add(image_in_login);


    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame myframe = new JFrame();
        myframe.setTitle(" Sign-Up");
        myframe.setSize(1000, 730);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setLayout(null);
        myframe.getContentPane().setBackground(new Color(50,76,49,255));
        JPanel mainPanel = new JPanel();

        SignUP  loginSignUp = new SignUP (mainPanel);

        myframe.add(loginSignUp.getMainPanel());

        myframe.setVisible(true);
    }

}
