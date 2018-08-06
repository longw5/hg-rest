package com.sky.hg.restful;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sky.hg.EntityReflect;
import com.sky.hg.JDBCUtils;

public abstract class QueryTemplate {
	
	public List queryList(String sql, String table){
		
		Connection conn = JDBCUtils.getConnection();
		Statement st = null;
		ResultSet rs = null;
		List list = new ArrayList();
		System.out.println("sql===========>"+sql);
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			System.out.println("rs===========>");
			while(rs.next()){
				Object entity = EntityReflect.setPropValue(table, rs);
				
				System.out.println("=============>"+entity);
				list.add(entity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.release(conn, st, rs);
		}
		return list;
		
	}
	
	public int queryCount(String sql){
		Connection conn = JDBCUtils.getConnection();
		Statement st = null;
		ResultSet rs = null;
		int count = 0;
		List list = new ArrayList();
		System.out.println("sql===========>"+sql);
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				count = rs.getInt(1);
				System.out.println("=============>"+count);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtils.release(conn, st, rs);
		}
		
		return count;
	}
	
	
}
