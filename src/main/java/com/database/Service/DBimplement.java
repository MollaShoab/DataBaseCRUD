package com.database.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import com.database.DAO.employeeDAO;
import com.database.Model.Employee;
import com.database.Util.DBoperation;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class DBimplement implements employeeDAO {

	
	@Override
	public boolean addUser(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.addData(user);
		log.info("New User Created");
		} catch (SQLException e) {
			log.warn("User was not Created");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean upadateUser(Employee user) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.updateData(user);
			log.info("User Updated");
		} catch (SQLException e) {
			log.warn("User Not Updated");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteUser(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.deleteData(user);
			log.info("User Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
			log.warn("User Not Deleted");
		}
		return true;
	}


	@Override
	public Employee getUser(int userId) {
		
		DBoperation dbOperations = new DBoperation();
		try {
			log.info("User was Fetched");
		return	dbOperations.getData(userId);
		
		} catch (SQLException e) {
			e.printStackTrace();
			log.warn("User was not Fetched");
		}
		return null;
		
		
		
	}

	@Override
	public int getMaxSalary(Employee user) {
		DBoperation dbOperations = new DBoperation();
		int maxsalary=0;

		try {
		maxsalary=	dbOperations.getMaxSalary(user);
		log.info("Max Salary was Fetched");
		} catch (SQLException e) {
			e.printStackTrace();
			log.warn("Max Salary was not Fetched");
		}
		
		return maxsalary;
	}

	@Override
	public int getMinSalary(Employee user) {
		DBoperation dbOperations = new DBoperation();
		int minsalary=0;

		try {
		minsalary=	dbOperations.getMinSalary(user);
		log.info("Min Salary was Fetched");
		} catch (SQLException e) {
			e.printStackTrace();
			log.warn("Min Salary was not Fetched");
		}
		
		return minsalary;
	}

	@Override
	public int getSecondMaxSalary(Employee user) {
		DBoperation dbOperations = new DBoperation();
		int SecondMaxSalary=0;

		try {
			SecondMaxSalary=	dbOperations.getSecondMaxSalary(user);
			log.info("Second Max Salary was Fetched");
		} catch (SQLException e) {
			e.printStackTrace();
			log.warn("Second Max Salary was not Fetched");
		}
		
		return SecondMaxSalary;
	}

	@Override
	public int getSecondMinSalary(Employee user) {
		DBoperation dbOperations = new DBoperation();
		int SecondMinSalary=0;

		try {
			SecondMinSalary=	dbOperations.getSecondMinSalary(user);
			log.info("Second Minimum Salary was Fetched");
		} catch (SQLException e) {
			e.printStackTrace();
			log.warn("Second Min Salary was not Fetched");
		}
		
		return SecondMinSalary;
	}

	@Override
	public int getAvgSalary(Employee user) {
		DBoperation dbOperations = new DBoperation();
		int AvgSalary=0;

		try {
			AvgSalary=	dbOperations.getAvgSalary(user);
			log.info("Average Salary was Fetched");
		} catch (SQLException e) {
			e.printStackTrace();
			log.warn("Average Salary was not Fetched");
		}
		
		return AvgSalary;
	}

}
