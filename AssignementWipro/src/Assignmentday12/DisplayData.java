package Assignmentday12;
import java.sql.*;

public class DisplayData {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            ResultSet rs =
            st.executeQuery("select * from students");

            while(rs.next()) {

                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2)
                );
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}


