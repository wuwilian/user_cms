package com.lm.entity;

import java.io.Serializable;

public class Base implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String tname;
	private String tpwd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTpwd() {
		return tpwd;
	}
	public void setTpwd(String tpwd) {
		this.tpwd = tpwd;
	}
}
