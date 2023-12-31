/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MangaStore;

import javax.swing.JOptionPane;

/**
 *
 * @author ebrah
 */
public class HomePage extends javax.swing.JFrame {
    
    private int itemCount1 = 0; // Count for item 1
    private int itemCount2 = 0; // Count for item 2
    private int itemCount3 = 0; // Count for item 1
    private int itemCount4 = 0; // Count for item 2
    private int itemCount5 = 0; // Count for item 1


    /**
     * Creates new form HomaPage
     */
    public HomePage() {
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
        username = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        titile = new javax.swing.JLabel();
        maga1 = new javax.swing.JLabel();
        maga2 = new javax.swing.JLabel();
        maga3 = new javax.swing.JLabel();
        maga4 = new javax.swing.JLabel();
        maga5 = new javax.swing.JLabel();
        maga1btn = new javax.swing.JButton();
        maga2btn = new javax.swing.JButton();
        maga3btn = new javax.swing.JButton();
        maga4btn = new javax.swing.JButton();
        maga5btn = new javax.swing.JButton();
        checkoutbtn = new javax.swing.JButton();
        basketLabel1 = new javax.swing.JLabel();
        basketLabel2 = new javax.swing.JLabel();
        basketLabel3 = new javax.swing.JLabel();
        basketLabel4 = new javax.swing.JLabel();
        basketLabel5 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();
        Price3 = new javax.swing.JLabel();
        Price4 = new javax.swing.JLabel();
        Price1 = new javax.swing.JLabel();
        BGImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 170));
        setMinimumSize(new java.awt.Dimension(839, 434));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Mido");
        jPanel1.add(username);
        username.setBounds(20, 70, 28, 16);

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/profile.png"))); // NOI18N
        jPanel1.add(profile);
        profile.setBounds(10, 10, 50, 66);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 70, 400);

        titile.setBackground(new java.awt.Color(102, 102, 102));
        titile.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titile.setForeground(new java.awt.Color(255, 255, 255));
        titile.setText("MangaVerse");
        getContentPane().add(titile);
        titile.setBounds(330, 10, 208, 48);

        maga1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/1.png"))); // NOI18N
        getContentPane().add(maga1);
        maga1.setBounds(90, 70, 110, 160);

        maga2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/2.png"))); // NOI18N
        getContentPane().add(maga2);
        maga2.setBounds(250, 70, 110, 160);

        maga3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/3.png"))); // NOI18N
        getContentPane().add(maga3);
        maga3.setBounds(410, 70, 110, 160);

        maga4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/4.png"))); // NOI18N
        getContentPane().add(maga4);
        maga4.setBounds(550, 70, 110, 160);

        maga5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/5.png"))); // NOI18N
        getContentPane().add(maga5);
        maga5.setBounds(690, 70, 110, 160);

        maga1btn.setText("Add");
        maga1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga1btnActionPerformed(evt);
            }
        });
        getContentPane().add(maga1btn);
        maga1btn.setBounds(110, 270, 75, 23);

        maga2btn.setText("Add");
        maga2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga2btnActionPerformed(evt);
            }
        });
        getContentPane().add(maga2btn);
        maga2btn.setBounds(270, 270, 72, 23);

        maga3btn.setText("Add");
        maga3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga3btnActionPerformed(evt);
            }
        });
        getContentPane().add(maga3btn);
        maga3btn.setBounds(430, 270, 72, 23);

        maga4btn.setText("Add");
        maga4btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga4btnActionPerformed(evt);
            }
        });
        getContentPane().add(maga4btn);
        maga4btn.setBounds(570, 270, 72, 23);

        maga5btn.setText("Add");
        maga5btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga5btnActionPerformed(evt);
            }
        });
        getContentPane().add(maga5btn);
        maga5btn.setBounds(710, 270, 72, 23);

        checkoutbtn.setText("Check out");
        checkoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(checkoutbtn);
        checkoutbtn.setBounds(710, 340, 100, 23);

        basketLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        basketLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(basketLabel1);
        basketLabel1.setBounds(100, 230, 100, 20);

        basketLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        basketLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(basketLabel2);
        basketLabel2.setBounds(260, 230, 130, 20);

        basketLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        basketLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(basketLabel3);
        basketLabel3.setBounds(420, 230, 130, 20);

        basketLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        basketLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(basketLabel4);
        basketLabel4.setBounds(560, 230, 100, 20);

        basketLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        basketLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(basketLabel5);
        basketLabel5.setBounds(700, 230, 100, 20);

        Price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price.setForeground(new java.awt.Color(255, 255, 255));
        Price.setText("6.5$");
        getContentPane().add(Price);
        Price.setBounds(290, 250, 30, 16);

        Price2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price2.setForeground(new java.awt.Color(255, 255, 255));
        Price2.setText("15$");
        getContentPane().add(Price2);
        Price2.setBounds(450, 250, 30, 16);

        Price3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price3.setForeground(new java.awt.Color(255, 255, 255));
        Price3.setText("8$");
        getContentPane().add(Price3);
        Price3.setBounds(600, 250, 20, 16);

        Price4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price4.setForeground(new java.awt.Color(255, 255, 255));
        Price4.setText("5$");
        getContentPane().add(Price4);
        Price4.setBounds(740, 250, 20, 16);

        Price1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price1.setForeground(new java.awt.Color(255, 255, 255));
        Price1.setText("10$");
        getContentPane().add(Price1);
        Price1.setBounds(140, 250, 30, 20);

        BGImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/bg2.jpg"))); // NOI18N
        getContentPane().add(BGImage);
        BGImage.setBounds(0, 0, 980, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void maga1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maga1btnActionPerformed
                itemCount1++;
                updateBasketLabel();
    }//GEN-LAST:event_maga1btnActionPerformed

    private void checkoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutbtnActionPerformed
                String message = "Items in your basket:\n";
                
                int t1 = itemCount1*10;
                Double t2 = itemCount1*6.5;
                int t3 = itemCount1*15;
                int t4 = itemCount1*8;
                int t5 = itemCount1*5;
                Double Total = 0.0;
                if (itemCount1 > 0) {
                    message +=  itemCount1 + "x Naruto " + ",Item Total Cost: " + t1 +"$" + ":\n";
                    Total += t1;
                }
                if (itemCount2 > 0) {
                    message += itemCount2 + "x OnePunchMan " + ",Item Total Cost: " + t2 +"$" + ":\n";
                    Total += t2;
                }
                if (itemCount3 > 0) {
                    message += itemCount3 + "x HXH " + ",Item Total Cost: " + t3 +"$" + ":\n";
                    Total += t3;
                }
                if (itemCount4 > 0) {
                    message += itemCount4 + "x Berserk " + ",Item Total Cost: " + t4 +"$" + ":\n";
                    Total += t4;
                }
                if (itemCount3 > 0) {
                    message += itemCount5 +"x One Piece " + ",Item Total Cost: " + t5 + "$" + ":\n";
                    Total += t5;
                }
                message += "Total Price: " + Total + "$";
                JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_checkoutbtnActionPerformed

    private void maga2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maga2btnActionPerformed
                itemCount2++;
                updateBasketLabel();        
    }//GEN-LAST:event_maga2btnActionPerformed

    private void maga3btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maga3btnActionPerformed
                itemCount3++;
                updateBasketLabel();
    }//GEN-LAST:event_maga3btnActionPerformed

    private void maga4btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maga4btnActionPerformed
                itemCount4++;
                updateBasketLabel();
    }//GEN-LAST:event_maga4btnActionPerformed

    private void maga5btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maga5btnActionPerformed
                itemCount5++;
                updateBasketLabel();
    }//GEN-LAST:event_maga5btnActionPerformed
