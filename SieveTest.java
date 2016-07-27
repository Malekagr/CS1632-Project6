import static org.junit.Assert.*;

import org.junit.Test;

public class SieveTest {

	/*
	 * Checks that an argument is properly thrown when 
	 * an argument of size 0 is passed. If not, the test is failed.
	 */
	
	@Test
	public void calculateMaxTest1() {
		String[] args =new String[0];
		try {
			Sieve.calculateMax(args);
			fail();
		    } catch (IllegalArgumentException iex) { 

		    }
	}
	/*
	 * If an argument that should pass (an array of size 1, with
	 * its contents being an int) is given to the function,
	 * then no exceptions should be caught. If an exception is caught
	 * the test is failed.
	 */
	@Test
	public void calculateMaxTest2() {
		String[] args = new String[1];
		args[0] = "5";
		try {
			Sieve.calculateMax(args);
			
		    } catch (IllegalArgumentException iex) { 
		    	fail();
		    }
	}

}
