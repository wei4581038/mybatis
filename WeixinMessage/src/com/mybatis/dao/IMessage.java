package com.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.mybatis.bean.Message;

/**
 * 与Message配置文件相对应的接口
 * @author qinjiwei
 *
 */
public interface IMessage {

	//这里的方法要和Message.xml文件中的ID相同
	//接口中的参数类型对应parameterType中的数据类型
	//返回值得类型对应xml文件中的返回值类型
	public List<Message> queryMessageListByPage(Map<String,Object> parameter);
}
