/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crms","root","NirajR@2580");
           return conn;
        }
        catch(Exception e){
            return null;
        }
    }
}
