package com.yqx.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PublicNumberCheck {
	
	private String id;	//编号
	private String pid;	//公众号编号
	private String userid;	//申请人编号
	@JSONField(format="yyyy-MM-dd")
	private Date applyTime;	//提交时间
	private String advise;	//审核意见
	private int state;	//审核是否通过
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp checkedTime;	//审核时间
	public PublicNumberCheck(String id, String pid, String userid, Date applyTime, String advise, int state,
			Timestamp checkedTime) {
		super();
		this.id = id;
		this.pid = pid;
		this.userid = userid;
		this.applyTime = applyTime;
		this.advise = advise;
		this.state = state;
		this.checkedTime = checkedTime;
	}
	public PublicNumberCheck() {
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getAdvise() {
		return advise;
	}
	public void setAdvise(String advise) {
		this.advise = advise;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Timestamp getCheckedTime() {
		return checkedTime;
	}
	public void setCheckedTime(Timestamp checkedTime) {
		this.checkedTime = checkedTime;
	}
	@Override
	public String toString() {
		return "PublicNumberCheck [id=" + id + ", pid=" + pid + ", userid=" + userid + ", applyTime=" + applyTime
				+ ", advise=" + advise + ", state=" + state + ", checkedTime=" + checkedTime + "]";
	}
	
	
}
