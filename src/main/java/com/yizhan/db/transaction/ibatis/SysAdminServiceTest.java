package com.yizhan.db.transaction.ibatis;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangtl ����ʱ�䣺2012-5-30 ����10:04:31 ��˵��
 */
public class SysAdminServiceTest {
	private static SysAdminServiceImpl sysAdminService;
	private static ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-����-ibatis.xml");

	/**
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			sysAdminService = (SysAdminServiceImpl) ac.getBean("sysAdminService");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void updateAndDel() throws Exception {
		sysAdminService.updateAndDel();
	}

}
