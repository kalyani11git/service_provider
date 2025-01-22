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
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 0;
    }
    h1 {
        text-align: center;
        margin-top: 50px;
        color: #333;
    }
    table {
        width: 80%;
        margin: 20px auto;
        border-collapse: collapse;
        border: 2px solid #6632a8;
    }
    th, td {
        padding: 10px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #6632a8;
        color: white;
    }
    tr:hover {
        background-color: #ddd;
    }
    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
    .button {
  background-color: black; /* Green */
  border-radius: 8px;
  color: white;
  padding: 10px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}
.back{
text-align: center;
}
</style>
</head>
<body>

<h1>Approved Request</h1>

<table>
    <thead>
        <tr>
            <th>Service Provider Name</th>
            <th>Date</th>
            <th>Time</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
       <%
    	List<OrderTable> orderTable = (List<OrderTable>)request.getAttribute("newPendingOrderList");
    
    	for(OrderTable orders:orderTable)
    	{
       %>
        <tr>
            <td><%=orders.getSpName() %>></td>
            <td><%=orders.getCustDate()%></td>
            <td><%=orders.getCustTime()%></td>
            <td><%=orders.getCustDescription() %></td>
        </tr>
         <% 
    	    }
         %>
       
    </tbody>
</table>

</body>
</html>