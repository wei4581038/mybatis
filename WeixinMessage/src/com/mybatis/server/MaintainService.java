package com.mybatis.server;

import com.mybatis.dao.MessageDao;

/**
 * 维护相关的业务功能
 * @author qinjiwei
 *
 */
public class MaintainService {
	
	
	
	public void deleteOne(String Id){
		MessageDao messageDao = new MessageDao();
		if(Id != null && !"".equals(Id.trim())){
			messageDao.deleteOne(Integer.valueOf(Id));			
		}
	}
}
