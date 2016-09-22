/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mik.gui;

import java.util.List;
import javax.swing.JOptionPane;
import mik.entity.User;
import mik.processor.FileProcessor;

/**
 *
 * @author Rasel
 */
public class CreateAccountGui extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccountGui
     */
    public CreateAccountGui() {
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
            java.util.logging.Logger.getLogger(CreateAccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        initComponents();
        this.lblPasswdMismatch.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCreateAcc = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPasswordWarning = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        lblPasswordWarning1 = new javax.swing.JLabel();
        RePasswordField = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblPasswdMismatch = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelCreateAcc.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Create New Account.");
        jPanelCreateAcc.add(jLabel1);
        jLabel1.setBounds(120, 10, 210, 30);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 204));
        lblName.setText("Name: ");
        jPanelCreateAcc.add(lblName);
        lblName.setBounds(30, 60, 50, 20);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 204, 255));
        lblPassword.setText("Password must be 16 character long");
        jPanelCreateAcc.add(lblPassword);
        lblPassword.setBounds(130, 80, 230, 20);

        lblPasswordWarning.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPasswordWarning.setForeground(new java.awt.Color(0, 0, 204));
        lblPasswordWarning.setText("Password: ");
        jPanelCreateAcc.add(lblPasswordWarning);
        lblPasswordWarning.setBounds(30, 100, 70, 20);

        txtName.setPreferredSize(new java.awt.Dimension(10, 20));
        jPanelCreateAcc.add(txtName);
        txtName.setBounds(130, 50, 220, 30);

        passwordField.setPreferredSize(new java.awt.Dimension(10, 20));
        jPanelCreateAcc.add(passwordField);
        passwordField.setBounds(130, 100, 220, 30);

        lblPasswordWarning1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPasswordWarning1.setForeground(new java.awt.Color(0, 0, 204));
        lblPasswordWarning1.setText("Re-Password: ");
        jPanelCreateAcc.add(lblPasswordWarning1);
        lblPasswordWarning1.setBounds(30, 160, 90, 20);

        RePasswordField.setPreferredSize(new java.awt.Dimension(10, 20));
        jPanelCreateAcc.add(RePasswordField);
        RePasswordField.setBounds(130, 160, 220, 30);

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanelCreateAcc.add(btnCancel);
        btnCancel.setBounds(240, 220, 80, 30);

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanelCreateAcc.add(btnCreate);
        btnCreate.setBounds(130, 220, 80, 30);

        lblPasswdMismatch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPasswdMismatch.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswdMismatch.setText("Password should be 16 character long!");
        jPanelCreateAcc.add(lblPasswdMismatch);
        lblPasswdMismatch.setBounds(130, 140, 250, 15);
        jPanelCreateAcc.add(lblBackground);
        lblBackground.setBounds(0, 0, 390, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCreateAcc, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCreateAcc, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkWithExistingUser(List<User> userList, String name) {
        boolean exist = false;
        for (int i = 0; i < userList.size(); i++) {
            if (name.equalsIgnoreCase(userList.get(i).getUserName())) {
                exist = true;
            }
        }
        return exist;
    }
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        FileProcessor fp = new FileProcessor();
        List<User> userList = fp.getExistingUser();
        String accountCreationTime = fp.getCurrentTimeAsString();
        User newUser;

        String name = this.txtName.getText().toString().trim();
        String password = String.copyValueOf(this.passwordField.getPassword());
        String rePassword = String.copyValueOf(this.RePasswordField.getPassword());

        if (checkWithExistingUser(userList, name)) {
            this.lblPasswdMismatch.setText("User already exist!");
            this.lblPasswdMismatch.setVisible(true);
            this.passwordField.setText("");
            this.RePasswordField.setText("");
        } else {
            if (password.length() == 16) {
                if (password.toLowerCase().equalsIgnoreCase(rePassword.toLowerCase())) {
                    System.out.println("match");
                    
                    newUser = new User(name, password, accountCreationTime);
                    newUser.setLastModifiedDate(accountCreationTime);
                    userList.add(newUser);
                    fp.updateUserLogInFile(userList);
                    JOptionPane.showMessageDialog(this, "Congratulation! Your account has been successfully created.");
                    this.dispose();
                } else {
                    this.lblPasswdMismatch.setText("Password mismatched!");
//                this.lblPasswdMismatch.setLocation(this.lblPasswdMismatch.getX() + 30, this.lblPasswdMismatch.getY());
                    this.lblPasswdMismatch.setVisible(true);
                    this.passwordField.setText("");
                    this.RePasswordField.setText("");
                }
            } else {
                this.lblPasswdMismatch.setText("Password should be 16 character long!");
//            this.lblPasswdMismatch.setSize(this.lblPasswdMismatch.getWidth() + 30, this.lblPasswdMismatch.getHeight());
//            this.lblPasswdMismatch.setLocation(this.lblPasswdMismatch.getX() - 30, this.lblPasswdMismatch.getY());
                this.lblPasswdMismatch.setVisible(true);
                this.passwordField.setText("");
                this.RePasswordField.setText("");
            }
        }
        fp = null;
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField RePasswordField;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCreateAcc;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPasswdMismatch;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordWarning;
    private javax.swing.JLabel lblPasswordWarning1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
