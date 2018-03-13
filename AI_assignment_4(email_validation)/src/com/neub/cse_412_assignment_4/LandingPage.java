package com.neub.cse_412_assignment_4;

import com.neub.cse_412_assignment_3.developer_information.DeveloperOption;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahat-Pritom
 */

public class LandingPage extends javax.swing.JFrame implements ActionListener{
        
    public LandingPage() throws IOException 
    {
        initComponents();
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        OkjButton.addActionListener(this);
        DeveloperjMenuItem.addActionListener(this);
        ExitjMenuItem.addActionListener(this);
    }
            
    public boolean isValidTopLevelDomain(String topLevelDomain)
    {
        String[] topLevelDomainList = {"com", "edu", "int", "gov", "net", "mil", "org"};
        
        for (String topLevelDomainList1 : topLevelDomainList) {
            if (topLevelDomainList1.equalsIgnoreCase(topLevelDomain)) {
                return true;
            }
        }
        return false;   
    }

    public boolean isValidCountryDomain(String countryDomain)
    {
        if(countryDomain.equals(" "))
            return true;
        
        String[] countryDomainList = {"ar", "au", "bd", "bt", "cn", "eg", "id", 
            "in", "jp", "lk", "my", "nl", "pk", "sa", "th", "tr", "uk", "us", "zw"};
        
        for (String countryDomainList1 : countryDomainList) {
            if (countryDomainList1.equalsIgnoreCase(countryDomain)) {
                return true;
            }
        }
        return false;   
    }
    
    public boolean isValidCompanyName(String companyName)
    {
        return (companyName.matches("[a-z]+") ) || (companyName.matches("[A-Z]+"));
    }
    
    public boolean isValidEmailName(String EmailName)
    {
        if(!Character.isLetter(EmailName.charAt(0)))
            return false;
        
        for(int i=1; i<EmailName.length(); i++)
        {
            if( !Character.isLetterOrDigit(EmailName.charAt(i)) )
                if(EmailName.charAt(i) != '_')
                    return false;
        }        
        return true;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent button) 
    {
        if(button.getSource() == OkjButton)
        {
            String emailPartList[] = new String[10];
            
            for(int i=0; i<10; i++)
                emailPartList[i] = " ";
            
            String email = EmailjTextField.getText().trim();
            int numberOfAtTheRate=0;
            String part = "";
            int numberOfPArt = 0;
            int numberOfDot = 0;
            for(int i=0; i<email.length(); i++)
            {
                part = "";
                while( (i<email.length()) && ( (email.charAt(i)!='.' ) && (email.charAt(i)!='@' ) ) )
                {
                    part = part + "" + email.charAt(i);
                    i++;
                }
                
                if( (i<email.length()) && (email.charAt(i) == '@') )
                    numberOfAtTheRate++;
                
                if( (i<email.length()) && (email.charAt(i) == '.') )
                    numberOfDot++;
                
                emailPartList[numberOfPArt++] = part;
            }

            //assign value of part:
            String email_name = emailPartList[0];
            String domain_name = emailPartList[1];
            String top_level_domain = emailPartList[2];
            String country_domain = emailPartList[3];
            
            if( (numberOfDot==(numberOfPArt-2)) && (numberOfAtTheRate == 1) && 
                    isValidEmailName(email_name)  && isValidCompanyName(domain_name) 
                    && isValidTopLevelDomain(top_level_domain) && isValidCountryDomain(country_domain))
            {
                JOptionPane.showMessageDialog(null, "Valid...!!!", "", JOptionPane.DEFAULT_OPTION);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid...!!!", "", JOptionPane.DEFAULT_OPTION);
            }
            
            EmailjTextField.setText("");
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
        EmailjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        OkjButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        HomejMenu = new javax.swing.JMenu();
        DeveloperjMenuItem = new javax.swing.JMenuItem();
        ExitjMenu = new javax.swing.JMenu();
        ExitjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EmailjTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Enter An Email : ");

        OkjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OkjButton.setForeground(new java.awt.Color(153, 0, 0));
        OkjButton.setText("OK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OkjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(EmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(OkjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitjMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitjMenuItemActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LandingPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DeveloperjMenuItem;
    private javax.swing.JTextField EmailjTextField;
    private javax.swing.JMenu ExitjMenu;
    private javax.swing.JMenuItem ExitjMenuItem;
    private javax.swing.JMenu HomejMenu;
    private javax.swing.JButton OkjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
