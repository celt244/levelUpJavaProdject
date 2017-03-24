import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by java on 17.03.2017.
 */

public class Main {

  public static void main(String[] args) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
    Class.forName("com.mysql.jdbc.Driver");

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/forum", "root", "qwerty");

    PreparedStatement preparedStatement = connection.prepareStatement
            ("INSERT INTO USERS (USERSNAME, EMAIL, PASSWORD) VALUES(?,?,?)",
            Statement.RETURN_GENERATED_KEYS);

    User user = new User("Harry Potter", "potter@yopmail.com", "1234");

    preparedStatement.setString(1, user.getName());
    preparedStatement.setString(2, user.getEmail());
    preparedStatement.setString(3, user.getPassword());

    preparedStatement.execute();

    ResultSet generatedKeys =  preparedStatement.getGeneratedKeys();

    while(generatedKeys.next()){
      long id = generatedKeys.getLong("GENERATED_KEY");

      user.setId(id);
    }



//    Statement statement = connection.createStatement();
//
//    ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");
//
//    List<User> userList = new ArrayList<User>();
//    while (resultSet.next()) {
//      long id = resultSet.getLong("ID");
//      String usersname = resultSet.getString("USERSNAME");
//      String email = resultSet.getString("EMAIL");
//      String pass = resultSet.getString("PASSWORD");
//
//      userList.add(new User(id, usersname, email, pass));
//
//      System.out.println(resultSet.getLong("ID")
//              + " " + resultSet.getString("USERNAME")
//              + " " + resultSet.getString("EMAIL"));
//    }
//
//
//    System.out.println(userList);
//
    connection.close();
  }
}