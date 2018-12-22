package com.lin.bean;

import java.util.HashMap;
import java.util.Map;

/*
 * ͨ�÷��ص���
 * */
public class Message {
	//�Զ���״̬�룺200-�ɹ���400-ʧ��
	private int code;
	//��ʾ��Ϣ
	private String msg;
	//�û�Ҫ���������������
	private Map<String,Object> extend = new HashMap<String,Object>();
	
	public static Message success() {
		Message result = new Message();
		result.setCode(200);
		result.setMsg("�����ɹ���");
		return result; 
	}
	
	public static Message fail() {
		Message result = new Message();
		result.setCode(400);
		result.setMsg("����ʧ�ܣ�");
		return result; 
	}
	
	public Message add(String key,Object value) {
		this.getExtend().put(key, value);
		return this;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
}