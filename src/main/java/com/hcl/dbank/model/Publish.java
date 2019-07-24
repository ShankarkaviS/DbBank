package com.hcl.dbank.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publish {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pId;
	private String pName;
	private String pVersion;
	private Date date= new Date();
	
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpVersion() {
		return pVersion;
	}
	public void setpVersion(String pVersion) {
		this.pVersion = pVersion;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Publish(Long pId, String pName, String pVersion, Date date) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pVersion = pVersion;
		this.date = date;
	}
	
	public Publish() {
		// TODO Auto-generated constructor stub
	}
	
	

}
