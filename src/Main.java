 import javax.swing.*;
 import  Controllers.MainController;

public class Main {
    public static void main(String[] args) {


        SwingUtilities.invokeLater(() -> {
            JFrame myFrame = new JFrame();
            myFrame.setSize(985, 730);
            new MainController(myFrame);
        });
    }
}