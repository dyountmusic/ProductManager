

<%@ include file="header.jsp" %>
    </head>
    <body>
        <div class="container" style="padding-top: 2%">
            <p> Welcome back, <c:out value='${user.firstName}'/>. <br/>
                <a href="membership?action=logout">Logout</a> </p>

            <h2>Product</h2>
            <c:out value="${error}" />
            <form action="productManagement?action=displayProducts" method="POST">
                <div class="form-group">
                <label> Code: </label>
                <input type="text" name="code" value="${product.code}" class="form-control"/>
                </div>
                
                <div class="form-group">
                <label> Description: </label>
                <textarea name="description" height="50px;" class="form-control" id="exampleFormControlTextarea1">${product.description}</textarea>
                </div>
                
                <div class="form-group">
                <label> Price: </label>
                <input type="text" name="price" value="${product.price}"/>
                </div>

                <input type="hidden" name="update" value="yes"/>
                <input type="submit" value="Add or Update Product" class="btn btn-primary"/>
            </form>
            <br/>
            <a href="productManagement?action=displayProducts"> <button class="left btn"> View All Products</button></a>
        </div>
    </body>
</html>
