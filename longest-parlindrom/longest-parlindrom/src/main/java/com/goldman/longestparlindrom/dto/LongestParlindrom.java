package com.goldman.longestparlindrom.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;


/*
 * By: Sherry Wang
 * 03/22/2021
 * 
 * Data Object. Consist of two fields, the original string and its longest palindrome
 */


@Component
@Entity
public class LongestParlindrom {
	
	@Id
	private String original;
	private String longestParlindrom;
	
	public LongestParlindrom() {
		
	}

	public LongestParlindrom(String original, String longestParlindrom) {
		this.original = original;
		this.longestParlindrom = longestParlindrom;
	}


	public String getOriginal() {
		return original;
	}

	public LongestParlindrom setOriginal(String original) {
		this.original = original;
		return this;
	}

	public String getLongestParlindrom() {
		return longestParlindrom;
	}

	public LongestParlindrom setLongestParlindrom(String longestParlindrom) {
		this.longestParlindrom = longestParlindrom;
		return this;
	}
	
	
}
