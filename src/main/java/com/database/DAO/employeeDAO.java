package com.database.DAO;

import java.util.List;

import com.database.Model.Employee;

public interface employeeDAO {
	boolean addUser(Employee user);

	boolean upadateUser(Employee user);

	boolean deleteUser(Employee user);

	Employee getUser(int userId);
	int getMaxSalary(Employee user);
	int getMinSalary(Employee user);
	int getSecondMaxSalary(Employee user);
	int getSecondMinSalary(Employee user);
	int getAvgSalary(Employee user);

	
	

}
