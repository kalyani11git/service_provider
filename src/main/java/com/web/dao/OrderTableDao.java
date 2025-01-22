package com.web.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.web.model.OrderTable;
import com.web.model.Service;
import com.web.model.User;

@Component
public class OrderTableDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public OrderTableDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderTableDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public String toString() {
		return "OrderTableDao [hibernateTemplate=" + hibernateTemplate + "]";
	}

	@Transactional
	public void addOrder(OrderTable orderTable) {
		hibernateTemplate.save(orderTable);
		
	}

	public  List<OrderTable> getAllOrder()
	{
		List<OrderTable> OrderList = hibernateTemplate.loadAll(OrderTable.class);
		return OrderList;
	}
	
	@Transactional
	public OrderTable approveOrder(String status) {
	
		 OrderTable i = hibernateTemplate.get(OrderTable.class,status);
		 return i;
			 
		 }
	
	@Transactional
	public void UpdateStatus(OrderTable orderTable){
	       hibernateTemplate.update(orderTable); 
	}
	

}
