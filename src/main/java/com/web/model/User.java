package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User {
	
	@Id
	private String uContact;
	private String uName;
	private String uAge;
	private String uAddress;
	private String uCity;
	private String uEmail;
	private String uPassword;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uName, String uAge, String uContact, String uAddress, String uCity, String uEmail,
			String uPassword) {
		super();
		this.uName = uName;
		this.uAge = uAge;
		this.uContact = uContact;
		this.uAddress = uAddress;
		this.uCity = uCity;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuAge() {
		return uAge;
	}
	public void setuAge(String uAge) {
		this.uAge = uAge;
	}
	public String getuContact() {
		return uContact;
	}
	public void setuContact(String uContact) {
		this.uContact = uContact;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public String getuCity() {
		return uCity;
	}
	public void setuCity(String uCity) {
		this.uCity = uCity;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	@Override
	public String toString() {
		return "User [uName=" + uName + ", uAge=" + uAge + ", uContact=" + uContact + ", uAddress=" + uAddress
				+ ", uCity=" + uCity + ", uEmail=" + uEmail + ", uPassword=" + uPassword + "]";
	}
	
	

}
