package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable
{
private static final long serialVersionUID = -7788619177798333712L;

private int empid;
private String address;
private String phone;
private String lastname;
private String education;
private String profile;
private String email;
private String officeAddress;
private String employeeType;
private String dateofjoin;
private String dateofleave;
private String dateofbirth;
private String firstname;



public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
public String getProfile() {
	return profile;
}
public void setProfile(String profile) {
	this.profile = profile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getOfficeAddress() {
	return officeAddress;
}
public void setOfficeAddress(String officeAddress) {
	this.officeAddress = officeAddress;
}
public String getEmployeeType() {
	return employeeType;
}
public void setEmployeeType(String employeeType) {
	this.employeeType = employeeType;
}
public String getDateofjoin() {
	return dateofjoin;
}
public void setDateofjoin(String dateofjoin) {
	this.dateofjoin = dateofjoin;
}
public String getDateofleave() {
	return dateofleave;
}
public void setDateofleave(String dateofleave) {
	this.dateofleave = dateofleave;
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}









}
