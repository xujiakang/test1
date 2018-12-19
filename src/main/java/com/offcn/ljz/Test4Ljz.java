package com.offcn.ljz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.mapper.ShiroUserMapper;
import com.offcn.pojo.ShiroUser;

@Service
public class Test4Ljz {
	
	@Autowired
	private ShiroUserMapper shiroUserMapper;
	
	public void addShiroUser() {
		ShiroUser su = new ShiroUser();
		su.setId(110);
		su.setUserName("李加真");
		su.setPassword("123456");
		System.out.println("ahhhahahhahah");
		System.out.println("zzzzzzzzzzzzz");
		shiroUserMapper.insert(su);
	}
	
	public void deleteUser() {
		System.out.println("ssssssssss");
	}
}
