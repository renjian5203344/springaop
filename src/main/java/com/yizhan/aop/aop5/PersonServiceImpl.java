package com.yizhan.aop.aop5;

import com.yizhan.aop.aop5.interceptor2.MyAnnotation;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

@Log4j
@Service
public class PersonServiceImpl implements PersonService {
	
	@MyAnnotation
	public void save(String name) {
		log.info("save");
	}

}