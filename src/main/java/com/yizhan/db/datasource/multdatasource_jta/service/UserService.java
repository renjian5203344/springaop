package com.yizhan.db.datasource.multdatasource_jta.service;

import lombok.Data;
import com.yizhan.db.datasource.multdatasource_jta.dao.LogDao;
import com.yizhan.db.datasource.multdatasource_jta.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Data
public class UserService {
	@Resource
	private UserDao userDao;
	@Resource
	private LogDao logDao;

	public void saveUser(String id, String name) {
		userDao.insertUser(id, name);
//		 int i = 1 / 0; // ÷∆‘Ï“Ï≥£
		logDao.insertLog(id, id + "_" + name);
	}
}
