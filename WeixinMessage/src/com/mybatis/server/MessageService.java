package com.mybatis.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mybatis.bean.Message;
import com.mybatis.dao.MessageDao;
import com.mybatis.entity.Page;

public class MessageService {

	MessageDao messageDao = new MessageDao();
	public List<Message> queryList(String command,String description,Page page){
		Map<String,Object> parameter = new HashMap<String,Object>();
		//组织消息对象
		Message message = new Message();
		message.setCOMMAND(command);
		message.setDESCRIPTINO(description);
		parameter.put("message", message);
		parameter.put("page", page);
		//分页查询并返回结果
		return messageDao.queryList(parameter);
	}
}
