package com.capg.otm.service;
import java.math.BigInteger;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otm.dao.TestDao;
import com.capg.otm.model.Test;

@Service
@Transactional
public class TestService {

	@Autowired
	TestDao testDao;
	/**
	 * Method 	     : addTest()
	 * Description   : This is a PostMethod() that is used to add test.
	 * Creation Type : Test
	 * parameters    : test
	 * Date 	     : 04-MAY-2020
	 **/
	public Test addTest(Test test)
	{
		return testDao.save(test);
		
	}
	/**
	 * Method 	     : updateTest()
	 * Description   : This is a PutMethod() that is used to update test.
	 * Creation Type : Test
	 * parameters    : test
	 * Date 	     : 04-MAY-2020
	 **/
	
	public Test updateTest(Test test)
	{
		return testDao.save(test);
	}
	/**
	 * Method 	     : testDetails()
	 * Description   : This is a GetMethod() that is used to give details of test.
	 * Creation Type : Test
	 * parameters    : test
	 * Date 	     : 04-MAY-2020
	 **/
	
	/**
	 * Method 	     : deleteTest()
	 * Description   : This is a DeleteMethod() that is used to delete test.
	 * Creation Type : String
	 * parameters    : id
	 * Date 	     : 04-MAY-2020
	 **/
	public boolean deleteTest(int id)
	{
		testDao.deleteById(id);
		return !testDao.existsById(id);
	}
	
	public List<Test> getTest() {
		return testDao.findAll();
	}


	
}