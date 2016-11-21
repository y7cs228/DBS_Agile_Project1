package test;

import core.RPNcalc;
import junit.framework.TestCase;

public class test_cases extends TestCase {
	
	public void testcase1(){
		String expr = "2,3,+";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(5,rpncalc.Calculate(expr));		
	}

	public void testcase2(){
		String expr = "3,2,-";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(-1,rpncalc.Calculate(expr));		
	}
	
	public void testcase3(){
		String expr = "2,3,*";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(6,rpncalc.Calculate(expr));		
	}
	
	public void testcase4(){
		String expr = "2,5,/";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(2,rpncalc.Calculate(expr));		
	}
	
	public void testcase5(){
		String expr = "2,5,%";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(1,rpncalc.Calculate(expr));		
	}
	
	public void testcase6(){
		String expr = "2,5,+,3,+";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(10,rpncalc.Calculate(expr));		
	}
	public void testcase7(){
		String expr = "2,5,+,2,*";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(14,rpncalc.Calculate(expr));		
	}
	public void testcase8(){
		String expr = "2,5,-,2,*";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(6,rpncalc.Calculate(expr));		
	}
	public void testcase9(){
		String expr = "2,5,*,2,*";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(20,rpncalc.Calculate(expr));		
	}
	public void testcase10(){
		String expr = "";
		RPNcalc rpncalc = new RPNcalc();
		assertEquals(0,rpncalc.Calculate(expr));		
	}
}
