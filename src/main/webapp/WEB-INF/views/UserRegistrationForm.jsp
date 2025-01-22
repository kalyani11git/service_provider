<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     
    <!----===== Iconscout CSS ===== -->
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

    <title>User Registration Form</title> 
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600&display=swap');
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }
        body {
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            background: linear-gradient(#cdbfdb, #ba77e7);
            
        }
        .container {
            position: relative;
            max-width: 900px;
            width: 100%;
            border-radius: 6px;
            padding: 30px;
            margin: 0 15px;
            background-color: rgba(73, 73, 73, 0.5);
            /* box-shadow: 0 5px 10px rgba(0,0,0); */
            color: aliceblue;
        }
        .container header {
            position: relative;
            font-size: 20px;
            font-weight: 600;
            color: white;
        }
        /* .container header::before {
            content: "";
            position: absolute;
            left: 0;
            bottom: -2px;
            height: 3px;
            width: 27px;
            border-radius: 8px;
            background-color: #8b1a1a;
        } */
        .container form {
            position: relative;
            margin-top: 16px;
            min-height: 490px;
            /* background-color: rgba(0,0,0,0.5); */
            overflow: hidden;
        }
        .container form .form {
            position: absolute;
            /* background-color: rgba(0, 0, 0, 0.5); */
            transition: 0.3s ease;
        }
        .container form .form.second {
            /* opacity: 0; */
            pointer-events: none;
            transform: translateX(100%);
        }
        form.secActive .form.second {
            /* opacity: 0.5; */
            pointer-events: auto;
            transform: translateX(0);
        }
        form.secActive .form.first {
            /* opacity: 0.5; */
            pointer-events: none;
            transform: translateX(-100%);
        }
        .container form .title {
            display: block;
            margin-bottom: 8px;
            font-size: 16px;
            font-weight: 500;
            margin: 6px 0;
            
        }
        .container form .fields {
            display: flex;
            align-items: center;
            justify-content: space-between;
            flex-wrap: wrap;
            
            

        }
        form .fields .input-field {
            display: flex;
            width: calc(100% / 3 - 15px);
            flex-direction: column;
            margin: 4px 0;
            


            

        }
        .input-field label {
            font-size: 12px;
            font-weight: 500;
            color: white;

        }
        .input-field input,
        select {
            outline: none;
            font-size: 14px;
            font-weight: 400;
            color: #e8f3f3;
            border-radius: 5px;
            border: 1px solid #aaa;
            padding: 0 15px;
            height: 42px;
            margin: 8px 0;
            background-color:transparent;

        }
        .input-field input :focus,
        .input-field select:focus {
            box-shadow: 0 3px 6px rgba(254, 255, 255);
        }
        
        .container form button,
        .backBtn {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 45px;
            max-width: 200px;
            width: 100%;
            border: none;
            outline: none;
            color: #fff;
            border-radius: 5px;
            margin: 25px 0;
            background-color: #53175f;
            transition: all 0.3s linear;
            cursor: pointer;
        }
        .container form .btnText {
            font-size: 14px;
            font-weight: 400;
        }
        form button:hover {
            background-color: #53175f;
        }
        form button i,
        form .backBtn i {
            margin: 0 6px;
        }
        form .backBtn i {
            transform: rotate(180deg);
        }
        form .buttons {
            display: flex;
            align-items: center;
        }
        form .buttons button,
        .backBtn {
            margin-right: 14px;
        }
        @media (max-width: 750px) {
            .container form {
                overflow-y: scroll;
            }
            .container form::-webkit-scrollbar {
               display: none;
            }
            form .fields .input-field {
                width: calc(100% / 2 - 15px);
            }
        }
        @media (max-width: 550px) {
            form .fields .input-field {
                width: 100%;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <header>Registration</header>

        <form action="UserRegistrationFormSubmit" method="post">
            <div class="form first">
                <div class="details personal">
                    <span class="title">User Details</span>

                    <div class="fields">
                        <div class="input-field">
                            <label>Name</label>
                            <input type="text" name="uName" placeholder="Enter your name" required>
                        </div>

                        <div class="input-field">
                            <label>Age</label>
                            <input type="number" name="uAge" placeholder="Enter your age" required>
                        </div>

                        <div class="input-field">
                            <label>Contact Number</label>
                            <input type="number" name="uContact" placeholder="Enter your contact number" required>
                        </div>

                        <div class="input-field">
                            <label>Address</label>
                            <input type="text" name="uAddress" placeholder="Enter your area" required>
                        </div>

                        <div class="input-field">
                            <label>City</label>
                            <input type="text" name="uCity" placeholder="Enter your city" required>
                        </div>

                        <div class="input-field">
                            <label>Email</label>
                            <input type="email" name="uEmail" placeholder="Enter your email" required>
                        </div>

                        <div class="input-field">
                            <label>Password</label>
                            <input type="password" name="uPassword" placeholder="Enter your password" required>
                        </div>

                       
                <!-- ... (existing identity details) ... -->

                <button class="nextBtn" type="submit">
                    <span class="btnText">Register</span>
                    <i class="uil uil-navigator"></i>
                </button>
            </div>

            
                </div> 
            </div>
        </form>
    </div>

    
</body>
</html>
