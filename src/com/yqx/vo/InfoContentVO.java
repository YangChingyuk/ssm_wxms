package com.yqx.vo;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class InfoContentVO {
	
	private String id;	//编号
	private String pname;	//公众号
	private String content;	//内容
	private String tname;	//内容模板
	private String uname;	//发布人
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;	//发布时间
	public InfoContentVO(String id, String pname, String content, String tname, String uname, Timestamp createTime) {
		super();
		this.id = id;
		this.pname = pname;
		this.content = content;
		this.tname = tname;
		this.uname = uname;
		this.createTime = createTime;
	}
	public InfoContentVO() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "InfoContentVO [id=" + id + ", pname=" + pname + ", content=" + content + ", tname=" + tname + ", uname="
				+ uname + ", createTime=" + createTime + "]";
	}
	
}
