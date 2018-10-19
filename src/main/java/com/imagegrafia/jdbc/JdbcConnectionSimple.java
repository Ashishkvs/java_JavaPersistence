package com.imagegrafia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;


public class JdbcConnectionSimple {
	
	
	//private String dataBaseDriverClass="new com.mysql.jdbc.Driver()";
	private String url="jdbc:mysql://localhost:3306/javapersistence?useSSL=false";
	private String username="root";
	private String password="root";
	
	//jdbc connection create
	public Connection getConnection() throws SQLException  {
		Connection connection=null;
		DriverManager.registerDriver(new Driver());
		connection=DriverManager.getConnection(this.url, this.username, this.password);
		return connection;
	}
	//fetch data from table
	public List<String> getTableData() throws SQLException{
		List<String> list=new ArrayList<String>();
		//
		Connection conn=this.getConnection();
		Statement createStatement = conn.createStatement();
		ResultSet resultSet=createStatement.executeQuery("select lastname from employee");
			while(resultSet.next()) {
				//System.out.println(resultSet.getString(1));
				list.add(resultSet.getString(1));
			}
		//close connection
		conn.close();
		System.out.println(list);
		return list;
	}
	//fetch table data and map into list
	
	//fetch table and map into model class
}
