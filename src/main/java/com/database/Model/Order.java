package com.database.Model;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {
	@NonNull
	int Order_ID;
	@NonNull
	int Employee_ID;
	@NonNull
	String Order_Name;
	@NonNull
	int Order_Quantity;
	@NonNull
	int Order_Price;
	

}
