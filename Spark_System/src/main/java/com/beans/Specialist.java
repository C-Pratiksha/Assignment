package com.beans;

public class Specialist {
	private int spe_id;
private String full_name;
private String profession;
private String contact_no;
private String email;
private String password;
public Specialist() {
	super();
}
public Specialist(String full_name, String profession,String contact_no, String email, String password) {
	super();
	this.full_name = full_name;
	this.profession = profession;
	this.contact_no=contact_no;
	this.email = email;
	this.password = password;
}
public int getSpe_id() {
	return spe_id;
}
public void setSpe_id(int spe_id) {
	this.spe_id = spe_id;
}
public String getFull_name() {
	return full_name;
}
public void setFull_name(String full_name) {
	this.full_name = full_name;
}
public String getProfession() {
	return profession;
}
public void setProfession(String profession) {
	this.profession = profession;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getContact_no() {
	return contact_no;
}
public void setContact_no(String contact_no) {
	this.contact_no = contact_no;
}

}
