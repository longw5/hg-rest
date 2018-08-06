package com.sky.hg.restful;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sky.hg.entity.UserEntity;

@Path("/user")
public class UserService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "hello world";
	}
	
	@GET
	@Path("/{username}")
	@Produces("text/plain;charset=utf-8")
	public String sayByPath(@PathParam("username") String username){
		
		return "hello "+username;
	}
	
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserEntity> sayByParamJson(@QueryParam("usr") String username,
									@QueryParam("id") int id){
		
		UserEntity user = new UserEntity();
		user.setId(id);
		user.setName(username);
		
		UserEntity user1 = new UserEntity();
		user1.setId(2);
		user1.setName("liuxiaolu");
		
		List<UserEntity> list = new ArrayList<UserEntity>();
		list.add(user);
		list.add(user1);
		
		return list;
	}
	
	
	public static void main(String[] args) {
		double d = 12.00;
		System.out.println(d);
	}
}
