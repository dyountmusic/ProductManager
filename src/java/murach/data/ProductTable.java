package murach.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import edu.uncc.nbad.Product;
import java.sql.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


public class ProductTable {

    public static Connection connection;
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/shop";
    public static final String USERNAME = "shoplogin";
    public static final String PASSWORD = "sesame";
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        }
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (SQLException e)  {
            System.out.println(e);
        }

    }

    public static List<Product> selectProducts() {
        try {
            Statement statement = connection.createStatement();
            ResultSet products = statement.executeQuery("SELECT * FROM products");
            List<Product> allProducts = new ArrayList<Product>();
            while (products.next()) {
                Product prod = new Product();
                prod.setCode(products.getString("code"));
                prod.setDescription(products.getString("description"));
                prod.setPrice(Double.parseDouble(products.getString("price")));
                allProducts.add(prod);
            }
            return allProducts;
        } catch (SQLException e) {
            System.out.println("an error occured");
        }
        return new ArrayList<Product>();
    }

    public static Product selectProduct(String productCode) {
        try {
            Statement statement = connection.createStatement();
            String queryString = "SELECT * FROM products WHERE code= '" + productCode + "'";
            System.out.println(queryString);
            ResultSet productResultSet = statement.executeQuery(queryString);

            Product prod = new Product();
            productResultSet.next();
            prod.setCode(productResultSet.getString("code"));
            prod.setDescription(productResultSet.getString("description"));
            prod.setPrice(Double.parseDouble(productResultSet.getString("price")));
                 
            return prod;
            
        } catch (SQLException e) {
            System.out.println("an error occured");
            System.out.println(e);
        }
        
        return new Product();
    }

    public static boolean exists(String productCode) {
        boolean doesExist = false;

        try {
            Statement statement = connection.createStatement();
            String queryString = "SELECT * FROM products WHERE code= '" + productCode + "'";
            ResultSet existsResultSet = statement.executeQuery(queryString);
            if (existsResultSet.next()) {
                doesExist = true;
            }
            return doesExist;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return doesExist;
        
    }

    public static void insertProduct(Product product) {
        try {
            String queryString = "INSERT INTO products(code, description, price) VALUES ('" + product.getCode() + "', '" + product.getDescription() + "', '" + product.getPrice() + "')";
            Statement statement = connection.createStatement();
            
            statement.executeUpdate(queryString);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateProduct(Product product) {
        try {
            String queryString = "UPDATE products SET "
                    + "code= '" + product.getCode() + "', "
                    + "description= '" + product.getDescription() + "', "
                    + "price= '" + product.getPrice() + "' "
                    + "WHERE code= '" + product.getCode() + "'";
            Statement statement = connection.createStatement();
            statement.executeUpdate(queryString);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void deleteProduct(Product product) {
        try {
            String queryString = "DELETE FROM products WHERE code= '" + product.getCode() + "'";
            Statement statement = connection.createStatement();
            statement.executeUpdate(queryString);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }    
}
