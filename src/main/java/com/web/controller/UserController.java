package com.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.web.dao.OrderTableDao;
import com.web.dao.ServiceDao;
import com.web.dao.UserDao;
import com.web.model.OrderTable;
import com.web.model.Service;
import com.web.model.User;

@Controller
public class UserController {
     String str1="";
	
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	User user = (User) context.getBean("user");
	UserDao userDao = (UserDao) context.getBean("userDao");
	
	Service service = (Service) context.getBean("service");
	ServiceDao serviceDao = (ServiceDao) context.getBean("serviceDao");
	
	OrderTable orderTable = (OrderTable) context.getBean("orderTable");
	OrderTableDao orderTableDao = (OrderTableDao) context.getBean("orderTableDao");
	
	
	@RequestMapping("/FinalSpringMVCDemo/UserPage")
    public String Userpage(){
  	  return "FinalSpringMVCDemo/UserPage";
    }
	
	//mapping to open user page by back button
	@RequestMapping("/UserPage")
    public String UserPageOpen(HttpServletRequest request,Model m){
		 
		try
		{
		String uContact = request.getParameter("uContact");
		str1 = uContact;
       String uEmail = request.getParameter("uEmail");
       String uPassword = request.getParameter("uPassword");


       user = userDao.getUser(uContact);

       m.addAttribute("user",user);
			
		    if(user.getuContact().equals(uContact)&& user.getuEmail().equals(uEmail)&& user.getuPassword().equals(uPassword)){
		    	
		    	

		    	
				return "UserPage";
		    	
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
		
		//mapping for user to go for particular service provider 
	
		
		
	}

	
	
	@RequestMapping("/UserLoginForm")
    public String UserLoginForm(){
  	  return "UserLoginForm";
    }
    
    @RequestMapping("/UserRegistrationForm")
    public String UserRegistrationFrom(){
  	  return "UserRegistrationForm";
    }

    @RequestMapping("/services")
	public String ServiceProviderHomeSubmit(){
		return "services";
	}
    
    @RequestMapping("/BookOrder")
	public String BookOrder(){
		return "BookOrder";
    }
    
//    @RequestMapping("/PendingOrder")
//	public String pendingRequest(){
//		return "PendingOrder";
//	}
    
    
    //Mapping for User to on login after Registration 
    @RequestMapping(path="/UserRegistrationFormSubmit",method=RequestMethod.POST)
    public String UserRegistrationFormSubmit(@ModelAttribute User user){
    	
    	try
		{
			userDao.addUser(user);
			System.out.println("service provider Added..!!");
			return "UserLoginForm";
		}
		catch(Exception e)
		{
			System.out.println("Failed to add service provider..!!");
			e.printStackTrace();
			return "error";
		}
    	
  	  
    }
    
    
	
	//Mapping for User login form submit
		@RequestMapping(path="/UserLoginFormSubmit",method=RequestMethod.POST)
		public String UserLoginFormSubmit(HttpServletRequest request,Model m){
			 
			try
			{
			String uContact = request.getParameter("uContact");
			str1 = uContact;
	        String uEmail = request.getParameter("uEmail");
	        String uPassword = request.getParameter("uPassword");
	
	
	        user = userDao.getUser(uContact);

	        m.addAttribute("user",user);
				
			    if(user.getuContact().equals(uContact)&& user.getuEmail().equals(uEmail)&& user.getuPassword().equals(uPassword)){
			    	
			    	

			    	
					return "UserPage";
			    	
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
			
			//mapping for user to go for particular service provider 
		
			
			
		}
	

		
		@RequestMapping(path="/AllServices/{cat}",method=RequestMethod.GET)
		public String serviceProvide(@PathVariable("cat") String cat,Model m)
		{
			System.out.println("Category == "+cat); //get category
			List<Service> servicelist = serviceDao.getAllServiceProvider(); //all sp list
			List<Service> myService = new ArrayList<Service>(); //new empty list
			for(Service ser : servicelist)
			{
				if(ser.getsServiceType().equals(cat)) //check with category
				{   
					if(ser.getsStatus().equals("Accept")){
						myService.add(ser);
					}
					 //add sp in new list if cat matches
				}
			}
			
			m.addAttribute("serviceProviderList",myService);
			return "AllServices";
		}
		
		//Mapping for user logout
		@RequestMapping(path="/UserLoginForm/{log}")
        public String LogOutUser(@PathVariable("log") String log,Model m){
    		return "UserLginForm/log";
    	} 
		
		
		
			
		
		
		@RequestMapping(path="/AddOrder",method=RequestMethod.POST)
		public String addOrder(@ModelAttribute OrderTable orderTable)
		{
			try
			{
				orderTableDao.addOrder(orderTable);
				
				System.out.println("Order Added..!!");
				return "BookOrder";
			}
			catch(Exception e)
			{
				System.out.println("Failed to add order..!!");
				e.printStackTrace();
				return "error";
			}
		}
		
		
		
		
        @RequestMapping(path="/OpenAllServicesAfterBookOrder",method=RequestMethod.POST)
        public String BookOrderSubmit(){
    		return "BookOrder";
    	}
        
        
      //mapping to open pending orders
        @RequestMapping("/PendingOrder")
    	public String pendingOrder(HttpServletRequest request,Model m)
    	{
        	
//    		String uContact = request.getParameter("uContact");
    		
        	String uContact = str1;
        	
    		System.out.println(uContact);
    		
    		List<OrderTable> pendingOrderList = orderTableDao.getAllOrder();
    		List<OrderTable> newPendingOrderList = new ArrayList<OrderTable>();
    		
    		for(OrderTable po:pendingOrderList){
    			
    			if(po.getCustNo().equals(uContact)&& po.getCustStatus().equals("Pending"))
    			{
    				newPendingOrderList.add(po);
    			}
    			
    			}
    		System.out.println(newPendingOrderList);
    		m.addAttribute("newPendingOrderList", newPendingOrderList);
    		return "PendingOrder";
    		
    		
    	}
        
        //mapping to open approved orders
        @RequestMapping("/ApprovedOrder")
    	public String ApprovedOrder(HttpServletRequest request,Model m)
    	{
        	
//    		String uContact = request.getParameter("uContact");
    		
        	String uContact = str1;
        	
    		System.out.println(uContact);
    		
    		List<OrderTable> pendingOrderList = orderTableDao.getAllOrder();
    		List<OrderTable> newPendingOrderList = new ArrayList<OrderTable>();
    		
    		for(OrderTable po:pendingOrderList){
    			
    			if(po.getCustNo().equals(uContact)&&po.getCustStatus().equals("Approved"))
    			{
    				newPendingOrderList.add(po);
    			}
    			
    			}
    		System.out.println(newPendingOrderList);
    		m.addAttribute("newPendingOrderList", newPendingOrderList);
    		return "ApprovedOrder";
    		
    		
    	}
        
        @RequestMapping(path="/UserLginForm",method=RequestMethod.POST)
        public String LogOutUser(){
    		return "UserLginForm";
    	}
        
        
        
}

     


