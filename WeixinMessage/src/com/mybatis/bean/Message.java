package com.mybatis.bean;
/**
 *  消息表对应的实体类
 * @author qinjiwei
 *
 */
public class Message {

	private String ID;
	private String COMMAND;
	private String DESCRIPTINO;
	private String CONTENT;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCOMMAND() {
		return COMMAND;
	}
	public void setCOMMAND(String cOMMAND) {
		COMMAND = cOMMAND;
	}
	public String getDESCRIPTINO() {
		return DESCRIPTINO;
	}
	public void setDESCRIPTINO(String dESCRIPTINO) {
		DESCRIPTINO = dESCRIPTINO;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public Message(String iD, String cOMMAND, String dESCRIPTINO, String cONTENT) {
		
		ID = iD;
		COMMAND = cOMMAND;
		DESCRIPTINO = dESCRIPTINO;
		CONTENT = cONTENT;
	}
	public Message() {
		
	}
	
	
}
