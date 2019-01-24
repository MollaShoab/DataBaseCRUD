package com.database.DAO;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.SQLException;

import org.junit.Test;

import com.database.Model.Employee;
import com.database.Service.DBimplement;
import com.database.Util.DBoperation;

public class employeeDAOTest {

	
	
	  @Test public void testADDdata() { Employee employee= new Employee();
	  employee.setEmployee_Name("Toma"); employee.setEmployee_Salary(35000);
	  employee.setEmployee_Country("Bangladesh");
	  employee.setEmployee_City("Dhaka"); employee.setEmployee_ZipCode("1224");
	  
	  DBimplement db=new DBimplement(); assertEquals(true, db.addUser(employee));
	  
	  }
	 
	 
	
	
	  @Test public void testUpdateData() { Employee employee= new Employee();
	  employee.setEmployee_Name("Rahim"); employee.setEmployee_Salary(22000);
	  employee.setEmployee_Country("Bangladesh");
	  employee.setEmployee_City("Dhaka"); employee.setEmployee_ZipCode("1206");
	  
	  DBimplement db=new DBimplement(); assertEquals(true,
	  db.upadateUser(employee));
	  
	  }
	 
	
	  @Test public void testDeleteData() { Employee employee= new Employee();
	  employee.setEmployee_ID(4); DBimplement db=new DBimplement();
	  assertEquals(true, db.deleteUser(employee));
	  
	  }
	 
	
	@Test
	public void testDisplayData() throws SQLException {
		
		DBoperation db=new DBoperation();
		db.DisplayData();
		
		
	}
	@Test
	public void testGetMaxSalary() {
		Employee emp = new Employee();
		DBimplement db=new DBimplement();
		int value = 35000;
		assertEquals(value,  db.getMaxSalary(emp));
	}
	@Test
	public void testGetMainSalary() {
		Employee emp = new Employee();
		DBimplement db=new DBimplement();
		int value = 10000;
		assertEquals(value,  db.getMinSalary(emp));
	}
	
	@Test
	public void testGetSecondMaxSalary() {
		Employee emp = new Employee();
		DBimplement db=new DBimplement();
		int value = 30000;
		assertEquals(value,  db.getSecondMaxSalary(emp));
	}
	
	@Test
	public void testGetSecondMinSalary() {
		Employee emp = new Employee();
		DBimplement db=new DBimplement();
		int value = 25000;
		assertEquals(value,  db.getSecondMinSalary(emp));
	}
	
	@Test
	public void testGetAvgSalary() {
		Employee emp = new Employee();
		DBimplement db=new DBimplement();
		int value = 25000;
		assertEquals(value,  db.getAvgSalary(emp));
	}
	@Test
	public void testGetUser() {
		Employee emp = new Employee(5,"Shoab",25000,"Bangladesh","Dhaka","1206");
		DBimplement db=new DBimplement();
		
		assertEquals(emp,  db.getUser(5));
	}
	
	
	
	

}
