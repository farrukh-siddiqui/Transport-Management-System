
package ooseproject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;

public   class  Person {
    private String fname ;
    private String lname;
    private String gender ;
    private int acc_id ;
    private int age ;
    private String contact;
    private Address add ;
    private String type;
    
    public account a1;
    Connection conn = null;
    PreparedStatement ps = null;    
    DB database = null;
    
    Person(){
        conn  = OoseProject.mysql();
        database =OoseProject.getDB();
    }
    
    Person(String fname , String lname ,String gender, int acc_id, int age , String contact,Address add,account a1,String type){
    
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.acc_id= acc_id;
        this.age = age;
        this.contact = contact;
        this.add = add;
        this.a1 = a1;
        this.type=type;
    }

    public Address getAdd() {
        return add;
    }

    public account getA1() {
        return a1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public void setA1(account a1) {
        this.a1 = a1;
    }
    
    
    public  int createAccid(){
        boolean t =false;
        int max = 500;
        int min = 1;
        
        int acc_id = (int)Math.floor(Math.random()*(max-min+1)+min);
        ArrayList<Integer> a =new ArrayList<Integer>(); 
        while(t=false){
            
            if(a.contains(acc_id)){
                  acc_id = (int)Math.floor(Math.random()*(max-min+1)+min);
                  
            }
            else {
            
            t = true ;    
            }
        }
        a.add(acc_id);
        return acc_id;
    }
    // Ye hamara add driver aur Pessenger add karne wala code ha 
    public boolean adduser(String fname , String lname ,String gender, int acc_id, int age , String contact){
        boolean b = true ;
        try{
            
             String sql = "INSERT INTO  person (fname,lname,gender,user_id,age,contact) VALUES ( '"+fname+"','"+lname+"','"+gender+"','"+acc_id+"','"+age+"','"+contact+"')";
        
           
             ps = conn.prepareStatement(sql);
           
             ps.execute();
        
            }catch(Exception e){
                  
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b; 
    
    }
    public boolean adduserMdb(String fname , String lname ,String gender, int acc_id, int age , String contact){
         boolean b = true ;
        try{
            DBCollection collection = database.getCollection("person");
            
            DBObject person = new BasicDBObject("fname", fname).append("lname", lname).append("gender",  gender)
                .append("age", age).append("contact",contact );
            
            collection.insert(person);
            }catch(Exception e){
                  
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b; 
    
    
    
    }
   
}
class Address{

    private int house_no ;
    private int street_no;
    private String city ;
    private int  add_id;
    Connection con = null;
    PreparedStatement ps = null;
    DB database  = null;
             Address (){
                 con = OoseProject.mysql();
                 database = OoseProject.getDB();
             }
    public int getHouse_no() {
        return house_no;
    }

    public int getStreet_no() {
        return street_no;
    }

    public String getCity() {
        return city;
    }

    public int getAdd_id() {
        return add_id;
    }
    
    public void setHouse_no(int house_no) {
        this.house_no = house_no;
    }

    public void setStreet_no(int street_no) {
        this.street_no = street_no;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAdd_id(int add_id) {
        this.add_id = add_id;
    }

    public Address(int house_no, int street_no, String city, int add_id) {
         con = OoseProject.mysql();
         database = OoseProject.getDB();

        this.house_no = house_no;
        this.street_no = street_no;
        this.city = city;
        this.add_id = add_id;
        
    }

    public boolean addaddres(int house,int street,String city,int add_id){
        boolean b = false;
        try{
        String sql2 = "INSERT INTO  address (house_no,street_no,city,add_id) VALUES ( '"+house+"','"+street+"','"+city+"','"+add_id+"')";
          
          ps = con.prepareStatement(sql2);
             ps.execute();
             b = true;
        }
        
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
     return b;
          
    }

    public boolean addaddressMdb(int house,int street,String city,int add_id){
         boolean b = true ;
        try{
            DBCollection collection = database.getCollection("address");
            
            DBObject address = new BasicDBObject("house", house).append("street", street).append("add_id", add_id);
            
            collection.insert(address);
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"This is not working");
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b;
    }
    

}



class account  {

    private String username;
    private String password;
    private int user_id;
    Connection conn;
    PreparedStatement ps;
    DB database = null;
    public account(){
      conn = OoseProject.mysql();
      database =OoseProject.getDB();
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUser_id() {
        return user_id;
    }

    public account(String username, String password, int user_id) {
        this.username = username;
        this.password = password;
        this.user_id = user_id;
        conn = OoseProject.mysql();
        database = OoseProject.getDB();

    }
    public boolean addAccount(String username , String password , int user_id,String type){
        boolean t;
        try{
            
            String sql = "INSERT INTO account (username,password,user_id,type) VALUES ('"+username+"','"+password+"','"+user_id+"','"+type+"')";
            ps = conn.prepareStatement(sql);
            ps.execute();
            t = true;
        }
        catch(Exception e ){
        
            JOptionPane.showMessageDialog(null,e);
            t= false;
        }
        
    return t ;    
    } 
    public boolean addaccountMdb(String username , String password , int user_id,String type){
         boolean b = true ;
         
        try{
            DBCollection collection = database.getCollection("account");
            
            DBObject account = new BasicDBObject("username", username).append("password", password).append("user_id", user_id).append("type",type);
            
            collection.insert(account);
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"This is not working");
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b;
    }
    
    
    
}
class user extends Person{
    private int user_id;
    private Double userrating;
    public static Connection conn;
    public static Statement st;
    public static PreparedStatement ps;
    public static ResultSet rs;
       user(){
           conn = OoseProject.mysql();
       }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUserrating(Double userrating) {
        this.userrating = userrating;
    }

    public int getUser_id() {
        return user_id;
    }

    public Double getUserrating() {
        return userrating;
    }

    public user(int user_id, Double userrating) {
        this.user_id = user_id;
        this.userrating = userrating;
    }
     public boolean addPassenger(int u_id,int a_id){
        boolean b = false;
        try{
        String sql2 = "INSERT INTO  user (user_id,acc_id) VALUES ( '"+u_id+"','"+a_id+"')";
          
          ps = conn.prepareStatement(sql2);
             ps.execute();
             b = true;
        }catch(Exception  e){
            JOptionPane.showMessageDialog(null, e);
        }
        return b;
    }
     public boolean addpessenderMdb(int user_id,int acc_id){
         boolean b = true ;
        try{
            DBCollection collection = database.getCollection("address");
            
            DBObject pessenger = new BasicDBObject("user_id", user_id).append("acc_id", acc_id);
            
            collection.insert(pessenger);
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"This is not working");
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b;
    }
    

}

class driver extends Person{
    private int  Dacc_id;       //This is the Primary Key 
    private Double driver_rating;
     // ye chawal mari wi ha 
    
    driver(){}
    public void setDacc_id(int Dacc_id) {
        this.Dacc_id = Dacc_id;
    }

    public void setDriver_rating(Double driver_rating) {
        this.driver_rating = driver_rating;
    }

   
    public int getDacc_id() {
        return Dacc_id;
    }

    public Double getDriver_rating() {
        return driver_rating;
    }

  

    public driver(int Dacc_id, Double driver_rating) {
        this.Dacc_id = Dacc_id;
        this.driver_rating = driver_rating;
        
    }
    public boolean addDriver(int d_id,int a_id){
        boolean b = false;
        try{
        String sql2 = "INSERT INTO  driver (driver_id,acc_id) VALUES ( '"+d_id+"','"+a_id+"')";
          
          ps = conn.prepareStatement(sql2);
             ps.execute();
             b = true;
        }catch(Exception  e){
            
        }
        return b;
    }
    public boolean addriverMdb(int driver_id ,int a_id){
         boolean b = true ;
        try{
            DBCollection collection = database.getCollection("driver");
            
            DBObject driver = new BasicDBObject("driver id ",driver_id).append("a_id", a_id);
            
            collection.insert(driver);
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"This is not working");
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b;
    }
}
class admin extends Person{
     private int  acc_id;       //This is the Primary Key 
    private int admin_id;
    admin(){
        
    }
    public boolean addAdmin(int a_id,int admin){
         boolean b = false;
        try{
        String sql2 = "INSERT INTO  admin (admin_id,acc_id) VALUES ( '"+a_id+"','"+admin+"')";
          
          ps = conn.prepareStatement(sql2);
             ps.execute();
             b = true;
        }catch(Exception  e){
            
        }
        return b;
    }
    public boolean addadminMdb(int a_id,int admin){
         boolean b = true ;
        try{
            DBCollection collection = database.getCollection("admin");
            
            DBObject admine = new BasicDBObject("admin id ",a_id).append("admin", admin);
            
            collection.insert(admine);
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"This is not working");
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b;
    }
}
    
    
    
    
    


class booking{
    private int booking_id;
    private  String destination;
    private String departure ;
    private int count = 0 ;
    public static Connection conn;
    public static Statement st;
    public static PreparedStatement ps;
    public static ResultSet rs;
    DB database=null;
    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

   

    public booking(int booking_id, String destination, String departure ) {
        this.booking_id = booking_id;
        this.destination = destination;
        this.departure = departure;
        database = OoseProject.getDB();
        
    }
    booking(){
        conn = OoseProject.mysql();
        database = OoseProject.getDB();
        count ++;
    }
   
    
    public boolean newbooking(int id , String destination, String departure ,int ide ,int noofseats,String datedepartrue){
            boolean bt;
            try{
//                String q2 = "SELECT * FROM account where user_id"
              
                String sql = "INSERT INTO booking (booking_id,destination,departure,user_acc_id,NoofSeats,datedeparture) VALUES ('"+id+"','"+destination+"','"+departure+"','"+ide+"','"+noofseats+ "','"+datedepartrue+"')";
                ps = conn.prepareStatement(sql);
                ps.execute();
                bt = true;
                
            
            }
            catch(Exception e ){
            
                   JOptionPane.showMessageDialog(null,e);
                bt = false;
            
            }
    
            return bt;
    }
    public boolean newbookingMdb(int id,String destination,String departure,int ide,int noofseats,String datedearture){
         boolean b = true ;
        try{
            DBCollection collection = database.getCollection("booking");
            
            DBObject book = new BasicDBObject("booking id", id).append("destination", destination).append("departure", departure)
                    .append("id",ide).append("No of seats",noofseats).append("date of departure",datedearture);
            
            collection.insert(book);
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"This is not working");
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b;
    }
   }
class packages{

    private int package_id;
    private int weight;
    private String destination;
    private int charges ;
    public static Connection conn;
    public static Statement st;
    public static PreparedStatement ps;
    public static ResultSet rs;
    DB database = null;
    
    public int getcharges(){
        return charges;
    }
    public void setPackage_id(int package_id) {
        this.package_id = package_id;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPackage_id() {
        return package_id;
    }

    public double getWeight() {
        return weight;
    }

    public String getDestination() {
        return destination;
        
    }

    public packages(int package_id, int  weight, String destination) {
        this.package_id = package_id;
        this.weight = weight;
        this.destination = destination;
         conn = OoseProject.mysql();

    }
    public packages (){
     conn = OoseProject.mysql();
     database = OoseProject.getDB();
    }
     public boolean sendpackage(int package_id, int weight, String destination,int user_id, String sendDate){
            boolean bt;
            try{
                charges =0;
                int cost =180;
                 
                if(weight ==1 ){
                    
                    charges = cost ;
                }
                else {
                    charges = weight*cost ;
                    
                }
                String sql = "INSERT INTO package (package_id,weight,destination,user_acc_id,sendDate,charges ) VALUES ('"+package_id+"','"+weight+"','"+destination+"','"+user_id+"','"+sendDate+"','"+charges+"')";
                ps = conn.prepareStatement(sql);
                ps.execute();
                bt = true;
            }
            catch(Exception e ){
            
                   JOptionPane.showMessageDialog(null,e);
                bt = false;
            
            }
    
            return bt;
    }
     public boolean newpackageMdb(int package_id, int weight, String destination,int user_id, String sendDate){
         boolean b = true ;
        try{
            DBCollection collection = database.getCollection("package");
            
            DBObject packaged = new BasicDBObject("package id", package_id).append("weight", weight).append("destination", destination)
                    .append("user id",user_id).append("sendDate",sendDate);
            
            collection.insert(packaged);
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"This is not working");
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b;
    }
   
    }
class payment{

    private int payment_id;
    private double amount ;

    public payment(int payment_id, double amount) {
        this.payment_id = payment_id;
        this.amount = amount;
    }
    


}

class vehicle {

    private int vehicle_id;
    private int vehicle_model;
    private String vehicle_name;
    private String vehicle_route;
    private String vehicletype;
    public static Connection conn;
    public static Statement st;
    public static PreparedStatement ps;
    public static ResultSet rs;
    DB database = null;
    public vehicle(int vehicle_id, int vehicle_model, String vehicle_name, String vehicle_route,String vehicletype) {
        this.vehicle_id = vehicle_id;
        this.vehicle_model = vehicle_model;
        this.vehicle_name = vehicle_name;
        this.vehicle_route = vehicle_route;
        this.vehicletype = vehicletype;
        
    }
    vehicle(){
       conn = OoseProject.mysql();
       database = OoseProject.getDB();
    }
//    public  int createvehicleid(){
//        boolean t =false;
//        int max = 100;
//        int min = 1;
//        
//        int acc_id = (int)Math.floor(Math.random()*(max-min+1)+min); ArrayList<Integer> a =new ArrayList<Integer>(); 
//        while(t=false){
//            
//            if(a.contains(acc_id)){
//                  acc_id = (int)Math.floor(Math.random()*(max-min+1)+min);
//                  
//            }
//            else {
//            
//            t = true ;    
//            }
//        }
//        a.add(acc_id);
//        return acc_id;
//    }
    
    public boolean addvehicle(int vehichle_id, int vehicle_model,String name,String type){
        boolean b = false;
        try{
        String sql = "INSERT INTO vehicle( vehicle_id,vehicle_model,vehicle_name,vehicletype) VALUES ('"+vehichle_id+"','"+vehicle_model+"','"+name+"','"+type+"')";
              
        ps = conn.prepareStatement(sql);
                    ps.execute();
                    b= true;
                    JOptionPane.showMessageDialog(null,"Registered Sucessfully");
        }   
        
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e);
            b = false;
        }
        
        return b;
        
    }
     public boolean addvehiclemd(int vehicle_id, int vehicle_model, String name,String type){
         boolean b = true ;
        try{
            DBCollection collection = database.getCollection("vehicles ");
            
            DBObject vehicles = new BasicDBObject("vehicle id", vehicle_id).append("vehicle model", vehicle_model).append("name", name)
                    .append("type",type);
            
            collection.insert(vehicles);
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"This is not working");
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b;
    }
    

}

class maintenence{
    
    private int maintenance_id;
    private String maintenece_date;
    private String nextmaindate;
    private int vehicle_id;

    public maintenence(int maintenance_id, String maintenece_date, String nextmaindate, int vehicle_id) {
        this.maintenance_id = maintenance_id;
        this.maintenece_date = maintenece_date;
        this.nextmaindate = nextmaindate;
        this.vehicle_id = vehicle_id;
    }
}

class route {
    
    private int route_id;
    private String departure;
    private String destination;
    private int  cash;
    public static Connection conn;
    public static Statement st;
    public static PreparedStatement ps;
    public static ResultSet rs;
    DB database = null;
    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCash(int  cash) {
        this.cash = cash;
    }

    public int getRoute_id() {
        return route_id;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public int getCash() {
        return cash;
    }

    public route(int route_id, String departure, String destination, int  cash) {
        this.route_id = route_id;
        this.departure = departure;
        this.destination = destination;
        this.cash = cash;
        database = OoseProject.getDB();
        
    }
    public route(){
    
        database = OoseProject.getDB();
    }
    
    
    
    
    public int checkPrices(String destination , String departure ){
        
        if(destination == "Islamabad" && departure == "Karachi"||destination == "Karachi" && departure == "Islamabad"){
            cash =4000;
            
            
        }
        
        else if (destination == "Islamabad" && departure == "Lahore"||destination == "Lahore" && departure == "Islamabad"){
        
            cash =5000;
           
        }else if (destination == "Islamabad" && departure == "Quetta"||destination == "Quetta" && departure == "Islamabad" )
        {
        
            cash=6000;
            
        }
        else if (destination == "Lahore" && departure == "Karachi"|| destination == "Karachi" && departure == "Lahore"){
        
            cash =4500;
          
        }
        else if (destination == "Lahore" && departure == "Quetta"||destination == "Quetta" && departure == "Lahore"){
        
            cash=3200;
          
        }
        else if (destination == "Lahore " && departure == "Peshawar"||destination == "Peshawar" && departure == "Lahore")
        {
            cash=2800;
       
        }
        else if(destination == "Peshawar" && departure == "karachi "||destination == "Karachi" && departure == "Peshawar"){
            cash=2600;
     
        }
        else if (destination == "Peshawar" && departure == "Islamabad"||destination == "Islamabad" && departure == "Peshawar"){
        
            cash =1400;
        
        }
        
    return cash;
    }
    public boolean addRoutes(int route_id,String departure , String destination , int cash ){
    boolean bt;
            try{
//                String q2 = "SELECT * FROM account where user_id"
              
                String sql ="INSERT INTO routes (route_id,departure,destination,cash) VALUES  ('"+route_id+"','"+departure+"','"+destination+"','"+cash+"');" ;
                ps = conn.prepareStatement(sql);
                ps.execute();
                bt = true;
            }
            catch(Exception e ){
            
                   JOptionPane.showMessageDialog(null,e);
                bt = false;
            
            }
            return bt;
    }
     public boolean newroutesMdb(int route_id, int departure, String destination,int cash){
         boolean b = true ;
        try{
            DBCollection collection = database.getCollection("routes");
            
            DBObject routes = new BasicDBObject("route id", route_id).append("departure", departure).append("destination", destination)
                    .append("user cash",cash);
            
            collection.insert(routes);
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"This is not working");
                JOptionPane.showMessageDialog(null,e);
                b = false;
        }    
        return b;
    }
    

}



