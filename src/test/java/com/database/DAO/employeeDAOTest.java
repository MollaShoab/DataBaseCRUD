package com.database.DAO;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import com.database.Model.Employee;
import com.database.Service.DBimplement;

public class employeeDAOTest {

	@Test
	public void testADDdata() {
		Employee employee= new Employee();
		employee.setEmployee_Name("Shoab");
		employee.setEmployee_Salary(25000);
		employee.setEmployee_Country("Bangladesh");
		employee.setEmployee_City("Dhaka");
		employee.setEmployee_ZipCode("1206");
		
		DBimplement db=new DBimplement();
		assertEquals(true, db.addUser(employee));
	
	}
	
	@Test
	public void testUpdateData() {
		Employee employee= new Employee();
		employee.setEmployee_Name("Rahim");
		employee.setEmployee_Salary(22000);
		employee.setEmployee_Country("Bangladesh");
		employee.setEmployee_City("Dhaka");
		employee.setEmployee_ZipCode("1206");
		
		DBimplement db=new DBimplement();
		assertEquals(true, db.upadateUser(employee));
	
	}
	@Test
	public void testDeleteData() {
		Employee employee= new Employee();
		employee.setEmployee_ID(1);
		DBimplement db=new DBimplement();
		assertEquals(true, db.deleteUser(employee));
		
	}

}
