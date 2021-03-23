package com.goldman.longestparlindrom.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/*
 * By: Sherry Wang
 * 03/22/2021
 * 
 * JUnit tests to test the LongestParlindromProcessor
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class LongestParlindromProcessorTest {
	
	@Autowired
	LongestParlindromProcessor lpProcessor;

	@Test
	public void testCase1() {
		/*
		 * General Test Case 1:
		 * input: accacbaa
		 * output: acca
		 */
		Assertions.assertEquals(lpProcessor.findLongestParlindrom("accacbaa"), "acca");
	}
	
	@Test
	public void testCase2() {
		/*
		 * General Test Case 2: whole string is parlindrom
		 * input: aaaaa
		 * output: aaaaa
		 */
		Assertions.assertEquals(lpProcessor.findLongestParlindrom("aaaaa"), "aaaaa");
	}
	
	
	@Test
	public void testCase3() {
		/*
		 * General Test Case 3:
		 * input: aabaaccaabaac
		 * output: caabaac
		 */
		Assertions.assertEquals(lpProcessor.findLongestParlindrom("aabaaccaabaac"), "aabaaccaabaa");
	}
	
	@Test
	public void testCase4() {
		/*
		 * General Test Case 4: two parindrome substrings with same length, return the last one 
		 * input: cbbcandtvvt
		 * output: tvvt
		 */
		Assertions.assertEquals(lpProcessor.findLongestParlindrom("cbbcandtvvt"), "tvvt");
	}
	
	@Test
	public void testCase5() {
		/*
		 * General Test Case 5: single char
		 * input: a
		 * output: a
		 */
		Assertions.assertEquals(lpProcessor.findLongestParlindrom("a"), "a");
	}
	
	
	@Test
	public void testCase6() {
		/*
		 * General Test Case 6: blank space
		 * input: " "
		 * output: " "
		 */
		Assertions.assertEquals(lpProcessor.findLongestParlindrom(" "), " ");
	}
	

	@Test
	public void testCase7() {
		/*
		 * General Test Case 7: string with space in it
		 * input: hello ollaa
		 * output: llo oll
		 */
		Assertions.assertEquals(lpProcessor.findLongestParlindrom("hello ollaa"), "llo oll");
	}
	
	@Test
	public void testCase8() {
		/*
		 * General Test Case 8: no parlindrom substring longer than 2, return the last digit
		 * input: asdghk
		 * output: "k"
		 */
		Assertions.assertEquals(lpProcessor.findLongestParlindrom("asdghk"), "k");
	}
	
}
