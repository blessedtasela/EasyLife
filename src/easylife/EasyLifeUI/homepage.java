/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package easylife.EasyLifeUI;

import com.raven.main.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author blessedtasela
 */
public class homepage extends javax.swing.JFrame {

   

    /**
     * Creates new form homepage
     */

    public homepage() {
        initComponents();
        
        setBackground(new Color(0,0,0,0));
        init();

        

    }

    private void init() {
    winButton.initEvent(this, background1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new com.raven.swing.Background();
        header = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jlabelLoginLogo = new javax.swing.JLabel();
        winButton = new com.raven.swing.win_button.WinButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonProducts = new javax.swing.JButton();
        jButtonContact = new javax.swing.JButton();
        jButtonFeedback = new javax.swing.JButton();
        jLabelDashboardTitle = new javax.swing.JLabel();
        jbAddProduct = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelDashboardTitle1 = new javax.swing.JLabel();
        jButtonCategories3 = new javax.swing.JButton();
        jButtonCategories4 = new javax.swing.JButton();
        jButtonCategories5 = new javax.swing.JButton();
        jButtonCategories1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background1.setAutoscrolls(true);

        header.setBackground(new java.awt.Color(29, 101, 166));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 161, 4));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html>  <h1>Home</h1> </html>");

        jlabelLoginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easylife/img/EasyLife-logo.jpg"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabelLoginLogo))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabelLoginLogo)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setOpaque(false);
        jPanel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel3FocusGained(evt);
            }
        });

        jButtonProducts.setBackground(new java.awt.Color(204, 204, 255));
        jButtonProducts.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonProducts.setForeground(new java.awt.Color(29, 101, 166));
        jButtonProducts.setText("Products");
        jButtonProducts.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonProductsMouseClicked(evt);
            }
        });
        jButtonProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductsActionPerformed(evt);
            }
        });

        jButtonContact.setBackground(new java.awt.Color(204, 204, 255));
        jButtonContact.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonContact.setForeground(new java.awt.Color(29, 101, 166));
        jButtonContact.setText("Contact");
        jButtonContact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContactActionPerformed(evt);
            }
        });

        jButtonFeedback.setBackground(new java.awt.Color(204, 204, 255));
        jButtonFeedback.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonFeedback.setForeground(new java.awt.Color(29, 101, 166));
        jButtonFeedback.setText("Review");
        jButtonFeedback.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFeedbackActionPerformed(evt);
            }
        });

        jLabelDashboardTitle.setBackground(new java.awt.Color(29, 101, 166));
        jLabelDashboardTitle.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabelDashboardTitle.setForeground(new java.awt.Color(0, 0, 153));
        jLabelDashboardTitle.setText("DASHBOARD");

        jbAddProduct.setBackground(new java.awt.Color(204, 204, 255));
        jbAddProduct.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jbAddProduct.setForeground(new java.awt.Color(29, 101, 166));
        jbAddProduct.setText("Add Product");
        jbAddProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDashboardTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonProducts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelDashboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jPanel1.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setOpaque(false);
        jPanel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel4FocusGained(evt);
            }
        });

        jLabelDashboardTitle1.setBackground(new java.awt.Color(29, 101, 166));
        jLabelDashboardTitle1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabelDashboardTitle1.setForeground(new java.awt.Color(0, 0, 153));
        jLabelDashboardTitle1.setText("My Profile");

        jButtonCategories3.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCategories3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonCategories3.setForeground(new java.awt.Color(29, 101, 166));
        jButtonCategories3.setText("My Cart");
        jButtonCategories3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCategories3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategories3ActionPerformed(evt);
            }
        });

        jButtonCategories4.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCategories4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonCategories4.setForeground(new java.awt.Color(29, 101, 166));
        jButtonCategories4.setText("WishList");
        jButtonCategories4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCategories4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategories4ActionPerformed(evt);
            }
        });

        jButtonCategories5.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCategories5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonCategories5.setForeground(new java.awt.Color(29, 101, 166));
        jButtonCategories5.setText("My Account");
        jButtonCategories5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCategories5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategories5ActionPerformed(evt);
            }
        });

        jButtonCategories1.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCategories1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonCategories1.setForeground(new java.awt.Color(29, 101, 166));
        jButtonCategories1.setText("Logout");
        jButtonCategories1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCategories1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategories1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDashboardTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCategories1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCategories4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCategories3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCategories5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDashboardTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonCategories5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCategories4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCategories3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCategories1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContactActionPerformed
        // TODO add your handling code here:
        dispose();
        contact ct = new contact();
        ct.setTitle("Contact Us");
        ct.setVisible(true);

    }//GEN-LAST:event_jButtonContactActionPerformed

    private void jButtonProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductsActionPerformed
        // TODO add your handling code here:
        dispose();
       Main m = new Main();
       m.setTitle("Products");
       m.setVisible(true);

    }//GEN-LAST:event_jButtonProductsActionPerformed

    private void jButtonFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFeedbackActionPerformed
        // TODO add your handling code here:
        dispose();
        review r = new review();
        r.setTitle("Feedback");
        r.setVisible(true);
    }//GEN-LAST:event_jButtonFeedbackActionPerformed

    private void jButtonProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProductsMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonProductsMouseClicked

    private void jPanel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3FocusGained
        this.requestFocusInWindow();
    }//GEN-LAST:event_jPanel3FocusGained

    private void jPanel4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4FocusGained

    private void jButtonCategories1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategories1ActionPerformed
          // Show a confirm dialog
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure?", "LOG OUT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // Check the user's choice
        if (choice == JOptionPane.YES_OPTION) {
            dispose();
            login lg = new login();
            lg.setTitle("LOG IN");
            lg.setVisible(true);
        } else {
            // User clicked No or closed the dialog, do nothing or handle accordingly
            // ...
        }
    }//GEN-LAST:event_jButtonCategories1ActionPerformed

    private void jButtonCategories3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategories3ActionPerformed
          dispose();
       MyCart mc = new MyCart();
       mc.setTitle("My Cart");
       mc.setVisible(true);
    }//GEN-LAST:event_jButtonCategories3ActionPerformed

    private void jButtonCategories4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategories4ActionPerformed
          dispose();
       wishlist w = new wishlist();
       w.setTitle("WishList");
       w.setVisible(true);
    }//GEN-LAST:event_jButtonCategories4ActionPerformed

    private void jButtonCategories5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategories5ActionPerformed
         dispose();
       account a = new account();
       a.setTitle("My Account");
       a.setVisible(true);
    }//GEN-LAST:event_jButtonCategories5ActionPerformed

    private void jbAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddProductActionPerformed
        // TODO add your handling code here:
         dispose();
       addProduct ad = new addProduct();
       ad.setTitle("Add Product");
       ad.setVisible(true);
    }//GEN-LAST:event_jbAddProductActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Create and display the form
                homepage frame = new homepage();
                frame.setVisible(true);

                // Create an ImageIcon
                ImageIcon originalIcon = new ImageIcon(homepage.class.getResource("/easylife/img/icon-easylife.jpg"));
                ImageIcon profile = new ImageIcon(homepage.class.getResource("/easylife/img/user-icon.jpg"));

                // Resize the icon
                int width = 30;  // desired width
                int height = 30; // desired height
                Image resizedImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImage);

                int w = 30;  // desired width
                int h = 30; // desired height
                Image resizedProfile = profile.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
                ImageIcon resizedProfileIcon = new ImageIcon(resizedProfile);
                //Create a JLabel with the resized icon
                JLabel iconLabel = new JLabel(resizedIcon);
                JLabel profileLabel = new JLabel(resizedProfileIcon);

                // Get the jPanelDashboardLogo instance from the homepage object
             

                // Set the layout manager of the jPanelDashboardLogo panel
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Background background1;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButtonCategories1;
    private javax.swing.JButton jButtonCategories3;
    private javax.swing.JButton jButtonCategories4;
    private javax.swing.JButton jButtonCategories5;
    private javax.swing.JButton jButtonContact;
    private javax.swing.JButton jButtonFeedback;
    private javax.swing.JButton jButtonProducts;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDashboardTitle;
    private javax.swing.JLabel jLabelDashboardTitle1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAddProduct;
    private javax.swing.JLabel jlabelLoginLogo;
    private com.raven.swing.win_button.WinButton winButton;
    // End of variables declaration//GEN-END:variables
}
