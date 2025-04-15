/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration;

/**
 *
 * @author USER
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jSalesReport = new javax.swing.JButton();
        jManageSeller = new javax.swing.JButton();
        jViewProduct = new javax.swing.JButton();
        jLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Admin Panel");

        jSalesReport.setText("Sales Report");
        jSalesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalesReportActionPerformed(evt);
            }
        });

        jManageSeller.setText("Manage Sellers");
        jManageSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManageSellerActionPerformed(evt);
            }
        });

        jViewProduct.setText("View Product Categories");
        jViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewProductActionPerformed(evt);
            }
        });

        jLogOut.setText("Log Out");
        jLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jViewProduct))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jManageSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jSalesReport))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLogOut)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jSalesReport)
                .addGap(33, 33, 33)
                .addComponent(jManageSeller)
                .addGap(35, 35, 35)
                .addComponent(jViewProduct)
                .addGap(29, 29, 29)
                .addComponent(jLogOut)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalesReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalesReportActionPerformed

    private void jManageSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManageSellerActionPerformed
        // TODO add your handling code here:
        SellerManager newFrame = new SellerManager();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jManageSellerActionPerformed

    private void jViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jViewProductActionPerformed

    private void jLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutActionPerformed
        // TODO add your handling code here:
        LogIn newFrame = new LogIn();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLogOut;
    private javax.swing.JButton jManageSeller;
    private javax.swing.JButton jSalesReport;
    private javax.swing.JButton jViewProduct;
    // End of variables declaration//GEN-END:variables
}
