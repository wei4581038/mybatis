package com.mybatis.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.bean.Message;
import com.mybatis.jdbc.JdbcUtil;

/**
 * �б�ҳ���ʼ������
 * @author qinjiwei
 *
 */
@SuppressWarnings("serial")
public class ListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String command = req.getParameter("COMMAND");
		String description = req.getParameter("DESCRIPTINO");
		req.setAttribute("COMMAND", command);
		req.setAttribute("DESCRIPTINO", description);
		try {
			Connection connection = JdbcUtil.getConnection();
			StringBuilder sql = new StringBuilder("select ID,COMMAND,DESCRIPTINO,CONTENT  FROM MESSAGE where 1=1 ");
		    List<String> paramList = new ArrayList<String>();
			if(command!=null && !"".equals(command.trim())){
								
				sql.append("and COMMAND=?");
				paramList.add(command);
			}
			if(description!=null && !"".equals(description.trim())){
				sql.append("and DESCRIPTINO like '%' ? '%'");
				paramList.add(description);
			}
			PreparedStatement statement = connection.prepareStatement(sql.toString());
			for(int i = 0;i<paramList.size();i++){
				statement.setString(i + 1,paramList.get(i));
			}
			ResultSet rs = statement.executeQuery();
			List<Message> listMessage = new ArrayList<Message>();
			while(rs.next()){
				Message message = new Message();
			    listMessage.add(message);
			    message.setID(rs.getString("ID"));
			    message.setCOMMAND(rs.getString("COMMAND"));
			    message.setCONTENT(rs.getString("CONTENT"));
			    message.setDESCRIPTINO(rs.getString("DESCRIPTINO"));
			}
			req.setAttribute("messageList", listMessage);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
