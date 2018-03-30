<%-- 
    Document   : product
    Created on : Feb 11, 2018, 2:43:23 PM
    Author     : danielyount
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

    <link rel="stylesheet" type="text/css" href="globalstyle.css">

    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

    <p>User <a href="index.jsp">Logout</a></p>
    <h1>Product</h1>
    <div>
        <form>
            <label>Code:</label>
            <input type="text" name="code">
            <br>
            <br><label>Description: </label>
            <textarea name="description"></textarea>
            <br>
            <br>
            <label>Price: </label>
            <input type="text" name="numbers">
        </form>
    </div>
    <br>
    <a href="productManagement?action=displayProducts"><button>Update Product</button></a>
    <a href="productManagement?action=displayProducts"><button>View Products</button></a>
</body>

</html>

