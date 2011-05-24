package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.User;

public class UserService {
	public List getUsers(){
		List users = new ArrayList();
		for(int i=0;i<10;i++){
			User user = new User();
			user.setId(i+"");
			user.setUsername(i+"user");
			user.setPassword(i+"pass");
			user.setSex("男");
			user.setAddress(i+"bj");
			user.setFavorite(i+"");
			users.add(user);
		}
		return users;
	}
}
