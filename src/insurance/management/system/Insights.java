/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package insurance.management.system;

import dao.Insurance_Insight_Count_dao;
import dao.Insurance_Trending_Policy_dao;

/**
 *
 * @author nidsp
 */
public class Insights extends javax.swing.JFrame {
    public String userEmail;

    /**
     * Creates new form Insights
     */
    public Insights() {
        initComponents();
    }
    
    public Insights(String email) {
        initComponents();
        userEmail = email;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegisteredUsers = new javax.swing.JButton();
        btnNotVerifiedUsers = new javax.swing.JButton();
        btnTotalInsurance = new javax.swing.JButton();
        btnAvailablePolicy = new javax.swing.JButton();
        btnTrendingPolicy = new javax.swing.JButton();
        btnSoldPolicy = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegisteredUsers.setBackground(new java.awt.Color(204, 255, 255));
        btnRegisteredUsers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegisteredUsers.setText("Total Registered Users");
        btnRegisteredUsers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegisteredUsers.setPreferredSize(new java.awt.Dimension(300, 200));
        btnRegisteredUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisteredUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisteredUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 300, 200));

        btnNotVerifiedUsers.setBackground(new java.awt.Color(204, 255, 255));
        btnNotVerifiedUsers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNotVerifiedUsers.setText("User Waiting for Approval");
        btnNotVerifiedUsers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNotVerifiedUsers.setPreferredSize(new java.awt.Dimension(300, 200));
        btnNotVerifiedUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotVerifiedUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnNotVerifiedUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 300, 200));

        btnTotalInsurance.setBackground(new java.awt.Color(204, 255, 255));
        btnTotalInsurance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTotalInsurance.setText("Total Available Insurance");
        btnTotalInsurance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTotalInsurance.setPreferredSize(new java.awt.Dimension(300, 200));
        btnTotalInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalInsuranceActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotalInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 300, 200));

        btnAvailablePolicy.setBackground(new java.awt.Color(204, 255, 255));
        btnAvailablePolicy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAvailablePolicy.setText("Total Available Policies");
        btnAvailablePolicy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAvailablePolicy.setPreferredSize(new java.awt.Dimension(300, 200));
        btnAvailablePolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailablePolicyActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvailablePolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 300, 200));

        btnTrendingPolicy.setBackground(new java.awt.Color(204, 255, 255));
        btnTrendingPolicy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTrendingPolicy.setText("Trending Policy");
        btnTrendingPolicy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTrendingPolicy.setPreferredSize(new java.awt.Dimension(300, 200));
        btnTrendingPolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrendingPolicyActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrendingPolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 300, 200));

        btnSoldPolicy.setBackground(new java.awt.Color(204, 255, 255));
        btnSoldPolicy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSoldPolicy.setText("Total Sold Policies");
        btnSoldPolicy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSoldPolicy.setPreferredSize(new java.awt.Dimension(300, 200));
        btnSoldPolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoldPolicyActionPerformed(evt);
            }
        });
        getContentPane().add(btnSoldPolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 300, 200));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Insights Dashboard");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisteredUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisteredUsersActionPerformed
        // TODO add your handling code here:
        new VerifyUser().setVisible(true);
    }//GEN-LAST:event_btnRegisteredUsersActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        btnRegisteredUsers.setText("<html>Total Registered Users<br><br><br><br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp "
                + Insurance_Insight_Count_dao.getTotalRegisteredUsers().toString() + "</html>");
        btnNotVerifiedUsers.setText("<html>User Waiting for Approval<br><br><br><br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp "
                + Insurance_Insight_Count_dao.getNonVerifiedUsers().toString() + "</html>");
        btnTotalInsurance.setText("<html>Total Available Insurance<br><br><br><br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp "
                + Insurance_Insight_Count_dao.getTotalInsurance().toString() + "</html>");
        btnAvailablePolicy.setText("<html>Total Policies<br><br><br><br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                + "&nbsp&nbsp "
                + Insurance_Insight_Count_dao.getTotalAvailablePolicy().toString() + "</html>");
        btnSoldPolicy.setText("<html>Total Sold Policies<br><br><br><br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                + "&nbsp&nbsp&nbsp&nbsp&nbsp "
                + Insurance_Insight_Count_dao.getTotalSoldPolicy().toString() + "</html>");
        btnTrendingPolicy.setText("<html>Trending Policy<br><br><br><br>&nbsp&nbsp&nbsp&nbsp&nbsp "
                + Insurance_Trending_Policy_dao.getTrendingPolicy() + "</html>");
        
    }//GEN-LAST:event_formComponentShown

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home(userEmail).setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNotVerifiedUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotVerifiedUsersActionPerformed
        // TODO add your handling code here:
        new VerifyUser().setVisible(true);
    }//GEN-LAST:event_btnNotVerifiedUsersActionPerformed

    private void btnTotalInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalInsuranceActionPerformed
        // TODO add your handling code here:
        new ManageInsurance().setVisible(true);
    }//GEN-LAST:event_btnTotalInsuranceActionPerformed

    private void btnAvailablePolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailablePolicyActionPerformed
        // TODO add your handling code here:
        new ViewEditDeletePolicy().setVisible(true);
    }//GEN-LAST:event_btnAvailablePolicyActionPerformed

    private void btnSoldPolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoldPolicyActionPerformed
        // TODO add your handling code here:
        new ViewSoldPolicyDetails().setVisible(true);
    }//GEN-LAST:event_btnSoldPolicyActionPerformed

    private void btnTrendingPolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrendingPolicyActionPerformed
        // TODO add your handling code here:
        new ViewEditDeletePolicy().setVisible(true);
    }//GEN-LAST:event_btnTrendingPolicyActionPerformed

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
            java.util.logging.Logger.getLogger(Insights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailablePolicy;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNotVerifiedUsers;
    private javax.swing.JButton btnRegisteredUsers;
    private javax.swing.JButton btnSoldPolicy;
    private javax.swing.JButton btnTotalInsurance;
    private javax.swing.JButton btnTrendingPolicy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
