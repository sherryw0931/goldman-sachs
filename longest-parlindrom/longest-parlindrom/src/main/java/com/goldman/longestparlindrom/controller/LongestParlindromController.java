package com.goldman.longestparlindrom.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.goldman.longestparlindrom.dto.LongestParlindrom;
import com.goldman.longestparlindrom.service.LongestParlindromServiceImpl;


/*
 * By: Sherry Wang
 * 03/22/2021
 * 
 * Rest Controller to handle http get/post request
 */



@RestController
public class LongestParlindromController {
	
	@Autowired
	private LongestParlindromServiceImpl lpServiceImpl;
	
	@RequestMapping("/")
	public List<LongestParlindrom> findLongestParlindrom() {
		return lpServiceImpl.getAllPairs();
	}
	
	@RequestMapping("/{originStr}")
	public Optional<LongestParlindrom> getLongestParlindrom(@PathVariable String originStr) {
		return lpServiceImpl.getLongestParlindrom(originStr);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public void addLongestParlindrom(@RequestBody String originStr) {
		lpServiceImpl.addLongestParlindrom(originStr);
	}

}
