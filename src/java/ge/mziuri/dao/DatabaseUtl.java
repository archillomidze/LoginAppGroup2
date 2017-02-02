/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.mziuri.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author C4C5
 */
public class DatabaseUtl {
    
    public static final String databaseURL = "jdbc:postgresql://localhost:5432/postgresql";
    public static final String username = "postgres";
    public static final String password = "rame";
    
    public static Connection getConnection() {
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(databaseURL, username, password); 
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
    public static void closeConnection(Connection con){
        try{
            con.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    } 
    
}
