package Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Rounded_normal extends JButton {
    private final int radius = 45;
    private Color backgroundColor;

    public Rounded_normal(String text) {
        super(text);
        setContentAreaFilled(false); // Make the button's content area transparent
        setFocusPainted(false); // Remove the focus border
        setBorderPainted(false); // Remove the default border
        backgroundColor = new Color(98, 183, 54, 255);
    }

    @Override
    public void setBackground(Color bg) {
        backgroundColor = bg;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint the background

            g2d.setColor(backgroundColor);


        g2d.fill(new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, radius, radius));

        // Draw the text
        FontMetrics metrics = g2d.getFontMetrics(getFont());
        Rectangle stringBounds = metrics.getStringBounds(getText(), g2d).getBounds();

        int textX = (getWidth() - stringBounds.width) / 2;
        int textY = (getHeight() - stringBounds.height) / 2 + metrics.getAscent();

        g2d.setColor(getForeground());
        g2d.setFont(getFont());
        g2d.drawString(getText(), textX, textY);

        g2d.dispose();
    }
}