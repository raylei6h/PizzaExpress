/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzaexpress;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author 63961
 */
public class userFrame extends javax.swing.JFrame {


    /**
     * Creates new form mainUI
     */
    
    public userFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    boolean a = false;
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        icominmaxclose = new javax.swing.JPanel();
        closeButton = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        maxButton = new javax.swing.JPanel();
        max = new javax.swing.JLabel();
        minButton = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        hidemenuline = new javax.swing.JPanel();
        hideMenu = new javax.swing.JPanel();
        settingmenuline = new javax.swing.JPanel();
        settingMenu = new javax.swing.JPanel();
        menuhide = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setBackground(new java.awt.Color(215, 78, 9));
        header.setPreferredSize(new java.awt.Dimension(800, 50));
        header.setLayout(new java.awt.BorderLayout());

        icominmaxclose.setBackground(new java.awt.Color(215, 78, 9));
        icominmaxclose.setPreferredSize(new java.awt.Dimension(150, 50));
        icominmaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButton.setBackground(new java.awt.Color(215, 78, 9));
        closeButton.setLayout(new java.awt.BorderLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        closeButton.add(close, java.awt.BorderLayout.CENTER);

        icominmaxclose.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        maxButton.setBackground(new java.awt.Color(215, 78, 9));
        maxButton.setLayout(new java.awt.BorderLayout());

        max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/full_screen_32px.png"))); // NOI18N
        max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxMouseExited(evt);
            }
        });
        maxButton.add(max, java.awt.BorderLayout.CENTER);

        icominmaxclose.add(maxButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        minButton.setBackground(new java.awt.Color(215, 78, 9));
        minButton.setLayout(new java.awt.BorderLayout());
        icominmaxclose.add(minButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        header.add(icominmaxclose, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(215, 78, 9));
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 50));
        jPanel2.setLayout(new java.awt.BorderLayout());
        header.add(jPanel2, java.awt.BorderLayout.LINE_START);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(50, 450));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(215, 78, 9));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hidemenuline.setBackground(new java.awt.Color(215, 78, 9));
        hidemenuline.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout hidemenulineLayout = new javax.swing.GroupLayout(hidemenuline);
        hidemenuline.setLayout(hidemenulineLayout);
        hidemenulineLayout.setHorizontalGroup(
            hidemenulineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        hidemenulineLayout.setVerticalGroup(
            hidemenulineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(hidemenuline, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        hideMenu.setBackground(new java.awt.Color(215, 78, 9));
        hideMenu.setLayout(new java.awt.BorderLayout());
        MenuIcon.add(hideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        settingmenuline.setBackground(new java.awt.Color(215, 78, 9));
        settingmenuline.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout settingmenulineLayout = new javax.swing.GroupLayout(settingmenuline);
        settingmenuline.setLayout(settingmenulineLayout);
        settingmenulineLayout.setHorizontalGroup(
            settingmenulineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        settingmenulineLayout.setVerticalGroup(
            settingmenulineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(settingmenuline, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, -1));

        settingMenu.setBackground(new java.awt.Color(215, 78, 9));
        settingMenu.setLayout(new java.awt.BorderLayout());
        MenuIcon.add(settingMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 50));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(240, 240, 201));
        menuhide.setPreferredSize(new java.awt.Dimension(50, 550));

        javax.swing.GroupLayout menuhideLayout = new javax.swing.GroupLayout(menuhide);
        menuhide.setLayout(menuhideLayout);
        menuhideLayout.setHorizontalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menuhideLayout.setVerticalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        dashboard.setBackground(new java.awt.Color(242, 187, 5));

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(dashboard, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void colorChange(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    public void triggerMenu(JPanel h1, JPanel h2,int nbool){
        if(nbool == 1){
            h1.setBackground(new Color(240,240,201));
            h2.setBackground(new Color(215,78,9));
        }
            else{
            h2.setBackground(new Color(240,240,201));
            h1.setBackground(new Color(215,78,9));   
                    }
     
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard){
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
        }
        else{
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
        }
        
    }
    
    
    
    
    
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);    

    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        colorChange(closeButton, new Color(240,240,201));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited

        colorChange(closeButton, new Color(215,78,9));
    }//GEN-LAST:event_closeMouseExited

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        if(this.getExtendedState() != userFrame.MAXIMIZED_BOTH){
            this.setExtendedState(userFrame.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(userFrame.NORMAL);
        }
    }//GEN-LAST:event_maxMouseClicked

    private void maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseEntered
        colorChange(maxButton, new Color(240,240,201));
    }//GEN-LAST:event_maxMouseEntered

    private void maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseExited
        colorChange(maxButton, new Color(215,78,9));
    }//GEN-LAST:event_maxMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
                                                                                      
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JLabel close;
    private javax.swing.JPanel closeButton;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hideMenu;
    private javax.swing.JPanel hidemenuline;
    private javax.swing.JPanel icominmaxclose;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel max;
    private javax.swing.JPanel maxButton;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel minButton;
    private javax.swing.JPanel settingMenu;
    private javax.swing.JPanel settingmenuline;
    // End of variables declaration//GEN-END:variables
}