private void updateBasketLabel() {
    String basketText1 = "";
    String basketText2 = "";
    String basketText3 = "";
    String basketText4 = "";
    String basketText5 = "";
    
    if (itemCount1 > 0) {
        basketText1 += "Naruto: " + itemCount1;
    }
    if (itemCount2 > 0) {
        basketText2 += "OnePunchMan: " + itemCount2;
    }
    if (itemCount3 > 0) {
        basketText3 += "HXH: " + itemCount3;
    }
    if (itemCount4 > 0) {
        basketText4 += "Berserk: " + itemCount4;
    }
    if (itemCount5 > 0) {
        basketText5 += "One Piece: " + itemCount5;
    }    
    basketLabel1.setText(basketText1);
    basketLabel2.setText(basketText2);
    basketLabel3.setText(basketText3);
    basketLabel4.setText(basketText4);
    basketLabel5.setText(basketText5);
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGImage;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel Price3;
    private javax.swing.JLabel Price4;
    private javax.swing.JLabel basketLabel1;
    private javax.swing.JLabel basketLabel2;
    private javax.swing.JLabel basketLabel3;
    private javax.swing.JLabel basketLabel4;
    private javax.swing.JLabel basketLabel5;
    private javax.swing.JButton checkoutbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maga1;
    private javax.swing.JButton maga1btn;
    private javax.swing.JLabel maga2;
    private javax.swing.JButton maga2btn;
    private javax.swing.JLabel maga3;
    private javax.swing.JButton maga3btn;
    private javax.swing.JLabel maga4;
    private javax.swing.JButton maga4btn;
    private javax.swing.JLabel maga5;
    private javax.swing.JButton maga5btn;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel titile;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
