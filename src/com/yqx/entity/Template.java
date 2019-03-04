package com.yqx.entity;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class Template {
	
	private String id;	//编号
	private String name;	//名称
	private String content;	//内容
	private String type;	//类型
	private String remark;	//备注
	private String userid;	//创建人
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;	//创建时间
	public Template(String id, String name, String content, String type, String remark, String userid,
			Timestamp createTime) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.type = type;
		this.remark = remark;
		this.userid = userid;
		this.createTime = createTime;
	}
	public Template() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
		return "Wxms_Template [id=" + id + ", name=" + name + ", content=" + content + ", type=" + type + ", remark="
				+ remark + ", userid=" + userid + ", createTime=" + createTime + "]";
	}
	
	
}
