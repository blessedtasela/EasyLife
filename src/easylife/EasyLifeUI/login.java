
package easylife.EasyLifeUI;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class login extends javax.swing.JFrame {

    dbConnection connect;

    public login() {
        initComponents();
        connect = new dbConnection();

        if (connect == null) {
            System.out.println("Error in connection. Can't connect to database");
        } else {
            System.out.println("Connection successful");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jlabelLoginLogo = new javax.swing.JLabel();
        jLabeldescription = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelUserLabel = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButtonPasswordRecovery = new javax.swing.JButton();
        jLabelPasswordLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonContactForm = new javax.swing.JButton();
        jButtonRegisterUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(29, 101, 166));

        jLabel7.setForeground(new java.awt.Color(242, 161, 4));
        jLabel7.setText("<html>  <h1>LOG IN</h1> </html>");

        jlabelLoginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easylife/img/EasyLife-logo.jpg"))); // NOI18N
        jlabelLoginLogo.setLabelFor(jlabelLoginLogo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabelLoginLogo))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlabelLoginLogo))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabeldescription.setBackground(new java.awt.Color(153, 153, 153));
        jLabeldescription.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabeldescription.setText("<html><h3>Please provide your login details to continue</h3></html>");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelUserLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUserLabel.setText("username");

        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jPasswordFieldPassword.setText("jPasswordField1");
        jPasswordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordActionPerformed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(204, 204, 255));
        jButtonLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(29, 101, 166));
        jButtonLogin.setText("login");
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authenticate(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Forgotten password? ");

        jButtonPasswordRecovery.setForeground(new java.awt.Color(242, 161, 4));
        jButtonPasswordRecovery.setText("click here to recover your password");
        jButtonPasswordRecovery.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPasswordRecovery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPasswordRecovery.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonPasswordRecovery.setDefaultCapable(false);
        jButtonPasswordRecovery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPasswordRecoveryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPasswordRecoveryMouseEntered(evt);
            }
        });
        jButtonPasswordRecovery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasswordRecoveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPasswordRecovery)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButtonPasswordRecovery))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPasswordLabel.setText("password");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButtonContactForm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonContactForm.setForeground(new java.awt.Color(242, 161, 4));
        jButtonContactForm.setText("contact us");
        jButtonContactForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContactFormActionPerformed(evt);
            }
        });

        jButtonRegisterUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRegisterUser.setForeground(new java.awt.Color(242, 161, 4));
        jButtonRegisterUser.setText("sign up now");
        jButtonRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegisterUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jButtonContactForm)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonContactForm)
                    .addComponent(jButtonRegisterUser))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelPasswordLabel)
                                    .addComponent(jLabelUserLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(jTextFieldUsername))))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelUserLabel)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPasswordLabel))
                .addGap(8, 8, 8)
                .addComponent(jButtonLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeldescription, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabeldescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void authenticate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authenticate
        // TODO add your handling code here:
    }//GEN-LAST:event_authenticate

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        String username = jTextFieldUsername.getText();
        String password = String.valueOf(jPasswordFieldPassword.getPassword());

        if (username.isEmpty() && password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "username and password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "please input username", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "please input password", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                userLogin(username, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonPasswordRecoveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasswordRecoveryActionPerformed
        // TODO add your handling code here:
        Connection dbconn = dbConnection.connectDb();
        if (dbconn != null) {
            dispose();
            passwordRecovery pwd = new passwordRecovery();
//        pwd.setTitle("Recover Password");
            pwd.setVisible(true);
        } else {
            System.out.println("not working");
        }
    }//GEN-LAST:event_jButtonPasswordRecoveryActionPerformed

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jButtonPasswordRecoveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPasswordRecoveryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPasswordRecoveryMouseClicked

    private void jButtonPasswordRecoveryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPasswordRecoveryMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonPasswordRecoveryMouseEntered

    private void jButtonRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterUserActionPerformed
        // TODO add your handling code here:
        dispose();
        registerUser regUser = new registerUser();
        regUser.setTitle("Create Account");
        regUser.setVisible(true);
    }//GEN-LAST:event_jButtonRegisterUserActionPerformed

    private void jButtonContactFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContactFormActionPerformed
        // TODO add your handling code here:
        dispose();
        feedback fedform = new feedback();
        fedform.setTitle("Feedback");
        fedform.setVisible(true);
    }//GEN-LAST:event_jButtonContactFormActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContactForm;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonPasswordRecovery;
    private javax.swing.JButton jButtonRegisterUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelPasswordLabel;
    private javax.swing.JLabel jLabelUserLabel;
    private javax.swing.JLabel jLabeldescription;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel jlabelLoginLogo;
    // End of variables declaration//GEN-END:variables

    private void userLogin(String username, String password) throws ClassNotFoundException {
        Connection dbconn = dbConnection.connectDb();
        if (dbconn != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                PreparedStatement statement = (PreparedStatement) dbconn.prepareStatement("SELECT * from login WHERE username = ? AND password = ?");
                statement.setString(1, username);
                statement.setString(2, password);
                ResultSet result = statement.executeQuery();
                System.out.println("Login: " + result);

                if (result.next()) {
                    System.out.println("Logged in");
                    JOptionPane.showMessageDialog(this, "You are successfully logged in. Click OK to continue", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    homepage hm = new homepage();
                    hm.setTitle("Dashboard");
                    hm.setVisible(true);

                } else {
                    System.out.println("inavlid login");
                    System.out.println("username: " + username + "\n" + "password: " + password);
                    System.out.println("login failed due to invalid credentials");
                    JOptionPane.showMessageDialog(this, "invalid details. Please input correct username and password", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } catch (SQLException ex) {
                System.out.println("not working");
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                // Close the database resources
                try {
                    if (dbconn != null) {
                        dbconn.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
}
