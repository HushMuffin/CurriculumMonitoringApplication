package edu.slu.prog2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RoundRectangleButton extends JButton {
    private static final Color SHADOW_COLOR = new Color(5, 0, 100, 50);
    private static final int CORNER_RADIUS = 20;
    private boolean hovering;

    public RoundRectangleButton(String text) {
        super(text);
        setOpaque(false);
        setBorderPainted(false);

        // Add a mouse listener to track when the mouse is hovering over the button
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hovering = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hovering = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Paint the main button shape
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (getModel().isPressed()) {
            g2.setColor(Color.gray);
        } else {
            g2.setColor(getBackground());
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), CORNER_RADIUS, CORNER_RADIUS);

        // Paint a semi-transparent rounded rectangle just below the main one to create a shadow effect
        if (hovering && isEnabled()) {
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.2f));
            g2.setColor(SHADOW_COLOR);
            g2.fillRoundRect(0, getHeight() - CORNER_RADIUS / 2, getWidth(), CORNER_RADIUS / 2, CORNER_RADIUS, CORNER_RADIUS);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
        }

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Paint the button border
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth(), getHeight(), CORNER_RADIUS, CORNER_RADIUS);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 30); // adjust to your liking
    }

}
