package database;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

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
                         
                         //stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('HardDrive', 2000.00, now())");
                         //stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('Laptop', 2000.00, now())");
                         //stmt.executeUpdate("update eproduct set price=20000 where name = 'Laptop'");
                         //stmt.executeUpdate("delete from eproduct where name = 'HardDrive'");
                         
                        //stmt.executeUpdate("drop database db2");
        					
                         CallableStatement stmt1 = (CallableStatement) con.prepareCall("{call add_product(?, ?)}");
                         stmt1.setString(1, "IPhone");
                         
                         BigDecimal obj = new BigDecimal(1900.50);
                         
                         stmt1.setBigDecimal(2, obj);
                         stmt1.executeUpdate();
                         
                        
        				}	 catch (ClassNotFoundException e) {
                            // TODO Auto-generated catch block
                            System.out.println("Class not found");
                        } catch (SQLException e) {
                            System.out.println("SQL Exception");
                        }
	}
}
	
       
	


