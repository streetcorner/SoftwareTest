package cn.tju.tiei.service;

import cn.tju.tiei.model.*;

public interface IUserService {
	
	public void add(user user);
	
	public user load(String username);
	
	public void delete(String username);

	public user login(String username, String password);
}
