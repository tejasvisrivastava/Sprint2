package com.capg.otm.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.otm.model.Test;

@Repository
public interface TestDao extends JpaRepository<Test,Integer>{
	
	

}
