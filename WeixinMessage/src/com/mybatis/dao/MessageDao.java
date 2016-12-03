package com.mybatis.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.bean.Message;
import com.mybatis.db.DBAccess;
import com.mybatis.jdbc.JdbcUtil;

public class MessageDao {
	/**
	 * 单条删除
	 * @param Id
	 */
	public void deleteOne(int Id){
		DBAccess access = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = access.getSqlSession();
			sqlSession.delete("Message.deleteOne",Id);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
	}
	
	/*---------------------------------MyBatis-----------------------------------------*/
	public List<Message> queryList(String command,String description){
		DBAccess dbAccess = new DBAccess();
		SqlSession session = null;
		List<Message> messagesList = new ArrayList<Message>();
		try {
			session = dbAccess.getSqlSession();
			Message message = new Message();
			message.setCOMMAND(command);
			message.setDESCRIPTINO(description);
			//通过session执行SQL语句
			messagesList = session.selectList("Message.queryList",message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(session != null){			
				session.close();
			}
		}
		return messagesList;
	}
	
	public static void main(String[] args) {
		MessageDao messageDao = new MessageDao();
		messageDao.deleteOne(6);
	}
	/*--------------------------------JDBC------------------------------------------*/
//	public List<Message> queryList(String command,String description){
//		List<Message> listMessage = new ArrayList<Message>();
//		try {
//			Connection connection = JdbcUtil.getConnection();
//			StringBuilder sql = new StringBuilder("select ID,COMMAND,DESCRIPTINO,CONTENT  FROM MESSAGE where 1=1 ");
//		    List<String> paramList = new ArrayList<String>();
//			if(command!=null && !"".equals(command.trim())){
//								
//				sql.append("and COMMAND=?");
//				paramList.add(command);
//			}
//			if(description!=null && !"".equals(description.trim())){
//				sql.append("and DESCRIPTINO like '%' ? '%'");
//				paramList.add(description);
//			}
//			PreparedStatement statement = connection.prepareStatement(sql.toString());
//			for(int i = 0;i<paramList.size();i++){
//				statement.setString(i + 1,paramList.get(i));
//			}
//			ResultSet rs = statement.executeQuery();
//			
//			while(rs.next()){
//				Message message = new Message();
//			    listMessage.add(message);
//			    message.setID(rs.getString("ID"));
//			    message.setCOMMAND(rs.getString("COMMAND"));
//			    message.setCONTENT(rs.getString("CONTENT"));
//			    message.setDESCRIPTINO(rs.getString("DESCRIPTINO"));
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return listMessage;
//	}
	
}
