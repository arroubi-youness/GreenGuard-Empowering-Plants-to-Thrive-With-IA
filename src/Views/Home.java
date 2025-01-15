package Views;

import Utils.RoundedBorder;
import Utils.RoundedButton;
 import Utils.Rounded_normal;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Home {

    private JPanel homePanel;
    private JPanel hearder_menu;
    public JButton home_button,Features_button,Pricing_button,get_start;
    public RoundedButton log_in;
    private JScrollPane scrollPane;
    public Rounded_normal getStartFreeBox,getStartpremuimBox,getStartgoldBox;
    JLabel Pricing_footer,Features_footer,home_footer;
    JLabel Linkdeien,github;

    public Home(){
        this.homePanel = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1000, 1812); // Set preferred size for scrolling
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



        JLabel Plans= new JLabel("Our Plans");
        Plans.setFont(new Font("Arial", Font.BOLD, 27));
        Plans.setForeground(Color.BLACK);
        Plans.setBounds(400, 1055, 200, 30);

 /// ///the pannel   contain plans
        JPanel Pricing =new JPanel();
        Pricing.setBounds(57, 1135, 840, 360);
        Pricing.setLayout(new GridLayout(1, 3, 20, 0));
        Pricing.setOpaque(false);

        /// ///gold plan

        JPanel element_pricing=new JPanel();
        element_pricing.setLayout(new BoxLayout(element_pricing, BoxLayout.Y_AXIS));
        Border customBorderGOLD = new RoundedBorder(new Color(255,215,0,255), 25, 2);
        Border customBorder = new RoundedBorder(Color.GRAY, 25, 2);
        element_pricing.setBorder(customBorderGOLD);
        element_pricing.setPreferredSize(new Dimension(240, 340));
        element_pricing.setOpaque(false);






        JLabel textLabel_Gold = new JLabel("Gold");
        textLabel_Gold.setFont(new Font("Arial", Font.BOLD, 29));
        textLabel_Gold.setAlignmentX(Component.CENTER_ALIGNMENT);
//        textLabel.setBackground(new Color(245,245,245,255));
        textLabel_Gold.setForeground(Color.BLACK);

        JLabel price_box_gold = new JLabel("$29.99/Month");
        price_box_gold.setFont(new Font("Arial", Font.PLAIN, 18));
        price_box_gold.setAlignmentX(Component.CENTER_ALIGNMENT);
        price_box_gold.setForeground(new Color(102,102,102,255));


        JLabel feautres_box_gold = new JLabel("<html>&#10004; Basic Plant Monitoring <br><br>&#10004; Water Reminder<br><br>&#10004;10 Plants Maximum <br><br>&#10004; Email Support </html>");
        feautres_box_gold.setFont(new Font("Arial", Font.PLAIN, 16));
        feautres_box_gold.setAlignmentX(Component.CENTER_ALIGNMENT);
        feautres_box_gold.setHorizontalAlignment(SwingConstants.CENTER);
        feautres_box_gold.setForeground(Color.BLACK);

         getStartgoldBox = new Rounded_normal("Choose Gold");
        getStartgoldBox.setFont(new Font("Arial", Font.BOLD, 15));
        getStartgoldBox.setMinimumSize(new Dimension(150, 40));
        getStartgoldBox.setPreferredSize(new Dimension(150, 40));
        getStartgoldBox.setMaximumSize(new Dimension(150, 40));
        getStartgoldBox.setForeground(Color.WHITE);
        getStartgoldBox.setBackground(new Color(255,215,0,255));
        getStartgoldBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        getStartgoldBox.setCursor(new Cursor(Cursor.HAND_CURSOR));

//adding label  to  box plan
        element_pricing.add(Box.createRigidArea(new Dimension(0, 15)));
        element_pricing.add(textLabel_Gold);
         element_pricing.add(Box.createRigidArea(new Dimension(0, 2)));
        element_pricing.add(price_box_gold);
        element_pricing.add(Box.createRigidArea(new Dimension(0, 40)));
        element_pricing.add(feautres_box_gold);
        element_pricing.add(Box.createRigidArea(new Dimension(0, 40)));
        element_pricing.add(getStartgoldBox);









        /// ////adding   to  premuim
        JPanel element_pricing3=new JPanel();
        element_pricing3.setLayout(new BoxLayout(element_pricing3, BoxLayout.Y_AXIS));
        Border customBorder_green = new RoundedBorder(new Color(76, 176, 80, 255), 25, 2);

        element_pricing3.setBorder(customBorder_green);
        element_pricing3.setPreferredSize(new Dimension(240, 340));
        element_pricing3.setOpaque(false);




        JLabel textLabel_premuim = new JLabel("Premuim");
        textLabel_premuim.setFont(new Font("Arial", Font.BOLD, 29));
        textLabel_premuim.setAlignmentX(Component.CENTER_ALIGNMENT);
//        textLabel.setBackground(new Color(245,245,245,255));
        textLabel_premuim.setForeground(Color.BLACK);

        JLabel price_box_premuim = new JLabel("$19.99/Month");
        price_box_premuim.setFont(new Font("Arial", Font.PLAIN, 18));
        price_box_premuim.setAlignmentX(Component.CENTER_ALIGNMENT);
        price_box_premuim.setForeground(new Color(102,102,102,255));


        JLabel feautres_box_premuim = new JLabel("<html>&#10004; Basic Plant Monitoring <br><br>&#10004; Water Reminder<br><br>&#10004;10 Plants Maximum <br><br>&#10004; Email Support </html>");
        feautres_box_premuim.setFont(new Font("Arial", Font.PLAIN, 16));
        feautres_box_premuim.setAlignmentX(Component.CENTER_ALIGNMENT);
        feautres_box_premuim.setHorizontalAlignment(SwingConstants.CENTER);
        feautres_box_premuim.setForeground(Color.BLACK);

        getStartpremuimBox = new Rounded_normal("Choose Premuim");
        getStartpremuimBox.setFont(new Font("Arial", Font.BOLD, 15));
        getStartpremuimBox.setMinimumSize(new Dimension(150, 40));
        getStartpremuimBox.setPreferredSize(new Dimension(150, 40));
        getStartpremuimBox.setMaximumSize(new Dimension(150, 40));
        getStartpremuimBox.setForeground(Color.WHITE);
        getStartpremuimBox.setBackground(new Color(76, 176, 80, 255));
        getStartpremuimBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        getStartpremuimBox.setCursor(new Cursor(Cursor.HAND_CURSOR));


        element_pricing3.add(Box.createRigidArea(new Dimension(0, 15)));
        element_pricing3.add(textLabel_premuim);
        element_pricing3.add(Box.createRigidArea(new Dimension(0, 2)));
        element_pricing3.add(price_box_premuim);
        element_pricing3.add(Box.createRigidArea(new Dimension(0, 40)));
        element_pricing3.add(feautres_box_premuim);
        element_pricing3.add(Box.createRigidArea(new Dimension(0, 40)));
        element_pricing3.add(getStartpremuimBox);




        /// ////////free
        JPanel element_pricing4=new JPanel();
        element_pricing4.setLayout(new BoxLayout(element_pricing4, BoxLayout.Y_AXIS));
        element_pricing4.setBorder(customBorder);
        element_pricing4.setPreferredSize(new Dimension(240, 340));
        element_pricing4.setOpaque(false);




        JLabel textLabel = new JLabel("Free");
        textLabel.setFont(new Font("Arial", Font.BOLD, 29));
        textLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//        textLabel.setBackground(new Color(245,245,245,255));
        textLabel.setForeground(Color.BLACK);

        JLabel price_box = new JLabel("$0/Month");
        price_box.setFont(new Font("Arial", Font.PLAIN, 18));
        price_box.setAlignmentX(Component.CENTER_ALIGNMENT);
        price_box.setForeground(new Color(102,102,102,255));


        JLabel feautres_box_free = new JLabel("<html>&#10004; Basic Plant Monitoring <br><br>&#10004; Water Reminder<br><br>&#10004;10 Plants Maximum <br><br>&#10004; Email Support </html>");
        feautres_box_free.setFont(new Font("Arial", Font.PLAIN, 16));
        feautres_box_free.setAlignmentX(Component.CENTER_ALIGNMENT);
        feautres_box_free.setHorizontalAlignment(SwingConstants.CENTER);
        feautres_box_free.setForeground(Color.BLACK);

        getStartFreeBox = new Rounded_normal("Get started");
        getStartFreeBox.setFont(new Font("Arial", Font.BOLD, 15));
        getStartFreeBox.setMinimumSize(new Dimension(150, 40));
        getStartFreeBox.setPreferredSize(new Dimension(150, 40));
        getStartFreeBox.setMaximumSize(new Dimension(150, 40));
        getStartFreeBox.setForeground(Color.WHITE);
        getStartFreeBox.setBackground(new Color(76, 176, 80, 255));
        getStartFreeBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        getStartFreeBox.setCursor(new Cursor(Cursor.HAND_CURSOR));













/// ////////addding   to    free box
        element_pricing4.add(Box.createRigidArea(new Dimension(0, 15)));
        element_pricing4.add(textLabel);
        element_pricing4.add(Box.createRigidArea(new Dimension(0, 2)));
        element_pricing4.add(price_box);
        element_pricing4.add(Box.createRigidArea(new Dimension(0, 40)));
        element_pricing4.add(feautres_box_free);
        element_pricing4.add(Box.createRigidArea(new Dimension(0, 40)));
        element_pricing4.add(getStartFreeBox);





/// ////adding boxex  plan  to  the grand panl
        Pricing.add(element_pricing4);
        Pricing.add(element_pricing3);
        Pricing.add(element_pricing);


        /// //Footer

        JPanel Footer= new JPanel();
        Footer.setBounds(0,1590,1000,200);
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

          Pricing_footer = new JLabel("Pricing");
        Pricing_footer.setFont(new Font("Arial", Font.PLAIN, 16));
        Pricing_footer.setBounds(420, 136, 220, 20);
        Pricing_footer.setForeground(Color.BLACK);
        Pricing_footer.setCursor(new Cursor(Cursor.HAND_CURSOR));



        Footer.add(home_footer);
        Footer.add(Pricing_footer);
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


        homePanel.add(Footer);
        homePanel.add(Pricing);
        homePanel.add(Plans);
        homePanel.add(features_image);
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
