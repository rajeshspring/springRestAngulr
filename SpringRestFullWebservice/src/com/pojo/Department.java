package com.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name = "departments")
@XmlAccessorType(XmlAccessType.NONE)
public class Department implements Serializable
{
	@XmlAttribute
	private int dept_id;
	
	@XmlElement
	private String deptname;
	
	@XmlElement
	private String deptlocation;
	
	@XmlElement
	private String dept_phone;
	
	@XmlElement
	private String dept_email;
	
	public String getDept_phone() {
		return dept_phone;
	}
	public void setDept_phone(String dept_phone) {
		this.dept_phone = dept_phone;
	}
	public String getDept_email() {
		return dept_email;
	}
	public void setDept_email(String dept_email) {
		this.dept_email = dept_email;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptlocation() {
		return deptlocation;
	}
	public void setDeptlocation(String deptlocation) {
		this.deptlocation = deptlocation;
	}
	

}
