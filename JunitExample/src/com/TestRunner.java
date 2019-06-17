package com;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Result res=JUnitCore.runClasses(TestJUnit2.class);
		
		for (Failure fal:res.getFailures())
		{
			System.out.println(fal.toString());
		}
		
		
		System.out.println(res.wasSuccessful());
	

*/
		
		TestSuite s= new TestSuite(TestJUnit.class,TestJUnit2.class);
		TestResult res=new TestResult();
		s.run(res);
		
		System.out.println("Number of test cases in this suite="+res.runCount());
	}

}
