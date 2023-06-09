/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandregister;

import java.lang.System.Logger;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;



/**
 *
 * @author prade
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabelmin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JLabelclose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1_login = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton_Login = new javax.swing.JButton();
        jLabelregister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabelmin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelmin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelmin.setText("-");
        jLabelmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelminMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Login Form");

        JLabelclose.setBackground(new java.awt.Color(255, 255, 255));
        JLabelclose.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        JLabelclose.setText("X");
        JLabelclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLabelclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(jLabelmin)
                .addGap(18, 18, 18)
                .addComponent(JLabelclose)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelmin)
                    .addComponent(JLabelclose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 50);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setBackground(new java.awt.Color(51, 51, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Password:");

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Username:");

        jTextField1_login.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_loginActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Cancel");

        jButton_Login.setBackground(new java.awt.Color(51, 255, 51));
        jButton_Login.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_Login.setText("Login");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jLabelregister.setText("click here to create a new account");
        jLabelregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelregisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Login)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1_login)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                            .addComponent(jLabelregister, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(48, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(270, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jTextField1_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton_Login))
                .addGap(18, 18, 18)
                .addComponent(jLabelregister)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 400, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_loginActionPerformed

    private void JLabelcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelcloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JLabelcloseMouseClicked

    private void jLabelminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelminMouseClicked

    private void jLabelregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelregisterMouseClicked
        // TODO add your handling code here:
       RegisterForm rgf=new RegisterForm();
       rgf.setVisible(true);
       rgf.pack();
       rgf.setLocationRelativeTo(null);
       rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabelregisterMouseClicked

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps;
        ResultSet rs;
        String Username=jTextField1_login.getText();
        String password=String.valueOf(jPasswordField1.getPassword());
        
        String query="SELECT*FROM login WHERE Username=? AND Password=?";
        
        try{
            ps=MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, Username);
            ps.setString(2, password);
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                 LoginForm mf = new LoginForm();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    mf.jLabelregister.setText("Welcome < "+Username+" >");
                    
                    this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Login Failed", 2);
            }
        }catch(SQLException e){
            
           // Logger.Logger(LoginForm.class.getName()).log(Level.ERROR,null,e);
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelclose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JLabel jLabelregister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1_login;
    // End of variables declaration//GEN-END:variables

    
}
