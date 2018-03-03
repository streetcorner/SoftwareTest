package cn.tju.tiei.service;

import cn.tju.tiei.dao.*;
import cn.tju.tiei.model.*;

public class userService implements IUserService {
	
private IUserDao userDao;
	
	public userService(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	public userService() {
//		通过Stub进行模拟，生成Map对象
		userDao = new userStubDao();
		
		//通过数据库连接，生成数据库DAO对象
		//userDao = new UserDao();	
		
	}

	@Override
	public void add(user user) {
		if(load(user.getUsername())!=null)
			throw new userException("用户名已经存在");
		userDao.add(user);
	}

	@Override
	public void delete(String username) {
		if(username=="superadmin")
			return; 
			
		userDao.delete(username);
	}

	@Override
	public user load(String username) {
	
//		userDao.load("asd");
		userDao.delete("abc");
//		userDao.load(username);
		return userDao.load(username);
	}

	@Override
	public user login(String username, String password) {
		user u = load(username);
		if(u==null) throw new userException("用户名不存在");
		if(!u.getPassword().equals(password)) throw new userException("用户密码不存在");
		return u;
	}


}