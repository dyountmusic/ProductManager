<%-- 
    Document   : products
    Created on : Feb 11, 2018, 2:31:48 PM
    Author     : danielyount
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

<head>

    <link rel="stylesheet" type="text/css" href="globalstyle.css">
    <link rel="stylesheet" type="text/css" href="productstablestyle.css">
    
    <title>Products</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

    <p>User <a href="index.jsp">Logout</a></p>
    
    <h1>Products</h1>
    <div>
        <table class="tg">
            <tr>
                <th class="tg-e3zv">Code</th>
                <th class="tg-9hbo">Description</th>
                <th class="tg-9hbo">Price</th>
                <th class="tg-yw4l"></th>
                <th class="tg-yw4l"></th>
            </tr>
            <tr>
                <td class="tg-yw4l">8601</td>
                <td class="tg-yw4l">86 (the band) - True Life Songs and Pictures</td>
                <td class="tg-yw4l">$15.96</td>
                <td class="tg-yw4l">Edit</td>
                <td class="tg-yw4l">Delete</td>
            </tr>
            <tr>
                <td class="tg-yw4l">pf01</td>
                <td class="tg-yw4l">Paddlefoot - The first CD</td>
                <td class="tg-yw4l">$12.95</td>
                <td class="tg-yw4l">Edit</td>
                <td class="tg-yw4l">Delete</td>
            </tr>
            <tr>
                <td class="tg-yw4l">pf02</td>
                <td class="tg-yw4l">Paddlefood - The second CD</td>
                <td class="tg-yw4l">$14.95</td>
                <td class="tg-yw4l">Edit</td>
                <td class="tg-yw4l">Delete</td>
            </tr>
            <tr>
                <td class="tg-yw4l">jr01</td>
                <td class="tg-yw4l">Joe Rut - Genuine Wood Grained Finish</td>
                <td class="tg-yw4l">$14.95</td>
                <td class="tg-yw4l">Edit</td>
                <td class="tg-yw4l">Delete</td>
            </tr>
        </table>
    </div>
    <br>
    <a href="product.jsp"><button>Add Product</button></a>
    
</body>

</html>
