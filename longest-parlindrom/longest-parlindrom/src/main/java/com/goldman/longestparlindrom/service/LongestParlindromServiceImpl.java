package com.goldman.longestparlindrom.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.goldman.longestparlindrom.dto.LongestParlindrom;
import com.goldman.longestparlindrom.repository.LongestParlindromRepo;


/*
 * By: Sherry Wang
 * 03/22/2021
 * 
 * Service Implementation to implement the functions provided in LongestParlindromService interface
 */



@Service
public class LongestParlindromServiceImpl implements LongestParlindromService {
	
	@Autowired
	private LongestParlindromRepo lpRepo;
	
	// service to process the input string and return a LongestParlindrom Object
	private LongestParlindromProcessor lpProcessor;
	
	@Autowired
	private void setLpProcessor(LongestParlindromProcessor lpProcessor) {
		this.lpProcessor = lpProcessor;
	}

	@Override
	public List<LongestParlindrom> getAllPairs() {
		return lpRepo.findAll();
	}
	
	@Override
	public Optional<LongestParlindrom> getLongestParlindrom(String originStr) {
		return lpRepo.findById(originStr);
	}

	@Override
	public void addLongestParlindrom(String originStr) {
		lpRepo.save(lpProcessor.getResult(originStr));
	}
}
