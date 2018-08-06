package com.sky.hg.restful;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/login")
public class LoginService {
	
	@Path("currentUser")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map currentUser(){
		Map map = new HashMap();
		map.put("name", "ÃÏ‘∆");
		map.put("avatar", "./favicon.png");
		map.put("userid", "00000001");
		map.put("notifyCount", "0");
		return map;
	}

	@Path("account")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map account(){
		Map map = new HashMap();
		map.put("status", "ok");
		map.put("type", "user");
		map.put("currentAuthority", "admin");
		return map;
	}
	
}
