package empapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnetion(){

        try{
       
            Class.forName("com.mysql.cj.jdbc.Driver");
         
            String url="jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
            String username="root";
            String password="root";
           con= DriverManager.getConnection(url,username,password);

        }catch (Exception ex){
            ex.printStackTrace();
        }
     return con;

    }
}