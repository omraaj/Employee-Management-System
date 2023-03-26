package employee.management;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
	String DB_URL="jdbc:mysql://localhost:3306/employee_management";
    public Conn () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employee_management", "root", "tiger");
            s = c.createStatement();
        } catch (Exception e) {
        	System.out.println("Unable to connect DataBase");
        }
    }
}
