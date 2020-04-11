package com.yizhan.db.transaction.ibatisAndjdbc;

import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * @author wangtl 创建时间：2012-5-30 下午09:36:16 类说明
 */
public interface SysAdminService {
	public void save(SysAdmin sysAdmin);

	public void save2(SysAdmin sysAdmin, ApplicationContext ac);

	public void update(SysAdmin sysAdmin)throws Exception;

	public SysAdmin getSysAdmin(Integer sysAdminId);

	public List<SysAdmin> getSysAdmins();

	public void delete(Integer sysAdminId) throws Exception;

	public void updateAndDel() throws Exception;
}
