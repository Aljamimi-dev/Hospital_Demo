
package Hospital;
import java.sql.*;
public class MyConnection {
    static Connection con;  //connection Object
    public static Connection getConnection(){  //to set up the connection
        try{
            con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//user//Documents//NetBeansProjects//Hospital//Abha_Branch.accdb");
            System.out.println("Connected");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    
    public static void main(String[] args) {
        MyConnection.getConnection();
    }
    
}
