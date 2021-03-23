package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.BinaryReversalProcessor;

class BinaryReversalProcessorTests {
	
	BinaryReversalProcessor brp = BinaryReversalProcessor.getInstance();

	@Test
	public void isNumericTest1() {
		/*
		 * Test Case 1: test the functionality of judging whether a input is numeric
		 * input 1: 23
		 * output: true
		 */
		Assertions.assertEquals(brp.isNumeric("23"), true);
	}

	@Test
	public void isNumericTest2() {
		/*
		 * Test Case 2: test the functionality of judging whether a input is numeric
		 * input 2: 2 3
		 * output: false
		 */
		Assertions.assertEquals(brp.isNumeric("2 3"), false);
	}
	
	
	@Test
	public void isNumericTest3() {
		/*
		 * Test Case 3: test the functionality of judging whether a input is numeric
		 * input 3: " 23 ", can ignore the spaces at two ends 
		 * output: true
		 */
		Assertions.assertEquals(brp.isNumeric(" 23 "), true);
	}
	
	
	@Test
	public void isNumericTest4() {
		/*
		 * Test Case 4: test the functionality of judging whether a input is numeric
		 * input 4: " " single space
		 * output: false
		 */
		Assertions.assertEquals(brp.isNumeric(" "), false);
	}
	
	
	@Test
	public void isNumericTest5() {
		/*
		 * Test Case 5: test the functionality of judging whether a input is numeric
		 * input 5: "" empty
		 * output: false
		 */
		Assertions.assertEquals(brp.isNumeric(""), false);
	}
	
	
	@Test
	public void isNumericTest6() {
		/*
		 * Test Case 6: test the functionality of judging whether a input is numeric
		 * input 6: "abid"
		 * output: false
		 */
		Assertions.assertEquals(brp.isNumeric("abid"), false);
	}
	
	
	@Test
	public void inputValidatorTest1() {
		/*
		 * Test Case 7: when input is not numeric
		 * input 1: "abcd"
		 * output: should throw illegalArgumentException
		 */
		System.out.println(
				"should throw illegalArgumentException if input is not numeric" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> brp.inputValidator("abcd"));
	}
	
	
	@Test
	public void inputValidatorTest2() {
		/*
		 * Test Case 8: when input is negative 
		 * input 2: -13
		 * output: should throw illegalArgumentException
		 */
		System.out.println(
				"should throw illegalArgumentException if input is negative" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> brp.inputValidator("-13"));
	}
	
	
	@Test
	public void inputValidatorTest3() {
		/*
		 * Test Case 9: when input is 0 
		 * input 3: 0
		 * output: should throw illegalArgumentException
		 */
		System.out.println(
				"should throw illegalArgumentException if input is 0" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> brp.inputValidator("0"));
	}
	
	
	@Test
	public void inputValidatorTest4() {
		/*
		 * Test Case 10: when the binary of input is longer than 8 digits 
		 * input 4: 256
		 * output: should throw illegalArgumentException
		 */
		System.out.println("256 to binary: " + Integer.toBinaryString(256));
		System.out.println(
				"should throw illegalArgumentException if the binary of input longer than 8 digits" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> brp.inputValidator("256"));
	}
	
	
	@Test
	public void inputValidatorTest5() {
		/*
		 * Test Case 11: when the binary of input is valid
		 * input 5: 47  
		 * output: 101111
		 */
		System.out.println("47 to binary: " + Integer.toBinaryString(47));
		Assertions.assertEquals(brp.inputValidator("47"), "101111");
	}
	
	
	@Test
	public void reverseBinaryTest1() {
		/*
		 * Test Case 12: test the functionality to pad the binary string to 8 digits and reverse
		 * input 1: 101111 (47)  --> 00101111  
		 * output: 244  <-- 11110100
		 */
		System.out.println("244 to binary: " + Integer.toBinaryString(244));
		Assertions.assertEquals(brp.reverseBinary("101111"), "244");
	}
	
	
	@Test
	public void reverseBinaryTest2() {
		/*
		 * Test Case 13: test the functionality to pad the binary string to 8 digits and reverse
		 * input 2: 1001011 (75)  --> 01001011  
		 * output: 210  <-- 11010010
		 */
		System.out.println("210 to binary: " + Integer.toBinaryString(210));
		Assertions.assertEquals(brp.reverseBinary("1001011"), "210");
	}
	
	
	@Test
	public void binaryReversalTest1() {
		/*
		 * Test Case 14: test the integrated functionality
		 * input 1: 47 
		 * output: 244
		 */
		Assertions.assertEquals(brp.binaryReversal("47"), "244");
	}
	
	
	@Test
	public void binaryReversalTest2() {
		/*
		 * Test Case 14: test the integrated functionality
		 * input 1: 75 
		 * output: 210
		 */
		Assertions.assertEquals(brp.binaryReversal("75"), "210");
	}
	
	
	
	
}
