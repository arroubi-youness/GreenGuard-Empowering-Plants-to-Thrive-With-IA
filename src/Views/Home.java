package Views;

import Utils.RoundedButton;
 import Utils.Rounded_normal;

import javax.swing.*;
import java.awt.*;

public class Home {

    private JPanel homePanel;
    private JPanel hearder_menu;
    private JButton home_button,Features_button,Pricing_button,get_start;
    private RoundedButton log_in;
    private JScrollPane scrollPane;

    public Home(){
        this.homePanel = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1000, 1200); // Set preferred size for scrolling
            }
        };
        homePanel.setLayout(null);
        homePanel.setBackground(Color.white);


        hearder_menu=new JPanel();
        hearder_menu.setBounds(0,0,1000,90);
        hearder_menu.setBackground(new Color(76,176,80,255));
        hearder_menu.setLayout(null);


        JLabel title = new JLabel("GreenGuard");
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setForeground(Color.white);
        title.setBounds(65, 30, 200, 30);


        JLabel logo = new JLabel();
        ImageIcon imageIcon = new ImageIcon("back_plant/logo_witte_no_Title.png");
        Image resizedImage = imageIcon.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(resizedImage));
        logo.setBounds(17, 19, 45, 45);





        home_button = new JButton("Home");
        home_button.setFont(new Font("Arial", Font.BOLD, 16));
        home_button.setForeground(Color.WHITE);
        home_button.setBounds(420, 31, 130, 30);
        home_button.setOpaque(false);
        home_button.setContentAreaFilled(false);
        home_button.setBorderPainted(false);
        home_button.setFocusPainted(false);
        home_button.setCursor(new Cursor(Cursor.HAND_CURSOR));


        Features_button = new JButton("Features");
        Features_button.setFont(new Font("Arial", Font.BOLD, 16));
        Features_button.setForeground(Color.WHITE);
        Features_button.setBounds(530, 31, 140, 30);
        Features_button.setOpaque(false);
        Features_button.setContentAreaFilled(false);
        Features_button.setBorderPainted(false);
        Features_button.setFocusPainted(false);
        Features_button.setCursor(new Cursor(Cursor.HAND_CURSOR));


        Pricing_button = new JButton("Pricing");
        Pricing_button.setFont(new Font("Arial", Font.BOLD, 16));
        Pricing_button.setForeground(Color.WHITE);
        Pricing_button.setBounds(640, 31, 140, 30);
        Pricing_button.setOpaque(false);
        Pricing_button.setContentAreaFilled(false);
        Pricing_button.setBorderPainted(false);
        Pricing_button.setFocusPainted(false);
        Pricing_button.setCursor(new Cursor(Cursor.HAND_CURSOR));



        log_in = new RoundedButton("Log in");
        log_in.setFont(new Font("Arial", Font.BOLD, 15));
        log_in.setForeground(new Color(76,176,80,255));
        log_in.setBackground(Color.white);
        log_in.setBounds(860, 28, 100, 35);
        log_in.setCursor(new Cursor(Cursor.HAND_CURSOR));


        JPanel content_panel=new JPanel();
        content_panel.setBounds(0,90,1000,600);
        content_panel.setBackground(new Color(201,231,203,255));
        content_panel.setLayout(null);




        JLabel big_title= new JLabel("<html>Keep Your Plants \n Happy And Healthy   </htmml>");
        big_title.setFont(new Font("Arial", Font.BOLD, 50));
        big_title.setForeground(Color.BLACK);
        big_title.setBounds(80, 230, 500, 120);


        JLabel sous_title= new JLabel("<html>GreenGuard is an innovative plant care app that blends technology with nature, helping your plants thrive, flourish, and grow to their fullest <br> potential.   </htmml>");
        sous_title.setFont(new Font("Arial", Font.PLAIN, 17));
        sous_title.setForeground(Color.BLACK);
        sous_title.setBounds(80, 370, 520, 70);


        get_start = new Rounded_normal("Get started");
        get_start.setFont(new Font("Arial", Font.BOLD, 15));
        get_start.setForeground(Color.WHITE);
        get_start.setBackground(new Color(76,176,80,255));
        get_start.setBounds(80, 470, 200, 45);
         get_start.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JLabel featrees_title= new JLabel("Key Features");
        featrees_title.setFont(new Font("Arial", Font.BOLD, 26));
        featrees_title.setForeground(Color.BLACK);
        featrees_title.setBounds(390, 735, 200, 30);




        scrollPane = new JScrollPane(homePanel);
        scrollPane.setBounds(0, 0, 1000, 730);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        JPanel statsPanel = new JPanel();
        statsPanel.setBounds(70, 585, 840, 100);
        statsPanel.setLayout(new GridLayout(1, 4, 20, 0));
        statsPanel.setOpaque(false);


        addStatistic(statsPanel, "10,000+", "Total Users");
        addStatistic(statsPanel, "3,000+", "Active Users");
        addStatistic(statsPanel, "95%", "Satisfaction");
        addStatistic(statsPanel, "24/7", "Support");

        homePanel.add(statsPanel);
        homePanel.add(featrees_title);
        homePanel.add(get_start);
        homePanel.add(sous_title);
        homePanel.add(big_title);
        homePanel.add(content_panel);
        homePanel.add(log_in);
        homePanel.add(Pricing_button);
        homePanel.add(Features_button);
        homePanel.add(home_button);
        homePanel.add(logo);
        homePanel.add(title);
        homePanel.add(hearder_menu);





    }
    private void addStatistic(JPanel container, String number, String label) {
        JPanel statPanel = new JPanel();
        statPanel.setLayout(new BoxLayout(statPanel, BoxLayout.Y_AXIS));
        statPanel.setOpaque(false);

        JLabel numberLabel = new JLabel(number);
        numberLabel.setFont(new Font("Arial", Font.BOLD, 24));
        numberLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel textLabel = new JLabel(label);
        textLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        textLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        statPanel.add(numberLabel);
        statPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        statPanel.add(textLabel);

        container.add(statPanel);
    }
    private void setupKeyFeaturesSection() {
        JLabel featuresTitle = new JLabel("Key Features");
        featuresTitle.setFont(new Font("Arial", Font.BOLD, 40));
        featuresTitle.setBounds(80, 700, 300, 50);

        JPanel featuresContainer = new JPanel();
        featuresContainer.setBounds(80, 770, 840, 200);
        featuresContainer.setLayout(new GridLayout(1, 3, 30, 0));
        featuresContainer.setOpaque(false);

        // Add feature cards
        addFeatureCard(featuresContainer, "Plant Tracking", "Track your plants' growth and health");
        addFeatureCard(featuresContainer, "Water Scheduling", "Never forget to water your plants");
        addFeatureCard(featuresContainer, "Health Monitoring", "Monitor your plants' health status");

        homePanel.add(featuresTitle);
        homePanel.add(featuresContainer);
    }

    private void addFeatureCard(JPanel container, String title, String description) {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(Color.WHITE);
        card.setBorder(BorderFactory.createLineBorder(new Color(230, 230, 230)));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel descLabel = new JLabel("<html><center>" + description + "</center></html>");
        descLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        descLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        card.add(Box.createRigidArea(new Dimension(0, 20)));
        card.add(titleLabel);
        card.add(Box.createRigidArea(new Dimension(0, 10)));
        card.add(descLabel);
        card.add(Box.createRigidArea(new Dimension(0, 20)));

        container.add(card);
    }


    public JPanel getMainPanel(){
        return homePanel;
    }
    public JScrollPane getMainPanelScroll(){
        return scrollPane;
    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setTitle("Login and Sign-Up Example");
        myFrame.setSize(985, 730);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.getContentPane().setBackground(new Color(50, 76, 49, 255));

        Home loginSignUp = new Home();

        myFrame.add(loginSignUp.getMainPanelScroll());
        myFrame.setVisible(true);
    }
}
