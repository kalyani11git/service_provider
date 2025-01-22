package com.web.controller;

import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class ServiceController {
	String str1 = "";
	
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	Service service = (Service) context.getBean("service");
	ServiceDao serviceDao = (ServiceDao) context.getBean("serviceDao");
	
	User user = (User) context.getBean("user");
	UserDao userDao = (UserDao) context.getBean("userDao");
	
	OrderTable orderTable = (OrderTable) context.getBean("orderTable");
	OrderTableDao orderTableDao = (OrderTableDao) context.getBean("orderTableDao");
	
	
	
	//Mapping for Service provider login open
	@RequestMapping("/ServiceProviderLogin")
	public String ServiceProviderLogin(){
		return "ServiceProviderLogin";
	}
	
	
	
	
	
	
	//Mapping for service provider registration for open
	@RequestMapping("/ServiceProviderRegistration")
	public String ServiceProviderRegister(){
		return "ServiceProviderRegister";
	}
	
	
	//Mapping for service provider registration for open

	@RequestMapping(path="/addServiceProviderSubmit",method=RequestMethod.POST)
	public String addServiceProviderSubmit(@ModelAttribute Service service)
	{
		try
		{
			serviceDao.addServiceProvider(service);
			System.out.println("service provider Added..!!");
			return "ServiceProviderLogin";
		}
		catch(Exception e)
		{
			System.out.println("Failed to service provider..!!");
			e.printStackTrace();
			return "error";
		}
	}
	
	    //Mapping for service provider login form submit
		@RequestMapping(path="/ServiceProviderLoginFormSubmit",method=RequestMethod.POST)
		public String ServiceProviderLoginFormSubmit(HttpServletRequest request,Model m){
			 
			try
			{
				String sContact = request.getParameter("sContact");
				str1 = sContact;
				String sEmail = request.getParameter("sEmail");
				String sPassword = request.getParameter("sPassword");
				
				
				service = serviceDao.getServiceProvider(sContact);

				m.addAttribute("service",service);
				
			    if(service.getsContact().equals(sContact) && service.getsEmail().equals(sEmail)&& service.getsPassword().equals(sPassword)&&service.getsStatus().equals("Accept")){
			    	
			    	System.out.println("Service provider login successfully..!!");
			    	
			    	List<User> userlist = userDao.getAllUser();
					
					m.addAttribute("UserList",userlist);

			    	
					return "ServiceProviderPage";
			    	
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
		
		
//		mapping for upcoming schedule
		
		//@RequestMapping("/UpcomingSchedule")
//		public String UpcomingSchedule(Model m){
//			
//			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//			
//			List<OrderTable> pendingOrderList = orderTableDao.getAllOrder();
//    		List<OrderTable> newPendingOrderList = new ArrayList<OrderTable>();
//    		for(OrderTable po:pendingOrderList){
//    			
//    			int i = (int) new Date().getTime();
//    			String date=po.getCustDate();
//    			
//    			
//    			
//    			
//    		int date = Integer.parseInt(po.getCustDate()) -  i ; 
//			if(service.getsName().equalsIgnoreCase(po.getSpName())&& date <=7 )
//			{
//				newPendingOrderList.add(po);
//			}
//    		}
//    		m.addAttribute("newPendingOrderList", newPendingOrderList);
//    		
//			return "UpcomingSchedule";
//		}
		
		
		
		//mapping to go from home to services page
		@RequestMapping("/OwnPendingOrder")
		public String returnOwnPendingOrder(Model m){
			String sContact = str1;
			service = serviceDao.getServiceProvider(sContact);
//			m.addAttribute("service",service);
			
			List<OrderTable> pendingOrderList = orderTableDao.getAllOrder();
    		List<OrderTable> newPendingOrderList = new ArrayList<OrderTable>();
    		for(OrderTable po:pendingOrderList){
			if(service.getsName().equalsIgnoreCase(po.getSpName()))
			{
				newPendingOrderList.add(po);
			}
    		}
    		m.addAttribute("newPendingOrderList", newPendingOrderList);
    		return "OwnPendingOrder";
		}
		
		//Mapping for showing pending order to service provider
		@RequestMapping("/SpPendingOrder")
		public String returnPendingOrder(Model m){
			String sContact = str1;
			service = serviceDao.getServiceProvider(sContact);
//			m.addAttribute("service",service);
			
			List<OrderTable> pendingOrderList = orderTableDao.getAllOrder();
    		List<OrderTable> newPendingOrderList = new ArrayList<OrderTable>();
    		for(OrderTable po:pendingOrderList){
			if(service.getsName().equalsIgnoreCase(po.getSpName())&& (po.getCustStatus().equalsIgnoreCase("Pending")))
			{
				newPendingOrderList.add(po);
			}
    		}
    		m.addAttribute("newPendingOrderList", newPendingOrderList);
    		return "SpPendingOrder";
		}
		
		
		//Mapping for showing pending order to service provider
		@RequestMapping("/SpApprovedOrder")
		public String returnApprovedOrder(Model m){
			String sContact = str1;
			service = serviceDao.getServiceProvider(sContact);
//			m.addAttribute("service",service);
			
			List<OrderTable> pendingOrderList = orderTableDao.getAllOrder();
    		List<OrderTable> newPendingOrderList = new ArrayList<OrderTable>();
    		for(OrderTable po:pendingOrderList){
			if(service.getsName().equalsIgnoreCase(po.getSpName())&& (po.getCustStatus().equalsIgnoreCase("Approved")))
			{
				newPendingOrderList.add(po);
			}
    		}
    		m.addAttribute("newPendingOrderList", newPendingOrderList);
    		return "SpApprovedOrder";
		}
		
		

	

		//Mapping for Approved order
		@RequestMapping(path="Approved/{status}",method=RequestMethod.GET)
		public RedirectView approveUserOrder(@PathVariable("status") String status,HttpServletRequest request)
		{
			System.out.println("approving order request : "+status);
			orderTable = orderTableDao.approveOrder(status);
			orderTable.setCustStatus("Approved"); 
			orderTableDao.UpdateStatus(orderTable);
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(request.getContextPath()+"/OwnPendingOrder");
			return redirectView;
		}

		//Mapping for DisApproved order
				@RequestMapping(path="Disapproved/{status}",method=RequestMethod.GET)
				public RedirectView disApprovedUserOrder(@PathVariable("status") String status,HttpServletRequest request)
				{
					System.out.println("Disapproving order request : "+status);
					orderTable = orderTableDao.approveOrder(status);
					orderTable.setCustStatus("Dispproved"); 
					orderTableDao.UpdateStatus(orderTable);
					RedirectView redirectView = new RedirectView();
					redirectView.setUrl(request.getContextPath()+"/OwnPendingOrder");
					return redirectView;
				}
		
	
	
	

}
