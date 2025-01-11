package Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedButton extends JButton {
    private final int radius = 25;
    private Color backgroundColor;
    private Color borderColor = Color.WHITE;
    private int borderThickness = 2;

    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        backgroundColor = new Color(98, 183, 54, 255);
    }

    @Override
    public void setBackground(Color bg) {
        backgroundColor = bg;
        repaint();
    }

    public void setBorderColor(Color color) {
        borderColor = color;
        repaint();
    }

    public void setBorderThickness(int thickness) {
        borderThickness = thickness;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint the background
        if (getModel().isPressed()) {
            g2d.setColor(backgroundColor.darker());
        } else if (getModel().isRollover()) {
            g2d.setColor(backgroundColor.brighter());
        } else {
            g2d.setColor(backgroundColor);
        }

        g2d.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, radius, radius));

        FontMetrics metrics = g2d.getFontMetrics(getFont());
        Rectangle stringBounds = metrics.getStringBounds(getText(), g2d).getBounds();

        int textX = (getWidth() - stringBounds.width) / 2;
        int textY = (getHeight() - stringBounds.height) / 2 + metrics.getAscent();

        g2d.setColor(getForeground());
        g2d.setFont(getFont());
        g2d.drawString(getText(), textX, textY);

        g2d.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(borderColor);
        g2d.setStroke(new BasicStroke(borderThickness));
        g2d.draw(new RoundRectangle2D.Float(borderThickness / 2.0f, borderThickness / 2.0f,
                getWidth() - borderThickness, getHeight() - borderThickness, radius, radius));

        g2d.dispose();
    }
}
