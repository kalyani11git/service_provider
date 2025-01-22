package com.web.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.web.model.Admin;
import com.web.model.Service;

@Component
public class ServiceDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public ServiceDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void addServiceProvider(Service service) {
    
		 try{
			 Integer i = (Integer)hibernateTemplate.save(service);
		 }catch(Exception e){
			 System.out.println("Failed...");
			 e.printStackTrace();
			 
		 }
		 
		
	}
	
	//Getting all records in admin page table
	public  List<Service> getAllServiceProvider()
	{
		List<Service> serviceProviderList = hibernateTemplate.loadAll(Service.class);
		return serviceProviderList;
	}
	
	//Upadte Status method
	@Transactional
	public void UpdateStatus(Service service){
	       hibernateTemplate.update(service); 
	}
	
   @Transactional
	public Service approveServiceProvider(String sContact) {
	
		 Service i = hibernateTemplate.get(Service.class, sContact);
		 return i;
			 
		 }

   
     @Transactional
     public Service getServiceProvider(String sContact) {
	return hibernateTemplate.get(Service.class, sContact);// TODO Auto-generated method stub
	
}
		 
	

	
	

//	public Service disApproveServiceProvider(int sContact) {
//		// TODO Auto-generated method stub
//		
//	}
	
	

	

}
