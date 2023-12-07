
package ooseproject;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class addvehicleform extends javax.swing.JFrame {
 Statement st =null;
     ResultSet rs=null;
     PreparedStatement ps = null;
     Connection con = null;
     DB database = null;
     
    /**
     * Creates new form addvehicleform                 //check karo level idr comment ke ander bhi error aa rahy hn kia zindagi ha yar 
     */
    public addvehicleform() {
        con=OoseProject.mysql();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vehiclename_txt = new javax.swing.JTextField();
        vehiclemodel_txt = new javax.swing.JTextField();
        type_btn = new javax.swing.JComboBox<>();
        addvehicle_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        jLabel1.setText("Add a Vehicle");

        jLabel2.setText("vehicle name");

        jLabel3.setText("vehicle model ");

        jLabel4.setText("vehicle  type ");

        type_btn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LTV", "HTV", "SUV" }));

        addvehicle_btn.setText("Enter Data ");
        addvehicle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvehicle_btnActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Driver UserName ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(type_btn, 0, 164, Short.MAX_VALUE)
                            .addComponent(vehiclemodel_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(vehiclename_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(name_txt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(addvehicle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vehiclename_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehiclemodel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(type_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addvehicle_btn)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     String FIRST_NAME_REGEX = "^[a-zA-Z]{2,30}$";
    public  boolean validate(String firstName) {
    Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
    Matcher matcher = pattern.matcher(firstName);
    return matcher.matches();
  }
    
    private void addvehicle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvehicle_btnActionPerformed
       String vehiclename = vehiclename_txt.getText();
      
       String vehicletype = type_btn.getSelectedItem().toString();
       String Pname =name_txt.getText();
       
       
           
       try{
            int vehiclemodel = Integer.parseInt(vehiclemodel_txt.getText());
            if (vehiclemodel>=1950 && vehiclemodel<=2024){
           int id =0;
        String getname = "SELECT * FROM account where username= '"+Pname+"' AND type='Driver'";
            ps= con.prepareStatement(getname);
            rs = ps.executeQuery();
            while(rs.next()){
                
                 id = rs.getInt("user_id");
            }
                    vehicle v1 = new vehicle();
                    v1.addvehicle(id, vehiclemodel, vehiclename, vehicletype);
                    v1.addvehiclemd(id, vehiclemodel,vehiclename, vehicletype);
//                String sql = "INSERT INTO vehicle( vehicle_id,vehicle_model,vehicle_name,vehicletype) VALUES ('"+id+"','"+vehiclemodel+"','"+vehiclename+"','"+vehicletype+"')";
//                ps =con.prepareStatement(sql);
//                ps.execute();
                JOptionPane.showMessageDialog(null,"Registered successfully");
                this.dispose();
                }else{
               JOptionPane.showMessageDialog(null, "Enter valid Model..");
                }
                
            }catch(Exception e){
//           JOptionPane.showMessageDialog(null,"Enter valid Input..");
JOptionPane.showMessageDialog(null,e);
                   
       }
       
      
        
    }//GEN-LAST:event_addvehicle_btnActionPerformed

    
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
            java.util.logging.Logger.getLogger(addvehicleform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addvehicleform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addvehicleform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addvehicleform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addvehicleform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addvehicle_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name_txt;
    private javax.swing.JComboBox<String> type_btn;
    private javax.swing.JTextField vehiclemodel_txt;
    private javax.swing.JTextField vehiclename_txt;
    // End of variables declaration//GEN-END:variables
}
