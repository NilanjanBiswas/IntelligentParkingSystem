/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilanjanbiswas
 * 
 */
import java.sql.*;  
public class DbConnection {
      
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/intelligentparkingsystem","root","cbr250rr");  
//here intelligentparkingsystem is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from user");  
while(rs.next())  
System.out.println(rs.getInt(1)+" a "+rs.getString(2)+" b "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
    
}
public static Connection dbConnection() {
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
return DriverManager.getConnection("jdbc:mysql://localhost:3306/intelligentparkingsystem","root","");  
    } catch(Exception e){return null;}
    
}
}
