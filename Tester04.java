import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("'Test 04' Unit Testing")
class Tester04 {
	
	//Normal Cases
	@Test
	@DisplayName("Test 01")
	void test01() throws Throwable {
		System.out.println("--- TEST 01 ---");
		int unPairedNum = 4;
		int[] list = {1, 2, 4, 2, 1};
		assertEquals(Test04.findUnpaired(list), unPairedNum);
		System.out.println("\n");
	}
	
	@Test
	void test02() throws Throwable {
		System.out.println("--- TEST 02 ---");
		int unPairedNum = 4;
		int[] list = {1, 2, 1, 2, 4};
		assertEquals(Test04.findUnpaired(list), unPairedNum);
		System.out.println("\n");
	}


	@Test
	void test03() throws Throwable {
		System.out.println("--- TEST 03 ---");
		int unPairedNum = 4;
		int[] list = {1, 1, 2, 2, 4};
		assertEquals(Test04.findUnpaired(list), unPairedNum);
		System.out.println("\n");
	}
	
	@Test
	void test04() throws Throwable {
		System.out.println("--- TEST 04 ---");
		int unPairedNum = 4;
		int[] list = {1, 1, 4};
		assertEquals(Test04.findUnpaired(list), unPairedNum);
		System.out.println("\n");
	}
	
	@Test
	void test05() throws Throwable {
		System.out.println("--- TEST 05 ---");
		int unPairedNum = 4;
		int[] list = {4, 1, 1};
		assertEquals(Test04.findUnpaired(list), unPairedNum);
		System.out.println("\n");
	}

	//Fails
	@Test
	void testFail01() throws Throwable {
		System.out.println("--- TEST EXCEPTIONS 01 ---");
		int unPairedNum = 4;
		int[] list = {1, 1, 2, 2};
		
		Exception exception = assertThrows(Exception.class, () -> Test04.findUnpaired(list));
		assertEquals("Array not an odd size", exception.getMessage());
		System.out.println("\n");
	}

}
