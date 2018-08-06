package com.sky.hg.restful;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Properties;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sky.hg.HttpTools;
import com.sky.hg.JDBCUtils;

@Path("/api")
public class RestApiService {
	
	public static final String REST_IP;
	public static final String REST_PORT;
	
	static{
		InputStream inputStream = JDBCUtils.class.getResourceAsStream("/rest.properties");
		Properties prop = new Properties();
		try {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		REST_IP = prop.getProperty("rest.ip");
		REST_PORT = prop.getProperty("rest.port");
	}
	
	@GET
	@Path("/graphs/restful/script")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayByPath(@QueryParam("script") String script){
		String context = "";
		String url = "http://" + REST_IP + ":"+REST_PORT;
		String encode = URLEncoder.encode(script);
//		String decode = URLDecoder.decode(encode);
		System.out.println(encode);
//		System.out.println(decode);
		String api_path = "/api/graphs/restful/script?script="+encode;
		System.out.println("rest===========>"+url+api_path);
		try {
			context = HttpTools.get(url+api_path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("rest·µ»Ø===========>"+context);
		return context;
	}
}
