package q3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTestFile {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public  void utReturnTrueTest() {
		MyClass c = new MyClass();
		
		
		
		assertTrue("If this message shows, return true does not return true", c.ReturnTrue());
		
		
		assertFalse("If this message shows, ReturnTrue does not equal False", c.ReturnTrue());
		
		
		
	}
	@Test
	public   void utReturnAddTwoNumbers(){
		MyClass d = new MyClass();
		
		int correctSum = 5;
		int num1 = 2;
		int num2 = 3;
		MyClass.AddTwoNumbers(num1, num2);
		int falseSum = 6;
		int falsenum1 = 4;
		int falsenum2 = 5;
		
		assertTrue("If this message shows, num1 + num2 != correctSum", correctSum == MyClass.AddTwoNumbers(num1,  num2));
		
		assertTrue("If this message shows, falsenum1 + falsenum2 do not equal falseSum", falseSum == d.AddTwoNumbers(falsenum1,  falsenum2)) ;
		
		
		
		
		
	}
	

}
