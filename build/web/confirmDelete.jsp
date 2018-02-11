<%-- 
    Document   : confirmDelete
    Created on : Feb 11, 2018, 2:33:11 PM
    Author     : danielyount
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="globalstyle.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Delete</title>
    </head>
    <body>
        <p>User <a href="index.jsp">Logout</a></p>
        <h1>Are you sure you want to delete this product?</h1>
        <div>
            <p><strong>Code: </strong></p>
            <p><strong>Description: </strong></p>
            <p><strong>Price: </strong></p>
            <p></p>
        </div>
        <br>
        <button>Yes</button>
        <a href="products"><button>No</button></a>
    </body>
</html>
