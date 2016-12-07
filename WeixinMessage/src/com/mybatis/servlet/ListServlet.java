package com.mybatis.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.bean.Message;
import com.mybatis.entity.Page;
import com.mybatis.jdbc.JdbcUtil;
import com.mybatis.server.MessageService;

/**
 * �б�ҳ���ʼ������
 * @author qinjiwei
 */
@SuppressWarnings("serial")
public class ListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String command = req.getParameter("COMMAND");
		String description = req.getParameter("DESCRIPTINO");
		
		// 接受页面的值
		String currentPage = req.getParameter("currentPage");
		// 创建分页对象
		Page page = new Page();
		Pattern pattern = Pattern.compile("[0-9]{1,9}");
		if(currentPage == null ||  !pattern.matcher(currentPage).matches()) {
			page.setCurrentPage(1);
		} else {
			page.setCurrentPage(Integer.valueOf(currentPage));
		}
				
		MessageService messageService = new MessageService();
		req.setAttribute("messageList", messageService.queryList(command, description,page));
		req.setAttribute("COMMAND", command);
		req.setAttribute("DESCRIPTINO", description);
		req.setAttribute("page", page);
		req.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
