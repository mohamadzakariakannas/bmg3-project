
package user_Interface;

import business.AddData;
import business.MasterOrderCatalog;
import business.PharmacyDirectory;
import business.StoreDirectory;
import java.awt.CardLayout;
import userinterface.CVSadmin.AdminWorkAreaJPanel;
import userinterface.CVSadmin.LoginPharmacyJPanel;
import userinterface.storeAdmin.LoginStoreJPanel;
import userinterface.storeAdmin.StoreWorkAreaJPanel;


public class MainJFrame extends javax.swing.JFrame {


    private PharmacyDirectory pharmacyDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private StoreDirectory storeDirectory;
    AddData d = new AddData();
        
    public MainJFrame() {
        initComponents();
        pharmacyDirectory =  new PharmacyDirectory();
      //  masterOrderCatalog = new MasterOrderCatalog();
        storeDirectory = new StoreDirectory();
       d.setInitialValues(pharmacyDirectory);
       d.setStoreInitialValues(storeDirectory);
    }

 
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        CVSAdminJButton = new javax.swing.JButton();
        storeAdminJButton = new javax.swing.JButton();
        pharmaAdminJButton = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CVSAdminJButton.setText("CVS admin");
        CVSAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVSAdminJButtonActionPerformed(evt);
            }
        });

        storeAdminJButton.setText("Store admin");
        storeAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeAdminJButtonActionPerformed(evt);
            }
        });

        pharmaAdminJButton.setText("Pharma admin");
        pharmaAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmaAdminJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pharmaAdminJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(storeAdminJButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CVSAdminJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(CVSAdminJButton)
                .addGap(18, 18, 18)
                .addComponent(pharmaAdminJButton)
                .addGap(18, 18, 18)
                .addComponent(storeAdminJButton)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CVSAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVSAdminJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
         AdminWorkAreaJPanel adminWorkArea =  new AdminWorkAreaJPanel(userProcessContainer,pharmacyDirectory,storeDirectory);
        userProcessContainer.add("adminWorkAreaJPanel",adminWorkArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_CVSAdminJButtonActionPerformed

    private void storeAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeAdminJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        LoginStoreJPanel loginStore = new LoginStoreJPanel(userProcessContainer, pharmacyDirectory, storeDirectory);
        userProcessContainer.add("loginStore",loginStore);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
      
        
    }//GEN-LAST:event_storeAdminJButtonActionPerformed

    private void pharmaAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmaAdminJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        LoginPharmacyJPanel loginPharmacy = new LoginPharmacyJPanel(userProcessContainer,pharmacyDirectory);
        userProcessContainer.add("loginPharmacy",loginPharmacy);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_pharmaAdminJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CVSAdminJButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton pharmaAdminJButton;
    private javax.swing.JButton storeAdminJButton;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
