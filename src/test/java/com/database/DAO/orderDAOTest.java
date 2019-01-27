package com.database.DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import com.database.Model.Order;
import com.database.Service.OrderImplement;

public class orderDAOTest {

//	@Test
//	public void testAddOrder() {
//		Order order = new Order();
//
//		order.setEmployee_ID(8);
//		order.setOrder_Name("Accesories");
//		order.setOrder_Quantity(18);
//		order.setOrder_Price(5000);
//
//		OrderImplement imp = new OrderImplement();
//		assertEquals(true, imp.addOrder(order));
//
//	}

	@Test
	public void testInnerJoint() {
		OrderImplement imp = new OrderImplement();
		assertEquals(true, imp.innerJoin());
	}
	@Test
	public void testOuterJoint() {
		OrderImplement imp = new OrderImplement();
		assertEquals(true, imp.outerJoin());
	}
	@Test
	public void testSelfJoint() {
		OrderImplement imp = new OrderImplement();
		assertEquals(true, imp.selfJoin());
	}
	@Test
	public void testleftJoint() {
		OrderImplement imp = new OrderImplement();
		assertEquals(true, imp.leftJoin());
	}
	@Test
	public void testRightJoint() {
		OrderImplement imp = new OrderImplement();
		assertEquals(true, imp.rightJoin());
	}
	@Test
	public void testOrderBY() {
		OrderImplement imp = new OrderImplement();
		assertEquals(true, imp.orderBy());
	}
	
	
	
}
