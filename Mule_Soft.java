/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mule_soft;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/**
 *
 * @author Gowthami
 */
public class Mule_Soft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner sc=new Scanner(System.in);
        try
		{  
		Class.forName("oracle.jdbc.driver.OracleDriver");    
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
	        Statement ps=con.createStatement();
                Statement ps2=con.createStatement();
                ResultSet rest1 = ps2.executeQuery("select * from movies");
                while(rest1.next()) {
                    System.out.println(rest1.getString(1)+"\t\t"+rest1.getString(2)+"\t\t"+rest1.getString(3)+"\t\t"+rest1.getString(4)+"\t\t"+rest1.getString(5));
                    
		}
                System.out.println("Enter the actor name");  
                String x=sc.nextLine();
                ResultSet rest = ps.executeQuery("select * from movies where actor='"+x+"'");
                
                while(rest.next()) {
                    System.out.println(rest.getString(1)+"\t\t"+rest.getString(2)+"\t\t"+rest.getString(3)+"\t\t"+rest.getString(4)+"\t\t"+rest.getString(5));
                    String name = rest.getString(1);
                    String actor = rest.getString(2);
                    String actress = rest.getString(3);
                    String director = rest.getString(4);
                    String year_of_release=rest.getString(5);
                    
		}
                
                }
		catch(Exception e)
		{
			System.out.println(e);
		}  

    }
    
}
