/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilanjanbiswas
 */
import java.sql.*;
public class MySqlDbCon {
 
public static void testConnection(){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/intelligentparkingsystem","root","");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from user");  
while(rs.next())  
System.out.println(rs.getInt(1)+" aa "+rs.getString(2)+" bb "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
