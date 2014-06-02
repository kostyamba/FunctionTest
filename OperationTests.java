import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class OperationTests {
	@Test
	public void testAddition(){
		Integer result = new Integer(4);
		assertEquals(result,(Number)4); 

		assertEquals(result, new Integer(4)); //true
	
		assertEquals(new Integer(20), (new Addition()).apply(1,19)); //true
	}

	@Test
	public void testSubtraction(){
		Integer result = new Integer(46);

		assertEquals(result, (new Subtraction()).apply(99,53)); //true
	}

	@Test
	public void testMultiplication(){
		Integer result = new Integer(12);

		assertEquals(result, (new Multiplication()).apply(6,2)); //true
	}

	@Test
	public void testStep(){
		Integer result = new Integer(81);

		assertEquals(result, (new Step()).apply(3,4)); //true
	}

	@Test
	public void testAlwaysPassed(){
		assertTrue(true);
	}
}
