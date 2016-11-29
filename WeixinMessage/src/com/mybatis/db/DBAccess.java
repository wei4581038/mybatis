package com.mybatis.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.naming.resources.Resource;

/**
 *  访问数据库类
 * @author qinjiwei
 *
 */
public class DBAccess {
	
	public SqlSession getSqlSession() throws IOException{
		//通过配置文件获取数据库连接信息
		Reader reader = Resources.getResourceAsReader("com/mybatis/config/Configuration.xml");
		//通过配置信息构建一个SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		//通过sqlSessionFactory打开一个数据库会话 是sqlsession别搞错了
		SqlSession openSession = sqlSessionFactory.openSession();
		return openSession;
	}
}
