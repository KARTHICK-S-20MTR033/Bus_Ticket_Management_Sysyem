/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;
import java.sql.*;
/**
 *
 * @author KARTHIK
 */
public class DBConnection {
    static Connection con=null;
    public static Connection getConnection()
    {
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_demo","root","Lovable@9324");
        }
        catch(SQLException se)
                {
                    System.out.println(se);
                }
        return con;
    }
    
}
