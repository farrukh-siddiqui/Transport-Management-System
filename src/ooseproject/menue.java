
package ooseproject;


public class menue extends javax.swing.JFrame {

    
    public menue() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bookride_btn = new javax.swing.JButton();
        sendpackage_btn = new javax.swing.JButton();
        checkroutes_btn = new javax.swing.JButton();
        viewpackage = new javax.swing.JButton();
        triphistory = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel1.setText("Welcome To Transport Management System");

        bookride_btn.setBackground(new java.awt.Color(0, 0, 255));
        bookride_btn.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        bookride_btn.setText("Book Ride");
        bookride_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookride_btnActionPerformed(evt);
            }
        });

        sendpackage_btn.setBackground(new java.awt.Color(204, 0, 51));
        sendpackage_btn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sendpackage_btn.setText("Send Package");
        sendpackage_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendpackage_btnActionPerformed(evt);
            }
        });

        checkroutes_btn.setBackground(new java.awt.Color(204, 204, 0));
        checkroutes_btn.setText("Check Routes");
        checkroutes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkroutes_btnActionPerformed(evt);
            }
        });

        viewpackage.setBackground(new java.awt.Color(255, 51, 255));
        viewpackage.setText("View Package history");
        viewpackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpackageActionPerformed(evt);
            }
        });

        triphistory.setBackground(new java.awt.Color(0, 255, 0));
        triphistory.setText("View Trip history");
        triphistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triphistoryActionPerformed(evt);
            }
        });

        jButton7.setText("Exit ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewpackage, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(triphistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkroutes_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sendpackage_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookride_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(bookride_btn)
                .addGap(18, 18, 18)
                .addComponent(sendpackage_btn)
                .addGap(27, 27, 27)
                .addComponent(checkroutes_btn)
                .addGap(32, 32, 32)
                .addComponent(triphistory)
                .addGap(31, 31, 31)
                .addComponent(viewpackage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(13, 13, 13)
                .addComponent(jButton7)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookride_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookride_btnActionPerformed
         new bookride().show();
        

    }//GEN-LAST:event_bookride_btnActionPerformed

    private void sendpackage_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendpackage_btnActionPerformed
        
        new sendPackage().show();
    }//GEN-LAST:event_sendpackage_btnActionPerformed

    private void triphistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triphistoryActionPerformed
           
        new triphistory().show();
        
    }//GEN-LAST:event_triphistoryActionPerformed

    private void viewpackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpackageActionPerformed
        
        new packagehistory().show();
        
    }//GEN-LAST:event_viewpackageActionPerformed

    private void checkroutes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkroutes_btnActionPerformed

        new routesform ().show();



    }//GEN-LAST:event_checkroutes_btnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new StartUPpage().show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookride_btn;
    private javax.swing.JButton checkroutes_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sendpackage_btn;
    private javax.swing.JButton triphistory;
    private javax.swing.JButton viewpackage;
    // End of variables declaration//GEN-END:variables
}
