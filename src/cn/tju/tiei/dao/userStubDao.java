package cn.tju.tiei.dao;

import java.util.HashMap;
import java.util.Map;

import cn.tju.tiei.model.user;

public class userStubDao implements IUserDao {
	private Map<String,user> us =new HashMap<String, user> ();
	
	@Override
	public void add(user user){
		us.put(user.getUsername(), user);
	}
	
	@Override
	public user load(String username){
		return us.get(username);
	}
	
	@Override
	public void delete(String username){
		us.remove(username);
	}
}
