package com.mybatis.server;

import java.util.List;

import com.mybatis.bean.Message;
import com.mybatis.dao.MessageDao;

public class MessageService {

	MessageDao messageDao = new MessageDao();
	public List<Message> queryList(String command,String description){
		
		
		return messageDao.queryList(command, description);
	}
}
