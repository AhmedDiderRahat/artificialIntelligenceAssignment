package com.neub.cse_412_assignment_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pritom Chowdhury & Ahmed Dider Rahat
 */

public class TwoDPlane extends JPanel implements Runnable 
{
    public int ax, ay, a, b, startX, startY, endX, endY;

    public int movingObjectsX, movingObjectsY, fixedObjectsX, fixedObjectsY, tempX, tempY, counter = 0, t = 0;

    int positionX[] = new int[25];
    int positionY[] = new int[25];

    public TwoDPlane(int a, int b, int c, int d) 
    {
        movingObjectsX = a;
        movingObjectsY = b;
        fixedObjectsX = c;
        fixedObjectsY = d;

        if (movingObjectsX <= fixedObjectsX) 
        {
            for (int i = movingObjectsX; i <= fixedObjectsX; i = i + 100) 
            {
                //System.out.println(i + " ");
                positionX[t] = i;
                positionY[t] = movingObjectsY;
                t++;
            }
        }
        if (movingObjectsX > fixedObjectsX) 
        {
            for (int i = movingObjectsX; i >= fixedObjectsX; i = i - 100) 
            {
                //System.out.println(i + " ");
                positionX[t] = i;
                positionY[t] = movingObjectsY;
                t++;
            }
        }
        if (movingObjectsY <= fixedObjectsY) 
        {
            for (int i = movingObjectsY; i <= fixedObjectsY; i += 80) 
            {
                System.out.println(i + " ");
                positionY[t] = i;
                positionX[t] = fixedObjectsX;
                t++;
            }
        }
        if (movingObjectsY > fixedObjectsY) 
        {
            for (int i = movingObjectsY; i >= fixedObjectsY; i -= 80) 
            {
                //System.out.println(i + " ");
                positionY[t] = i;
                positionX[t] = fixedObjectsX;
                t++;
            }
        }
    }

    Rectangle movingRectangle = new Rectangle(movingObjectsX, movingObjectsY, 80, 100);
   // Rectangle fixedRectangle = new Rectangle(fixedObjectsX, fixedObjectsY, 80, 100);
    

    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);

        int y = 0, x = 0, px = 10, py = 10;

        for (int i = 0; i < 6; i++) 
        {
            g.drawLine(px, y + py, 500 + px, y + py);
            g.drawLine(x + px, py, x + px, 400 + py);
            x += 100;
            y += 80;
        }

        g.drawOval(fixedObjectsX, fixedObjectsY, 100, 80);
        g.setColor(Color.GREEN);
        g.fillRect(fixedObjectsX, fixedObjectsY, 100, 80);
        
        g.setColor(Color.BLACK);
        g.drawString("food", fixedObjectsX+40, fixedObjectsY+38);
        
        
        g.setColor(Color.RED);
        g.fillRect(movingRectangle.x, movingRectangle.y, movingRectangle.height, movingRectangle.width);
        g.setColor(Color.BLACK);
        g.drawString("Snake", movingRectangle.x+40, movingRectangle.y+38);
        
        repaint();
    }

    public void move(int a, int b) 
    {
        movingRectangle.x = a;
        movingRectangle.y = b;
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void run() 
    {
        int cx, dx;
        try 
        {
            for (int i = 0; i < t; i++) 
            {
                cx = positionX[i];
                dx = positionY[i];
                move(cx, dx);
                
                if( (cx == fixedObjectsX) && (dx == fixedObjectsY) )
                {
                    JOptionPane.showMessageDialog(null, "Finished...!!!", "Finished", JOptionPane.DEFAULT_OPTION);
                    break;
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) 
        {
            System.out.println("error");
        }
    }
}
