package com.database.DAO;

import com.database.Model.Order;

public interface orderDAO {
	
	boolean addOrder(Order user);
	boolean leftJoin();
	boolean rightJoin();
	boolean innerJoin();
	boolean outerJoin();
	boolean selfJoin();
	boolean orderBy();
	

}
