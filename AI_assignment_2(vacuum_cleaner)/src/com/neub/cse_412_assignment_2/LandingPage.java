package com.neub.cse_412_assignment_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.neub.cse_412_assignment_2.developer_information.DeveloperOption;

/**
 *
 * @author Pritom Chowdhury & Ahmed Dider Rahat
 */

public class LandingPage extends javax.swing.JFrame implements ActionListener{
    
    int dustPositionX[] = new int[10];
    int dustPositionY[] = new int[10];
    public static int dustX, dustY;


    public LandingPage() 
    {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        clean.addActionListener(this);
        
        DeveloperjMenuItem.addActionListener(this);
        ExitjMenuItem.addActionListener(this);
        
        int num = 9, answer=9;
        
        while(true)
        {
            Random r = new Random();
            num = r.nextInt(10);
          
            if(num==0 || num==1)
                break;
            answer = num;
        }
        
        dustPositionX[0] = 30;
        dustPositionY[0] = 20;
        dustPositionX[1] = 170;
        dustPositionY[1] = 20;
        dustPositionX[2] = 310;
        dustPositionY[2] = 20;
        
        dustPositionX[3] = 30;
        dustPositionY[3] = 160;
        dustPositionX[4] = 170;
        dustPositionY[4] = 160;
        dustPositionX[5] = 310;
        dustPositionY[5] = 160;
        
        dustPositionX[6] = 30;
        dustPositionY[6] = 300;
        dustPositionX[7] = 170;
        dustPositionY[7] = 300;
        dustPositionX[8] = 310;
        dustPositionY[8] = 300;
        
        System.out.println("answe = "  + answer);
        
        dustX = dustPositionX[answer-1];
        dustY = dustPositionY[answer-1];
        
    }
    
    @Override
    public void actionPerformed(ActionEvent button) {
        
        if(button.getSource() == clean)
        {
            MovingPage  movingPage = new MovingPage();
            this.dispose();
        }
        if(button.getSource() == DeveloperjMenuItem)
        {
            DeveloperOption developerOption = new DeveloperOption();
            this.dispose();
        }
        if(button.getSource() == ExitjMenuItem)
            this.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clean = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        HomejMenu = new javax.swing.JMenu();
        DeveloperjMenuItem = new javax.swing.JMenuItem();
        ExitjMenu = new javax.swing.JMenu();
        ExitjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(340, 320));

        clean.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clean.setForeground(new java.awt.Color(0, 0, 204));
        clean.setText("start Cleaning ?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clean, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HomejMenu.setText("Developer");

        DeveloperjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        DeveloperjMenuItem.setText("Developer");
        HomejMenu.add(DeveloperjMenuItem);

        jMenuBar1.add(HomejMenu);

        ExitjMenu.setText("Exit");

        ExitjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        ExitjMenuItem.setText("Exit");
        ExitjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitjMenuItemActionPerformed(evt);
            }
        });
        ExitjMenu.add(ExitjMenuItem);

        jMenuBar1.add(ExitjMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitjMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitjMenuItemActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DeveloperjMenuItem;
    private javax.swing.JMenu ExitjMenu;
    private javax.swing.JMenuItem ExitjMenuItem;
    private javax.swing.JMenu HomejMenu;
    private javax.swing.JButton clean;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
