package com.database.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.database.Model.Order;



public class Orderoperation {
	public void addData(Order user) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String insertData = "INSERT INTO [dbo].[Order_Shoab]"
				+ "(Employee_ID,Order_Name,Order_Quantity,Order_Price) VALUES"
				+ "(?,?,?,?)";

		PreparedStatement preparedStatement = dbConnection.prepareStatement(insertData);

		
		preparedStatement.setInt(1, user.getEmployee_ID());
		preparedStatement.setString(2, user.getOrder_Name());
		preparedStatement.setInt(3, user.getOrder_Quantity());
		preparedStatement.setInt(4, user.getOrder_Price());
		preparedStatement.execute();

	}
	/*
	 * public void innerJoin() throws SQLException{ String insertSQL =
	 * "SELECT [dbo].[Employee_Shoab].[Employee_ID]" +
	 * ",[dbo].[Employee_Shoab].[Employee_ID] as Emp_id" +
	 * ",[dbo].[Employee_Shoab].[Employee_Email] as Emp_email" +
	 * ",[dbo].[Employee_Shoab].[Employee_Name] as Emp_name" +
	 * ",[dbo].[Employee_Shoab].[Employee_Phone] as Emp_phone" +
	 * " FROM [dbo].[Employee_Shoab]" +
	 * "INNER JOIN [dbo].[T_Employee_Akil] ON [dbo].[T2_Employee_Akil].[Employee_ID]=[dbo].[T_Employee_Akil].[Employee_ID]"
	 * ; PreparedStatement statement = getInit().prepareStatement(insertSQL);
	 * ResultSet rs = statement.executeQuery();
	 * 
	 * while (rs.next()) { int id = rs.getInt("Emp_id"); String name =
	 * rs.getString("Emp_name"); String e_mail = rs.getString("Emp_email"); String
	 * phone = rs.getString("Emp_phone");
	 * System.out.println("ID :"+id+" Name :"+name+" E-Mail :"+e_mail+" Phone :"
	 * +phone); } }
	 */


}
