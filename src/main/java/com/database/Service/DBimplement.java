package com.database.Service;

import java.sql.SQLException;
import java.util.List;

import com.database.DAO.employeeDAO;
import com.database.Model.Employee;
import com.database.Util.DBoperation;

public class DBimplement implements employeeDAO {

	@Override
	public boolean addUser(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.addData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean upadateUser(Employee user) {

		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.updateData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteUser(Employee user) {
		DBoperation dbOperations = new DBoperation();

		try {
			dbOperations.deleteData(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}


	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
