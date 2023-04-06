package com.example.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class User {
    @Id
	public int eno;
	public String ename;
	public int esal;
	public String email;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int eno, String ename, int i, String email) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = i;
		this.email = email;
	}
	public User() {
		
	}
}
