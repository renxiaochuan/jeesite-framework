/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.salespoint.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.salespoint.entity.SalesPoints;

/**
 * InnoDB free: 5120 kBDAO接口
 * @author 任晓川
 * @version 2018-05-02
 */
@MyBatisDao
public interface SalesPointsDao extends CrudDao<SalesPoints> {
	
}