package com.database.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.database.Model.Employee;

public class DBoperation {

	public void addData(Employee user) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

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
		preparedStatement.execute();

	}

	public void updateData(Employee user) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

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
		preparedStatement.execute();

	}

	public void deleteData(Employee user) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();
		String deleteData = "DELETE [dbo].[Employee_Shoab] WHERE Employee_ID = ?";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteData);
		preparedStatement.setInt(1, user.getEmployee_ID());
		preparedStatement.execute();

	}

	public void DisplayData() throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String getData = "SELECT * FROM [dbo].[Employee_Shoab]";
		// PreparedStatement preparedStatement = dbConnection.prepareStatement(getData);
		ResultSet rs = dbConnection.createStatement().executeQuery(getData);
		while (rs.next()) {
			// emp.setEmployee_ID(rs.getInt("Employee_ID"));
			String Employee_Name = rs.getString("Employee_Name");
			int Employee_Salary = rs.getInt("Employee_Salary");
			String Employee_Country = rs.getString("Employee_Country");
			String Employee_City = rs.getString("Employee_City");
			String Employee_ZipCode = rs.getString("Employee_ZipCode");
			

			System.out.println("Name: " + Employee_Name + ", Salary: " + Employee_Salary + ", Country: "
					+ Employee_Country + ", City: " + Employee_City + ", Zip code : " + Employee_ZipCode);

		}

	}

	public int getMaxSalary(Employee emp) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String getMaxData = "SELECT max(Employee_salary) as MaxSalary FROM [dbo].[Employee_Shoab]";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getMaxData);

		ResultSet rs = preparedStatement.executeQuery();
		int maxSalary = 0;
		while (rs.next()) {
			maxSalary = rs.getInt("MaxSalary");
		}

		return maxSalary;
	}

	public int getMinSalary(Employee emp) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String getMaxData = "SELECT min(Employee_salary) as MinSalary FROM [dbo].[Employee_Shoab]";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getMaxData);

		ResultSet rs = preparedStatement.executeQuery();
		int minSalary = 0;
		while (rs.next()) {
			minSalary = rs.getInt("MinSalary");
		}

		return minSalary;
	}

	public int getSecondMaxSalary(Employee emp) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String getSecondMaxData = "SELECT MAX(Employee_salary) as SecondMaxSalary "
				+ "FROM [dbo].[Employee_Shoab] where Employee_salary"
				+ " < (Select MAX(Employee_salary) FROM [dbo].[Employee_Shoab])";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getSecondMaxData);

		ResultSet rs = preparedStatement.executeQuery();
		int secondMaxSalary = 0;
		while (rs.next()) {
			secondMaxSalary = rs.getInt("SecondMaxSalary");
		}

		return secondMaxSalary;
	}

	public int getSecondMinSalary(Employee emp) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String getSecondMaxData = "SELECT MIN(Employee_salary) as SecondMinSalary "
				+ "FROM [dbo].[Employee_Shoab] where Employee_salary"
				+ " > (Select MIN(Employee_salary) FROM [dbo].[Employee_Shoab])";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getSecondMaxData);

		ResultSet rs = preparedStatement.executeQuery();
		int secondMinSalary = 0;
		while (rs.next()) {
			secondMinSalary = rs.getInt("SecondMinSalary");
		}

		return secondMinSalary;
	}

	public int getAvgSalary(Employee emp) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String getMaxData = "SELECT avg(Employee_salary) as AvgSalary FROM [dbo].[Employee_Shoab]";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(getMaxData);

		ResultSet rs = preparedStatement.executeQuery();
		int avgSalary = 0;
		while (rs.next()) {
			avgSalary = rs.getInt("AvgSalary");
		}

		return avgSalary;
	}

	public Employee getData(int userId) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String getData = "SELECT * FROM [dbo].[Employee_Shoab] where Employee_ID=?";
		 PreparedStatement preparedStatement = dbConnection.prepareStatement(getData);
		
		preparedStatement.setInt(1, userId);
		ResultSet rs = preparedStatement.executeQuery();
		if (rs.next()) {
			
			String Employee_Name = rs.getString("Employee_Name");
			int Employee_Salary = rs.getInt("Employee_Salary");
			String Employee_Country = rs.getString("Employee_Country");
			String Employee_City = rs.getString("Employee_City");
			String Employee_ZipCode = rs.getString("Employee_ZipCode");
			return new Employee(userId,Employee_Name,Employee_Salary,Employee_Country,Employee_City,Employee_ZipCode);

			

		}
		return null;

	}

}
