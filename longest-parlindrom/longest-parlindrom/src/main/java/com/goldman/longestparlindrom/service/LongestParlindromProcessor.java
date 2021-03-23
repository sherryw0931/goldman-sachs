package com.goldman.longestparlindrom.service;


import org.springframework.stereotype.Service;
import com.goldman.longestparlindrom.dto.LongestParlindrom;


/*
 * By: Sherry Wang
 * 03/22/2021
 * 
 * Main logic to find the longest palindrome of a string.
 * Take a string as input and returns a LongestParlindrom Object
 */



@Service
public class LongestParlindromProcessor {

	
	public LongestParlindrom getResult(String input) {
		LongestParlindrom lp = new LongestParlindrom();
		lp.setOriginal(input).setLongestParlindrom(findLongestParlindrom(input));
		return lp;
	}

	public String findLongestParlindrom(String str) {
		if (str.length()<2) { return str; }
		int n = str.length();
		String res = "";
		boolean[][] dp = new boolean[n][n];
		for (int i = n-1; i>=0; i--) {
			for (int j=i; j<n; j++) {
				dp[i][j] = str.charAt(i) == str.charAt(j) 
						&& (j - i < 3 || dp[i + 1][j - 1]);
				if (dp[i][j] && (res == "" || j - i + 1 > res.length())) {
					res = str.substring(i, j + 1);
				}
			}
		}
		return res;
	}
	

}
