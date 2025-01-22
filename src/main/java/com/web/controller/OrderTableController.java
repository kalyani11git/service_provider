package com.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.dao.OrderTableDao;

import com.web.model.OrderTable;
import com.web.model.Service;


@Controller
public class OrderTableController {
	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	OrderTable orderTable = (OrderTable) context.getBean("orderTable");
	OrderTableDao orderTableDao = (OrderTableDao) context.getBean("orderTableDao");
	
	
	
	
	
	
//	@RequestMapping("/")
//	public String adminHome(Model m)
//	{
//		List<Service> servicelist = serviceDao.getAllServiceProvider();
//		m.addAttribute("serviceProviderList",servicelist);
//		return "adminPage";
//	}

}
