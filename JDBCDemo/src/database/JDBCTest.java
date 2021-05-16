package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
        
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from eproduct"); 
                            
                         while(rs.next()) {
                                
                                System.out.println(rs.getInt(1)+"  "+rs.getString(2)); 
                                
                            }
                         
                         stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('HardDrive', 2000.00, now())");
                         //stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('Laptop', 2000.00, now())");
                         stmt.executeUpdate("update eproduct set price=20000 where name = 'Laptop'");
                         //stmt.executeUpdate("delete from eproduct where name = 'HardDrive'");
                         
                        		
                        
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
		

	}

}
