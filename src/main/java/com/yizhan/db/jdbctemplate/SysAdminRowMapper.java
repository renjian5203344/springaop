package com.yizhan.db.jdbctemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SysAdminRowMapper implements RowMapper {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		SysAdmin sysAdmin=new SysAdmin();
		sysAdmin.setAdminId(rs.getInt("adminId"));
		sysAdmin.setAdminName(rs.getString("ADMIN_NAME"));
		sysAdmin.setPassword(rs.getString("PASSWORD"));
		return sysAdmin;
	}

}
