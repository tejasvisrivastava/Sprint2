package com.capg.otm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otm.model.Test;
import com.capg.otm.service.TestService;


@RestController
@RequestMapping("/test")
@CrossOrigin("http://localhost:9200")
public class TestController {

	@Autowired
	private TestService testService;
	/**
	 * Method 	     : getAllTest()
	 * Description   : This is a GetMethod() that is used to get all test.
	 * Creation Type : Test
	 * parameters    : 
	 * Date 	     : 04-MAY-2020
	 **/
	@RequestMapping(method = RequestMethod.GET, value = "/tests")
	public @ResponseBody List<Test> getAllTest() {
		return  testService.getTest();
	}

	/*
	 * @PostMapping("/tests") public ResponseEntity<String> addTest(@RequestBody
	 * Test test) { Test u = testService.addTest(test); if (u == null) {
	 * 
	 * return new ResponseEntity<String>("Test not added", new HttpHeaders(),
	 * HttpStatus.OK);
	 * 
	 * } else { return new ResponseEntity<String>("Test added successfully", new
	 * HttpHeaders(), HttpStatus.OK); } }
	 * 
	 */
	/**
	 * Method 	     : addTest()
	 * Description   : This is a PostMethod() that is used to add test.
	 * Creation Type : Test
	 * parameters    : test
	 * Date 	     : 04-MAY-2020
	 **/
	@RequestMapping(method = RequestMethod.POST, value = "/tests")
	public Test addTest(@RequestBody Test test) {
		return testService.addTest(test);
	}
	

	/*@PutMapping("/updateTest")
	public ResponseEntity<String> UpdateTest(@RequestBody Test test) {
		Test t = testService.updateTest(test);
		if (t == null) {

			return new ResponseEntity<String>("Update Operation Unsuccessful,Provided testId does not exist",
					new HttpHeaders(), HttpStatus.OK);

		} else {
			return new ResponseEntity<String>("Test updated successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}*/
	/**
	 * Method 	     : updateTest()
	 * Description   : This is a PutMethod() that is used to update test.
	 * Creation Type : Test
	 * parameters    : test
	 * Date 	     : 04-MAY-2020
	 **/
	@RequestMapping(method = RequestMethod.PUT, value = "/tests")
	public Test updateTest(@RequestBody Test test) {
		return testService.updateTest(test);
	}
	
	/*@DeleteMapping("/deleteTest/{id}")
	public ResponseEntity<String> DeleteTest(@PathVariable("id") BigInteger id) {
		String u = testService.deleteTest(id);
		if (u == null) {
			return new ResponseEntity<String>("Delete operation is unsuccessful", new HttpHeaders(), HttpStatus.OK);

		} else {
			return new ResponseEntity<String>("Delete operation is successful", new HttpHeaders(), HttpStatus.OK);
		}
	}*/
	/**
	 * Method 	     : deleteTest()
	 * Description   : This is a DeleteMethod() that is used to delete test.
	 * Creation Type : String
	 * parameters    : id
	 * Date 	     : 04-MAY-2020
	 **/
	@RequestMapping(method = RequestMethod.DELETE, value = "/tests/{id}")
	public boolean deleteTest(@PathVariable int id) {
		return testService.deleteTest(id);
	}
	
	
}
