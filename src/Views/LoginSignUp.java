package Views;

import Utils.RoundedBorder;
import Utils.RoundedButton;
import Utils.RoundedButton_normal;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.*;
import java.awt.*;

public class LoginSignUp {
    private JPanel mainPanel;

    public LoginSignUp(JPanel panel) {
        this.mainPanel = panel;

        mainPanel.setBounds(64, 70, 850, 560);
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(null);
        //define components
        JLabel welcome_title = new JLabel("Welcome back !");
        welcome_title.setFont(new Font("Arial", Font.BOLD, 26));
        welcome_title.setForeground(new Color(98, 183, 54, 255));
        welcome_title.setBounds(520, 180, 200, 30);

        Border eroundedBorder = new LineBorder(Color.GRAY, 2, true);

        JLabel username =new JLabel("Email address:");
        username.setFont(new Font("Arial",Font.PLAIN , 14));
        username.setForeground(new Color(170,169,174,255));
         username.setBounds(470,240,100,30);

//        username.setBorder(eroundedBorder);






        JTextField email = new JTextField();
        email.setBounds(470, 275, 310, 40);

        Border customBorder = new RoundedBorder(Color.GRAY, 25, 2);//(intesrface can not  be instantiate so for that we   instatiate with that class RoundedBorder  that extends  drom abstractborder that impolemts the interface )
        email.setBorder(customBorder);

        email.setFont(new Font("Arial", Font.PLAIN, 14));
        email.setBackground(Color.WHITE);




        JLabel password =new JLabel("Password:");
        password.setFont(new Font("Arial",Font.PLAIN , 14));
        password.setForeground(new Color(170,169,174,255));
         password.setBounds(470,325,100,30);
        //password
        JPasswordField pasword =new JPasswordField();
        pasword.setBounds(470, 360, 310, 40);
        pasword.setBorder(customBorder);

        JLabel forget_password =new JLabel("Forget Password");
        forget_password.setFont(new Font("Arial",Font.BOLD , 12));
        forget_password.setForeground(new Color(98, 183, 54, 255));
        forget_password.setBounds(675,400,100,30);








        RoundedButton_normal sign_in = new RoundedButton_normal("Sign In");
        sign_in.setFont(new Font("Arial", Font.BOLD, 15));
        sign_in.setForeground(Color.WHITE);
        sign_in.setBackground(new Color(98, 183, 54, 255));
        sign_in.setBounds(470, 440, 310, 40);


        RoundedButton signup = new RoundedButton("Get Plan");
        signup.setFont(new Font("Arial", Font.BOLD, 16));
        signup.setForeground(Color.WHITE);
        signup.setBackground(new Color(0, 0, 0, 0));
         signup.setBounds(60, 390, 250, 40);




        //add image
        JLabel image_in_login = new JLabel();
        ImageIcon imageIcon = new ImageIcon("back_plant/adrian-swancar-Y8W7j4ETCsc-unsplash.jpg");


        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(390, 560, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        image_in_login.setIcon(resizedIcon);
        image_in_login.setBounds(0, 0, 390, 560);


        //green log
        JLabel greenLogo = new JLabel();
        ImageIcon imageIconLogoGreen = new ImageIcon("back_plant/greenn_logo_png.png");


        Image imageGreen = imageIconLogoGreen.getImage();
        Image resizedImageGreen = imageGreen.getScaledInstance(75, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIconGreen = new ImageIcon(resizedImageGreen);

        greenLogo.setIcon(resizedIconGreen);
        greenLogo.setBounds(765, 10, 75, 100);

        //white logo
        JLabel whiteLogo = new JLabel();
        ImageIcon imageIconLogoWhite = new ImageIcon("back_plant/aaaaaaaa.png");


        Image imageWHite = imageIconLogoWhite.getImage();
        Image resizedImageWhite = imageWHite.getScaledInstance(220, 210, Image.SCALE_SMOOTH);
        ImageIcon resizedIconWhite = new ImageIcon(resizedImageWhite);

        whiteLogo.setIcon(resizedIconWhite);
        whiteLogo.setBounds(90, 160, 220, 210);


        JLabel descripption =new JLabel("<html>GreenGuard is an innovative plant care app that  combines technology\n with nature to ensure your\n plants    thrive, flourish, grow and rise .</html>");
        descripption.setForeground(Color.white);
        descripption.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        descripption.setBounds(28,190,360,150);

        JLabel create= new JLabel("Choose your Plan!");
        create.setForeground(Color.white);
        create.setFont(new Font("Arial", Font.BOLD, 15));
        create.setBounds(113,297,360,150);

        //add to panel
        mainPanel.add(welcome_title);
        mainPanel.add(signup);
        mainPanel.add(greenLogo);
        mainPanel.add(descripption);
//        mainPanel.add(whiteLogo);
        mainPanel.add(create);
        mainPanel.add(username);
        mainPanel.add(email);
        mainPanel.add(password);
        mainPanel.add(pasword);
        mainPanel.add(forget_password);
        mainPanel.add(sign_in);
        mainPanel.add(image_in_login);


    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame myframe = new JFrame();
        myframe.setTitle("Login and Sign-Up Example");
        myframe.setSize(1000, 730);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setLayout(null);
        myframe.getContentPane().setBackground(new Color(50,76,49,255));
        JPanel mainPanel = new JPanel();

        LoginSignUp loginSignUp = new LoginSignUp(mainPanel);

        myframe.add(loginSignUp.getMainPanel());

        myframe.setVisible(true);
    }
}