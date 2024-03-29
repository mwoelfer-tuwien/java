package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) throws Throwable{
		Connection c = null;
		
		c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webshop","test","test");
		
		Statement stat = c.createStatement();
		String query = "SELECT * FROM artikel";
		ResultSet res = stat.executeQuery(query);
		
		while(res.next()){
			System.out.println(res.getString("abez"));
		}
		System.out.println("Finished");
		
		Statement stmt2 = c.createStatement();
        String query2 = "insert into artikel(anr,abez,npreis,vstueckz,info) values(1203123123,'test',2,2,'das ist ein test')";
        stmt2.executeUpdate(query2); // update hei�t Query ohne R�ckgabe
       
       
        String search = "Schokolade";
        String query3 = "select * from artikel where abez = '"+search+"'";
        
        PreparedStatement pstmt = c.prepareStatement("select * from artikel where abez = ?");
        pstmt.setString(1, search);
       
        ResultSet res4 = pstmt.executeQuery();
       
        while(res4.next()){
        	System.out.println(res4.getString("npreis"));
        }
	}
}
