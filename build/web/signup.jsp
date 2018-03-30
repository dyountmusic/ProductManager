<%-- 
    Document   : signup
    Created on : Feb 11, 2018, 2:47:49 PM
    Author     : danielyount
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

    <link rel="stylesheet" type="text/css" href="globalstyle.css">

    <title>Signup</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

    <h1>Sign-up form</h1>
    <div>
        <form method="POST" action="membership/signup">
            <label><strong>First Name</strong></label>
            <input type="text" name="firstName">
            <br><br>

            <label><strong>Last Name</strong></label>
            <input type="text" name="lastName">
            <br><br>

            <label><strong>Email</strong></label>
            <input type="text" name="email">
            <br><br>

            <label><strong>Username</strong></label>
            <input type="text" name="userName">
            <br><br>

            <label><strong>Password</strong></label>
            <input type="text" name="password">
            <br><br>

            <input type="submit" value="Sign up">
        </form>
    </div>
    <br>
    
</body>

</html>
