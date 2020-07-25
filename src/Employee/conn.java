
package Employee;

import java.sql.*;

public class conn {
    public Connection c;
    public Statement s;
    
    public conn()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///ems","root","root");
            System.out.println("Connection established Successfully");
            s=c.createStatement();
       }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}