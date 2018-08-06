package com.sky.hg.entity;

import java.io.Serializable;

public class UserEntity implements Serializable{

	private static final long serialVersionUID = 3961620017436438470L;
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
