 import javax.swing.*;
 import  Controllers.MainController;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        new MainController(myFrame);
    }
}