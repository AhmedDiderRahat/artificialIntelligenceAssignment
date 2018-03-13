package com.neub.cse_412_assignment_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author Pritom Chowdhury & Ahmed Dider Rahat
 */

public class MovingPage implements MenuListener, ActionListener{
    
    public int movingObjectsX, movingObjectsY, fixedObjectsX, fixedObjectsY, tempX, tempY, counter=0;
         
    JFrame frame; 
    JMenuBar menuBar;
    JMenu m1;
    
    public MovingPage() 
    {       
        frame = new JFrame("Vaccum Clean and Dust");   
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        menuBar = new JMenuBar();
        m1 = new JMenu("Home");
        m1.addMenuListener(this);
        menuBar.add(m1);
        frame.setJMenuBar(menuBar);
        frameCreate();   
    }
    
    public void frameCreate()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        TwoDPlane dPlane = new TwoDPlane();                   
        frame.add(dPlane);

        Thread t = new Thread(dPlane);
        t.start();
    }    

    @Override
    public void menuSelected(MenuEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LandingPage ob = new LandingPage();
        frame.setVisible(false);
    }

    @Override
    public void menuDeselected(MenuEvent e)
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
