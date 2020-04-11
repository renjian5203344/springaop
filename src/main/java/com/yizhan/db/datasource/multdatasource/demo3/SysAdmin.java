package com.yizhan.db.datasource.multdatasource.demo3;

import lombok.Data;

/** 
 * @author wangtl
 * 创建时间：2012-5-30 下午09:34:16 
 * 类说明 
 */
@Data
public class SysAdmin {
	private Integer adminId;
	private String adminName;
	private String password;
	public SysAdmin(){}
	/**
	 * @param adminId
	 * @param adminName
	 * @param password
	 */
	public SysAdmin(Integer adminId, String adminName, String password) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.password = password;
	}
}
