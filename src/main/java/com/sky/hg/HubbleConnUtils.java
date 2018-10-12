package com.sky.hg;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class HubbleConnUtils {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	private HubbleConnUtils(){}
	
	static{
		initConfig();
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void initConfig(){
		try {
			InputStream inputStream = HubbleConnUtils.class.getResourceAsStream("/hubble.properties");
			Properties prop = new Properties();
			prop.load(inputStream);
			driver = prop.getProperty("jdbc.hubble.driver");
			url = prop.getProperty("jdbc.hubble.url");
			username = prop.getProperty("jdbc.hubble.username");
			password = prop.getProperty("jdbc.hubble.password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection connection = null;
		java.util.Properties info = new java.util.Properties();
		info.put("user", username);
		try {
			connection = DriverManager.getConnection(url, info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void release(Connection conn,Statement st,ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(st != null){
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
