package com.jyd.multi.bean;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class ViewLog implements Serializable {
	private int id;
	private String log;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

}
