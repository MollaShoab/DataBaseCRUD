package com.database.Service;

import java.sql.SQLException;

import com.database.DAO.orderDAO;
import com.database.Model.Order;
import com.database.Util.Orderoperation;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class OrderImplement implements orderDAO {

	@Override
	public boolean addOrder(Order user) {
		
		Orderoperation op=new Orderoperation();

		try {
			op.addData(user);
		log.info("New User Created");
		} catch (SQLException e) {
			log.warn("User was not Created");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean leftJoin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rightJoin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean innerJoin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean outerJoin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean selfJoin() {
		// TODO Auto-generated method stub
		return false;
	}

}
