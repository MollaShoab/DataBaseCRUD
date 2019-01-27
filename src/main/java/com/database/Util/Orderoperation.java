package com.database.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.database.Model.Order;

public class Orderoperation {
	public void addData(Order user) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String insertData = "INSERT INTO [dbo].[Order_Shoab]"
				+ "(Employee_ID,Order_Name,Order_Quantity,Order_Price) VALUES" + "(?,?,?,?)";

		PreparedStatement preparedStatement = dbConnection.prepareStatement(insertData);

		preparedStatement.setInt(1, user.getEmployee_ID());
		preparedStatement.setString(2, user.getOrder_Name());
		preparedStatement.setInt(3, user.getOrder_Quantity());
		preparedStatement.setInt(4, user.getOrder_Price());
		preparedStatement.execute();

	}

	public void innerJoin() throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();
		String join ="SELECT Employee_Shoab.Employee_ID as Emp_id,"
				+ "Order_Shoab.Order_Name as O_name,Order_Shoab.Order_Quantity as O_quan"
				+ " FROM Order_Shoab INNER JOIN Employee_Shoab ON Employee_Shoab.Employee_ID=Order_Shoab.Employee_ID";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(join);
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			rs.getInt("Emp_id");
			rs.getString("O_name");
			rs.getString("O_quan");
			
			
		}
	}
	
	public void outerJoin() throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();
		String join ="SELECT  Employee_Shoab.Employee_ID as Emp_id,Order_Shoab.Order_Name as O_name,\r\n" + 
				"Order_Shoab.Order_Quantity as O_quan FROM Order_Shoab FULL OUTER JOIN Employee_Shoab\r\n" + 
				" ON Employee_Shoab.Employee_ID = Order_Shoab.Employee_ID";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(join);
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			rs.getInt("Emp_id");
			rs.getString("O_name");
			rs.getString("O_quan");
			
			
		}
	}
	
	public void selfJoin() throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();
		String join ="SELECT  Employee_Shoab.Employee_ID as Emp_id,Order_Shoab.Order_Name as O_name," + 
				"Order_Shoab.Order_Quantity as O_quan FROM Order_Shoab,Employee_Shoab " + 
				" where Employee_Shoab.Employee_ID = Order_Shoab.Employee_ID";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(join);
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			rs.getInt("Emp_id");
			rs.getString("O_name");
			rs.getString("O_quan");
			
			
		}
	}
	
	public void leftJoin() throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();
		String join ="SELECT  Employee_Shoab.Employee_ID as Emp_id,Order_Shoab.Order_Name as O_name," + 
				"Order_Shoab.Order_Quantity as O_quan FROM Order_Shoab left join Employee_Shoab" + 
				" ON Employee_Shoab.Employee_ID = Order_Shoab.Employee_ID";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(join);
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			rs.getInt("Emp_id");
			rs.getString("O_name");
			rs.getString("O_quan");
			
			
		}
	}
	
	public void rightJoin() throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();
		String join ="SELECT  Employee_Shoab.Employee_ID as Emp_id,Order_Shoab.Order_Name as O_name," + 
				"Order_Shoab.Order_Quantity as O_quan FROM Order_Shoab right join Employee_Shoab" + 
				" ON Employee_Shoab.Employee_ID = Order_Shoab.Employee_ID ";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(join);
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			rs.getInt("Emp_id");
			rs.getString("O_name");
			rs.getString("O_quan");
			
			
		}
	}
	
	public void orderBy() throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();
		String join ="select Employee_ID as Emp_id,Employee_Salary as Emp_Salary from Employee_Shoab order by Employee_Salary";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(join);
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			rs.getInt("Emp_id");
			rs.getString("Emp_Salary");
			
			
			
		}
	}

}
