/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MangaStore;

import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;

/**
 *
 * @author ebrah
 */
public class HomePage4 extends javax.swing.JFrame {
    
    private int itemCount1 = 0; // Count for item 1
    private int itemCount2 = 0; // Count for item 2
    private int itemCount3 = 0; // Count for item 1
    private int itemCount4 = 0; // Count for item 2
    private int itemCount5 = 0; // Count for item 1


    /**
     * Creates new form HomaPage
     */
    public HomePage4() {
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

        Removebtn = new javax.swing.JButton();
        Removebtn1 = new javax.swing.JButton();
        Removebtn2 = new javax.swing.JButton();
        Removebtn3 = new javax.swing.JButton();
        Removebtn4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        titile = new javax.swing.JLabel();
        checkoutbtn = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        maga5 = new javax.swing.JLabel();
        basketLabel5 = new javax.swing.JLabel();
        Price4 = new javax.swing.JLabel();
        maga5btn = new javax.swing.JButton();
        Removebtn9 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        Removebtn5 = new javax.swing.JButton();
        maga1btn = new javax.swing.JButton();
        Price1 = new javax.swing.JLabel();
        basketLabel1 = new javax.swing.JLabel();
        maga1 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        maga2 = new javax.swing.JLabel();
        basketLabel2 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        maga2btn = new javax.swing.JButton();
        Removebtn6 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        maga3 = new javax.swing.JLabel();
        basketLabel3 = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();
        maga3btn = new javax.swing.JButton();
        Removebtn7 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        maga4 = new javax.swing.JLabel();
        basketLabel4 = new javax.swing.JLabel();
        Price3 = new javax.swing.JLabel();
        maga4btn = new javax.swing.JButton();
        Removebtn8 = new javax.swing.JButton();

        Removebtn.setText("Remove");
        Removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovebtnActionPerformed(evt);
            }
        });

        Removebtn1.setText("Remove");
        Removebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removebtn1ActionPerformed(evt);
            }
        });

        Removebtn2.setText("Remove");
        Removebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removebtn2ActionPerformed(evt);
            }
        });

        Removebtn3.setText("Remove");
        Removebtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removebtn3ActionPerformed(evt);
            }
        });

        Removebtn4.setText("Remove");
        Removebtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removebtn4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 170));
        setMinimumSize(new java.awt.Dimension(839, 434));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Abdallah");
        jPanel1.add(username);
        username.setBounds(10, 70, 50, 16);

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/pp.png"))); // NOI18N
        jPanel1.add(profile);
        profile.setBounds(10, 10, 50, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 70, 400);

        titile.setBackground(new java.awt.Color(102, 102, 102));
        titile.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titile.setForeground(new java.awt.Color(255, 255, 255));
        titile.setText("Library System");
        getContentPane().add(titile);
        titile.setBounds(330, 10, 270, 48);

        checkoutbtn.setText("Check out");
        checkoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(checkoutbtn);
        checkoutbtn.setBounds(710, 340, 100, 23);

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Backbtn);
        Backbtn.setBounds(620, 340, 72, 23);

        maga5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/9.png"))); // NOI18N

        basketLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Price4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price4.setText("5$");

        maga5btn.setText("Add");
        maga5btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga5btnActionPerformed(evt);
            }
        });

        Removebtn9.setText("Remove");
        Removebtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removebtn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maga5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basketLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Price4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(maga5btn))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Removebtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(maga5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(basketLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Price4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(maga5btn)
                .addGap(7, 7, 7)
                .addComponent(Removebtn9))
        );

        getContentPane().add(jPanel17);
        jPanel17.setBounds(660, 370, 122, 260);

        Removebtn5.setText("Remove");
        Removebtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removebtn5ActionPerformed(evt);
            }
        });

        maga1btn.setText("Add");
        maga1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga1btnActionPerformed(evt);
            }
        });

        Price1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price1.setText("10$");

        basketLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        maga1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/17.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maga1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(basketLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(maga1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Removebtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(maga1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(basketLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Price1)
                .addComponent(maga1btn)
                .addGap(7, 7, 7)
                .addComponent(Removebtn5))
        );

        getContentPane().add(jPanel18);
        jPanel18.setBounds(90, 350, 122, 260);

        maga2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/18.png"))); // NOI18N

        basketLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price.setText("6.5$");

        maga2btn.setText("Add");
        maga2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga2btnActionPerformed(evt);
            }
        });

        Removebtn6.setText("Remove");
        Removebtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removebtn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maga2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(basketLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(maga2btn))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Removebtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(maga2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(basketLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(maga2btn)
                .addGap(7, 7, 7)
                .addComponent(Removebtn6))
        );

        getContentPane().add(jPanel19);
        jPanel19.setBounds(250, 350, 122, 260);

        maga3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/19.png"))); // NOI18N

        basketLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Price2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price2.setText("15$");

        maga3btn.setText("Add");
        maga3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga3btnActionPerformed(evt);
            }
        });

        Removebtn7.setText("Remove");
        Removebtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removebtn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maga3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(basketLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(maga3btn))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Removebtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(maga3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(basketLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(maga3btn)
                .addGap(7, 7, 7)
                .addComponent(Removebtn7))
        );

        getContentPane().add(jPanel20);
        jPanel20.setBounds(400, 350, 122, 260);

        maga4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/Store/20.png"))); // NOI18N

        basketLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Price3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Price3.setText("8$");

        maga4btn.setText("Add");
        maga4btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maga4btnActionPerformed(evt);
            }
        });

        Removebtn8.setText("Remove");
        Removebtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removebtn8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maga4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basketLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Price3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(maga4btn))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Removebtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(maga4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(basketLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Price3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(maga4btn)
                .addGap(7, 7, 7)
                .addComponent(Removebtn8))
        );

        getContentPane().add(jPanel21);
        jPanel21.setBounds(530, 360, 122, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void maga1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maga1btnActionPerformed
                itemCount1++;
                updateBasketLabel();
    }//GEN-LAST:event_maga1btnActionPerformed

    private void checkoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutbtnActionPerformed
    final StringBuilder message = new StringBuilder("Items in your basket:\n");
    
    final int t1 = itemCount1 * 10;
    final Double t2 = itemCount2 * 6.5;
    final int t3 = itemCount3 * 15;
    final int t4 = itemCount4 * 8;
    final int t5 = itemCount5 * 5;
    final Double[] total = {0.0}; // Use array to modify inside lambda

    if (itemCount1 > 0) {
        message.append(itemCount1).append("x Grimm, Item Total Cost: ").append(t1).append("$\n");
        total[0] += t1;
    }
    if (itemCount2 > 0) {
        message.append(itemCount2).append("x The Bass, Item Total Cost: ").append(t2).append("$\n");
        total[0] += t2;
    }
    if (itemCount3 > 0) {
        message.append(itemCount3).append("x Harry p1, Item Total Cost: ").append(t3).append("$\n");
        total[0] += t3;
    }
    if (itemCount4 > 0) {
        message.append(itemCount4).append("x Harry p2, Item Total Cost: ").append(t4).append("$\n");
        total[0] += t4;
    }
    if (itemCount5 > 0) {
        message.append(itemCount5).append("x ALone, Item Total Cost: ").append(t5).append("$\n");
        total[0] += t5;
    }
    message.append("Total Price: ").append(total[0]).append("$");

    // Display the message in a dialog
    JOptionPane.showMessageDialog(null, message.toString());

    // Print the message as a plain text document
    PrinterJob job = PrinterJob.getPrinterJob();
    job.setJobName("Receipt");

    job.setPrintable((g, pf, page) -> {
        if (page > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        int x = 100;
        int y = 100;

        for (String line : message.toString().split("\n")) {
            g.drawString(line, x, y);
            y += 15;
        }

        return Printable.PAGE_EXISTS;
    });

    if (job.printDialog()) {
        try {
            job.print();
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Print failed: " + e.getMessage());
        }
    }
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

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        HomePage3 homePage3 = new HomePage3();
        homePage3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackbtnActionPerformed

    private void RemovebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovebtnActionPerformed
        itemCount1--;
        updateBasketLabel();
    }//GEN-LAST:event_RemovebtnActionPerformed

    private void Removebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removebtn1ActionPerformed
        itemCount2--;
        updateBasketLabel();
    }//GEN-LAST:event_Removebtn1ActionPerformed

    private void Removebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removebtn2ActionPerformed
        itemCount3--;
        updateBasketLabel();
    }//GEN-LAST:event_Removebtn2ActionPerformed

    private void Removebtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removebtn3ActionPerformed
        itemCount4--;
        updateBasketLabel();
    }//GEN-LAST:event_Removebtn3ActionPerformed

    private void Removebtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removebtn4ActionPerformed
        itemCount5--;
        updateBasketLabel();
    }//GEN-LAST:event_Removebtn4ActionPerformed

    private void Removebtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removebtn5ActionPerformed
        itemCount1--;
        updateBasketLabel();
    }//GEN-LAST:event_Removebtn5ActionPerformed

    private void Removebtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removebtn6ActionPerformed
        itemCount2--;
        updateBasketLabel();
    }//GEN-LAST:event_Removebtn6ActionPerformed

    private void Removebtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removebtn7ActionPerformed
        itemCount3--;
        updateBasketLabel();
    }//GEN-LAST:event_Removebtn7ActionPerformed

    private void Removebtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removebtn8ActionPerformed
        itemCount4--;
        updateBasketLabel();
    }//GEN-LAST:event_Removebtn8ActionPerformed

    private void Removebtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removebtn9ActionPerformed
        itemCount5--;
        updateBasketLabel();
    }//GEN-LAST:event_Removebtn9ActionPerformed
