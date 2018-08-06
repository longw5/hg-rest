package com.sky.hg;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EntityReflect {
	
	public static Object setPropValue(String table,ResultSet rs){
		String qualifiedClass = PropUtils.tableProp.getProperty(table+".entity");
		Object entity = null;
		try {
			entity = Class.forName(qualifiedClass).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Class<? extends Object> cls = entity.getClass();
		
		Field[] fields = cls.getDeclaredFields();
		Method[] methods = cls.getDeclaredMethods();
		
		try {
			for(Field field : fields){
				if(field.getName().equals("serialVersionUID"))
					continue;
				if(field.getName().startsWith("_"))
					continue;
				String fieldSetName = parseSetName(field.getName());
				Method fieldSetMet = cls.getMethod(fieldSetName, field.getType());
				String fieldType = field.getType().getSimpleName();
				
				
				if("String".equals(fieldType)){
					String value = rs.getString(PropUtils.attrColumnProp.getProperty(field.getName()));
					if(isDouble(value)){
						String[] split = value.split("\\.");
						value = split[0]+"."+(split[1].length()==1 ? split[1]+"0" : split[1]);
					}
					
					fieldSetMet.invoke(entity, value);
					
				}
				else if("Double".equalsIgnoreCase(fieldType))
					fieldSetMet.invoke(entity, rs.getDouble(PropUtils.attrColumnProp.getProperty(field.getName())));
				else if("Integer".equals(fieldType) || "int".equals(fieldType))
					fieldSetMet.invoke(entity, rs.getInt(PropUtils.attrColumnProp.getProperty(field.getName())));
				else
					System.out.println("不支持的类型["+field.getName()+":"+field.getType()+"]");
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	private static String parseSetName(String name) {
		return "set"+name.substring(0,1).toUpperCase()+name.substring(1);
	}
	
	private static boolean isDouble(String str){
		
		if(str == null)
			return false;
		
		if(!str.contains("."))
			return false;
		
		
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static void test(){
		System.out.println(isDouble("1234.11"));
		System.out.println(isDouble("a2d.45"));
		System.out.println(isDouble("123"));
	}
	
	public static void main(String[] args) {

		test();
	}
	
}
