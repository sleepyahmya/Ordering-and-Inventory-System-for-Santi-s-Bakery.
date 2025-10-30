
package orderingsystemforsanti;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());


    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
       
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LAYOUT_NULL = new javax.swing.JPanel();
        LEFT = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        RIGHT = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        Drop = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(0, 103, 0));
        setLocation(new java.awt.Point(250, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        LAYOUT_NULL.setBackground(new java.awt.Color(204, 204, 204));
        LAYOUT_NULL.setPreferredSize(new java.awt.Dimension(900, 600));
        LAYOUT_NULL.setLayout(null);

        LEFT.setBackground(new java.awt.Color(51, 51, 0));
        LEFT.setForeground(new java.awt.Color(102, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystemforsanti/logo (1).png"))); // NOI18N

        javax.swing.GroupLayout LEFTLayout = new javax.swing.GroupLayout(LEFT);
        LEFT.setLayout(LEFTLayout);
        LEFTLayout.setHorizontalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        LEFTLayout.setVerticalGroup(
            LEFTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LEFTLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        LAYOUT_NULL.add(LEFT);
        LEFT.setBounds(0, 0, 230, 600);

        RIGHT.setBackground(new java.awt.Color(51, 51, 0));
        RIGHT.setPreferredSize(new java.awt.Dimension(450, 600));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");

        UserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserName.setToolTipText("");
        UserName.setBorder(null);
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Password.setBorder(null);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystemforsanti/Sing iout.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Drop.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Drop.setForeground(new java.awt.Color(102, 102, 102));
        Drop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Admin" }));
        Drop.setBorder(null);
        Drop.setInheritsPopupMenu(true);
        Drop.setName(""); // NOI18N
        Drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Santi's Bakeshop");

        javax.swing.GroupLayout RIGHTLayout = new javax.swing.GroupLayout(RIGHT);
        RIGHT.setLayout(RIGHTLayout);
        RIGHTLayout.setHorizontalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RIGHTLayout.createSequentialGroup()
                .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RIGHTLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton1))
                    .addGroup(RIGHTLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RIGHTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RIGHTLayout.createSequentialGroup()
                        .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(Drop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RIGHTLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        RIGHTLayout.setVerticalGroup(
            RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RIGHTLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addComponent(jLabel2)
                .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RIGHTLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(RIGHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RIGHTLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Drop, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        LAYOUT_NULL.add(RIGHT);
        RIGHT.setBounds(230, 0, 680, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LAYOUT_NULL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LAYOUT_NULL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try {
        String username = UserName.getText().trim();
        String password = new String(Password.getPassword());
        String role = Drop.getSelectedItem().toString();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "⚠️ Kindly enter all required information!");
            return;
        }

       
        boolean success = UserDAO.validateLogin(username, password, role);

        if (success) {
            JOptionPane.showMessageDialog(this, "✅ Access granted!");
            
            if (role.equalsIgnoreCase("Admin")) {
                Dashboard adminDashboard = new Dashboard();
                adminDashboard.setVisible(true);
            } else if (role.equalsIgnoreCase("Cashier")) {
                Cashier cashierDashboard = new Cashier();
                cashierDashboard.setVisible(true);
            }
            this.dispose(); // Close login window
        } else {
            JOptionPane.showMessageDialog(this, "❌ Login failed — invalid credentials or role.");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "⚠️ Authentication Error:" + e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void DropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropActionPerformed

    }//GEN-LAST:event_DropActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
      
    }//GEN-LAST:event_UserNameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
      
    }//GEN-LAST:event_PasswordActionPerformed

  
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Drop;
    private javax.swing.JPanel LAYOUT_NULL;
    private javax.swing.JPanel LEFT;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel RIGHT;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    
    

 

   
}
