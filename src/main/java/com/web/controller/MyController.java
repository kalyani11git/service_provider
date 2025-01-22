package com.web.controller;



import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.web.dao.AdminDao;
import com.web.model.Admin;
import com.web.model.Service;
import com.web.dao.ServiceDao;

@Controller
public class MyController {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	Admin admin = (Admin) context.getBean("admin");
	AdminDao adminDao = (AdminDao) context.getBean("adminDao");
	
	Service service = (Service) context.getBean("service");
	ServiceDao serviceDao = (ServiceDao) context.getBean("serviceDao");
	
	

	
	//Mapping for index page open 
	@RequestMapping("/")
	public String indexPage(){
		return "index";
	}
	
	//Mapping for Admin login form open
	@RequestMapping("/AdminLoginForm")
	public String AdminLoginForm(){
		
		return "AdminLoginForm";
	}
	
	//Mapping for Admin login form submit
	@RequestMapping(path="/AdminLoginFormSubmit",method=RequestMethod.POST)
	public String AdminLoginFormSubmit(HttpServletRequest request,Model m){
		 
		try
		{
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			admin = adminDao.getAdmin(email);
			
		    if(admin.getEmail().equals(email)&& admin.getPassword().equals(password)){
		    	
		    	System.out.println("Admin login successfully..!!");
		    	
		    	List<Service> servicelist = serviceDao.getAllServiceProvider();
				
				m.addAttribute("serviceProviderList",servicelist);

		    	
				return "adminPage";
		    	
		    }
		    else{
		    	
		    	return "error";
		    }
		    
			
		}
		catch(Exception e)
		{
			System.out.println("Failed to add..!!");
			e.printStackTrace();
			return "error";
		}
		
	}

	
	//Mapping for Approved service provider
	@RequestMapping(path="Accept/{sContact}",method=RequestMethod.GET)
	public RedirectView approveServiceProvider(@PathVariable("sContact") String sContact,HttpServletRequest request)
	{
		System.out.println("approving service provider : "+sContact);
		service = serviceDao.approveServiceProvider(sContact);
		service.setsStatus("Accept");
		serviceDao.UpdateStatus(service);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/adminPage");
		return redirectView;
	}
	
	@RequestMapping("/adminPage")
	public String adminHome(Model m)
	{
		List<Service> servicelist = serviceDao.getAllServiceProvider();
		m.addAttribute("serviceProviderList",servicelist);
		return "adminPage";
	}
	
	//Mapping for DisApproved service provider
		@RequestMapping(path="Reject/{sContact}",method=RequestMethod.GET)
		public RedirectView disApproveServiceProvider(@PathVariable("sContact") String sContact,HttpServletRequest request)
		{
  	     System.out.println("approving service provider : "+sContact);
		 service = serviceDao.approveServiceProvider(sContact);
		 service.setsStatus("Reject");
		 serviceDao.UpdateStatus(service);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/adminPage");
		return redirectView;
		}
	
	
		

          //Mapping for go to home tab from admin
          @RequestMapping("/index")
          public String adminLoginToHome(){
        	  return "index";
          }
          
          //mapping to open user login form 
          

}

