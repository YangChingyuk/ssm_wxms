package com.yqx.vo;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class InfoContentCheckVO {
	
	private String id;	//编号
	private String pname;	//公众号
	private String content;	//信息内容
	private String uname;	//发布人
	@JSONField(format="yyyy-MM-dd")
	private Date applyTime;	//提交时间
	private int state;	//审核是否通过
	private String advise;	//审核意见
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp checkedTime;	//审核时间
	public InfoContentCheckVO(String id, String pname, String content, String uname, Date applyTime, int state,
			String advise, Timestamp checkedTime) {
		super();
		this.id = id;
		this.pname = pname;
		this.content = content;
		this.uname = uname;
		this.applyTime = applyTime;
		this.state = state;
		this.advise = advise;
		this.checkedTime = checkedTime;
	}
	public InfoContentCheckVO() {
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getAdvise() {
		return advise;
	}
	public void setAdvise(String advise) {
		this.advise = advise;
	}
	public Timestamp getCheckedTime() {
		return checkedTime;
	}
	public void setCheckedTime(Timestamp checkedTime) {
		this.checkedTime = checkedTime;
	}
	@Override
	public String toString() {
		return "InfoContentCheckVO [id=" + id + ", pname=" + pname + ", content=" + content + ", uname=" + uname
				+ ", applyTime=" + applyTime + ", state=" + state + ", advise=" + advise + ", checkedTime="
				+ checkedTime + "]";
	}
	
	
}
