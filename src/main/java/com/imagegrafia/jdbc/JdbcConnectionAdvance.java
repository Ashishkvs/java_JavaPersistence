package com.imagegrafia.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.mysql.jdbc.Driver;


public class JdbcConnectionAdvance {


	//private String dataBaseDriverClass="new com.mysql.jdbc.Driver()";
	private String url="jdbc:mysql://localhost:3306/javapersistence?useSSL=false";
	private String username="root";
	private String password="root";
	
	//jdbc connection create
	Connection connection=null;
	public Connection getConnection() throws SQLException  {
		
		DriverManager.registerDriver(new Driver());
		connection=DriverManager.getConnection(this.url, this.username, this.password);
		return connection;
	}
	
	//get ResultSet data by passing String query args
	public ResultSet getResultSet(String executeQuery) throws SQLException {
		Connection conn=this.getConnection();
		Statement createStatement = conn.createStatement();
		ResultSet resultSet=createStatement.executeQuery(executeQuery);
		return resultSet;
	}
	//fetch data from table
	public List<String> getTableData() throws SQLException{
		List<String> list=new ArrayList<String>();
	
		ResultSet resultSet=this.getResultSet("select lastname from employee");
			while(resultSet.next()) {
				list.add(resultSet.getString(1));
			}
		
			//close connection
		connection.close();
		System.out.println(list);
		return list;
	}
	//fetch table data and map into list
	public List<String> mapColumnDataToList() throws SQLException{
		List<String> list=new ArrayList<String>();
	
		ResultSet resultSet=this.getResultSet("select lastname from employee");
		
		System.out.println();
		while(resultSet.next()) {
				list.add(resultSet.getString(1));
			}
		
			
		//list.addAll(Stream.of(resultSet).);
			//close connection
		connection.close();
		System.out.println(list);
		return list;
	}
	
	//fetch table and map into model class
}
