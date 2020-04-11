package com.yizhan.db.datasource.multdatasource_jta.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogDao   {
	
	@Resource
	private JdbcTemplate jdbcTemplate_log;
	
	
	public void insertLog(String id, String content) {
		jdbcTemplate_log.execute("insert into log values('" + id + "','" + content + "')");
//		throw new RuntimeException();
	}
	
	
}
