package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional //宣言的トランザクション管理：begin/commit/rollbackを直接書かない。publicのみ。メソッド開始/終了で制御
public class UketukeService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Uketuke> getUketukeList() {
		List<Uketuke> uketukeList = jdbcTemplate.queryForObject("select * from java_db.uketuke", new UketukeMapper());

		return uketukeList;
	}
}