package com.yizhan.db.transaction.ibatis;

import lombok.Setter;

/** 
 * @author wangtl
 * ����ʱ�䣺2012-5-30 ����09:38:27 
 * ��˵�� 
 */
//@Transactional 
public class SysAdminServiceImpl  {
	public SysAdminServiceImpl() {
		super();
	}
	@Setter
	private IbatisDao ibatisDao;
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.demo.jdbc.SysAdminService#delete(java.lang.Integer)
	 */
//	@Transactional(rollbackFor=Exception.class)
	public void delete(Integer sysAdminId) throws Exception {
		ibatisDao.delete("del");
//		throw new Exception();
	}


	/* (non-Javadoc)
	 * @see com.demo.jdbc.SysAdminService#update(com.demo.jdbc.SysAdmin)
	 */
	public void update(SysAdmin sysAdmin) throws Exception {
		ibatisDao.update("update");
	} 

	public void updateAndDel() throws Exception {
		this.delete(2);
		this.update(null);
	}
}
