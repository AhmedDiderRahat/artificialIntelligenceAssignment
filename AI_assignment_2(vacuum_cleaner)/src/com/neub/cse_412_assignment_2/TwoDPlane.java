package com.neub.cse_412_assignment_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pritom Chowdhury & Ahmed Dider Rahat
 */

public class TwoDPlane extends JPanel implements Runnable {

    public int ax, ay, a, b, startX, startY, endX, endY;
    public int vacuumCleanerX, vacuumCleanerY, dustX, dustY, tempX, tempY, 
            counter = 0, t = 0;
    int positionX[] = new int[10];
    int positionY[] = new int[10];

    public TwoDPlane() {
        vacuumCleanerX = 30;
        vacuumCleanerY = 20;

        dustX = LandingPage.dustX;
        dustY = LandingPage.dustY;

        positionX[0] = 30;
        positionY[0] = 20;
        positionX[1] = 170;
        positionY[1] = 20;
        positionX[2] = 310;
        positionY[2] = 20;
        positionX[3] = 310;
        positionY[3] = 160;
        positionX[4] = 170;
        positionY[4] = 160;
        positionX[5] = 30;
        positionY[5] = 160;

        positionX[6] = 30;
        positionY[6] = 300;
        positionX[7] = 170;
        positionY[7] = 300;
        positionX[8] = 310;
        positionY[8] = 300;
    }

    public int cx = positionX[0], dx = positionY[0];

    Rectangle vacuumCleaner = new Rectangle(30, 20, 140, 140);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int y = 20, x = 30, px = 20, py = 10;

        for (int i = 0; i < 4; i++) {
            g.drawLine(30, y, 450, y);
            g.drawLine(x, 20, x, 440);
            x += 140;
            y += 140;
        }

        if (cx == dustX && dx == dustY) {
            g.setColor(Color.BLUE);
            g.fillRect(dustX, dustY, 140, 140);
            repaint();
            g.dispose();
            counter = 1;
            cx = 10;
            dx = 10;
        }
        if (counter != 1) {
            g.drawOval(dustX, dustY, 140, 140);
            g.setColor(Color.GREEN);
            g.fillRect(dustX, dustY, 140, 140);
            g.setColor(Color.BLACK);
            g.drawString("DUST", dustX + 50, dustY + 69);
            repaint();
        }

        g.setColor(Color.RED);
        g.fillRect(vacuumCleaner.x, vacuumCleaner.y, vacuumCleaner.height, 
                vacuumCleaner.width);
        g.setColor(Color.BLACK);
        g.drawString("Vacuum Cleaner", vacuumCleaner.x + 25, 
                vacuumCleaner.y + 69);

        repaint();
    }

    public void move(int a, int b) {
        vacuumCleaner.x = a;
        vacuumCleaner.y = b;
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void run() {
        try {
            for (int i = 0; i < 9; i++) {
                cx = positionX[i];
                dx = positionY[i];
                move(cx, dx);

                if ((cx == dustX) && (dx == dustY)) {
                    System.out.println("khefelece re...!!!");
                }

                Thread.sleep(1000);
            }
            for (int i = 8; i >= 0; i--) {
                cx = positionX[i];
                dx = positionY[i];
                move(cx, dx);

                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "Finished...!!!", 
                            "Finished", JOptionPane.DEFAULT_OPTION);
                }

                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
