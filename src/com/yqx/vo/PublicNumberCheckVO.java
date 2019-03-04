package com.yqx.vo;

import java.sql.Timestamp;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PublicNumberCheckVO {
	
	private String id;	//编号
	private String pname;	//公众号编号
	private String uname;	//申请人编号
	@JSONField(format="yyyy-MM-dd")
	private Date applyTime;	//提交时间
	private String advise;	//审核意见
	private int state;	//审核是否通过
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp checkedTime;	//审核时间
	public PublicNumberCheckVO(String id, String pname, String uname, Date applyTime, String advise, int state,
			Timestamp checkedTime) {
		super();
		this.id = id;
		this.pname = pname;
		this.uname = uname;
		this.applyTime = applyTime;
		this.advise = advise;
		this.state = state;
		this.checkedTime = checkedTime;
	}
	public PublicNumberCheckVO() {
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
		return "PublicNumberCheckVO [id=" + id + ", pname=" + pname + ", uname=" + uname + ", applyTime=" + applyTime
				+ ", advise=" + advise + ", state=" + state + ", checkedTime=" + checkedTime + "]";
	}
	
	
}
