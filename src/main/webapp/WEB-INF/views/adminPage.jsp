<%@page import="java.util.List"%>

<%@page import="com.web.model.Service"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Page Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f5;
        }

       /* Style the navigation bar */
.navbar {
  width: 100%;
  background-color: #555;
  overflow: auto;
}

/* Navbar links */
.navbar a {
  float: left;
  text-align: center;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}

/* Navbar links on mouse-over */
.navbar a:hover {
  background-color: #000;
}

/* Current/active navbar link */
.active {
  background-color: #04AA6D;
}

/* Add responsiveness - will automatically display the navbar vertically instead of horizontally on screens less than 500 pixels */
@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #333;
            color: #fff;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        .btn1 {
            background-color: #1bd634;
        }

        .btn2 {
            background-color: #d61b1b;
        }

        button {
            padding: 8px 16px;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s;
            height: 35px;
        }

        button:hover {
            background-color: #555;
        }

        nav a:hover {
            color: white;
        }

        .nav-btn:hover {
            color: #ddd;
            background-color: rgb(66, 3, 102);
        }
    </style>
</head>
<body>
       <div class="navbar">
		  <a  href="index"><i class="fa fa-fw fa-home"></i> Home</a>
		  
		  <a href="#"><i class="fa fa-fw fa-envelope"></i> Service Provider Request</a>
		  <a href="index"><i class="fa fa-fw fa-user"></i> Logout</a>
		</div>
    

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
                <th>Status</th>
                <th>Accept</th>
                <th>Reject</th>
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
                <td><%=serviceproviders.getsStatus() %></td>
                <td><a href="Accept/<%=serviceproviders.getsContact()%>"><button class="btn1" type="submit">Accept</button></a></td>
                <td><a href="Reject/<%=serviceproviders.getsContact()%>"><button class="btn2" type="submit">Reject</button></a></td>
            </tr>
             <% 
    	    }
             %>
            <!-- Add more rows as needed -->
        </tbody>
    </table>

</body>
</html>
