package com.raven.form;

import com.raven.component.Item;
import com.raven.event.EventItem;
import com.raven.model.ModelItem;
import com.raven.swing.ScrollBar;
import easylife.EasyLifeUI.MyCart;
import easylife.EasyLifeUI.contact;
import easylife.EasyLifeUI.dbConnection;
import easylife.EasyLifeUI.homepage;
import easylife.EasyLifeUI.login;
import easylife.EasyLifeUI.payment;
import easylife.EasyLifeUI.review;
import easylife.EasyLifeUI.wishlist;
import java.awt.Component;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class FormHome extends javax.swing.JPanel {

    private int usrId;
    private dbConnection connect;

    public void setEvent(EventItem event) {
        this.event = event;
    }

    private EventItem event;

    public FormHome(login log) {
        initComponents();
        scroll.setVerticalScrollBar(new ScrollBar());

        connect = new dbConnection(); // Instantiate the dbConnection class

        if (connect == null) {
            System.out.println("Error in connection. Can't connect to the database");
        } else {
            System.out.println("Connection successful");
        }
        
        this.usrId = log.getUserId();
    }

    public void addItem(ModelItem data) {
        Item item = new Item();
        item.setData(data);
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    event.itemClick(item, data);
                }
            }
        });
        panelItem.add(item);
        panelItem.repaint();
        panelItem.revalidate();
    }

    public void setSelected(Component item) {
        for (Component com : panelItem.getComponents()) {
            Item i = (Item) com;
            if (i.isSelected()) {
                i.setSelected(false);
            }
        }
        ((Item) item).setSelected(true);
    }

    public void showItem(ModelItem data) {
        lbProductId.setText(String.valueOf(data.getProductId()));
        lbItemName.setText(data.getItemName());
        txtDescription.setText(data.getDescription());
        lbBrand.setText(data.getBrandName());
        lbCategory.setText(data.getCategory());
        lbProdDate.setText(data.getDate());
        DecimalFormat df = new DecimalFormat(".00 MAD");
        lbPrice.setText(df.format(data.getPrice()));
    }

    public Point getPanelItemLocation() {
        Point p = scroll.getLocation();
        return new Point(p.x, p.y - scroll.getViewport().getViewPosition().y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelItem = new com.raven.swing.PanelItem();
        jpanel = new javax.swing.JPanel();
        lbItemName = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        lbBrand = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtDescription = new javax.swing.JTextPane();
        jbAddCart = new javax.swing.JButton();
        lbCategory = new javax.swing.JLabel();
        lbProdDate = new javax.swing.JLabel();
        lbProductId = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbBackToHome = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1290, 650));

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setViewportView(panelItem);

        jpanel.setOpaque(false);
        jpanel.setPreferredSize(new java.awt.Dimension(360, 800));

        lbItemName.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName.setText("Item Name");

        lbPrice.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice.setText("0.00MAD");

        lbBrand.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand.setText("Brand");

        txtDescription.setBorder(null);
        txtDescription.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(178, 178, 178));
        txtDescription.setFocusable(false);

        jbAddCart.setBackground(new java.awt.Color(204, 204, 255));
        jbAddCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAddCart.setForeground(new java.awt.Color(29, 101, 166));
        jbAddCart.setText("Add to Cart");
        jbAddCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAddCartMouseClicked(evt);
            }
        });
        jbAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddCartActionPerformed(evt);
            }
        });

        lbCategory.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbCategory.setForeground(new java.awt.Color(255, 102, 0));
        lbCategory.setText("Category");

        lbProdDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbProdDate.setText("Prod. date");

        lbProductId.setText("0");

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                        .addComponent(jbAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpanelLayout.createSequentialGroup()
                                    .addComponent(lbBrand)
                                    .addGap(139, 139, 139)
                                    .addComponent(lbCategory)
                                    .addGap(37, 37, 37)))
                            .addGroup(jpanelLayout.createSequentialGroup()
                                .addComponent(lbItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lbProductId)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addComponent(lbPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbProdDate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jbAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbItemName)
                    .addComponent(lbProductId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice)
                    .addComponent(lbProdDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBrand)
                    .addComponent(lbCategory))
                .addGap(18, 18, 18)
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setOpaque(false);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(29, 101, 166));
        jButton2.setText("Review");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(29, 101, 166));
        jButton3.setText("My Cart");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(29, 101, 166));
        jButton4.setText("Wish List");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/form/shopping-cart.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jbBackToHome.setBackground(new java.awt.Color(204, 204, 255));
        jbBackToHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbBackToHome.setForeground(new java.awt.Color(29, 101, 166));
        jbBackToHome.setText("To DashBoard");
        jbBackToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBackToHomeMouseClicked(evt);
            }
        });
        jbBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jbBackToHome)
                .addGap(50, 50, 50)
                .addComponent(jButton4)
                .addGap(78, 78, 78)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBackToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(scroll)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAddCartMouseClicked

    }//GEN-LAST:event_jbAddCartMouseClicked

    private void jbAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddCartActionPerformed
        login log = new login();
        String productId = lbProductId.getText();
        String userid = String.valueOf(1);

// Check if all fields are filled
        if (productId.isEmpty() || userid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please an item", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Connection dbconn = dbConnection.connectDb();
            String query = "INSERT INTO cart (userId, productId) VALUES (?, ?)";
            System.out.println(query);
            try (PreparedStatement statement = dbconn.prepareStatement(query)) {
                statement.setString(1, userid);
                statement.setString(2, productId);
                 System.out.println(statement);
                int rowsInserted = statement.executeUpdate();

                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Item added to cart", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to insert a row", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Error inserting a row into the cart table: " + e.getMessage());
            }
        }


    }//GEN-LAST:event_jbAddCartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Window window = SwingUtilities.getWindowAncestor(FormHome.this);
        if (window != null) {
            window.dispose(); // Dispose the parent window
        }
        review r = new review();
        r.setTitle("Review");
        r.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Window window = SwingUtilities.getWindowAncestor(FormHome.this);
        if (window != null) {
            window.dispose(); // Dispose the parent window
        }

        MyCart mc = new MyCart();
        mc.setTitle("Home");
        mc.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Window window = SwingUtilities.getWindowAncestor(FormHome.this);
        if (window != null) {
            window.dispose(); // Dispose the parent window
        }

        wishlist w = new wishlist();
        w.setTitle("My Cart");
        w.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Window window = SwingUtilities.getWindowAncestor(FormHome.this);
        if (window != null) {
            window.dispose(); // Dispose the parent window
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new payment().setVisible(true);
            }
        });
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jbBackToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBackToHomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBackToHomeMouseClicked

    private void jbBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackToHomeActionPerformed
        Window window = SwingUtilities.getWindowAncestor(FormHome.this);
        if (window != null) {
            window.dispose(); // Dispose the parent window
        }

        homepage hp = new homepage(usrId);
        hp.setTitle("Dashboard");
        hp.setVisible(true);
    }//GEN-LAST:event_jbBackToHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbAddCart;
    private javax.swing.JButton jbBackToHome;
    private javax.swing.JPanel jpanel;
    public static javax.swing.JLabel lbBrand;
    private javax.swing.JLabel lbCategory;
    public static javax.swing.JLabel lbItemName;
    public static javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbProdDate;
    private javax.swing.JLabel lbProductId;
    private com.raven.swing.PanelItem panelItem;
    private javax.swing.JScrollPane scroll;
    public static javax.swing.JTextPane txtDescription;
    // End of variables declaration//GEN-END:variables
}
