package cn.tju.tiei.util;

import cn.tju.tiei.model.user;
import static org.junit.Assert.*;

public class EntitiesHelper {
	private static user baseUser =new user(1,"admin","123","管理员");
			
			
	public static void assertUser(user expected, user actual){
		assertNotNull(expected);
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getUsername(), actual.getUsername());
		assertEquals(expected.getPassword(), actual.getPassword());
		assertEquals(expected.getNickname(), actual.getNickname());
		
	}
	public static void assertUser(user expected){
		assertUser(expected, baseUser);
	}

}
