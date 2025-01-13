package Views;

import Utils.RoundedBorder;
import Utils.RoundedButton;
import Utils.RoundedButton_normal;

import javax.swing.*;
import java.awt.*;

public class SignUP {

    private JPanel mainPanel;

    private JLabel welcomeTitle;
    private JLabel usernameLabel, emailLabel, passwordLabel, confirmPasswordLabel;
    private JTextField usernameInput, emailInput;
    private JPasswordField passwordInput, confirmPasswordInput;
    public RoundedButton_normal signUpButton;
    public RoundedButton loginButton;
    public JCheckBox termsCheckbox;
    private JLabel imageLabel, greenLogo, descriptionLabel;

    public SignUP(JPanel panel) {
        this.mainPanel = panel;

        mainPanel.setBounds(64, 70, 850, 560);
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(null);

        // Initialize components
        welcomeTitle = new JLabel("Welcome !");
        welcomeTitle.setFont(new Font("Arial", Font.BOLD, 26));
        welcomeTitle.setForeground(new Color(98, 183, 54, 255));
        welcomeTitle.setBounds(158, 100, 200, 30);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        usernameLabel.setForeground(new Color(170, 169, 174, 255));
        usernameLabel.setBounds(72, 143, 100, 30);

        usernameInput = new JTextField();
        usernameInput.setBounds(70, 175, 315, 40);
        usernameInput.setBorder(new RoundedBorder(Color.GRAY, 25, 2));
        usernameInput.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameInput.setBackground(Color.WHITE);

        emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 14));
        emailLabel.setForeground(new Color(170, 169, 174, 255));
        emailLabel.setBounds(72, 223, 100, 30);

        emailInput = new JTextField();
        emailInput.setBounds(70, 255, 315, 40);
        emailInput.setBorder(new RoundedBorder(Color.GRAY, 25, 2));
        emailInput.setFont(new Font("Arial", Font.PLAIN, 14));
        emailInput.setBackground(Color.WHITE);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));
        passwordLabel.setForeground(new Color(170, 169, 174, 255));
        passwordLabel.setBounds(72, 303, 100, 30);

        passwordInput = new JPasswordField();
        passwordInput.setBounds(70, 335, 315, 40);
        passwordInput.setBorder(new RoundedBorder(Color.GRAY, 25, 2));
        passwordInput.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordInput.setBackground(Color.WHITE);

        confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setFont(new Font("Arial", Font.BOLD, 14));
        confirmPasswordLabel.setForeground(new Color(170, 169, 174, 255));
        confirmPasswordLabel.setBounds(72, 383, 200, 30);

        confirmPasswordInput = new JPasswordField();
        confirmPasswordInput.setBounds(70, 415, 315, 40);
        confirmPasswordInput.setBorder(new RoundedBorder(Color.GRAY, 25, 2));
        confirmPasswordInput.setFont(new Font("Arial", Font.PLAIN, 14));
        confirmPasswordInput.setBackground(Color.WHITE);

        termsCheckbox = new JCheckBox("I accept terms & conditions");
        termsCheckbox.setFont(new Font("Arial", Font.BOLD, 12));
        termsCheckbox.setForeground(new Color(98, 183, 54, 255));
        termsCheckbox.setOpaque(false);
        termsCheckbox.setFocusPainted(false);
        termsCheckbox.setBounds(72, 465, 200, 20);

        signUpButton = new RoundedButton_normal("Sign Up");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 15));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(new Color(98, 183, 54, 255));
        signUpButton.setBounds(70, 495, 316, 40);

        loginButton = new RoundedButton("Log In");
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0, 0, 0, 0));
        loginButton.setBounds(535, 340, 250, 40);

        imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("back_plant/adrian-swancar-Y8W7j4ETCsc-unsplash.jpg");
        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(390, 560, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(resizedImage));
        imageLabel.setBounds(460, 0, 390, 560);

        greenLogo = new JLabel();
        ImageIcon logoIcon = new ImageIcon("back_plant/greenn_logo_png.png");
        Image logoImage = logoIcon.getImage();
        Image resizedLogo = logoImage.getScaledInstance(75, 100, Image.SCALE_SMOOTH);
        greenLogo.setIcon(new ImageIcon(resizedLogo));
        greenLogo.setBounds(2, 7, 75, 100);

        descriptionLabel = new JLabel("<html>Join us today and unlock exclusive features or log in if you have one!</html>");
        descriptionLabel.setForeground(Color.WHITE);
        descriptionLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
        descriptionLabel.setBounds(485, 200, 355, 150);
        mainPanel.add(descriptionLabel);

        mainPanel.add(welcomeTitle);
        mainPanel.add(usernameLabel);
        mainPanel.add(usernameInput);
        mainPanel.add(emailLabel);
        mainPanel.add(emailInput);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordInput);
        mainPanel.add(confirmPasswordLabel);
        mainPanel.add(confirmPasswordInput);
        mainPanel.add(termsCheckbox);
        mainPanel.add(signUpButton);
        mainPanel.add(loginButton);
        mainPanel.add(imageLabel);
        mainPanel.add(greenLogo);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
    public String getUsernameInput(){
        return usernameInput.getText();
    }
    public String getEmailInput(){
        return emailInput.getText();
    }
    public  String getPasswordfield(){
        return new String(passwordInput.getPassword());

    }
    public  String getPasswordfieldConfirm(){
        return new String(confirmPasswordInput.getPassword());

    }


    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setTitle("Sign-Up");
        myFrame.setSize(1000, 730);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.getContentPane().setBackground(new Color(50, 76, 49, 255));
        JPanel mainPanel = new JPanel();

        SignUP signUp = new SignUP(mainPanel);

        myFrame.add(signUp.getMainPanel());
        myFrame.setVisible(true);
    }
}
