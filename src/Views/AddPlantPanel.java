package Views;
import Utils.RoundedBorder;
import Utils.RoundedButton_normal;


import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class AddPlantPanel {
    public  JPanel AddPlantPanel;
     public JTextField Name_plant,last_watred,last_feltrizing;
     public JComboBox<String> comboBox   ;
     public RoundedButton_normal Add_button,Upload;
     public String hiddenValue;
     private  JLabel plant_image;
    public AddPlantPanel(){
        AddPlantPanel =new JPanel();
        AddPlantPanel.setBounds(0,0,710, 692);
        AddPlantPanel.setBackground(Color.white);
        AddPlantPanel.setLayout(null);





        JLabel welcomeTitle = new JLabel("Add your Plant !");
        welcomeTitle.setFont(new Font("Arial", Font.BOLD, 26));
        welcomeTitle.setForeground(new Color(81,173,168,255));
        welcomeTitle.setBounds(224, 40, 250, 30);



          plant_image =new JLabel();
        plant_image.setBounds(235,80,180,160);
        ImageIcon imageIcon_feautres = new ImageIcon("back_plant/ddddddddd.jpg");
        Image resizedImage_features = imageIcon_feautres.getImage().getScaledInstance(180, 160, Image.SCALE_SMOOTH);
        plant_image.setIcon(new ImageIcon(resizedImage_features));
        plant_image.setBorder(new RoundedBorder(new Color(81,173,168,255), 10, 2));





        JLabel Name_plantLabel = new JLabel("Plant name:");
        Name_plantLabel.setFont(new Font("Arial", Font.BOLD, 14));
        Name_plantLabel.setForeground(new Color(170, 169, 174, 255));
        Name_plantLabel.setBounds(170, 250, 100, 30);

        Name_plant = new JTextField();
        Name_plant.setBounds(170, 280, 315, 40);
        Name_plant.setBorder(new RoundedBorder(Color.GRAY, 25, 2));
        Name_plant.setFont(new Font("Arial", Font.PLAIN, 14));
        Name_plant.setBackground(Color.WHITE);

        JLabel SpicesIdLabel = new JLabel("Spices:");
        SpicesIdLabel.setFont(new Font("Arial", Font.BOLD, 14));
        SpicesIdLabel.setForeground(new Color(170, 169, 174, 255));
        SpicesIdLabel.setBounds(170, 340, 100, 30);

        Map<String, String> optionsMap = new HashMap<>();
        optionsMap.put("Option 1", "Hidden Value 1");
        optionsMap.put("Option 2", "Hidden Value 2");
        optionsMap.put("Option 3", "Hidden Value 3");

        comboBox = new JComboBox<>(optionsMap.keySet().toArray(new String[0]));
        comboBox.setBounds(170,370,315,40);
        comboBox.setBackground(Color.white);



        comboBox.addActionListener(e -> {
            String selectedOption = (String) comboBox.getSelectedItem();
             hiddenValue = optionsMap.get(selectedOption);
        });




        JLabel last_watredLabel = new JLabel("Last watred date:");
        last_watredLabel.setFont(new Font("Arial", Font.BOLD, 14));
        last_watredLabel.setForeground(new Color(170, 169, 174, 255));
        last_watredLabel.setBounds(170, 430, 120, 30);

        last_watred = new JTextField();
        last_watred.setBounds(170, 460, 315, 40);
        last_watred.setBorder(new RoundedBorder(Color.GRAY, 25, 2));
        last_watred.setFont(new Font("Arial", Font.PLAIN, 14));
        last_watred.setBackground(Color.WHITE);

        JLabel lastFeltrizingDate = new JLabel("Last fealtrizing date:");
        lastFeltrizingDate.setFont(new Font("Arial", Font.BOLD, 14));
        lastFeltrizingDate.setForeground(new Color(170, 169, 174, 255));
        lastFeltrizingDate.setBounds(170, 520, 200, 30);

        last_feltrizing = new JTextField();
        last_feltrizing.setBounds(170, 550, 315, 40);
        last_feltrizing.setBorder(new RoundedBorder(Color.GRAY, 25, 2));
        last_feltrizing.setFont(new Font("Arial", Font.PLAIN, 14));
        last_feltrizing.setBackground(Color.WHITE);



        Add_button = new RoundedButton_normal("Add Palnt");
        Add_button.setFont(new Font("Arial", Font.BOLD, 15));
        Add_button.setForeground(Color.WHITE);
        Add_button.setBackground(new Color(81,173,168,255));
        Add_button.setBounds(240, 620, 236, 40);

        Upload = new RoundedButton_normal("Upload");
        Upload.setFont(new Font("Arial", Font.BOLD, 15));
        Upload.setForeground(Color.WHITE);
        Upload.setBackground(new Color(81,173,168,255));
        Upload.setBounds(170, 620, 63, 40);

        Upload.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();

             int returnValue = fileChooser.showOpenDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());

                 ImageIcon selectedImageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                Image resizedImage = selectedImageIcon.getImage().getScaledInstance(180, 160, Image.SCALE_SMOOTH);
                plant_image.setIcon(new ImageIcon(resizedImage));
            }
        });
         AddPlantPanel.add(welcomeTitle);
        AddPlantPanel.add(Name_plantLabel);
        AddPlantPanel.add(Name_plant);
        AddPlantPanel.add(SpicesIdLabel);
        AddPlantPanel.add(last_watredLabel);
        AddPlantPanel.add(last_watred);
        AddPlantPanel.add(lastFeltrizingDate);
        AddPlantPanel.add(last_feltrizing);
        AddPlantPanel.add(Add_button);
        AddPlantPanel.add(comboBox);
        AddPlantPanel.add(plant_image);
        AddPlantPanel.add(Upload);
    }
}
