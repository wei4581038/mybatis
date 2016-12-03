package com.mybatis.dao;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.bean.Message;
import com.mybatis.bean.TBILLLOG;
import com.mybatis.db.DBAccess;

public class TbiLogDao {

	public List<TBILLLOG> queryList(){
		DBAccess dbAccess = new DBAccess();
		SqlSession session = null;
		List<TBILLLOG> tbilllogsList = new ArrayList<TBILLLOG>();
		try {
			 
			session = dbAccess.getSqlSession();
			TBILLLOG tbilllog = new TBILLLOG();
			tbilllog.setWAITBEGIN(new Date(20161130));
			//通过session执行SQL语句
			Map<String, Object> map = new HashMap<String, Object>();
	    	map.put("yue", tbilllog.getYue());
	    	map.put("startDate", tbilllog.getWAITBEGIN());
			tbilllogsList = session.selectList("TBILLLOG.querytag",map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(session != null){			
				session.close();
			}
		}
		return tbilllogsList;
	}
	public static void main(String[] args) {
		TbiLogDao dao = new TbiLogDao();
		dao.queryList();
	}
}
