<%@page import="java.util.List"%>

<%@page import="com.web.model.Service"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

 table {
        border-collapse: collapse;
        width: 100%;
    }
    h1 {
        text-align: center;
        margin-top: 50px;
        color: #333;
    }

    th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }

    /* Hover effect */
    tr:hover {
        background-color: #6a3cd6;
        color: white;
    }

    th {
        background-color: #6a3cd6;
        color: white;
    }

</style>

</head>
 <body>
   <h1>Service Providers</h1>
     <table>
        <thead>
            <tr>
                <th>Contact</th>
                <th>Name</th>
                <th>Age</th>
                <th>Area</th>
                <th>City</th>
                <th>Email</th>
                <th>Password</th>
                <th>ServiceType</th>
                <th>Opening Time</th>
                <th>Closing Time</th>
               
            </tr>
        </thead>
        <tbody>
        
        <%
    	List<Service> service = (List<Service>)request.getAttribute("serviceProviderList");
    
    	for(Service serviceproviders:service)
    	{
        %>
            <tr>
                <td><%=serviceproviders.getsContact() %></td>
                <td><%=serviceproviders.getsName() %></td>
                <td><%=serviceproviders.getsAge() %></td>
                <td><%=serviceproviders.getsArea() %></td>
                <td><%=serviceproviders.getsCity() %></td>
                <td><%=serviceproviders.getsEmail() %></td>
                <td><%=serviceproviders.getsPassword() %></td>
                <td><%=serviceproviders.getsServiceType() %></td>
                <td><%=serviceproviders.getsOpen() %></td>
                <td><%=serviceproviders.getsClose() %></td>
                
            </tr>
             <% 
    	    }
             %>
         
        </tbody>
    </table>

</body>
</html>