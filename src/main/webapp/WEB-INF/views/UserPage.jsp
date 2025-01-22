<%@page import="com.web.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Dashboard</title>
    <!-- Link Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
        }

        .dashboard {
            display: flex;
            flex-direction: column;
            position: sticky;
            top: 0;
            background-color: #4a106b;
            padding: 15px;
            color: white;
            min-width: 200px; /* Set a minimum width for the sidebar */
            height:100%;
           
        }

        .user-info {
            margin-bottom: 20px;
            font-size:15px;
            
        }

        .nav-link {
            color: white !important;
        }

        .content {
            flex-grow: 1;
            padding: 20px;
        }

        .card-deck {
            margin-top: 20px;
        }
        #home{
          margin-left:200px; 
          margin-top:0;
        }
	   button {
	  background-color: black; 
	  color: white; 
	  border: 2px solid #04AA6D;
	    }
		
		button:hover {
	  background-color: #04AA6D;
	  color: white;
       }
    </style>
</head>
<body>

    <div class="dashboard" style="position: fixed">
        <div class="user-info">
        <%  User user = (User)request.getAttribute("user"); %>
             
            <p >  <i class="fa-solid fa-user"></i> : <%= user.getuName() %><p>
           
            <!-- You can dynamically replace "John Doe" with the actual username from your backend -->
        </div >
        
        <nav class="nav flex-column" >
            <a class="nav-link active" href="index" onclick="showContent('home')"><button>Home</button></a>
            <a class="nav-link" href="BookOrder" onclick="showContent('bookNow')"><button>Book Now</button></a>
             
            <a class="nav-link" href="PendingOrder" onclick="showContent('pendingRequests')"><button>Pending Requests</button></a>
            <a class="nav-link" href="ApprovedOrder" onclick="showContent('approveRequests')"><button>Approve Requests</button></a>
            <a class="nav-link" href="index" id="logOut" onclick="showContent('logout')"><button>Logout</button></a>
        </nav>
       </div>
    <div class="content" id="home" style="margin-left:200px; margin-top:0px" >
        <jsp:include page="services.jsp" />
    </div>

    <div class="content" id="bookNow" style="display: none;">
        
    </div>


    <!-- Other content divs for different pages -->
    <div class="content" id="pendingRequests" style="display: none;">
       <h1>Pending Request</h1>
       
       
        
    </div>

    <div class="content" id="approveRequests" style="display: none;">
        <!-- Content for Approve Requests page -->
        <h2>Approve Requests</h2>
        
        
    </div>

    <div class="content" id="logout" style="display: none;">
        <!-- Content for Logout page -->
        <h2>Logout</h2>
        <p>Logout from your account.</p>
    </div>

    <!-- Link Bootstrap JS and Popper.js -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
    <script>
    function showContent(contentId) {
        // Hide all content divs
        var contentDivs = document.querySelectorAll('.content');
        contentDivs.forEach(function(content) {
            content.style.display = 'none';
        });

        // Show the selected content
        document.getElementById(contentId).style.display = 'block';
    }

    </script>
</body>
</html>
