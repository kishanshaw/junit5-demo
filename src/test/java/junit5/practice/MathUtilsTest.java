package junit5.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeAllMethods() {
		System.out.println("Inside the beforeAllMethods");
	}
	
	@AfterAll
	static void afterAllMethods() {
		System.out.println("Inside the afterAllMethods");
	}
	
	@BeforeEach
	void init(){
		mathUtils = new MathUtils();
	}
	
	@Nested
	class AddTest{
		
		@Test
		@DisplayName("Testing the add method")
		public void testAdd() {
			int expectedValue = 3;
			int actualValue = mathUtils.add(1, 2);
			assertEquals(expectedValue, actualValue, "The values are added!!");
		}
	
	}
	
	@Test
	@DisplayName("Testing the subtract method")
	public void testSubtract() {
		int expectedValue = -1;
		int actualValue = mathUtils.subtract(2, 3);
		assertEquals(expectedValue, actualValue, "The values are subtracted!!");
		
	}

}
