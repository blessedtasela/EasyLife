/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package easylife.EasyLifeUI;

import com.raven.main.Main;
import java.awt.BorderLayout;
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

    public JPanel getDashboardLogoPanel() {
        return jPanelDashboardLogo;
    }

    public JPanel getProfileLogoPanel() {
        return jPanelProfileLogo;
    }

    /**
     * Creates new form homepage
     */

    public homepage() {
        initComponents();

        jPanelProducts.setVisible(false);
// Set the content pane layout to BorderLayout
        getContentPane().setLayout(new BorderLayout());

        // Set a minimum size to the frame
        setMinimumSize(new java.awt.Dimension(400, 300));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanelDashboardLogo = new javax.swing.JPanel();
        jLabelDashboardTitle = new javax.swing.JLabel();
        jLabelProducts = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonProducts = new javax.swing.JButton();
        jButtonCategories = new javax.swing.JButton();
        jButtonContact = new javax.swing.JButton();
        jButtonFeedback = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jPanelProfileLogo = new javax.swing.JPanel();
        jPanelDashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelProducts = new javax.swing.JPanel();
        jLabelProductList = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jlabelLoginLogo1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));

        jPanelDashboardLogo.setBackground(new java.awt.Color(204, 204, 204));
        jPanelDashboardLogo.setForeground(new java.awt.Color(29, 101, 166));

        javax.swing.GroupLayout jPanelDashboardLogoLayout = new javax.swing.GroupLayout(jPanelDashboardLogo);
        jPanelDashboardLogo.setLayout(jPanelDashboardLogoLayout);
        jPanelDashboardLogoLayout.setHorizontalGroup(
            jPanelDashboardLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelDashboardLogoLayout.setVerticalGroup(
            jPanelDashboardLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jLabelDashboardTitle.setBackground(new java.awt.Color(29, 101, 166));
        jLabelDashboardTitle.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabelDashboardTitle.setForeground(new java.awt.Color(0, 0, 153));
        jLabelDashboardTitle.setText("DASHBOARD");

        jLabelProducts.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelProducts.setForeground(new java.awt.Color(242, 161, 4));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel3FocusGained(evt);
            }
        });

        jButtonProducts.setBackground(new java.awt.Color(204, 204, 204));
        jButtonProducts.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonProducts.setForeground(new java.awt.Color(242, 161, 4));
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

        jButtonCategories.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCategories.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonCategories.setForeground(new java.awt.Color(242, 161, 4));
        jButtonCategories.setText("Categories");
        jButtonCategories.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategoriesActionPerformed(evt);
            }
        });

        jButtonContact.setBackground(new java.awt.Color(204, 204, 204));
        jButtonContact.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonContact.setForeground(new java.awt.Color(242, 161, 4));
        jButtonContact.setText("Contact");
        jButtonContact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContactActionPerformed(evt);
            }
        });

        jButtonFeedback.setBackground(new java.awt.Color(204, 204, 204));
        jButtonFeedback.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonFeedback.setForeground(new java.awt.Color(242, 161, 4));
        jButtonFeedback.setText("Feedback");
        jButtonFeedback.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonFeedback)
                    .addComponent(jButtonContact)
                    .addComponent(jButtonCategories)
                    .addComponent(jButtonProducts))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonProducts)
                .addGap(18, 18, 18)
                .addComponent(jButtonCategories)
                .addGap(18, 18, 18)
                .addComponent(jButtonContact)
                .addGap(18, 18, 18)
                .addComponent(jButtonFeedback))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("MY PROFILE");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 161, 4));
        jButton1.setText("Account");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 161, 4));
        jButton2.setText("WishList");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(242, 161, 4));
        jButton3.setText("Cart");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(242, 161, 4));
        jButton4.setText("Orders");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonLogOut.setBackground(new java.awt.Color(204, 204, 204));
        jButtonLogOut.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(242, 161, 4));
        jButtonLogOut.setText("log out");
        jButtonLogOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        jPanelProfileLogo.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelProfileLogoLayout = new javax.swing.GroupLayout(jPanelProfileLogo);
        jPanelProfileLogo.setLayout(jPanelProfileLogoLayout);
        jPanelProfileLogoLayout.setHorizontalGroup(
            jPanelProfileLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelProfileLogoLayout.setVerticalGroup(
            jPanelProfileLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelDashboardLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelProducts)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDashboardTitle)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanelProfileLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLogOut)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabelDashboardTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanelDashboardLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelProfileLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jButton1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelProducts)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLogOut)
                        .addContainerGap(51, Short.MAX_VALUE))))
        );

        jPanelDashboard.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Dashboard");

        jLabelProductList.setText("Product");

        javax.swing.GroupLayout jPanelProductsLayout = new javax.swing.GroupLayout(jPanelProducts);
        jPanelProducts.setLayout(jPanelProductsLayout);
        jPanelProductsLayout.setHorizontalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductsLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelProductList)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelProductsLayout.setVerticalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductsLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabelProductList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDashboardLayout = new javax.swing.GroupLayout(jPanelDashboard);
        jPanelDashboard.setLayout(jPanelDashboardLayout);
        jPanelDashboardLayout.setHorizontalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanelDashboardLayout.setVerticalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(29, 101, 166));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 161, 4));
        jLabel8.setText("<html>  <h1>Product</h1> </html>");

        jlabelLoginLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easylife/img/EasyLife-logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabelLoginLogo1))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlabelLoginLogo1))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCategoriesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
        feedback fd = new feedback();
        fd.setTitle("Feedback");
        fd.setVisible(true);
    }//GEN-LAST:event_jButtonFeedbackActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed

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
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProductsMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonProductsMouseClicked

    private void jPanel3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel3FocusGained
        this.requestFocusInWindow();
    }//GEN-LAST:event_jPanel3FocusGained

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
                JPanel jPanelDashboardLogo = frame.getDashboardLogoPanel();
                JPanel jPanelProfileLogo = frame.getProfileLogoPanel();

                // Set the layout manager of the jPanelDashboardLogo panel
                jPanelDashboardLogo.setLayout(new FlowLayout(FlowLayout.LEFT));
                jPanelProfileLogo.setLayout(new FlowLayout(FlowLayout.LEFT));

                // Add the iconLabel to the jPanelDashboardLogo panel
                jPanelDashboardLogo.add(iconLabel);
                jPanelProfileLogo.add(profileLabel);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCategories;
    private javax.swing.JButton jButtonContact;
    private javax.swing.JButton jButtonFeedback;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonProducts;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDashboardTitle;
    private javax.swing.JLabel jLabelProductList;
    private javax.swing.JLabel jLabelProducts;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelDashboardLogo;
    private javax.swing.JPanel jPanelProducts;
    private javax.swing.JPanel jPanelProfileLogo;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabelLoginLogo1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    // End of variables declaration//GEN-END:variables
}
