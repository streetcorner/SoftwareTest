package cn.tju.tiei.service;

import cn.tju.tiei.model.*;

import static org.junit.Assert.*;

import org.junit.*;

public class testUserService {
	private IUserService us;
	private user baseUser,superUser;
	@Before
	public void setUp(){
		//初始化
		//us = new UserServiceByMap();
//		us = new UserServiceNull();
		
		us = new userService();
		baseUser = new user("Admin","123","管理员");
		superUser = new user("superadmin","123","超级管理员");
	}
	
	private void assertUserEquals(user tu, user u){
		assertEquals(tu.getUsername(), u.getUsername());
		assertEquals(tu.getPassword(), u.getPassword());
		assertEquals(tu.getNickname(), u.getNickname());
	}
	
	@Test
	public void testAdd(){
		
		us.add(baseUser);
		user tu = us.load("Admin");
		assertUserEquals(tu,baseUser);
		us.delete("Admin");
			
	}
	
	@Test(expected=userException.class)
	public void testAddExistUsername(){
		us.add(baseUser);
		user tu = new user("Admin","123","test");
		us.add(tu);	
		
	}
	
	@Test
	public void testDelete(){
		us.add(baseUser);
		user tu = us.load(baseUser.getUsername());
		assertNotNull(tu);
		us.delete(baseUser.getUsername());
		tu = us.load(baseUser.getUsername());
		assertNull(tu);
		
	}
	
	@Test
	public void testDeleteSA(){
		us.add(superUser);
		user tu = us.load("superadmin");
		assertNotNull(tu);
		us.delete("superadmin");
		user u = us.load("superadmin");
		assertNotNull(u);
	}
	

	
	@Test
	public void testLogin(){
		us.add(baseUser);
		String username = "Admin";
		String password = "123";
		user tu = us.login(username, password);
		assertUserEquals(tu, baseUser);
		us.delete("Admin");
	}
	
	@Test(expected=userException.class)
	public void testNotExistsUserLogin(){
		us.add(baseUser);
		String username="admin1";
		String password = "123";
		us.login(username, password);
	}
	
	@Test(expected=userException.class)
	public void testPasswordErrorUserLogin(){
		us.add(baseUser);
		String username="Admin";
		String password="1234";
		us.login(username, password);
	}

}
