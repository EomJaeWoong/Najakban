package com.web.blog.dto;

public class signupReq {
	private String email;
	private String name;
	private String pw;
	private String phone;

	public signupReq() {
	}

	public signupReq(String email, String name, String pw, String phone) {
		this.email = email;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
