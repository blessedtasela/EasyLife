package com.raven.main;

import com.raven.event.EventItem;
import com.raven.form.FormHome;
import com.raven.model.ModelItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

public class Main extends javax.swing.JFrame {

    private FormHome home;
    private Animator animator;
    private Point animatePoint;
    private ModelItem itemSelected;;

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        init();
        //  Animator start form animatePoint to TagetPoint
        animator = PropertySetter.createAnimator(500, mainPanel, "imageLocation", animatePoint, mainPanel.getTargetLocation());
        animator.addTarget(new PropertySetter(mainPanel, "imageSize", new Dimension(180, 120), mainPanel.getTargetSize()));
        animator.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel.setImageOld(null);
            }
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
    }

    private void init() {
        home = new FormHome();
        winButton.initEvent(this, background1);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(home);
        testData();
        
    }

    private void testData() {
        home.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (itemSelected != null) {
                    mainPanel.setImageOld(itemSelected.getImage());
                }
                if (itemSelected != item) {
                    if (!animator.isRunning()) {
                        itemSelected = item;
                        animatePoint = getLocationOf(com);
                        mainPanel.setImage(item.getImage());
                        mainPanel.setImageLocation(animatePoint);
                        mainPanel.setImageSize(new Dimension(180, 120));
                        mainPanel.repaint();
                        home.setSelected(com);
                        home.showItem(item);
                        animator.start();
                    }
                }
            }
        });
        int ID = 1;
        for (int i = 0; i <= 5; i++) {
            home.addItem(new ModelItem(ID++, "Accessories for hair", "10 Pcs Small Mini Pearl Claw Clips with Flower Design for Women Girls", 110, "LINXI", new ImageIcon(getClass().getResource("/com/raven/image/Accessories for hair.png"))));
            home.addItem(new ModelItem(ID++, "Baby Boy Girl Clothes", "Simple Joys by Carter s Unisex Babies Cotton Footed Sleep and Play.", 100, "Carter", new ImageIcon(getClass().getResource("/com/raven/image/Baby Boy Girl Clothes.png"))));
            home.addItem(new ModelItem(ID++, "Beach Bag", " beach bag for women with Handles Embroidery Large Personalized  A", 150, "BeeGreen", new ImageIcon(getClass().getResource("/com/raven/image/Beach Bag.png"))));
            home.addItem(new ModelItem(ID++, "Cap for women", "Cap for women", 160, "UAAQV", new ImageIcon(getClass().getResource("/com/raven/image/Cap for women.png"))));
            home.addItem(new ModelItem(ID++, "Car Charger", "Wireless Car Charger, MOKPR Auto-Clamping Car Mount 15W/10W/7.5W Fast Charging Air Vent Car Phone Mount", 120, "MOKPR", new ImageIcon(getClass().getResource("/com/raven/image/Car Charger.png"))));
            home.addItem(new ModelItem(ID++, "Girl s 2 Piece Outfits", " 2 Piece Outfits for girls", 370, "SheIn Girl", new ImageIcon(getClass().getResource("/com/raven/image/Girl's 2 Piece Outfits.png"))));
            home.addItem(new ModelItem(ID++, "Girls Kids Fall Clothing", "simple Joys by Carter's Toddlers and Baby Girls' 5-Piece Fleece Pajama Set", 190, "Carter", new ImageIcon(getClass().getResource("/com/raven/image/Girls Kids Fall Clothing.png"))));
            home.addItem(new ModelItem(ID++, "Glasses Computer", "Oilway Blue-Light Blocking Glasses Computer Reading/Gaming/TV/Phones Glasses Fashion Anti Eyestrain UV Glasses for Women Men", 180, "Oilway", new ImageIcon(getClass().getResource("/com/raven/image/Glasses Computer.png"))));
            home.addItem(new ModelItem(ID++, "Hair accessories", "755PCS Hair Holder Accessories for Women", 90, "YANRONG", new ImageIcon(getClass().getResource("/com/raven/image/Hair accessories.png"))));
            home.addItem(new ModelItem(ID++, "Glasses ", "  Glasses with Cute Nerd Frame Reading/Gaming/TV/Phones Glasses for Women Men ", 160, "MAXJULI", new ImageIcon(getClass().getResource("/com/raven/image/MAXJULI Blue Light Blocking Glasses,Computer.png"))));
            home.addItem(new ModelItem(ID++, "S22 Ultra", "Cell Phone, Factory Unlocked Android Smartphone, 128GB, 8K Camera ,Phantom Black", 8000, "SAMSUNG", new ImageIcon(getClass().getResource("/com/raven/image/S22 Ultra.png"))));
            home.addItem(new ModelItem(ID++, " Galaxy A23", " Phone, Factory Unlocked Android Smartphone, 128GB, 50MP Camera.", 7000, "SAMSUNG", new ImageIcon(getClass().getResource("/com/raven/image/SAMSUNG Galaxy A23.png"))));
            home.addItem(new ModelItem(ID++, "Slim Wallet", "lim Card Holder Wallet", 160, "YESIIW", new ImageIcon(getClass().getResource("/com/raven/image/Slim Wallet.png"))));
            home.addItem(new ModelItem(ID++, "Smart Watch for Men & Women", " Smart Watch, Fitness Tracker with 5ATM Swimming Waterproof.", 500, "SKG", new ImageIcon(getClass().getResource("/com/raven/image/Smart Watch for Men Women.png"))));
            home.addItem(new ModelItem(ID++, "Sweatshirt for Men", "Midweight Fleece Pullover Sweatshirt with Pockets", 300, "Niceif", new ImageIcon(getClass().getResource("/com/raven/image/Sweatshirt for Men.png"))));
            home.addItem(new ModelItem(ID++, "Travel Makeup Bag", "Travel Makeup Bag Cosmetic Bag ", 160, "Queboom", new ImageIcon(getClass().getResource("/com/raven/image/Travel Makeup Bag.png"))));
            home.addItem(new ModelItem(ID++, "Watch for women", "Elegant Watch for women", 200, "Anne Klein", new ImageIcon(getClass().getResource("/com/raven/image/Watch for women.png"))));
            home.addItem(new ModelItem(ID++, "hair clip", " 5 Pcs Large Pearl Hair Claw Clips White .", 100, "Adidas", new ImageIcon(getClass().getResource("/com/raven/image/hair clip.png"))));
            home.addItem(new ModelItem(ID++, "iphone14pro", "pple iPhone 14 Pro, 128GB, Space Black - Unlocked.", 10600, "Apple", new ImageIcon(getClass().getResource("/com/raven/image/iphone14pro.png"))));
        }
    }

    private Point getLocationOf(Component com) {
        Point p = home.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new com.raven.swing.Background();
        header = new javax.swing.JPanel();
        winButton = new com.raven.swing.win_button.WinButton();
        jlabelLoginLogo = new javax.swing.JLabel();
        mainPanel = new com.raven.swing.MainPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        header.setBackground(new java.awt.Color(29, 101, 166));

        jlabelLoginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easylife/img/EasyLife-logo.jpg"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(963, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(winButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelLoginLogo, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jlabelLoginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Background background1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jlabelLoginLogo;
    private com.raven.swing.MainPanel mainPanel;
    private com.raven.swing.win_button.WinButton winButton;
    // End of variables declaration//GEN-END:variables
}
