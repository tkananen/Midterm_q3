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
		
		
		// This code makes sure that the program returns True.
		
		assertTrue("If this message shows, return true does not return true", c.ReturnTrue());
		
		//This code will fail.  assertFalse checks to see if whatever is in the argument evaluates to false.
		// Since returnTrue returns true, this test will fail.  It shows that returnTrue does not return false.
		
		assertFalse("If this message shows, ReturnTrue does not return False", c.ReturnTrue());
		
		
		
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
		
		// This line tests to see if the code actually returns the correct sum.
		
		assertTrue("If this message shows, num1 + num2 != correctSum", correctSum == MyClass.AddTwoNumbers(num1,  num2));
		
		
		// This test will purposefully fail.  This will test if two number added together will return a sum.  
		//Since the false sum will not equal the sum of the two numbers, it will produce a failure.  If there was no 
		// failure, the false numbers would add to an incorrect sum.  THIS IS PURPOSELY SUPPOSED TO FAIL.
		
		assertTrue("If this message shows, falsenum1 + falsenum2 do not equal falseSum", falseSum == d.AddTwoNumbers(falsenum1,  falsenum2)) ;
		
		
		
		
		
	}
	

}
