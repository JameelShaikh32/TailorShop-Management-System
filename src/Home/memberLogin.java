/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.sql.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author jameel
 */
public class memberLogin extends javax.swing.JFrame {

    /**
     * Creates new form memberLogin
     */
    public memberLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        memuser = new javax.swing.JTextField();
        mempass = new javax.swing.JTextField();
        memlog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>CITY JEANS<sup style=\"font-size: 10px;\"> EMPLOYEE</sup></html>");

        memuser.setBackground(new java.awt.Color(81, 79, 79));
        memuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        memuser.setForeground(new java.awt.Color(255, 153, 153));
        memuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        memuser.setText("Enter Username");
        memuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        memuser.setCaretColor(new java.awt.Color(255, 0, 0));
        memuser.setName("user"); // NOI18N
        memuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                memuserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                memuserFocusLost(evt);
            }
        });

        mempass.setBackground(new java.awt.Color(81, 79, 79));
        mempass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mempass.setForeground(new java.awt.Color(255, 153, 153));
        mempass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mempass.setText("Enter Password");
        mempass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        mempass.setCaretColor(new java.awt.Color(255, 0, 0));
        mempass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mempassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mempassFocusLost(evt);
            }
        });

        memlog.setBackground(new java.awt.Color(81, 79, 79));
        memlog.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        memlog.setForeground(new java.awt.Color(255, 51, 51));
        memlog.setText("Login");
        memlog.setBorder(null);
        memlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memlogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(memlog, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mempass, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(memuser, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(mempass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(memlog, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(memuser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(179, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void memuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memuserFocusGained
        // TODO add your handling code here:
        memuser.setText("");
        memuser.setForeground(new Color(255,51,51));
    }//GEN-LAST:event_memuserFocusGained

    private void memuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memuserFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_memuserFocusLost

    private void memlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memlogActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6460932", "sql6460932", "8898");

            String sql = "select username = ? and password = ? from members";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, memuser.getText());
            stmt.setString(2, mempass.getText());
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Login Successfull", "City Jeans", JOptionPane.PLAIN_MESSAGE);
                new home().setVisible(true);
                Home.home.panel3.setVisible(false);
                Home.home.menupanel.setVisible(false);
                Home.home.menu.setVisible(false);
                Home.home.jLabel1.setText("<html>&nbsp;&nbsp;&nbsp;CITY JEANS<sup style=\"font-size: 12px;\"> EMPLOYEE</sup></html>");
            }
            dispose();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_memlogActionPerformed

    private void mempassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mempassFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_mempassFocusLost

    private void mempassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mempassFocusGained
        // TODO add your handling code here:
        mempass.setText("");
        mempass.setForeground(new Color(255,51,51));
    }//GEN-LAST:event_mempassFocusGained

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
            java.util.logging.Logger.getLogger(memberLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(memberLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(memberLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(memberLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new memberLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton memlog;
    private javax.swing.JTextField mempass;
    private javax.swing.JTextField memuser;
    // End of variables declaration//GEN-END:variables
}
