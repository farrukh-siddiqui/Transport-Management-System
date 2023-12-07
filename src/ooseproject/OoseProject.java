
package ooseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.mongodb.DB;
import com.mongodb.MongoClient;

public class OoseProject {
     
    public static Statement st;
    public static ResultSet rs;
    public  static Connection mysql(){
            try{
                Connection conn;
                String username = "root";
                String pas = "Piedpiper2020";
                String sqlcon = "jdbc:mysql://localhost:3306/ooseproject";
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(sqlcon, username,pas);
                return conn;
            }catch(Exception e ){
                JOptionPane.showMessageDialog(null,e);
            
            }    
            return null;
}
        public static DB getDB(){
        DB db = null;
        MongoClient mongoClient  = new MongoClient( "localhost" , 27017 );
        //create database / if already created just get that database
        db = mongoClient.getDB("transportmanagementsystem");
        return db;

        }



    
    
    public static void main(String[] args) {
        mysql();
        getDB();
       
        
        
    }
    
}
