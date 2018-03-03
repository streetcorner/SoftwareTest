package cn.tju.tiei.service;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Test;

import cn.tju.tiei.dao.IUserDao;
import cn.tju.tiei.model.user;
import cn.tju.tiei.util.EntitiesHelper;

public class TestEasyMockSingle {

	
	@Test
	public void testLoadMock(){
		//实例化借口
		IUserDao ud= EasyMock.createStrictMock(IUserDao.class);
		user u= new user(1,"admin","123","管理员");
				
		
		ud.delete("abc");
		EasyMock.expectLastCall();
		
		EasyMock.expect(ud.load("admin")).andReturn(u);
		
		//测试阶段
		EasyMock.replay(ud);
		
		IUserService us= new userService(ud);
		user tu= us.load("admin");
		EntitiesHelper.assertUser(tu, u);
		
		EasyMock.verify(ud);
	}

}
