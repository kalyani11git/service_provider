
package com.web.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.web.model.Admin;

@Component
public class AdminDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	
	
	
	public AdminDao() {
		super();
		// TODO Auto-generated constructor stub
	}

    

	public AdminDao(HibernateTemplate hibernateTemplate) {
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
	public Admin getAdmin(String email) {
		return hibernateTemplate.get(Admin.class, email);
		
		
	}
	
		 
	

}
