

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>       
        <title> Product Management </title>
    </head>
    <body>
        <div class="container" style="padding-top: 5%">

            <h2>Sign-up Form</h2>
            <form action="membership?action=signup-attempt" name="registration" method="post">  
                <div class="form-group">
                    <label for="firstName">First Name:</label>  
                    <input type="text" name="firstName" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="lastName">Last Name:</label>  
                    <input type="text" name="lastName" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>  
                    <input type="text" name="email" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>  
                    <input type="password" name="password" class="form-control"/>
                </div>
                <input type="submit" name="submit" value="Sign Up" class="btn btn-primary" />
            </form>
        </div>
    </body>
</html>
