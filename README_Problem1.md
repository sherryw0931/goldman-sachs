# Longest Palindrome 

### Problem Statement

Given a string _s_, find the longest palindromic substring in _s_. You may assume that the maximum length of _s_ is 1000.

Write a Spring Boot micro-service that completes the following:

1. Receives string input over an API
2. Stores the longest palindrome in provided database
3. Retrieves the stored palindrome over an API


### Assumption

1. When there are more than 1 longest palindrome exist, return the last one.
2. The input string can contain space in the middle and are treated as ordinary character. I.e. "a  a" is considered as a palindrome.
3. POST with empty (not space) request body not allowed.
4. Will return error if searched string not in database


### Approach

1. Created LongestParlindrom Object which contains two field, original string ("original") and its longest palindrome substring("longestParlindrom")
2. Utilize Spring Data JPA to perform operations to database (JpaRepository) and linked the LongestParlindrom Object with a table in databse.
3. Configure embedded, in-memory H2 database as the database.
4. Use HTTP POST Method to receive a string as input and write to database and use GET Method to retrieve items from database according to original string.
5. Besides the basic rest controller/service/serviceImpl/repositort artitecture, implement a LongestParlindromProcessor Service and annotate with @Service to process the input string from post method, find the longest parlindrome, and converted to LongestParlindrom Object.
6. Utilized the SpringBootTest to test the functionality of LongestParlindromProcessor Service and use PostMan for test Rest APIs.
7. The dababase configuration properties are mentioned in src/main/resources/application.properties file.


### Method to Run

1. Run application as a springboot application. (application starts on port 8080)
2. Use Get at "localhost:8080/" to get all records in database
3. Use POST at "localhost:8080/" and enter target input as request body
4. Use GET at "localhost:8080/{TargetString}" to get the record for {TargetString}


### File Description

#### Under src/main/java/com/goldman/longestparlindrom
1. LongestParlindromApplication.java: starting porint of whole application;
2. controller/LongestParlindromController.java: Rest Controller to handle http get/post request;
3. dto/LongestParlindrom.java: Data Object;
4. repository/LongestParlindromRepo.java: Repo interface which extends JpaRepository that helps to operate to databse;
5. service/LongestParlindromProcessor.java: Main logic to find the longest palindrome of a string. Returns defined data object;
6. service/LongestParlindromService.java: service interface to provide functions to handle the requests;
7. service/LongestParlindromServiceImpl.java: Service Implementation to implement the functions provided in LongestParlindromService interface;

#### Under src/test/java
1. com/goldman/longestparlindrom/service/LongestParlindromProcessorTest.java: contains all test cases to test the functionality of main logic to find longest palindrome;



### Sample Test Cases:
1. Input: " "  --> Output: "  ";                // see assumption 2
2. Input: "hello ollaa"  --> Output: "llo oll"; // see assumption 2
3. Input: "cbbcandtvvt"  --> Output: "tvvt";    // see assumption 1
4. Input: "asdghk"  --> Output: "k";            // see assumption 1




