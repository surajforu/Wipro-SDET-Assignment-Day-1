package Assignmentday12;

import java.sql.*;
import java.util.Scanner;

public class InsertData {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "root"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            String query =
            "insert into students values(?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, city);
            ps.setString(5, course);

            ps.executeUpdate();

            System.out.println("Data Inserted Successfully");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}