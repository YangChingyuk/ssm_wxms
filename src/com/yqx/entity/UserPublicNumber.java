package com.yqx.entity;


public class UserPublicNumber {
	
	private String id;	//±àºÅ
	private String userid;	//ÓÃ»§±àºÅ
	private String pid;	//¹«ÖÚºÅ±àºÅ
	
	public UserPublicNumber(String id, String userid, String pid) {
		super();
		this.id = id;
		this.userid = userid;
		this.pid = pid;
	}
	public UserPublicNumber() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	@Override
	public String toString() {
		return "Wxms_User_Public_Number [id=" + id + ", userid=" + userid + ", pid=" + pid + "]";
	}
	
}
