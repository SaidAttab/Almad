package ca.said.firstTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ca.said.first.Calculator;
import ca.said.first.CalculatorImpl;

public class CalculatorImplTest {

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDevide() {

	    Calculator calc = new CalculatorImpl();
	    int a, b, res;
	    a = 5; 
	        b  = 0; 
	        res = a / b;
	    if (calc.divide(a, b) != res) {
	        fail("a et b positif");
	        }
	    a = 0; 
	        b  = 5; 
	        res = a / b;
	    if (calc.divide(a, b) != res) {
	        fail("a nul");
	        }
	    a = -5; 
	        b  = 5; 
	        res = a / b;
	    if (calc.divide(a, b) != res) {
	        fail("a negatif");
	        }
	    a = 5; 
	        b  = -5; 
	        res = a / b;
	    if (calc.divide(a, b) != res) {
	        fail("b negatif");
	        }
	    a = -5; 
	        b  = -5; 
	        res = a / b;
	    if (calc.divide(a, b) != res) {
	        fail("a et b negatif");
	        }
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivideByZero() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5; 
	        b  = 0; 
	        res = 0;
		if (calc.divide(a, b) != res) {
			fail("b nul");
	        }
		a = 0; 
	        b  = 0; 
	        res = 0;
		if (calc.divide(a, b) != res) {
			fail("a et b nuls");
	        }
	}

	@Test
	public void testAdd() {
		Calculator calc = new CalculatorImpl();
		
		int a, b, res;
		
		a = 5;
		b = 5;
		res = a + b;
		assertTrue("a et b positifs", calc.add(a, b) == res);
		
//		if(calc.add(a, b) != res){fail("a et b positifs");}
		
		a = 0;
		b = 5;
		res = a + b;
		
		if(calc.add(a, b) != res){
			fail("a null");
		}
		
		a = 5;
		b = 0;
		res = a + b;
		
		if(calc.add(a, b) != res){
			fail("b null");
		}
		
		a = 0;
		b = 0;
		res = a + b;
		
		if(calc.add(a, b) != res){
			fail("a et b nulls");
		}
		
		a = -5;
		b = 5;
		res = a + b;
		
		if(calc.add(a, b) != res){
			fail("a negatif");
		}
		
		a = 5;
		b = -5;
		res = a + b;
		
		if(calc.add(a, b) != res){
			fail("b negatif");
		}
		
		a = -5;
		b = -5;
		res = a + b;
		
		if(calc.add(a, b) != res){
			fail("a et b negatifs");
		}
	}

	@Test
	public void testSubstract() {
		fail("Not yet implemented");
	}

}
