package com.spring.core.beanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.core.beanLifeCycle.Student;

@Component
public class DAOLayer implements InitializingBean, DisposableBean {
	
	Connection connection;
	Statement statement;
	
	//Database Connection Properties
	@Value("${db.DBDriverName}")
	private String dbDriverName;
	
	@Value("${db.DBConnectionString}")
	private String dbConnectionURL;
	
	private String user;
	private String password;

	public void setDbDriverName(String dbDriverName) {
		this.dbDriverName = dbDriverName;
	}

	public void setDbConnectionURL(String dbConnectionURL) {
		this.dbConnectionURL = dbConnectionURL;
	}

	@Value("${db.DBUser}")
	public void setUser(String user) {
		this.user = user;
	}

	@Value("${db.DBPassword}")
	public void setPassword(String password) {
		this.password = password;
	}


	public List<Student> getAllStudents() {
		
		List<Student> studentsList = new ArrayList<Student>();
		//setUpConnection();
		
		ResultSet rs = null;
				
		try {
			rs = statement.executeQuery("SELECT * FROM STUDENTN");
			while(rs.next()) {
				Student student = new Student();
				student.setStudentId(rs.getInt(1));
				student.setStudentName(rs.getString(2));
				student.setStudentAge(rs.getInt(3));
				studentsList.add(student);
			}
		} catch (Exception e) {}
		
		return studentsList;
	}
	
	private void setUpConnection() {
		try {
			Class.forName(dbDriverName);
			connection = DriverManager.getConnection(dbConnectionURL, ""+user, ""+password);
			statement = connection.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet called");
		setUpConnection();
	}

}
