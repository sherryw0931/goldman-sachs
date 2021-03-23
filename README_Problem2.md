# BinaryReversal

### Problem Statement

Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive integer, take its binary representation (padded to the nearest N * 8 bits), reverse that string of bits, and then finally return the new reversed string in decimal form. For example: if str is "47" then the binary version of this integer is 101111 but we pad it to be 00101111. Your program should reverse this binary string which then becomes: 11110100 and then finally return the decimal version of this string, which is 244.


### Assumption

1. Input String must be numeric, otherwise will throw a IllegalArgumentException
2. Input String must be postive (> 0), otherwise will throw a IllegalArgumentException
3. Input String's binary must not exceed 8 digits, i.e. max would be 1111 1111, which is 255, otherwise will throw a IllegalArgumentException


### Approach

1. Implement a BinaryReversalProcessor class, which is designed as a singleton.
2. Within the class develop methods as follows:

      2.1 boolean isNumeric(String str): check whethe the input string is numeric

      2.2 String inputValidator(String str): check whether the input is valid (see assumptions 2 & 3). Return 8-digits binary if valid, throw exception if not.

      2.3 String reverseBinary(String binary): take a binary as input, padded to 8 digits, reverse and return corresponding numeric string.

      2.4 String binaryReversal(String str): Integration methods above, complete logic to provide the solution
     
3. With Driver Class, take the input from command using Scanner and output the result or throw the Exception


### File Description:
1. src/main/App.java: Main Mehtods to run
2. src/main/BinaryReversalProcessor.java: Main logic to provide the solution
3. src/test/BinaryReversalProcessorTests.java: all the test cases to test the functionality


### Sample Test Cases:
1. Input: "47" (10 1111) --->  0010 1111 Output: ---> "244" (1111 0100)
2. Input: "75" (100 1011) --->  0100 1011 Output: ---> "210" (1101 0010)
