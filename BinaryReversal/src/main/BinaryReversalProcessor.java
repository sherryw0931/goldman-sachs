package main;


/*
 * By: Sherry Wang
 * 03/23/2021
 * 
 * Main logic perform the task
 */


public class BinaryReversalProcessor {
	
	private static BinaryReversalProcessor brpInstance = null;
	
	private BinaryReversalProcessor() { }
	
	public static BinaryReversalProcessor getInstance () {
		if (brpInstance == null) {
			brpInstance = new BinaryReversalProcessor();
		}
		return brpInstance;
	}
	
	// main function to call. Takes a numeric string as input, return a numeric string after reversing
	public String binaryReversal(String str) {
		str = inputValidator(str);
		return reverseBinary(str);
	}
	
	
	// check whether input string is a numeric
	public boolean isNumeric(String str){
		str = str.trim();
		if (str == null || str.length() == 0) { return false; }
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) { return false; }
		}
		return true;
	}
	
	
	/*  check whether the input is valid. Return 8-digits binary if valid, throw exception if not.
	 *  valid condition:
	 *  1. Input string is a positive numeric;
	 *  2. The binary of numeric can not exceed 8 digits, which is 11111111 --> 255
	 */
	public String inputValidator(String str) {
		if (!isNumeric(str)) {
			throw new IllegalArgumentException("Input Invalid: Input must be numeric!");
		}
		int num = Integer.parseInt(str);
		if (num <= 0 || num > 255) {
			throw new IllegalArgumentException("Input Invalid: Input should be positive and no greater than 255");
		}
		return Integer.toBinaryString(num);
	}
	
	
	/* reverse the binary and return a numeric string.
	 * If length shorter than 8, append 0's to the end after reversing
	 */
	public String reverseBinary(String binary) {
		binary = new StringBuilder(binary).reverse().toString();
		int reversed =  Integer.parseInt(binary, 2) << (8-binary.length());
		return String.valueOf(reversed);
	}

}
