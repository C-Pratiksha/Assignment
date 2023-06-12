package com.beans;

public class Admin {
private String full_name;
private String email;
private String password;
private String location;
public Admin() {
	super();
}
public Admin(String full_name, String email, String password, String location) {
	super();
	this.full_name = full_name;
	this.email = email;
	this.password = password;
	this.location = location;
}
public String getFull_name() {
	return full_name;
}
public void setFull_name(String full_name) {
	this.full_name = full_name;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
