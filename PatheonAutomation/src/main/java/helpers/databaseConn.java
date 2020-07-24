package helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class databaseConn {
	 
	public static ArrayList<HashMap <String, Object>> DatabaseResult (String Query) {
		
		Connection conn = null;
		java.sql.PreparedStatement pst = null;
		ResultSet result= null;
		ArrayList<HashMap <String, Object>> list = new ArrayList<HashMap <String, Object>>();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			conn=DriverManager.getConnection("jdbc:sqlserver://Usswe-sql08-q1; databaseName=DTP3_FulfillmentProcessing; integratedSecurity=true");
			System.out.println("Database connection Established Successfully");
			pst=conn.prepareStatement(Query);
			result=pst.executeQuery();
			int columns = result.getMetaData().getColumnCount();
			  while (result.next()){
			     HashMap<String, Object> row = new HashMap <String, Object>(columns);
			     for(int i=1; i<=columns; ++i){           
			      row.put(result.getMetaData().getColumnName(i),result.getObject(i).toString());
			     }
			      list.add(row);
			  }
			  if (result != null) {
				 try {
					 result.close();
				 } catch (Exception e) {
					 e.printStackTrace();
				 }
				 }
				 
				
				if (pst != null) {
				 try {
				 pst.close();
				 } catch (Exception e) {
					 e.printStackTrace();
				 }
				 }
				 
				 if (conn != null) {
				 try {
				 conn.close();
				 } catch (Exception e) {
					 e.printStackTrace();
				 }
				 }
		}
		catch (SQLException e) {

			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
			return list;
		}
	
public static HashMap<Object, String> FetchDatabaseResult (String Query) {
		
		Connection conn = null;
		java.sql.PreparedStatement pst = null;
		ResultSet result= null;
	     HashMap<Object, String> Data = new HashMap <Object, String>();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			conn=DriverManager.getConnection("jdbc:sqlserver://Usswe-sql08-q1; databaseName=DTP3_FulfillmentProcessing; integratedSecurity=true");
			System.out.println("Database connection Established Successfully");
			pst=conn.prepareStatement(Query);
			result=pst.executeQuery();
			int i=0;
			  while (result.next()){
			     Data.put(i,result.getString(1));
			     i++;
			     }
			  if (result != null) {
				 try {
					 result.close();
				 } catch (Exception e) {
					 e.printStackTrace();
				 }
				 }
				 
				
				if (pst != null) {
				 try {
				 pst.close();
				 } catch (Exception e) {
					 e.printStackTrace();
				 }
				 }
				 
				 if (conn != null) {
				 try {
				 conn.close();
				 } catch (Exception e) {
					 e.printStackTrace();
				 }
				 }
		}
		catch (SQLException e) {

			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
			return Data;
		}
	
	}
		 

	
