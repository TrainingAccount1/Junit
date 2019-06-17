package com;



import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestJUnit {

	/*String message="Hello World";
	
	MessageUtil obj= new MessageUtil(message);
	
	@Test
	public void testprintMessage()
	{
	
		assertEquals("Hello", obj.printMessage());
	}*/
	
	
	int num=5;
	
	String temp=null;
	
	String str="Hai";
	
	@Test
	public void testAdd() {
		assertEquals("Hai",str);
		System.out.println(str);
		
		
		assertFalse(num>8);
		System.out.println(num);
		
		
		assertTrue(num<8);
		
		assertNotNull(str);
		
		
	}
		
}
