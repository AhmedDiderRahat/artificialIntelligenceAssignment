package com.neub.cse_412_assignment_3;

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
    
    public static String[] MansName = new String[250];
    public static String[] WomensName = new String[250];
    
    public static double menAvgLengthOfMenName, menAvgOfSmallPart, womenAvgLengthOfMenName, womenAvgOfSmallPart, total, lenOfSmallPArt;
    
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
        
        readMensName();
        readGirlsName();        
    }
    
    int readFile(String fileName, String gender) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try 
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int i=0;
            while (line != null) 
            {
                if(gender.equals("men"))
                    MansName[i] = line;
                else
                    WomensName[i] = line;
                
                line = br.readLine();
                i++;
            }
            return i;
        } finally {
            br.close();
        }
    }
    
    public boolean SpecialKeyWordForMen(String Name)
    {
        String[] menKey = {"Mr.", "Syed", "Md.", "Md", "Muhammad", "Mohammad", "Abdullah", "Akter", "Ahmed"};
        
        for(int i=0; i<menKey.length; i++)
        {
            if(menKey[i].equalsIgnoreCase(Name))
                return true;
        }
        return false;   
    }
    
    public boolean SpecialKeyWordForWomen(String Name)
    {
        String[] womenKey = {"Syeda", "Mrs.", "Miss", "Sultana", "Begum", "Ummay", 
            "Khatun", "Mst", "Musammat", "Khatun", "Mst.", "Mist.", "Sayeeda", 
            "Akter", "Ahmed", "Khanom"};
        for(int i=0; i<womenKey.length; i++)
        {
            if(womenKey[i].equalsIgnoreCase(Name))
                return true;
        }
        return false;   
    }
    
    public void readMensName() throws IOException
    {
        int count = 0, len = readFile("inputMen.txt", "men");
        total = 0.0;
        lenOfSmallPArt = 0.0;
        
        for(int i=0; i<len; i++)
        {
            total += MansName[i].length();
            String temp = MansName[i];
            int totalTemp=0;
            int j;
            for(j=0; j<temp.length(); j++)
            {
                if( (temp.charAt(j) != ' ') && (j!=(temp.length()-1)) )
                {
                    totalTemp++;
                }
                else
                {
                    if(j == (temp.length()-1))
                        totalTemp++;
                    lenOfSmallPArt += totalTemp;
                    totalTemp = 0;
                    count++;
                }
            }  
        }
        menAvgLengthOfMenName = total / (len*1.0);
        menAvgOfSmallPart = lenOfSmallPArt / (count*1.0);
    }
    
    public void readGirlsName() throws IOException
    {
        int count = 0, len = readFile("inputWomen.txt", "women");
        total = 0.0;
        lenOfSmallPArt = 0.0;
        
        for(int i=0; i<len; i++)
        {
            total +=  WomensName[i].length();
            String temp = WomensName[i];
            int totalTemp=0;
            int j;
            for(j=0; j<temp.length(); j++)
            {
                if( (temp.charAt(j) != ' ') && (j!=(temp.length()-1)) )
                {
                    totalTemp++;
                }
                else
                {
                    if(j == (temp.length()-1))
                        totalTemp++;
                    lenOfSmallPArt += totalTemp;
                    totalTemp = 0;
                    count++;
                }
            }  
        }
        womenAvgLengthOfMenName = total / (len*1.0);
        womenAvgOfSmallPart = lenOfSmallPArt / (count*1.0); 
    }
    
    double difference(double a, double b)
    {
        if(a>b)
            return a-b;
        return b-a;
    }
    
    @Override
    public void actionPerformed(ActionEvent button) 
    {
        if(button.getSource() == OkjButton)
        {
            double valueOfM=0, valueOfW=0;
            String name = NamejTextField.getText().trim();
            
            //System.out.println(name +" ");
            String tempName="";
            
            for(int i=0; i<name.length(); i++)
            {
                if( (name.charAt(i) != ' ') && (i!=(name.length()-1)) )
                    tempName = tempName + name.charAt(i);
                else
                {
                    if(i==name.length()-1)
                        tempName = tempName+name.charAt(i);
                    
                    //main calculation :
                    String testName = tempName;
                    char ch = tempName.charAt(tempName.length()-1);
                    
                    if( (ch=='y') || (ch=='e') || (ch=='a') || (ch=='i') ){
                        valueOfW += 0.5;
                        System.out.println("effwfg");
                    }
                    else
                        valueOfM += .3;
                    
                    if(SpecialKeyWordForMen(testName))
                        valueOfM += 5;
                    if(SpecialKeyWordForWomen(testName))
                        valueOfW +=5;
                    
                    //System.out.println(SpecialKeyWordForWomen(name) + "");
                    
                    valueOfM += (difference(menAvgOfSmallPart , (tempName.length()*1.0)))/10;                    
                    valueOfW += (difference(womenAvgOfSmallPart , (tempName.length()*1.0)))/10;
                   
                    tempName = "";
                }
            }
            
            valueOfM += (difference( ( name.length()*1.0) , menAvgLengthOfMenName)) / 10 ;
            
            valueOfW += (difference( ( name.length()*1.0) , womenAvgLengthOfMenName)) / 10;
            
            System.out.println("M = " + valueOfM + " W = " + valueOfW);
            
            if(valueOfM >= valueOfW)
                JOptionPane.showMessageDialog(null, "Man...!!!",
                        "", JOptionPane.DEFAULT_OPTION);
            else
               JOptionPane.showMessageDialog(null, "Woman...!!!",
                        "", JOptionPane.DEFAULT_OPTION);
            
            NamejTextField.setText("");
            
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
        NamejTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        OkjButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        HomejMenu = new javax.swing.JMenu();
        DeveloperjMenuItem = new javax.swing.JMenuItem();
        ExitjMenu = new javax.swing.JMenu();
        ExitjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NamejTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Enter A Name : ");

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
                        .addComponent(NamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JMenu ExitjMenu;
    private javax.swing.JMenuItem ExitjMenuItem;
    private javax.swing.JMenu HomejMenu;
    private javax.swing.JTextField NamejTextField;
    private javax.swing.JButton OkjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
