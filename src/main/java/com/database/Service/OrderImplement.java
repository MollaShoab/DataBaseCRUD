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
		Orderoperation op=new Orderoperation();

		try {
			op. leftJoin();
		log.info("Join Is done");
		} catch (SQLException e) {
			log.warn("Join was not Done");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean rightJoin() {
		Orderoperation op=new Orderoperation();

		try {
			op. rightJoin();
		log.info("Join Is done");
		} catch (SQLException e) {
			log.warn("Join was not Done");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean innerJoin() {
		Orderoperation op=new Orderoperation();

		try {
			op. innerJoin();
		log.info("Join Is done");
		} catch (SQLException e) {
			log.warn("Join was not Done");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean outerJoin() {
		Orderoperation op=new Orderoperation();

		try {
			op. outerJoin();
		log.info("Join Is done");
		} catch (SQLException e) {
			log.warn("Join was not Done");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean selfJoin() {
		Orderoperation op=new Orderoperation();

		try {
			op. selfJoin();
		log.info("Join Is done");
		} catch (SQLException e) {
			log.warn("Join was not Done");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean orderBy() {
		Orderoperation op=new Orderoperation();

		try {
			op. orderBy();
		log.info("Ordering Is done");
		} catch (SQLException e) {
			log.warn("Ordering is not Done");
			e.printStackTrace();
		}
		return true;
	}

}
