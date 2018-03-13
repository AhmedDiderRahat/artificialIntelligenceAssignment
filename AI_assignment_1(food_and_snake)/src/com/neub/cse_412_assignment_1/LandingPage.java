package com.neub.cse_412_assignment_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.neub.cse_412_assignment_1.developer_information.DeveloperOption;

/**
 *
 * @author Pritom Chowdhury & Ahmed Dider Rahat
 */

public class LandingPage extends javax.swing.JFrame implements ActionListener
{
    public int movingObjectsX, movingObjectsY, fixedObjectsX, fixedObjectsY, tempX, tempY, counter=0;
    
    public LandingPage()
    {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        jButton_1.addActionListener(this);
        jButton_2.addActionListener(this);
        jButton_3.addActionListener(this);
        jButton_4.addActionListener(this);
        jButton_5.addActionListener(this);
        jButton_6.addActionListener(this);
        jButton_7.addActionListener(this);
        jButton_8.addActionListener(this);
        jButton_9.addActionListener(this);
        jButton_10.addActionListener(this);
        jButton_11.addActionListener(this);
        jButton_12.addActionListener(this);
        jButton_13.addActionListener(this);
        jButton_14.addActionListener(this);
        jButton_15.addActionListener(this);
        jButton_16.addActionListener(this);
        jButton_17.addActionListener(this);
        jButton_18.addActionListener(this);
        jButton_19.addActionListener(this);
        jButton_20.addActionListener(this);
        jButton_21.addActionListener(this);
        jButton_22.addActionListener(this);
        jButton_23.addActionListener(this);
        jButton_24.addActionListener(this);
        jButton_25.addActionListener(this);
        DeveloperjMenuItem.addActionListener(this);
        ExitjMenuItem.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent button) 
    {
        if(button.getSource() == jButton_1)
        {
            tempX = 10;
            tempY = 10;
            counter++;
        } if(button.getSource() == jButton_2) {
            tempX = 110;
            tempY = 10; 
            counter++;
        } if(button.getSource() == jButton_3) {
            tempX = 210;
            tempY = 10;
            counter++;
        } if(button.getSource() == jButton_4) {
            tempX = 310;
            tempY = 10;
            counter++;
        } if(button.getSource() == jButton_5) {
            tempX = 410;
            tempY = 10;
            counter++;
        } if(button.getSource() == jButton_6) {
            tempX = 10;
            tempY = 90;
            counter++;
        } if(button.getSource() == jButton_7) {
            tempX = 110;
            tempY = 90;
            counter++;
        } if(button.getSource() == jButton_8) {
            tempX = 210;
            tempY = 90;
            counter++;
        } if(button.getSource() == jButton_9) {
            tempX = 310;
            tempY = 90;
            counter++;
        } if(button.getSource() == jButton_10) {
            tempX = 410;
            tempY = 90;
            counter++;
        } if(button.getSource() == jButton_11) {
            tempX = 10;
            tempY = 170;
            counter++;
        } if(button.getSource() == jButton_12) {
            tempX = 110;
            tempY = 170;
            counter++;
        } if(button.getSource() == jButton_13) {
            tempX = 210;
            tempY = 170;
            counter++;
        } if(button.getSource() == jButton_14) {
            tempX = 310;
            tempY = 170;
            counter++;
        } if(button.getSource() == jButton_15) {
            tempX = 410;
            tempY = 170;
            counter++;
        } if(button.getSource() == jButton_16) {
            tempX = 10;
            tempY = 250;
            counter++;
        } if(button.getSource() == jButton_17) {
            tempX = 110;
            tempY = 250;
            counter++;
        } if(button.getSource() == jButton_18) {
            tempX = 210;
            tempY = 250;
            counter++;
        } if(button.getSource() == jButton_19) {
            tempX = 310;
            tempY = 250;
            counter++;
        } if(button.getSource() == jButton_20) {
            tempX = 410;
            tempY = 250;
            counter++;
        } if(button.getSource() == jButton_21) {
            tempX = 10;
            tempY = 330;
            counter++;
        } if(button.getSource() == jButton_22) {
            tempX = 110;
            tempY = 330;
            counter++;
        } if(button.getSource() == jButton_23) {
            tempX = 210;
            tempY = 330;
            counter++;
        } if(button.getSource() == jButton_24) {
            tempX = 310;
            tempY = 330;
            counter++;
        } if(button.getSource() == jButton_25) {
            tempX = 410;
            tempY = 330;
            counter++;
        } if(counter == 1) {
            movingObjectsX = tempX; 
            movingObjectsY = tempY;
        } if(counter == 2) {
            fixedObjectsX = tempX;
            fixedObjectsY = tempY; 
            System.out.println("Mov X = " + movingObjectsX + " MovY = " + 
                    movingObjectsY + " Fixed X = " + fixedObjectsX + 
                    " Fixed Y " + fixedObjectsY);
            this.dispose();
            MovingPage movingPage = new MovingPage(movingObjectsX, 
                    movingObjectsY, fixedObjectsX, fixedObjectsY);
        } if(button.getSource() == DeveloperjMenuItem)
        {
            DeveloperOption developerOption = new DeveloperOption();
            this.dispose();
        } if(button.getSource() == ExitjMenuItem)
        {
            this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton_1 = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_6 = new javax.swing.JButton();
        jButton_7 = new javax.swing.JButton();
        jButton_8 = new javax.swing.JButton();
        jButton_9 = new javax.swing.JButton();
        jButton_10 = new javax.swing.JButton();
        jButton_11 = new javax.swing.JButton();
        jButton_12 = new javax.swing.JButton();
        jButton_13 = new javax.swing.JButton();
        jButton_14 = new javax.swing.JButton();
        jButton_15 = new javax.swing.JButton();
        jButton_16 = new javax.swing.JButton();
        jButton_17 = new javax.swing.JButton();
        jButton_18 = new javax.swing.JButton();
        jButton_19 = new javax.swing.JButton();
        jButton_20 = new javax.swing.JButton();
        jButton_21 = new javax.swing.JButton();
        jButton_22 = new javax.swing.JButton();
        jButton_23 = new javax.swing.JButton();
        jButton_24 = new javax.swing.JButton();
        jButton_25 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        HomejMenu = new javax.swing.JMenu();
        DeveloperjMenuItem = new javax.swing.JMenuItem();
        ExitjMenu = new javax.swing.JMenu();
        ExitjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });

        jButton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_6ActionPerformed(evt);
            }
        });

        jButton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_9ActionPerformed(evt);
            }
        });

        jButton_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_20ActionPerformed(evt);
            }
        });

        jButton_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HomejMenu.setText("Home");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ExitjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitjMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitjMenuItemActionPerformed
    private void jButton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_6ActionPerformed

    private void jButton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_9ActionPerformed

    private void jButton_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_20ActionPerformed

    private void jButton_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_24ActionPerformed

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_1ActionPerformed
     public static void main(String args[]) 
     {
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
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_10;
    private javax.swing.JButton jButton_11;
    private javax.swing.JButton jButton_12;
    private javax.swing.JButton jButton_13;
    private javax.swing.JButton jButton_14;
    private javax.swing.JButton jButton_15;
    private javax.swing.JButton jButton_16;
    private javax.swing.JButton jButton_17;
    private javax.swing.JButton jButton_18;
    private javax.swing.JButton jButton_19;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_20;
    private javax.swing.JButton jButton_21;
    private javax.swing.JButton jButton_22;
    private javax.swing.JButton jButton_23;
    private javax.swing.JButton jButton_24;
    private javax.swing.JButton jButton_25;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_8;
    private javax.swing.JButton jButton_9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
