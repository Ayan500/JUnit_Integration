package junit_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest { 
	
	@Test
	public void simpleTestPass(){
		int a=1; 
		int b=2;
		assertTrue(a + b ==3);
		
	}
	@Test
	public void simpleTestFail(){
		int a=2; 
		int b=2;
		assertTrue(a + b ==4);
		
	}
	@Test
	public void simpleTestnull(){
		int a=3; 
		int b=2;
		
		assertNotNull(a);
		
	}

	@Test
	public void simpleTesttrue(){
		int a=-3; 
		int b=2;
	
		assertTrue(a>0);
		
		
	}
}
