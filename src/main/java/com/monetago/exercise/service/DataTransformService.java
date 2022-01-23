package com.monetago.exercise.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.monetago.exercise.model.Item;
import com.monetago.exercise.model.Orders;
import com.monetago.exercise.model.OrdersDetail;
import com.monetago.exercise.model.OrdersT;

@Service
public class DataTransformService {

	public OrdersT execute(Orders order) {
		
		OrdersT transformedData = new OrdersT();
		
		transformedData.setIDCustomer(order.getCustomerId());
		transformedData.setIDOrder(order.getOrderId());
		
		Map<String, OrdersDetail> orderDetails = new HashMap<>();
		
		for(Item item: order.getItems()) {
			OrdersDetail od = new OrdersDetail();
			od.setTitle(item.getDesc());
			od.setQuantity(item.getQty());
			
			orderDetails.put(item.getItemId(), od);
		}
		
		transformedData.setElements(orderDetails);
		
		return transformedData;
	}
	
}
