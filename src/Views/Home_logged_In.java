package Views;

import Utils.RoundedBorder;
import Utils.RoundedButton;
import Utils.Rounded_normal;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Home_logged_In {

    private JPanel homePanel;
    private JPanel hearder_menu;
    public JButton home_button,Features_button,Pricing_button,get_start;
    public RoundedButton log_out;
    private JScrollPane scrollPane;
    public Rounded_normal getStartFreeBox,getStartpremuimBox,getStartgoldBox;
    public JLabel Functionalities_footer,Features_footer,home_footer;
    public JLabel Linkdeien,github;
    public  JLabel manage,add_plant,dashbord;

    public Home_logged_In(){
        this.homePanel = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1000, 1742); // Set preferred size for scrolling
            }//announymous  class  extends   from  Jpanel  ANd  overie  the method   and used  for scrolling
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


        Pricing_button = new JButton("Functionalities ");
        Pricing_button.setFont(new Font("Arial", Font.BOLD, 16));
        Pricing_button.setForeground(Color.WHITE);
        Pricing_button.setBounds(640, 31, 170, 30);
        Pricing_button.setOpaque(false);
        Pricing_button.setContentAreaFilled(false);
        Pricing_button.setBorderPainted(false);
        Pricing_button.setFocusPainted(false);
        Pricing_button.setCursor(new Cursor(Cursor.HAND_CURSOR));



        log_out = new RoundedButton("Log out");
        log_out.setFont(new Font("Arial", Font.BOLD, 15));
        log_out.setForeground(new Color(76,176,80,255));
        log_out.setBackground(Color.white);
        log_out.setBounds(860, 28, 100, 35);
        log_out.setCursor(new Cursor(Cursor.HAND_CURSOR));


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


        JLabel featrees_title= new JLabel("Key Features");
        featrees_title.setFont(new Font("Arial", Font.BOLD, 26));
        featrees_title.setForeground(Color.BLACK);
        featrees_title.setBounds(390, 735, 200, 30);



        JLabel features_image = new JLabel();
        ImageIcon imageIcon_feautres = new ImageIcon("back_plant/Plants Tracking (1) (1).png");
        Image resizedImage_features = imageIcon_feautres.getImage().getScaledInstance(760, 230, Image.SCALE_SMOOTH);
        features_image.setIcon(new ImageIcon(resizedImage_features));
        features_image.setBounds(97, 792, 760, 230);


        //

        /// FUNCTIONNALTY

        JLabel FUNCTIONNALITY= new JLabel("Functionalities");
        FUNCTIONNALITY.setFont(new Font("Arial", Font.BOLD, 26));
        FUNCTIONNALITY.setForeground(Color.BLACK);
        FUNCTIONNALITY.setBounds(390, 1080, 200, 30);



          add_plant = new JLabel();
        ImageIcon add_plant_icon = new ImageIcon("back_plant/plus.jpg");
        Image add_plant_resised = add_plant_icon.getImage().getScaledInstance(150, 170, Image.SCALE_SMOOTH);
        add_plant.setIcon(new ImageIcon(add_plant_resised));
        add_plant.setBounds(97, 1160, 170, 185);
        add_plant.setCursor(new Cursor(Cursor.HAND_CURSOR));



        manage = new JLabel();

        ImageIcon manage_plant_icon = new ImageIcon("back_plant/manage.jpg");
        Image manage_plant_resised = manage_plant_icon.getImage().getScaledInstance(147, 189, Image.SCALE_SMOOTH);
        manage.setIcon(new ImageIcon(manage_plant_resised));
        manage.setBounds(393, 1160, 150, 189);
        manage.setCursor(new Cursor(Cursor.HAND_CURSOR));



        dashbord = new JLabel();

        ImageIcon dashbord_plant_icon = new ImageIcon("back_plant/dashbord.jpg");
        Image dashbord_plant_resised = dashbord_plant_icon.getImage().getScaledInstance(160, 175, Image.SCALE_SMOOTH);
        dashbord.setIcon(new ImageIcon(dashbord_plant_resised));
        dashbord.setBounds(669, 1170, 160, 175);
        dashbord.setCursor(new Cursor(Cursor.HAND_CURSOR));




        /// //Footer

        JPanel Footer= new JPanel();
        Footer.setBounds(0,1520,1000,200);
        Footer.setBackground(new Color(201,231,203,255));
        Footer.setLayout(null);

        //LABEL
        JLabel titleFooter = new JLabel("GreenGuard");
        titleFooter.setFont(new Font("Arial", Font.BOLD, 26));
        titleFooter.setForeground(Color.BLACK);
        titleFooter.setBounds(60, 35, 200, 30);


        JLabel my_infos = new JLabel("<html>Arrouyouness215@gmail.com<br><br>0621728280<br><br></html>");
        my_infos.setFont(new Font("Arial", Font.PLAIN, 16));
        my_infos.setBounds(60, 70, 220, 90);
        my_infos.setForeground(Color.BLACK);

        Footer.add(my_infos);
        Footer.add(titleFooter);

