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
public class Signin extends javax.swing.JFrame {

    /**
     * Creates new form Signin
     */
    public Signin() {
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
        passwordlb = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginbt = new javax.swing.JButton();
        userjf = new javax.swing.JTextField();
        usernamelable = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocation(new java.awt.Point(600, 170));
        setMinimumSize(new java.awt.Dimension(592, 457));
        setResizable(false);
        setSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MangaVerse");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(1958, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2361, 81);

        passwordlb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        passwordlb.setForeground(new java.awt.Color(255, 0, 0));
        passwordlb.setText("Password");
        getContentPane().add(passwordlb);
        passwordlb.setBounds(130, 270, 109, 32);

        jPasswordField1.setBackground(new java.awt.Color(255, 102, 102));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(250, 276, 180, 26);

        loginbt.setBackground(new java.awt.Color(153, 255, 153));
        loginbt.setText("Login");
        loginbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtActionPerformed(evt);
            }
        });
        getContentPane().add(loginbt);
        loginbt.setBounds(380, 330, 72, 23);

        userjf.setBackground(new java.awt.Color(255, 102, 102));
        userjf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userjf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userjfActionPerformed(evt);
            }
        });
        getContentPane().add(userjf);
        userjf.setBounds(250, 200, 179, 26);

        usernamelable.setBackground(new java.awt.Color(168, 168, 168));
        usernamelable.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usernamelable.setForeground(new java.awt.Color(255, 0, 0));
        usernamelable.setText("Username");
        getContentPane().add(usernamelable);
        usernamelable.setBounds(120, 190, 114, 32);

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MangaStore/bg.png"))); // NOI18N
        getContentPane().add(Image);
        Image.setBounds(0, 70, 600, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userjfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userjfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userjfActionPerformed

    private void loginbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtActionPerformed
     String username = userjf.getText();
     String password = new String(jPasswordField1.getPassword());
     if (username.equals("mido") && password.equals("123")){
         JOptionPane.showMessageDialog(this,"Login successful!");
         HomePage homePage = new HomePage();
         homePage.setVisible(true);
         this.dispose(); // close current form
     }
     else{
        JOptionPane.showMessageDialog(this,"Login Failed Please check you password and username !");
     }
    }//GEN-LAST:event_loginbtActionPerformed

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
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loginbt;
    private javax.swing.JLabel passwordlb;
    private javax.swing.JTextField userjf;
    private javax.swing.JLabel usernamelable;
    // End of variables declaration//GEN-END:variables
}
