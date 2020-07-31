package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Test> getTestList() {
		List<Test> testList = jdbcTemplate.queryForObject("select * from java_db.test", new TestMapper());

		return testList;
	}
}
