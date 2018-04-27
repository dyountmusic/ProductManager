

<%@ include file="header.jsp" %>
    </head>
    <body>
        <div class="container" style="padding-top: 2%">
        <p> Welcome back, <c:out value='${user.firstName}'/>. <br/>
            <a href="membership?action=logout">Logout</a> </p>
        
        <h2>Products</h2>
        <table class="table">
            <tr><th> Code </th> <th> Description </th> <th> Price </th> 
                <th></th> <th></th> </tr>
            <!-- The For Each that Loops Through the Products -->
            <c:forEach var="Product" items="${products}">
             <tr>
                <td>${Product.code}</td>
                <td>${Product.description}</td> 
                <td>$ ${Product.price}</td>
                <td> 
                    <form action="productManagement?action=displayProduct" method="post">
                        <input type="hidden" name="productCode" value="<c:out value='${Product.code}'/>"/>
                        <input type="submit" value="Edit" class="btn"/>
                    </form>
                </td> 
                <td> 
                    <form action="productManagement?action=deleteProduct" method="post">
                        <input type="hidden" name="productCode" value="<c:out value='${Product.code}'/>"/>
                        <input type="submit" value="Delete" class="btn"/>
                    </form>
                </td> 
            </tr>
             </c:forEach>
        </table>
        
        <a href="/FinalProject/product.jsp"> <button class="btn btn-primary"> Add Product </button> </a>
         </div>
    </body>
</html>