/// ///quick lonks



        JLabel title_quickLinks = new JLabel("Quick Links");
        title_quickLinks.setFont(new Font("Arial", Font.BOLD, 20));
        title_quickLinks.setForeground(Color.BLACK);
        title_quickLinks.setBounds(420, 35, 200, 30);


        home_footer = new JLabel("Home");
        home_footer.setFont(new Font("Arial", Font.PLAIN, 16));
        home_footer.setBounds(420, 74, 220, 20);
        home_footer.setForeground(Color.BLACK);
        home_footer.setCursor(new Cursor(Cursor.HAND_CURSOR));


        Features_footer = new JLabel("Features");
        Features_footer.setFont(new Font("Arial", Font.PLAIN, 16));
        Features_footer.setBounds(420, 105, 220, 20);
        Features_footer.setForeground(Color.BLACK);
        Features_footer.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Functionalities_footer = new JLabel("Functionalities");
        Functionalities_footer.setFont(new Font("Arial", Font.PLAIN, 16));
        Functionalities_footer.setBounds(420, 136, 220, 20);
        Functionalities_footer.setForeground(Color.BLACK);
        Functionalities_footer.setCursor(new Cursor(Cursor.HAND_CURSOR));



        Footer.add(home_footer);
        Footer.add(Functionalities_footer);
        Footer.add(title_quickLinks);
        Footer.add(Features_footer);
        /// /info
        JLabel title_devloper = new JLabel("Developer Infos");
        title_devloper.setFont(new Font("Arial", Font.BOLD, 20));
        title_devloper.setForeground(Color.BLACK);
        title_devloper.setBounds(710, 35, 200, 30);


        github = new JLabel("Github Developer");
        github.setFont(new Font("Arial", Font.PLAIN, 16));
        github.setBounds(710, 74, 220, 20);
        github.setForeground(Color.BLACK);
        github.setCursor(new Cursor(Cursor.HAND_CURSOR));


        Linkdeien = new JLabel("Linkdein Developer");
        Linkdeien.setFont(new Font("Arial", Font.PLAIN, 16));
        Linkdeien.setBounds(710, 105, 220, 20);
        Linkdeien.setForeground(Color.BLACK);
        Linkdeien.setCursor(new Cursor(Cursor.HAND_CURSOR));




        Footer.add(Linkdeien);
        Footer.add(github);
        Footer.add(title_devloper);
       homePanel.add(manage);
        homePanel.add(dashbord);
         homePanel.add(add_plant);
         homePanel.add(FUNCTIONNALITY);
        homePanel.add(Footer);
        homePanel.add(features_image);
        homePanel.add(statsPanel);
        homePanel.add(featrees_title);
        homePanel.add(get_start);
        homePanel.add(sous_title);
        homePanel.add(big_title);
        homePanel.add(content_panel);
        homePanel.add(log_out);
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

        Home_logged_In loginSignUp = new Home_logged_In();

        myFrame.add(loginSignUp.getMainPanelScroll());
        myFrame.setVisible(true);
    }
}
