
<%@ include file="header.jsp" %>
    </head>
    <body>
        <div class="container" style="padding-top: 5%">
        <p> Welcome back, <c:out value='${user.firstName}'/>.
            <a href="membership?action=logout">Logout</a> </p>
        
        <h2>Are you sure you want to delete this product?</h2>
        <form action="productManagement?action=displayProducts" method="POST">
            <div class="form-group">
                <label> <em>Code:</em> </label>
            <p> <c:out value='${product.code}' />
            </div>
            <div class="form-group">
            <label> <em>Description: </em> </label>
            <p> <c:out value='${product.description}' /> </p>
            </div>
            <div class="form-group">
                <label> <em>Price:</em> </label>
            <p> <c:out value='${product.price}' /> </p>
            </div>
            
            <input type="hidden" name="delete" value="Yes" />
            <input type="hidden" name="code" value="<c:out value='${product.code}'/>"/>
            <input type="submit" value="Yes" class="btn btn-primary"/> 
        </form>
            <br>
            <a href="productManagement?action=displayProducts"> <button class="btn"> No </button></a>
            </div>
    </body>
</html>
