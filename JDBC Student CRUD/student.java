package com.jsp.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class student 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdet", "root", "root");
			Statement statement=connection.createStatement();
			statement.execute("insert into student values(1,'shiva',26,'male')");
			statement.execute("insert into student values(2,'arjun',27,'male')");
			statement.execute("insert into student values(3,'ashika',28,'Female')");
			statement.execute("insert into student values(4,'virat',29,'male')");
			statement.execute("insert into student values(5,'karuna',30,'Female')");
			connection.close();
			System.out.println("Data Saved");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
