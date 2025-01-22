<%@page import="java.util.List"%>

<%@page import="com.web.model.OrderTable"%>
<%@page import="com.web.model.Service"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }
    h2 {
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

<h2>Upcoming Orders</h2>

<table>
    <thead>
        <tr>
            <th>Customer Name</th>
            <th>Customer No</th>
            <th>Customer Address</th>
            <th>Customer City</th>
            <th>Customer Email</th>
            <th>Service Provider Name</th>
            <th>Date</th>
            <th>Time</th>
            <th>Description</th>
            <th>Order Status</th>
           
        </tr>
    </thead>
    <tbody>
       <%
    	List<OrderTable> orderTable = (List<OrderTable>)request.getAttribute("newPendingOrderList");
    
    	for(OrderTable orders:orderTable)
    	{
       %>
        <tr>
            <td><%=orders.getCustName() %></td>
            <td><%=orders.getCustNo() %></td>
            <td><%=orders.getCustAddr() %></td>
            <td><%=orders.getCustCity() %></td>
            <td><%=orders.getCustEmail() %></td>
            <td><%=orders.getSpName() %></td>
            <td><%=orders.getCustTime() %></td>
            <td><%=orders.getCustDate() %></td>
            <td><%=orders.getCustDescription() %></td>
            <td><%=orders.getCustStatus() %></td>
           
            
        </tr>
         <% 
    	    }
         %>
       
    </tbody>
</table>

</body>
</html>