package com.mybatis.bean;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class TBILLLOG {

	
	
	private int  PARTID;
	private String  CALLID;//
	private int  CALLIDNUM;
	private String  CALLERNO;//
	private String  CALLEENO;
	private Date  WAITBEGIN;// ��ʼʱ��
	private Date  WAITEND;
	private Date  ACKBEGIN;
	private Date  ACKEND;
	private Date  CALLBEGIN;
	private Date  CALLEND;// ����ʱ��
	private int  SERVICENO;
	private int  TRKNO;
	private int  TRKGRPNO;
	private int  MODNO;
	private int  DEVICETYPE;
	private int  DEVICENO;//  ����
	private String  DEVICEIN;
    private int  CALLTYPE;
    private int  WAITCAUSE;
    private int  RELEASECAUSE;//  551�ͻ�  1281��ϯ  qita ϵͳ
    private int  SUBCCNO;
    private int  VDN;
    private int  MEDIATYPE;
    private int  UVID;
    private int  ORGCCNO;
    private String  ORGCALLID;
    private String  ORGCALLEENO;
    private int  ORGSERVICENO;
    private int  SERCCNO;
    private int  SERSERVICE;
    private int  USERLEVEL;
    private int  USERTYPE;
    private int  CALLINCAUSE;
    private int  ENTERREASON;
    private int  LEAVEREASON;
    private int  BILLINFO;
    private int  PRESERVICENO;
    private int  PREDEVICETYPE;
    private int  PREDEVICENO;
    private String  PREDEVICEIN;
    private int  MEDIAINFOTYPE;
    private int  SKILLID;//  -1 ������ 
    
    
    
    Calendar calendar = Calendar.getInstance();
	int i = calendar.get(Calendar.MONTH)+1;
    final  int yue = i;
   
	public TBILLLOG() {
		
	}
	public int getPARTID() {
		return PARTID;
	}
	public void setPARTID(int pARTID) {
		PARTID = pARTID;
	}
	public String getCALLID() {
		return CALLID;
	}
	public void setCALLID(String cALLID) {
		CALLID = cALLID;
	}
	public int getCALLIDNUM() {
		return CALLIDNUM;
	}
	public void setCALLIDNUM(int cALLIDNUM) {
		CALLIDNUM = cALLIDNUM;
	}
	public String getCALLERNO() {
		return CALLERNO;
	}
	public void setCALLERNO(String cALLERNO) {
		CALLERNO = cALLERNO;
	}
	public String getCALLEENO() {
		return CALLEENO;
	}
	public void setCALLEENO(String cALLEENO) {
		CALLEENO = cALLEENO;
	}
	public Date getWAITBEGIN() {
		return WAITBEGIN;
	}
	public void setWAITBEGIN(Date wAITBEGIN) {
		WAITBEGIN = wAITBEGIN;
	}
	public Date getWAITEND() {
		return WAITEND;
	}
	public void setWAITEND(Date wAITEND) {
		WAITEND = wAITEND;
	}
	public Date getACKBEGIN() {
		return ACKBEGIN;
	}
	public void setACKBEGIN(Date aCKBEGIN) {
		ACKBEGIN = aCKBEGIN;
	}
	public Date getACKEND() {
		return ACKEND;
	}
	public void setACKEND(Date aCKEND) {
		ACKEND = aCKEND;
	}
	public Date getCALLBEGIN() {
		return CALLBEGIN;
	}
	public void setCALLBEGIN(Date cALLBEGIN) {
		CALLBEGIN = cALLBEGIN;
	}
	public Date getCALLEND() {
		return CALLEND;
	}
	public void setCALLEND(Date cALLEND) {
		CALLEND = cALLEND;
	}
	public int getSERVICENO() {
		return SERVICENO;
	}
	public void setSERVICENO(int sERVICENO) {
		SERVICENO = sERVICENO;
	}
	public int getTRKNO() {
		return TRKNO;
	}
	public void setTRKNO(int tRKNO) {
		TRKNO = tRKNO;
	}
	public int getTRKGRPNO() {
		return TRKGRPNO;
	}
	public void setTRKGRPNO(int tRKGRPNO) {
		TRKGRPNO = tRKGRPNO;
	}
	public int getMODNO() {
		return MODNO;
	}
	public void setMODNO(int mODNO) {
		MODNO = mODNO;
	}
	public int getDEVICETYPE() {
		return DEVICETYPE;
	}
	public void setDEVICETYPE(int dEVICETYPE) {
		DEVICETYPE = dEVICETYPE;
	}
	public int getDEVICENO() {
		return DEVICENO;
	}
	public void setDEVICENO(int dEVICENO) {
		DEVICENO = dEVICENO;
	}
	public String getDEVICEIN() {
		return DEVICEIN;
	}
	public void setDEVICEIN(String dEVICEIN) {
		DEVICEIN = dEVICEIN;
	}
	public int getCALLTYPE() {
		return CALLTYPE;
	}
	public void setCALLTYPE(int cALLTYPE) {
		CALLTYPE = cALLTYPE;
	}
	public int getWAITCAUSE() {
		return WAITCAUSE;
	}
	public void setWAITCAUSE(int wAITCAUSE) {
		WAITCAUSE = wAITCAUSE;
	}
	public int getRELEASECAUSE() {
		return RELEASECAUSE;
	}
	public void setRELEASECAUSE(int rELEASECAUSE) {
		RELEASECAUSE = rELEASECAUSE;
	}
	public int getSUBCCNO() {
		return SUBCCNO;
	}
	public void setSUBCCNO(int sUBCCNO) {
		SUBCCNO = sUBCCNO;
	}
	public int getVDN() {
		return VDN;
	}
	public void setVDN(int vDN) {
		VDN = vDN;
	}
	public int getMEDIATYPE() {
		return MEDIATYPE;
	}
	public void setMEDIATYPE(int mEDIATYPE) {
		MEDIATYPE = mEDIATYPE;
	}
	public int getUVID() {
		return UVID;
	}
	public void setUVID(int uVID) {
		UVID = uVID;
	}
	public int getORGCCNO() {
		return ORGCCNO;
	}
	public void setORGCCNO(int oRGCCNO) {
		ORGCCNO = oRGCCNO;
	}
	public String getORGCALLID() {
		return ORGCALLID;
	}
	public void setORGCALLID(String oRGCALLID) {
		ORGCALLID = oRGCALLID;
	}
	public String getORGCALLEENO() {
		return ORGCALLEENO;
	}
	public void setORGCALLEENO(String oRGCALLEENO) {
		ORGCALLEENO = oRGCALLEENO;
	}
	public int getORGSERVICENO() {
		return ORGSERVICENO;
	}
	public void setORGSERVICENO(int oRGSERVICENO) {
		ORGSERVICENO = oRGSERVICENO;
	}
	public int getSERCCNO() {
		return SERCCNO;
	}
	public void setSERCCNO(int sERCCNO) {
		SERCCNO = sERCCNO;
	}
	public int getSERSERVICE() {
		return SERSERVICE;
	}
	public void setSERSERVICE(int sERSERVICE) {
		SERSERVICE = sERSERVICE;
	}
	public int getUSERLEVEL() {
		return USERLEVEL;
	}
	public void setUSERLEVEL(int uSERLEVEL) {
		USERLEVEL = uSERLEVEL;
	}
	public int getUSERTYPE() {
		return USERTYPE;
	}
	public void setUSERTYPE(int uSERTYPE) {
		USERTYPE = uSERTYPE;
	}
	public int getCALLINCAUSE() {
		return CALLINCAUSE;
	}
	public void setCALLINCAUSE(int cALLINCAUSE) {
		CALLINCAUSE = cALLINCAUSE;
	}
	public int getENTERREASON() {
		return ENTERREASON;
	}
	public void setENTERREASON(int eNTERREASON) {
		ENTERREASON = eNTERREASON;
	}
	public int getLEAVEREASON() {
		return LEAVEREASON;
	}
	public void setLEAVEREASON(int lEAVEREASON) {
		LEAVEREASON = lEAVEREASON;
	}
	public int getBILLINFO() {
		return BILLINFO;
	}
	public void setBILLINFO(int bILLINFO) {
		BILLINFO = bILLINFO;
	}
	public int getPRESERVICENO() {
		return PRESERVICENO;
	}
	public void setPRESERVICENO(int pRESERVICENO) {
		PRESERVICENO = pRESERVICENO;
	}
	public int getPREDEVICETYPE() {
		return PREDEVICETYPE;
	}
	public void setPREDEVICETYPE(int pREDEVICETYPE) {
		PREDEVICETYPE = pREDEVICETYPE;
	}
	public int getPREDEVICENO() {
		return PREDEVICENO;
	}
	public void setPREDEVICENO(int pREDEVICENO) {
		PREDEVICENO = pREDEVICENO;
	}
	public String getPREDEVICEIN() {
		return PREDEVICEIN;
	}
	public void setPREDEVICEIN(String pREDEVICEIN) {
		PREDEVICEIN = pREDEVICEIN;
	}
	public int getMEDIAINFOTYPE() {
		return MEDIAINFOTYPE;
	}
	public void setMEDIAINFOTYPE(int mEDIAINFOTYPE) {
		MEDIAINFOTYPE = mEDIAINFOTYPE;
	}
	public int getSKILLID() {
		return SKILLID;
	}
	public void setSKILLID(int sKILLID) {
		SKILLID = sKILLID;
	}
	public int getYue() {
		return yue;
	}
}
