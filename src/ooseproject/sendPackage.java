
package ooseproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class sendPackage extends javax.swing.JFrame {
        public static Connection conn;
    public static Statement st;
    public static PreparedStatement ps;
    public static ResultSet rs;
    
   
    
    public sendPackage() {
        initComponents();
         conn = OoseProject.mysql();
    }

    
    @SuppressWarnings("unchecked")
       String FIRST_NAME_REGEX = "^[a-zA-Z]{2,30}$";
    public  boolean validate(String firstName) {
    Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
    Matcher matcher = pattern.matcher(firstName);
    return matcher.matches();
  }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider2 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senddate_txt = new com.toedter.calendar.JDateChooser();
        destination_txt = new javax.swing.JComboBox<>();
        weight_btn = new javax.swing.JSpinner();
        sendpackage_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Send  a Package");

        jLabel2.setText("Weight Of Package");

        jLabel3.setText("Destination");

        jLabel4.setText("Sending Date");

        destination_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "karachi", "Islamabad", "Lahore", "Rawalpindi", " Muree" }));

        weight_btn.setDoubleBuffered(true);
        weight_btn.setEditor(new javax.swing.JSpinner.NumberEditor(weight_btn, ""));

        sendpackage_btn.setText("Send Package");
        sendpackage_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendpackage_btnActionPerformed(evt);
            }
        });

        jLabel6.setText("First name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sendpackage_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(senddate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(destination_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(weight_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(name_txt))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(weight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(destination_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senddate_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(55, 55, 55)
                .addComponent(sendpackage_btn)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendpackage_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendpackage_btnActionPerformed
        if(validate(name_txt.getText())){
        
       
        int weight = (Integer)weight_btn.getValue();
        String destination = destination_txt.getSelectedItem().toString();
        Date  d=  senddate_txt.getDate();
  
             LocalDate currentDate = LocalDate.now(); // current
            
            SimpleDateFormat format =new SimpleDateFormat("YYYY-MM-DD");
            String db =format.format(d);
            LocalDate dd = LocalDate.of(Integer.parseInt(db.substring(0, 4)),Integer.parseInt(db.substring(5, 7)),Integer.parseInt(db.substring(8, 10)));
        //--------------

        try {
              if (currentDate.isBefore(dd)){
                  
              if(weight<1){
                  JOptionPane.showMessageDialog(null," Weight should be a positive value");
              }else{

          
            int id = 0;
            
            String name = name_txt.getText();
            String getname = "SELECT * FROM person where fname= '"+name+"' ";
            ps= conn.prepareStatement(getname);
            rs = ps.executeQuery();
            while(rs.next()){
                
                 id = rs.getInt("user_id");
            }
            packages p1 = new packages();
            System.out.println(p1.sendpackage(id,weight,destination, id,db));
            System.out.println(p1.newpackageMdb(id, weight, destination, id, db));
            JOptionPane.showMessageDialog(null,"Your Package will be send in time  charges:" + p1.getcharges());
            this.dispose();
        }}
              else{
                  JOptionPane.showMessageDialog(null, "Enter valid Date");
              }
        }
        catch(Exception e){
        
            JOptionPane.showMessageDialog(null,e);
            
        }
        }else{
            JOptionPane.showMessageDialog(null, "Enter valid name");
        }
        
        
    }//GEN-LAST:event_sendpackage_btnActionPerformed

   
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
            java.util.logging.Logger.getLogger(sendPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sendPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sendPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sendPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sendPackage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> destination_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextField name_txt;
    private com.toedter.calendar.JDateChooser senddate_txt;
    private javax.swing.JButton sendpackage_btn;
    private javax.swing.JSpinner weight_btn;
    // End of variables declaration//GEN-END:variables
}
