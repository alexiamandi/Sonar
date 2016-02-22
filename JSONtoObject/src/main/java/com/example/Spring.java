package com.example;

import java.util.Date;

public class Spring {
	int id;
	String key;
	String name;
	String lname;
	String scope;
	String qualifier;
	String version;
	Date date;
	Date creationDate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public Spring() {
		super();
	}

	public Spring(int id, String key, String name, String lname, String scope, String qualifier, String version,
			Date date, Date creationDate) {
		super();
		this.id = id;
		this.key = key;
		this.name = name;
		this.lname = lname;
		this.scope = scope;
		this.qualifier = qualifier;
		this.version = version;
		this.date = date;
		this.creationDate = creationDate;
	}

	public String toS()
	{
		return id+name;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getQualifier() {
		return qualifier;
	}
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
