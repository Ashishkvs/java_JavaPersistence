package com.imagegrafia;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.imagegrafia.jdbc.JdbcConnectionAdvance;

@SpringBootApplication
public class JavaPersistenceApplicationSimple {
	@Autowired
	DataSource dataSource;
	public static void main(String[] args) throws SQLException {
		SpringApplication.run(JavaPersistenceApplicationSimple.class, args);
		
//		JDBC TEMPLATE
		//method 1
		/*		JdbcConnectionSimple jdbcConnectionDemo=new JdbcConnectionSimple();
				jdbcConnectionDemo.getTableData();
		 */		
		
		//method 2
		//JdbcConnectionAdvance jdbcConnectionDemo=new JdbcConnectionAdvance();
		//jdbcConnectionDemo.getTableData();
	}
}
