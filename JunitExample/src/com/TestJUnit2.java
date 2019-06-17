package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestJUnit2 extends TestCase {

		protected double fvalue1;
		protected double fvalue2;
		
		@Before
	public	void setUp() {
		fvalue1= 1.0;
		fvalue2= 2.0;
			}
		
		
		@Test
		public void testAdd() {
			
			System.out.println("no of test cases"+this.countTestCases());
			
			String name=this.getName();
			System.out.println("test case name="+name);
			
			this.setName("testNewAdd");
			String name1= this.getName();
			System.out.println("Test Case name="+name1);
		
	}
		
		public void teardown()
		{
			
		}

}
