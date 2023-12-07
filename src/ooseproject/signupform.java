
package ooseproject;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.*;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.*;

public class signupform extends javax.swing.JFrame {

   private static java.sql.Connection conn;
   
    Statement st =null;
     ResultSet rs=null;
     PreparedStatement ps = null;
    public signupform() {
        conn =   OoseProject.mysql();
        initComponents();
        
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        fname_txt = new javax.swing.JTextField();
        lname_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        contact_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        password_txt = new javax.swing.JPasswordField();
        username_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        house_txt = new javax.swing.JTextField();
        street_txt = new javax.swing.JTextField();
        city_combo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        type_btn = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First name ");

        jLabel2.setText("Last name ");

        jLabel3.setText("gender ");

        jLabel4.setText("contact ");

        jLabel5.setText("age ");

        jLabel6.setFont(new java.awt.Font("Ebrima", 2, 18)); // NOI18N
        jLabel6.setText("Sign Up page ");

        buttonGroup1.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setText("Female");

        jButton1.setText("Signup ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Username ");

        jLabel8.setText("password");

        jLabel9.setText("Street No ");

        jLabel10.setText("City ");

        jLabel11.setText("house No ");

        city_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "islamabad", "Lahore", "Karachi", "Taxas" }));
        city_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_comboActionPerformed(evt);
            }
        });

        jLabel12.setText("SIgnup as a ");

        type_btn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Driver", "User", "Admin", " " }));
        type_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_btnActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(male)
                                .addGap(71, 71, 71)
                                .addComponent(female)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fname_txt)
                                        .addComponent(age_txt)
                                        .addComponent(contact_txt)
                                        .addComponent(house_txt)
                                        .addComponent(street_txt)
                                        .addComponent(city_combo, 0, 193, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type_btn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(house_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(street_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(city_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(type_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(6, 6, 6))
        );

        type_btn.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_maleActionPerformed
 private static final String PHONE_NUMBER_REGEX = "^[0-9]{10}$";

  public static boolean validatePhone(String phoneNumber) {
    Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    Matcher matcher = pattern.matcher(phoneNumber);
    return matcher.matches();
  }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String[] arr ={'a','b','c'};
        String arr[] ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String arr2[]={"#","$","%","&"};
        String arr3[]={"0","1","2","3","4","5","6","7","8","9"};
        String x = "^[a-zA-Z][a-zA-Z0-9_]{6,19}$";
        String validNameReq = "1) Username must be 8 to 20 characters in length\n" +
"2) Username can only contain alphanumeric characters, numbers, underscore (_) and dot (.)\n" +
"3) Username cannot start with underscore and dot";
        
//        boolean a,b,c,d;
//        a = password_txt.getText().length()<8;
//        b = 
          if(fname_txt.getText().equals("")||lname_txt.getText().equals("")||contact_txt.getText().equals("")||username_txt.getText()==""||password_txt.getText()=="")
        {
            JOptionPane.showMessageDialog(null,"Please fill all of the elements listed above");
            fname_txt.setText("");
            lname_txt.setText("");
            contact_txt.setText("");
        }
          else if (password_txt.getText().length()<8){
              JOptionPane.showMessageDialog(null, "please Enter 8 digit password..");
              password_txt.setText("");
              
          }else if (!username_txt.getText().matches(x)){
              JOptionPane.showMessageDialog(null, validNameReq );
              username_txt.setText("");
          }else if (!validatePhone(contact_txt.getText())){
              JOptionPane.showMessageDialog(null, "Enter valid Contact Number");
              contact_txt.setText("");
              
          }else if (!(Integer.parseInt(age_txt.getText()) >= 0 && Integer.parseInt(age_txt.getText()) <= 120)){
              JOptionPane.showMessageDialog(null, "Enter valid age..");
              age_txt.setText("");
              
          }
        
          else{
            try  {
               
                String fname = fname_txt.getText();
                String lname = lname_txt.getText();
                String contact = contact_txt.getText();
                String username = username_txt.getText();
                String password = password_txt.getText();
                
                
               // String typePerson = type_btn.getSelectedItem().toString();
                
                int  house = Integer.parseInt(house_txt.getText());
                int  street = Integer.parseInt(street_txt.getText());
                String city = city_combo.getSelectedItem().toString();
                Person p1 = new Person();
                
                int ac1 = p1.createAccid();
                Address add = new Address(house,street,city,ac1);
                account a2 = new account(username,password,ac1);
                
                int age =(Integer.parseInt(age_txt.getText()));
                String gender = "";
                if(male.isSelected()){
                    
                    gender= "male";
                }else if (female.isSelected()){
                    gender = "female";
                }
                String accounttype = type_btn.getSelectedItem().toString();
//                String sql2 = "SELECT * FROM account  "; 
//                String pass ="";
//                ps = conn.prepareStatement(sql2);
//                rs = ps.executeQuery();
//               
//                     pass = rs.getString(password);
//                if(pass == password_txt.getText()){
//                
//                    JOptionPane.showMessageDialog(null,"Two passwords can not be same ");
//                    password_txt.setText("");
//                }
//                else {}
                if(accounttype=="Driver"){
                   
                   
                    Person d1 = new driver(); 
                    d1.setA1(a2);
                    d1.setAdd(add);
                    d1.setContact(contact);
                    d1.setAge(age);
                    d1.setGender(gender);
                    d1.setFname(fname);
                    d1.setLname(lname);
                    d1.setType(accounttype);
                    driver d =new driver();
                    
                    System.out.println(d1.adduser( fname ,  lname ,gender,ac1,age,contact));
                    System.out.println(d1.adduserMdb(fname, lname, gender, ac1, age, contact));
                    System.out.println(add.addaddres(d1.getAdd().getHouse_no(), d1.getAdd().getStreet_no(),d1.getAdd().getCity(),ac1));
                    System.out.println(add.addaddressMdb(d1.getAdd().getHouse_no(), d1.getAdd().getStreet_no(),d1.getAdd().getCity(),ac1));
                    System.out.println(a2.addAccount(username, password, ac1,accounttype));
                    System.out.println(a2.addaccountMdb(username, password, ac1, accounttype));
                    System.out.println(d.addDriver(ac1,ac1));
                    System.out.println(d.addriverMdb(ac1, ac1));
                
                }
                else if (accounttype == "User"){
                
                     user  u1 = new user(); 
                    
                    u1.setA1(a2);
                    u1.setAdd(add);
                    u1.setContact(contact);
                    u1.setAge(age);
                    u1.setGender(gender);
                    u1.setFname(fname);
                    u1.setLname(lname);
                    u1.setType(accounttype);
                    System.out.println(u1.adduser( fname ,  lname ,gender,ac1,age,contact));
                    System.out.println(u1.adduserMdb(fname, lname, gender, ac1, age, contact));
                    System.out.println(add.addaddres(house,street,city,ac1));
                    System.out.println(add.addaddressMdb(house, street, city, age));
                    System.out.println(a2.addAccount(username, password, ac1,accounttype));
                    System.out.println(a2.addaccountMdb(username, password, ac1, accounttype));
                    System.out.println(u1.addPassenger(ac1, ac1));
                    System.out.println(u1.addpessenderMdb(ac1, ac1));
                    
                    
                   
                }
                 else if (accounttype == "Admin"){
                
                     admin  a1 = new admin(); 
                    
                    a1.setA1(a2);
                    a1.setAdd(add);
                    a1.setContact(contact);
                    a1.setAge(age);
                    a1.setGender(gender);
                    a1.setFname(fname);
                    a1.setLname(lname);
                    a1.setType(accounttype);
                    System.out.println(a1.adduser( fname ,  lname ,gender,ac1,age,contact));
                    System.out.println(a1.adduserMdb(fname, lname, gender, ac1, age, contact)+"Person should be working ");
                    System.out.println(add.addaddres(house,street,city,ac1));
                    System.out.println(add.addaddressMdb(house, street, city, age) +"Why  is this not working ");
                    System.out.println(a2.addAccount(username, password, ac1,accounttype));
                    System.out.println(a2.addaccountMdb(username, password, ac1, accounttype)+ "is this working");
                    System.out.println(a1.addAdmin(ac1, ac1));
                    System.out.println(a1.addadminMdb(ac1, ac1));
                    
                    
                   
                }
                JOptionPane.showMessageDialog(null, "Signup Successfull");
                this.dispose();    
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
            
            }
            
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void city_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_city_comboActionPerformed

    private void type_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();;
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> city_combo;
    private javax.swing.JTextField contact_txt;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JTextField house_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JRadioButton male;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JTextField street_txt;
    private javax.swing.JComboBox<String> type_btn;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
