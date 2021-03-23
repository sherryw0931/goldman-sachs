package com.goldman.longestparlindrom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.goldman.longestparlindrom.dto.LongestParlindrom;


/*
 * By: Sherry Wang
 * 03/22/2021
 * 
 * Repo interface which extends JpaRepository
 */


@Repository
public interface LongestParlindromRepo extends JpaRepository<LongestParlindrom, String>{

}
