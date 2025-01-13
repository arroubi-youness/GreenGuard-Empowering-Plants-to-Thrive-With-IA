package Views;

import Utils.RoundedBorder;
import Utils.RoundedButton;
import Utils.RoundedButton_normal;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Login {
    private JPanel mainPanel;
    private JLabel welcomeTitle, username, password, forgetPassword, imageInLogin, greenLogo, whiteLogo, description, create;
    private JTextField email;
    private JPasswordField passwordField;
    public RoundedButton_normal signInButton;
    private RoundedButton signUpButton;

    public Login(JPanel panel) {
        this.mainPanel = panel;

        mainPanel.setBounds(64, 70, 850, 560);
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(null);

        // Initialize components
        welcomeTitle = new JLabel("Welcome back !");
        welcomeTitle.setFont(new Font("Arial", Font.BOLD, 26));
        welcomeTitle.setForeground(new Color(98, 183, 54, 255));
        welcomeTitle.setBounds(520, 180, 200, 30);

        username = new JLabel("Email address:");
        username.setFont(new Font("Arial", Font.PLAIN, 14));
        username.setForeground(new Color(170, 169, 174, 255));
        username.setBounds(470, 240, 100, 30);

        email = new JTextField();
        email.setBounds(470, 275, 310, 40);
        Border customBorder = new RoundedBorder(Color.GRAY, 25, 2);
        email.setBorder(customBorder);
        email.setFont(new Font("Arial", Font.PLAIN, 14));
        email.setBackground(Color.WHITE);

        password = new JLabel("Password:");
        password.setFont(new Font("Arial", Font.PLAIN, 14));
        password.setForeground(new Color(170, 169, 174, 255));
        password.setBounds(470, 325, 100, 30);

        passwordField = new JPasswordField();
        passwordField.setBounds(470, 360, 310, 40);
        passwordField.setBorder(customBorder);

        forgetPassword = new JLabel("Forget Password");
        forgetPassword.setFont(new Font("Arial", Font.BOLD, 12));
        forgetPassword.setForeground(new Color(98, 183, 54, 255));
        forgetPassword.setBounds(675, 400, 100, 30);

        signInButton = new RoundedButton_normal("Sign In");
        signInButton.setFont(new Font("Arial", Font.BOLD, 15));
        signInButton.setForeground(Color.WHITE);
        signInButton.setBackground(new Color(98, 183, 54, 255));
        signInButton.setBounds(470, 440, 310, 40);

        signUpButton = new RoundedButton("Get Plan");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 16));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(new Color(0, 0, 0, 0));
        signUpButton.setBounds(60, 380, 250, 40);

        imageInLogin = new JLabel();
        ImageIcon imageIcon = new ImageIcon("back_plant/adrian-swancar-Y8W7j4ETCsc-unsplash.jpg");
        Image resizedImage = imageIcon.getImage().getScaledInstance(390, 560, Image.SCALE_SMOOTH);
        imageInLogin.setIcon(new ImageIcon(resizedImage));
        imageInLogin.setBounds(0, 0, 390, 560);

        greenLogo = new JLabel();
        ImageIcon imageIconLogoGreen = new ImageIcon("back_plant/greenn_logo_png.png");
        Image resizedImageGreen = imageIconLogoGreen.getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH);
        greenLogo.setIcon(new ImageIcon(resizedImageGreen));
        greenLogo.setBounds(765, 10, 75, 100);

        description = new JLabel("<html>GreenGuard is an innovative plant care app that combines technology<br> with nature to ensure your plants thrive, flourish, grow and rise it</html>");
        description.setForeground(Color.white);
        description.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        description.setBounds(28, 220, 360, 150);

        create = new JLabel("Choose your Plan!");
        create.setForeground(Color.white);
        create.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        create.setBounds(110, 275, 360, 150);

         mainPanel.add(welcomeTitle);
        mainPanel.add(signUpButton);
        mainPanel.add(greenLogo);
        mainPanel.add(description);
        mainPanel.add(username);
        mainPanel.add(email);
        mainPanel.add(password);
        mainPanel.add(passwordField);
        mainPanel.add(forgetPassword);
        mainPanel.add(signInButton);
        mainPanel.add(imageInLogin);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public String getEmail() {
        return email.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }


    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setTitle("Login and Sign-Up Example");
        myFrame.setSize(1000, 730);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.getContentPane().setBackground(new Color(50, 76, 49, 255));

        JPanel mainPanel = new JPanel();
        Login loginSignUp = new Login(mainPanel);

        myFrame.add(loginSignUp.getMainPanel());
        myFrame.setVisible(true);
    }
}
