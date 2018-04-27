package murach.data;

import java.io.*;
import java.util.*;
import java.sql.*;
import edu.uncc.nbad.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class UserTable {
    
    public static Connection connection;
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/shop";
    public static final String USERNAME = "shoplogin";
    public static final String PASSWORD = "sesame";
	
//Static initializer, it runs when the class is intialized (it is executed once)
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
    
    public static void addRecord(User user) throws IOException {
        if (user.getFirstName().contains("<script>")) {
            return;
        }
        
        if (user.getLastName().contains("<script>")) {
            return;
        }
        
        if (user.getEmail().contains("<script>")) {
            return;
        }
        
        if (user.getPassword().contains("<script>")) {
            return;
        }
        
        String query = "INSERT INTO users(firstName, lastName, email, password) VALUES ('"+ user.getFirstName()+ "', '" + user.getLastName()+ "', '"  + user.getEmail() + "', '"  + user.getPassword() + "')";

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch(Exception e) {
            System.out.println("an error has occured when trying to add a user to the database");
            System.out.println(e.toString());
        }
        
    }

    public static User getUser(String emailAddress) throws IOException {
        String query = "SELECT * FROM USERS WHERE email = '" + emailAddress + "'";
        
        try {
            Statement statement = connection.createStatement();
            ResultSet user = statement.executeQuery(query);
            user.next();
            return new User(user.getString("firstName"), user.getString("lastName"), user.getString("email"), user.getString("password"));
        } catch(Exception e) {
            System.out.println("an error has occured when trying to get a user from the database");
            System.out.println(e.toString());
        }
        
        return new User();
        
    }

    public static ArrayList<User> getUsers() throws IOException {
        String query = "SELECT * FROM USERS";
        ArrayList<User> usersList = new ArrayList<User>();
        
        try {
            Statement statement = connection.createStatement();
            ResultSet usersResultSet = statement.executeQuery(query);
            
            while(usersResultSet.next()){
                User user = new User();
                user.setFirstName(usersResultSet.getString("firstName"));
                user.setLastName(usersResultSet.getString("lastName"));
                user.setEmail(usersResultSet.getString("email"));
                user.setPassword(usersResultSet.getString("password"));
                usersList.add(user);
            }
            
            return usersList;
            
        } catch(Exception e) {
            System.out.println("an error has occured when trying to get a user from the database");
            System.out.println(e.toString());
        }
        
        return new ArrayList<User>();
    }

}
