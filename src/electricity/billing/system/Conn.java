package electricity.billing.system;

import java.sql.*;
import java.sql.DriverManager;

public class Conn {

    Connection conn;
    Statement s;
    Conn() {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "root");
            s=conn.createStatement();

            //ResultSet rs=s.executeQuery("select * from login");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


