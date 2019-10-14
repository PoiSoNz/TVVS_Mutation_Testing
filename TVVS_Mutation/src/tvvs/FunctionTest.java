package tvvs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;


public class FunctionTest {
	
	private Functions instance = new Functions();
	
	@Test
	public void test_func1() {
		assertEquals(-2, instance.func1(2, 3, 0));
	}
	
	@Test
	@Ignore
	public void test_func2() {
		MutableInt a = new MutableInt(5);
		instance.func2(a, 3, true, 2);
		assertEquals(11, a.getInt());
	}
	
	@Test
	@Ignore
	public void test_func3() {
		assertTrue(instance.func3(true, false, true));
	}
	
	@Test
	@Ignore
	public void test_func4() {
		assertEquals(40, instance.func4(4, 1, 3, 40));
	}
	
	@Test
	@Ignore
	public void test_func5() {
		assertEquals(6, instance.func5(1, 5, 1, 1));
		assertEquals(6, instance.func5(-1, 5, -1, -1));
	}
	
	@Test
	@Ignore
	public void test_fibonacci() {
		assertEquals(1, instance.nth_fibonacci_num(1));
	}
	
}
