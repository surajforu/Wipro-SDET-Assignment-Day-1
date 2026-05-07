package Assignmentday12;
import java.sql.*;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "root"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Username: ");
            String user = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            String query =
            "select * from login where username=? and password=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                System.out.println("Login Successful");
            }
            else {
                System.out.println("Invalid Username or Password");
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}


