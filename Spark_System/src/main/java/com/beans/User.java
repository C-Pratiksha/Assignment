package com.beans;

public class User {
private int id;
private String full_name;
private int age;
private String email;
private String password;



public User() {
	super();
}

public User(String full_name, int age, String email, String password) {
	super();
	this.full_name = full_name;
	this.age = age;
	this.email = email;
	this.password = password;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFull_name() {
	return full_name;
}
public void setFull_name(String full_name) {
	this.full_name = full_name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
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

}
