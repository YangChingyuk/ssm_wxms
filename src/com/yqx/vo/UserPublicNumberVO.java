package com.yqx.vo;

public class UserPublicNumberVO {
	
	private String id;
	private String userid;
	private String name;
	private String pid;
	private String public_name;
	public UserPublicNumberVO(String id, String userid, String name, String pid, String public_name) {
		super();
		this.id = id;
		this.userid = userid;
		this.name = name;
		this.pid = pid;
		this.public_name = public_name;
	}
	public UserPublicNumberVO() {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPublic_name() {
		return public_name;
	}
	public void setPublic_name(String public_name) {
		this.public_name = public_name;
	}
	@Override
	public String toString() {
		return "UserPublicNumberVO [id=" + id + ", userid=" + userid + ", name=" + name + ", pid=" + pid
				+ ", public_name=" + public_name + "]";
	}
	
	
}
