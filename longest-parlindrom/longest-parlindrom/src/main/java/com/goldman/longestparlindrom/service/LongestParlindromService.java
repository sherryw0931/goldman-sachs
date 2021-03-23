package com.goldman.longestparlindrom.service;


import java.util.List;
import java.util.Optional;
import com.goldman.longestparlindrom.dto.LongestParlindrom;



/*
 * By: Sherry Wang
 * 03/22/2021
 * 
 * service interface to provide functions to handle the requests
 */


public interface LongestParlindromService {

	public List<LongestParlindrom> getAllPairs();
	
	public Optional<LongestParlindrom> getLongestParlindrom(String originStr);

	public void addLongestParlindrom(String originStr);


}
