package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection
{

public static Connection getConnection() throws Exception
    {
    String driver = "org.postgresql.Driver";
    String url = "jdbc:postgresql://localhost:5432/moi";
    String username = "postgres";
    String password = "admin@123";
    Class.forName(driver); // load Oracle driver
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
    }

    /*
    public static void main(String args[]) throws Exception
    {
    System.out.println(">>>>> Database connection"+DBConnection.getConnection());
    }*/

    }
    
	
	
	

