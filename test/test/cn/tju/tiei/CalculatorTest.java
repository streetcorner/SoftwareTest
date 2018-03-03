package cn.tju.tiei;

import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {
	
	//before看作构造函数
	//beforeclass是构造之前，析构之后
	@Before
	public void setUp(){
		//ca=new Calculator();
		System.out.println("TestBefore");
	}
	
	
	@Test
	public void testAdd(){
		Calculator cal =new Calculator();
		assertEquals(2, cal.add(1,1));
		System.out.println("Test-------------Add");
	}
	
	@Test
	public void testMinus(){
		Calculator cal =new Calculator();
		assertEquals(2, cal.minus(5,3));
	}
	
	@Test
	public void testDivide(){
		Calculator cal =new Calculator();
		assertEquals(2, cal.divide(6,3));
	}
	
	@After
	public void tearDown(){
		System.out.println("TestDown");
	}
}
