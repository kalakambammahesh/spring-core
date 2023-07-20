package com.spring.core.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DAOLayerClass {
	
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	@Value("${db.DBDriverName}")
	String DBDriverName;

	@Value("${db.DBConnectionString}")
	String DBConnectionString;
	
	@Value("${db.DBUser}")
	String DBUser;
	
	@Value("${db.DBPassword}")
	String DBPassword;
	
	public String getDBDriverName() {
		return DBDriverName;
	}

	public void setDBDriverName(String dBDriverName) {
		DBDriverName = dBDriverName;
	}

	public String getDBConnectionString() {
		return DBConnectionString;
	}

	public void setDBConnectionString(String dBConnectionString) {
		DBConnectionString = dBConnectionString;
	}

	public String getDBUser() {
		return DBUser;
	}

	public void setDBUser(String dBUser) {
		DBUser = dBUser;
	}

	public String getDBPassword() {
		return DBPassword;
	}

	public void setDBPassword(String dBPassword) {
		DBPassword = dBPassword;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	
	public List<StudentN> getAllStudents() {
		
		List<StudentN> students = new ArrayList<StudentN>();
		
		System.out.println("checking:"+DBConnectionString);
		
		
		try {
			Class.forName(DBDriverName);
			connection = DriverManager.getConnection(DBConnectionString, DBUser, DBPassword);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM STUDENTN");
			while (resultSet.next()) {
				students.add(new StudentN(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3)));
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.print(e.getMessage());
		}finally {
			try {
				resultSet.close();
				statement.close();
				resultSet.close();
			} catch (Exception e2) {}
		}
		
		return students;
	}

}
