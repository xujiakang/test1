package com.offcn.sc.impl;

import org.springframework.stereotype.Service;

import com.offcn.pojo.ShiroUser;
import com.offcn.sc.ScService;

@Service
public class ScServiceImpl implements ScService {
	
	public void addUser() {
	 
		ShiroUser shiroUser = new ShiroUser();
		shiroUser.setId(null);
		shiroUser.setUserName("sfdsf");
		shiroUser.setPassword("dsfds");
		
		
		
	}

	public void add() {
		System.out.println("��������Ц��");
		
	}
	
	public void deleteUser() {
		System.out.println("123");
		
	}

}
