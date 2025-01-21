package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student
{
	@Id
	private int sid;
	private String sname;
	
	private String address;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	 
	
	
	
}