private void updateBasketLabel() {
    String basketText1 = "";
    String basketText2 = "";
    String basketText3 = "";
    String basketText4 = "";
    String basketText5 = "";
    
    if (itemCount1 > 0) {
        basketText1 += "Grimm: " + itemCount1;
    }
    if (itemCount2 > 0) {
        basketText2 += "The Bass: " + itemCount2;
    }
    if (itemCount3 > 0) {
        basketText3 += "Harry p1: " + itemCount3;
    }
    if (itemCount4 > 0) {
        basketText4 += "Harry p2: " + itemCount4;
    }
    if (itemCount5 > 0) {
        basketText5 += "Alone: " + itemCount5;
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
            java.util.logging.Logger.getLogger(HomePage4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel Price3;
    private javax.swing.JLabel Price4;
    private javax.swing.JButton Removebtn;
    private javax.swing.JButton Removebtn1;
    private javax.swing.JButton Removebtn2;
    private javax.swing.JButton Removebtn3;
    private javax.swing.JButton Removebtn4;
    private javax.swing.JButton Removebtn5;
    private javax.swing.JButton Removebtn6;
    private javax.swing.JButton Removebtn7;
    private javax.swing.JButton Removebtn8;
    private javax.swing.JButton Removebtn9;
    private javax.swing.JLabel basketLabel1;
    private javax.swing.JLabel basketLabel2;
    private javax.swing.JLabel basketLabel3;
    private javax.swing.JLabel basketLabel4;
    private javax.swing.JLabel basketLabel5;
    private javax.swing.JButton checkoutbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
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
