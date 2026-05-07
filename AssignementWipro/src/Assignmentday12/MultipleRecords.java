package Assignmentday12;
import java.sql.*;

public class MultipleRecords {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            st.executeUpdate(
            "insert into students values(1,'Suraj',22,'Kolkata','BTech')");

            st.executeUpdate(
            "insert into students values(2,'Rahul',21,'Delhi','BCA')");

            st.executeUpdate(
            "insert into students values(3,'Aman',23,'Mumbai','MCA')");

            st.executeUpdate(
            "insert into students values(4,'Rohit',24,'Pune','MBA')");

            st.executeUpdate(
            "insert into students values(5,'Ankit',20,'Chennai','BSc')");

            System.out.println("Multiple Records Inserted Successfully");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}


