package com.web.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.web.model.Service;
import com.web.model.User;

@Component
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDao(HibernateTemplate hibernateTemplate) {
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
		return "UserDao [hibernateTemplate=" + hibernateTemplate + "]";
	}
    
	@Transactional
	public void addUser(User user) {
		hibernateTemplate.save(user);
		
	}

	public  List<User> getAllUser()
	{
		List<User> UserList = hibernateTemplate.loadAll(User.class);
		return UserList;
	}

	public User getUser(String uContact) {
		return hibernateTemplate.get(User.class, uContact);
		
	}
	
	
	

}
