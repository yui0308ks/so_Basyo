package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;


public class TestMapper implements RowMapper<List<Test>> {
	public List<Test> mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		List<Test> list = new ArrayList<>();
		do {
			Test test = new Test();
			test.setTestNo(rs.getInt("testNo"));
			test.setName(rs.getString("name"));
		} while (rs.next());
		return list;
	}
}


