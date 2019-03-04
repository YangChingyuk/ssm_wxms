package com.yqx.entity;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class InfoContent {
	
	private String id;	//���
	private String pid;	//���ں�
	private String content;	//����
	private String tid;	//����ģ��
	private String userid;	//������
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;	//����ʱ��
	public InfoContent(String id, String pid, String content, String tid, String userid, Timestamp createTime) {
		super();
		this.id = id;
		this.pid = pid;
		this.content = content;
		this.tid = tid;
		this.userid = userid;
		this.createTime = createTime;
	}
	public InfoContent() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Wxms_Info_Content [id=" + id + ", pid=" + pid + ", content=" + content + ", tid=" + tid + ", userid="
				+ userid + ", createTime=" + createTime + "]";
	}
	
}
