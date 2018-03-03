package cn.tju.tiei.dao;

import cn.tju.tiei.model.user;

public interface IUserDao {
	
	public void add(user user);
	
	public user load(String username);
	
	public void delete(String username);
}
