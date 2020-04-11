/*
 *  Copyright 2004 Clinton Begin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.yizhan.db.transaction.ibatisAndjdbc.ext.spring;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapSession;
import com.ibatis.sqlmap.engine.impl.SqlMapClientImpl;
import com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate;
import com.ibatis.sqlmap.engine.impl.SqlMapSessionImpl;

/**
 * Implementation of ExtendedSqlMapClient
 */
public class SqlMapClientImplOur extends SqlMapClientImpl {

	public SqlMapClientImplOur(SqlMapExecutorDelegate delegate) {
		super(delegate);
	}

	public SqlMapClientImplOur(SqlMapClient sqlMapClient, SqlMapExecutorDelegate delegate) {
		super(delegate);
	}

	public SqlMapSession openSession() {
	    SqlMapSessionImpl sqlMapSession = new SqlMapSessionImplOur(this);
	    sqlMapSession.open();
	    return sqlMapSession;
	  }
	
}
