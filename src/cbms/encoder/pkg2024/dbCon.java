package cbms.encoder.pkg2024;

/**
 *
 * @author CPDD - SPD PDIU
 */


import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbCon {
    
    public static Connection conn = null;
    public static PreparedStatement pst;
    public static ResultSet rs;
    public static CallableStatement pro = null;
    public static Statement statement;
    
    public static Connection ConnectDB()
    {
        try
        {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connstring = "jdbc:sqlserver://localhost:1433;user=sa;password=123123123;database=CBMS_ENCODER_2024;integratedSecurity=true;";
            conn = DriverManager.getConnection(connstring); 
            return conn;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
            return null;
        }

    } 
}
