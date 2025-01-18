package Views;
import Utils.RoundedButton;
import Utils.RoundedPanel;
import Utils.Rounded_normal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Dashboard {
    private JLabel activeLabel = null;

    private JPanel Dashboard_panel ;
    private RoundedPanel SideBar;
    private  JPanel Content_dashboard;
    public Rounded_normal log_out;

    public JLabel Add_Plants,Health_tracking,Overview,All_Plants;
    public  Dashboard(){
        Dashboard_panel=new JPanel();
        Dashboard_panel.setLayout(null);
        Dashboard_panel.setBounds(0,0,985, 692);
        Dashboard_panel.setBackground(Color.white);

        SideBar=new RoundedPanel(40);
        SideBar.setLayout(null);
        SideBar.setBounds(-30,0,280, 692);
        SideBar.setBackground(new Color(81,173,168,255));

        JLabel titleDash= new JLabel("GreenGuard");
        titleDash.setFont(new Font("Arial", Font.BOLD, 20));
        titleDash.setForeground(Color.WHITE);
        titleDash.setBounds(72, 30, 180, 30);

        JLabel logowhite = new JLabel();
        ImageIcon imageIcon = new ImageIcon("back_plant/logo_witte_no_Title.png");
        Image resizedImage = imageIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        logowhite.setIcon(new ImageIcon(resizedImage));
        logowhite.setBounds(40, 28, 30, 30);


          Overview= new JLabel("              Overview");
        Overview.setFont(new Font("Arial", Font.PLAIN, 18));
        Overview.setForeground(Color.WHITE);
        Overview.setBounds(20, 150, 259, 45);
        Overview.setBackground(new Color(81,173,168,255));
        Overview.setForeground(Color.white);
        Overview.setOpaque(true);


          Add_Plants= new JLabel("              Add Plants");
        Add_Plants.setFont(new Font("Arial", Font.PLAIN, 18));
        Add_Plants.setForeground(Color.WHITE);
        Add_Plants.setBounds(20, 200, 259, 45);
        Add_Plants.setBackground(new Color(81,173,168,255));
        Add_Plants.setForeground(Color.white);
        Add_Plants.setOpaque(true);


          All_Plants= new JLabel("              All Plants");
        All_Plants.setFont(new Font("Arial", Font.PLAIN, 18));
        All_Plants.setForeground(Color.WHITE);
        All_Plants.setBounds(20, 250, 259, 45);
        All_Plants.setBackground(new Color(81,173,168,255));
        All_Plants.setForeground(Color.white);
        All_Plants.setOpaque(true);


          Health_tracking= new JLabel("              Health Tracking");
        Health_tracking.setFont(new Font("Arial", Font.PLAIN, 18));
        Health_tracking.setForeground(Color.WHITE);
        Health_tracking.setBounds(20, 300, 259, 45);
        Health_tracking.setBackground(new Color(81,173,168,255));
        Health_tracking.setForeground(Color.white);
        Health_tracking.setOpaque(true);


        log_out = new Rounded_normal("Log Out");
        log_out.setFont(new Font("Arial", Font.BOLD, 15));
        log_out.setForeground(new Color(81, 173, 168, 255));
        log_out.setBackground(Color.white);
        log_out.setBounds(60, 640, 170, 40);
        log_out.setCursor(new Cursor(Cursor.HAND_CURSOR));





         Overview.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (activeLabel != Overview) {
                    setActiveStyle(Overview);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (activeLabel != Overview) {
                    setDefaultStyle(Overview);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (activeLabel != null) {
                    setDefaultStyle(activeLabel);
                }
                activeLabel = Overview;
                setActiveStyle(Overview);
            }
        });

         Add_Plants.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (activeLabel != Add_Plants) {
                    setActiveStyle(Add_Plants);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (activeLabel != Add_Plants) {
                    setDefaultStyle(Add_Plants);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (activeLabel != null) {
                    setDefaultStyle(activeLabel);
                }
                activeLabel = Add_Plants;
                setActiveStyle(Add_Plants);
            }
        });

         All_Plants.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (activeLabel != All_Plants) {
                    setActiveStyle(All_Plants);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (activeLabel != All_Plants) {
                    setDefaultStyle(All_Plants);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (activeLabel != null) {
                    setDefaultStyle(activeLabel);
                }
                activeLabel = All_Plants;
                setActiveStyle(All_Plants);
            }
        });

         Health_tracking.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (activeLabel != Health_tracking) {
                    setActiveStyle(Health_tracking);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (activeLabel != Health_tracking) {
                    setDefaultStyle(Health_tracking);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (activeLabel != null) {
                    setDefaultStyle(activeLabel);
                }
                activeLabel = Health_tracking;
                setActiveStyle(Health_tracking);
            }
        });


        /// //add  component to  sidebar
        SideBar.add(Overview);
        SideBar.add(Add_Plants);
        SideBar.add(All_Plants);
        SideBar.add(titleDash);
        SideBar.add(logowhite);
        SideBar.add(Health_tracking);
        SideBar.add(log_out);














      Dashboard_panel.add(SideBar);
    }



    public  JPanel GetDashboardPanel(){
        return Dashboard_panel;
    }
    private void setDefaultStyle(JLabel label) {
        label.setBackground(new Color(81,173,168,255));
        label.setForeground(Color.WHITE);
        label.repaint();
    }

     private void setActiveStyle(JLabel label) {
        label.setBackground(Color.white);
        label.setForeground(new Color(81,173,168,255));
        label.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dashboard");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(985, 730);
             Dashboard test=new Dashboard();
            frame.add(test.GetDashboardPanel());
            frame.setLayout(null);
            frame.setVisible(true);
        });
    }
}
