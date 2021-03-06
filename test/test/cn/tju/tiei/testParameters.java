package cn.tju.tiei;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class testParameters {
	private int input1;
	private int input2;
	private int result;
	private Calculator cal;
	
	@Before
	public void setup(){
		cal=new Calculator();
	}
	public testParameters(int input1, int input2, int result){
		this.input1=input1;
		this.input2= input2;
		this.result= result;
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{1, 1, 2},
			{2, 3, 5},
			{3, 5, 8}
		});
	}
	
	@Test
	public void testAdd(){
		assertEquals(this.result,cal.add(input1,input2));
	}
}
