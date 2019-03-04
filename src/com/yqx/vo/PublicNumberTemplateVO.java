package com.yqx.vo;

public class PublicNumberTemplateVO {

	private String id;	//±àºÅ
	private String pname;	//¹«ÖÚºÅ±àºÅ
	private String tname;	//Ä£°å±àºÅ
	public PublicNumberTemplateVO(String id, String pname, String tname) {
		super();
		this.id = id;
		this.pname = pname;
		this.tname = tname;
	}
	public PublicNumberTemplateVO() {
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
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "PublicNumberTemplateVO [id=" + id + ", pname=" + pname + ", tname=" + tname + "]";
	}
	
	
}
