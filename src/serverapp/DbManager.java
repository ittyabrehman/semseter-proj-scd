/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapp;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BSE193139
 */
public class DbManager {

    private Connection dbConnection;
    
    public DbManager() {
        String dbURL = "jdbc:mysql://localhost:1527/softwareData";
        String username = "root";
        String password = "";

        try {
            dbConnection = (Connection) DriverManager.getConnection(dbURL,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void Insert(String query)
    {
        try {
            java.sql.Statement st =  dbConnection.createStatement();
            int rows= st.executeUpdate(query);           
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public void Update(String query)
    {
        try {
            java.sql.Statement st =  dbConnection.createStatement();
            int rows= st.executeUpdate(query);           
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
        }     
    } 
    public void Delete(String query)
    {
        try {
            java.sql.Statement st =  dbConnection.createStatement();
            int rows= st.executeUpdate(query);           
        } catch (SQLException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
}
