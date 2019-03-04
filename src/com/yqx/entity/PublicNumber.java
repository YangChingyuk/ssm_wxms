package com.yqx.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PublicNumber {
	private String id;	//编号
	private String public_id;	//公众号账号
	private String public_name;	//公众号昵称
	private String public_type;	//公众号性质
	private String name;	//公众号注册人名称
	private String phone;	//公众号注册联系方式
	private String address;	//公众号注册联系地址
	private String logo;	//公众号logo图片
	@JSONField(format="yyyy-MM-dd")
	private Date regDate;	//公众号注册日期
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;	//创建时间
	
	public PublicNumber() {
		super();
	}
	public PublicNumber(String id, String public_id, String public_name, String public_type, String name,
			String phone, String address, String logo, Date regDate, Timestamp createTime) {
		super();
		this.id = id;
		this.public_id = public_id;
		this.public_name = public_name;
		this.public_type = public_type;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.logo = logo;
		this.regDate = regDate;
		this.createTime = createTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPublic_id() {
		return public_id;
	}
	public void setPublic_id(String public_id) {
		this.public_id = public_id;
	}
	public String getPublic_name() {
		return public_name;
	}
	public void setPublic_name(String public_name) {
		this.public_name = public_name;
	}
	public String getPublic_type() {
		return public_type;
	}
	public void setPublic_type(String public_type) {
		this.public_type = public_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	@Override
	public String toString() {
		return "wxms_public_number [id=" + id + ", public_id=" + public_id + ", public_name=" + public_name
				+ ", public_type=" + public_type + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", logo=" + logo + ", regDate=" + regDate + ", createTime=" + createTime + "]";
	}
	
	
}
