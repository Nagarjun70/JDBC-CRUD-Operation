package com.jsp.hosiptal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetHosiptalDet 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hosiptaldet", "root", "root");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from hosiptal ");
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				System.out.println("Hosiptal Id:"+resultSet.getInt(1));
				System.out.println("Hosipatl Name:"+resultSet.getString(2));
				System.out.println("Hosiptal Website:"+resultSet.getString(3));
				System.out.println("Hosiptal Location:"+resultSet.getString(4));
				
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


