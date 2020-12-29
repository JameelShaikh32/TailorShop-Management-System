
package Home;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;

public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        
    }
    
    private ImageIcon RImage(ImageIcon path){
    Image i = path.getImage();
    Image newimg = i.getScaledInstance(Home.home.profile.getWidth(), Home.home.profile.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon i2 = new ImageIcon(newimg);
    return i2;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        login = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        register = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("City Jeans");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Home/images/favicon-32x32.png")).getImage());
        setIconImages(null);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(81, 79, 79));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>CITY JEANS<sup style=\"font-size: 10px;\"> ADMIN</sup></html>");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/icons8_user_24px_2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/icons8_password_24px_1.png"))); // NOI18N

        user.setBackground(new java.awt.Color(81, 79, 79));
        user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setToolTipText("ff");
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        user.setCaretColor(new java.awt.Color(255, 255, 255));
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user.setNextFocusableComponent(pass);

        login.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/icons8_login_64px.png"))); // NOI18N
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        pass.setBackground(new java.awt.Color(81, 79, 79));
        pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pass.setCaretColor(new java.awt.Color(255, 255, 255));

        register.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("<html>Employee? <p style=\"color:orange;\">Login here</p></html>");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(user)
                            .addComponent(pass)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(user))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(pass))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://www.remotemysql.com:3306/rVPGwzQ1zC", "rVPGwzQ1zC", "uMcb3Rj2Qn");
            
            String sql = "select * from user where username = ? and password = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, user.getText());
            stmt.setString(2, pass.getText());
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                String usr = user.getText();
                String pss = pass.getText();
                new home().setVisible(true);
                String u = rs.getString(1);
                Blob b = rs.getBlob(3);
                FileOutputStream out = new FileOutputStream("C://Users/Public/Pictures/" + u + ".jpg");
                int len = (int) b.length();
                byte[] buffer = b.getBytes(1, len);
                out.write(buffer,0,len);
                
                buffer = b.getBytes(1, (int)b.length());
                BufferedImage imag = ImageIO.read(new ByteArrayInputStream(buffer));
                ImageIcon imgicon = new ImageIcon(imag);
                Home.home.profile.setIcon(RImage(imgicon));
                dispose();               
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Username/Password ", "Error", JOptionPane.ERROR_MESSAGE);
                user.setText("");
                pass.setText("");
            }
            
            Home.home.welcome.setText(user.getText().toUpperCase());
            con.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        // TODO add your handling code here:
        dispose();
        new memberLogin().setVisible(true);
    }//GEN-LAST:event_registerMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    public static javax.swing.JPasswordField pass;
    private javax.swing.JLabel register;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}