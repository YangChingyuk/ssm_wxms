package com.yqx.vo;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class TemplateVO {
	
	private String id;	//编号
	private String name;	//名称
	private String content;	//内容
	private String type;	//类型
	private String remark;	//备注
	private String uname;	//创建人
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;	//创建时间
	public TemplateVO(String id, String name, String content, String type, String remark, String uname,
			Timestamp createTime) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.type = type;
		this.remark = remark;
		this.uname = uname;
		this.createTime = createTime;
	}
	public TemplateVO() {
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
		return "TemplateVO [id=" + id + ", name=" + name + ", content=" + content + ", type=" + type + ", remark="
				+ remark + ", uname=" + uname + ", createTime=" + createTime + "]";
	}
	
	
}
