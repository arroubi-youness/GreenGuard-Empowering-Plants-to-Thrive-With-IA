package Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedPanel extends JPanel {
    private int cornerRadius = 15;

    public RoundedPanel() {
        super();
        setOpaque(false);
    }

    public RoundedPanel(int radius) {
        super();
        this.cornerRadius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth()-1, getHeight()-1, cornerRadius, cornerRadius));

        g2.dispose();
        super.paintComponent(g);
    }

    public void setCornerRadius(int radius) {
        this.cornerRadius = radius;
        repaint();
    }

     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rounded Panel Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            RoundedPanel panel = new RoundedPanel(20);
            panel.setBackground(new Color(87, 182, 173)); // Turquoise color
            panel.setPreferredSize(new Dimension(200, 100));


            panel.setLayout(new BorderLayout());
            JLabel label = new JLabel("Hello, Rounded Panel!", SwingConstants.CENTER);
            label.setForeground(Color.WHITE);
            panel.add(label, BorderLayout.CENTER);


            frame.add(Box.createVerticalStrut(20), BorderLayout.NORTH);
            frame.add(Box.createHorizontalStrut(20), BorderLayout.WEST);
            frame.add(panel, BorderLayout.CENTER);
            frame.add(Box.createHorizontalStrut(20), BorderLayout.EAST);
            frame.add(Box.createVerticalStrut(20), BorderLayout.SOUTH);

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}