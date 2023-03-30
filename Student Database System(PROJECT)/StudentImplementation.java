package com.jsp.studentDbS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentImplementation implements StudentInterface
{
	Scanner scanner=new Scanner(System.in);
	@Override
	public void SaveStudent()
	{
		System.out.println("Enter the Student ID: ");
		int id=scanner.nextInt();
		System.out.println("Enter the Student Name: ");
		String name=scanner.next();
		System.out.println("Enter the Student Age: ");
		int age=scanner.nextInt();
		System.out.println("Enter the Student Marks: ");
		double marks=scanner.nextDouble();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setDouble(4,marks);
			preparedStatement.execute();
			
			connection.close();
			System.out.println("Data Saved");
			System.out.println("********************************");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void DeleteStudent() 
	{
		System.out.println("Enter the Student ID: ");
		int id=scanner.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("delete from student where id=?");
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			
			connection.close();
			System.out.println("Data Deleted");
			System.out.println("************************************");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	@Override
	public void UpdateStudent() 
	{
		System.out.println("Enter the Student ID: ");
		int id=scanner.nextInt();
		System.out.println("Enter the Student Name: ");
		String name=scanner.next();
		System.out.println("Enter the Student Age: ");
		int age=scanner.nextInt();
		System.out.println("Enter the Student Marks: ");
		double marks=scanner.nextDouble();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("update student set name=? where id=101");
			preparedStatement.setString(1, name);
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Updated");
			System.out.println("***********************************");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void GetStudentByMarks() 
	{
		System.out.println("Enter the Student Marks: ");
		double marks=scanner.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from student ");
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
	
				System.out.println("Student Marks: "+resultSet.getDouble(4));
				
				
				
			}
			
			connection.close();
			System.out.println("Data Retrived");
			System.out.println("*********************************************");
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
	

	@Override
	public void GetAllStudent() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from student ");
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				System.out.println("Student Id: "+resultSet.getInt(1));
				System.out.println("Student  Name: "+resultSet.getString(2));
				System.out.println("Student  Age: "+resultSet.getInt(3));
				System.out.println("Student  Marks: "+resultSet.getDouble(4));
			
				System.out.println("************************************************");
				
				
			}
			
			connection.close();
			System.out.println("Data Retrived");
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
		
	}
	


