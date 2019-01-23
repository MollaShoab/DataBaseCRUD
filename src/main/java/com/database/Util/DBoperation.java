package com.database.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.database.Model.Employee;

public class DBoperation {

	public void addData(Employee user) throws SQLException {
      DBConnection conn =  DBConnection.getInstance();
		
		Connection dbConnection = conn.getConnection();
		
		
		String insertData = "INSERT INTO [dbo].[Employee_Shoab]"
				+ "(Employee_Name,Employee_Salary,Employee_Country,Employee_City,Employee_ZipCode) VALUES"
				+ "(?,?,?,?,?)";
		
		PreparedStatement preparedStatement = dbConnection.prepareStatement(insertData);
		
		
		preparedStatement.setString(1, user.getEmployee_Name());
		preparedStatement.setInt(2, user.getEmployee_Salary());
		preparedStatement.setString(3, user.getEmployee_Country());
		preparedStatement.setString(4, user.getEmployee_City());
		preparedStatement.setString(5, user.getEmployee_ZipCode());
		preparedStatement .execute();
		
	}

	public void updateData(Employee user) throws SQLException {
	      DBConnection conn =  DBConnection.getInstance();
			
			Connection dbConnection = conn.getConnection();
			
			
			String updateData = "UPDATE [dbo].[Employee_Shoab]"
					+ "SET Employee_Name = ?, Employee_Salary = ?, Employee_Country=?, Employee_City=?,"
					+ "Employee_ZipCode=? WHERE Employee_ID = ?";
			
			PreparedStatement preparedStatement = dbConnection.prepareStatement(updateData);
			
			preparedStatement.setInt(1, user.getEmployee_ID());
			preparedStatement.setString(2, user.getEmployee_Name());
			preparedStatement.setInt(3, user.getEmployee_Salary());
			preparedStatement.setString(4, user.getEmployee_Country());
			preparedStatement.setString(5, user.getEmployee_City());
			preparedStatement.setString(6, user.getEmployee_ZipCode());
			preparedStatement .execute();

		
		
	}
	
	
	public void deleteData(Employee user) throws SQLException {
		 DBConnection conn =  DBConnection.getInstance();
			
			Connection dbConnection = conn.getConnection();
		String deleteData = "DELETE [dbo].[Employee_Shoab] WHERE Employee_ID = ?";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteData);
		preparedStatement.setInt(1, user.getEmployee_ID());
		preparedStatement.execute();
		
		
	
	}
	public void getData(Employee user) throws SQLException {
		 DBConnection conn =  DBConnection.getInstance();
			
			Connection dbConnection = conn.getConnection();
			
			String getData="SELECT * FROM [dbo].[Employee_Shoab] WHERE Employee_ID=?";
			PreparedStatement preparedStatement = dbConnection.prepareStatement(getData);
			preparedStatement.setInt(1, user.getEmployee_ID());
			preparedStatement.execute();
		
	}
	

}
