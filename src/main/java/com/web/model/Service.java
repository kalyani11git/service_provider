package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Service {
	
	@Id
	private String sContact;
	private String sName;
	private int sAge;
	
	private String sArea;
	private String sCity;
	private String sEmail;
	private String sPassword;
	private String sServiceType;
	private String sOpen;
	private String sClose;
	private String sStatus = "Reject";
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(String sContact, String sName, int sAge, String sArea, String sCity, String sEmail, String sPassword,
			String sServiceType, String sOpen, String sClose, String sStatus) {
		super();
		this.sContact = sContact;
		this.sName = sName;
		this.sAge = sAge;
		this.sArea = sArea;
		this.sCity = sCity;
		this.sEmail = sEmail;
		this.sPassword = sPassword;
		this.sServiceType = sServiceType;
		this.sOpen = sOpen;
		this.sClose = sClose;
		this.sStatus = sStatus;
	}
	public String getsContact() {
		return sContact;
	}
	public void setsContact(String sContact) {
		this.sContact = sContact;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public String getsArea() {
		return sArea;
	}
	public void setsArea(String sArea) {
		this.sArea = sArea;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsPassword() {
		return sPassword;
	}
	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	public String getsServiceType() {
		return sServiceType;
	}
	public void setsServiceType(String sServiceType) {
		this.sServiceType = sServiceType;
	}
	public String getsOpen() {
		return sOpen;
	}
	public void setsOpen(String sOpen) {
		this.sOpen = sOpen;
	}
	public String getsClose() {
		return sClose;
	}
	public void setsClose(String sClose) {
		this.sClose = sClose;
	}
	public String getsStatus() {
		return sStatus;
	}
	public void setsStatus(String sStatus) {
		this.sStatus = sStatus;
	}
	@Override
	public String toString() {
		return "Service [sContact=" + sContact + ", sName=" + sName + ", sAge=" + sAge + ", sArea=" + sArea + ", sCity="
				+ sCity + ", sEmail=" + sEmail + ", sPassword=" + sPassword + ", sServiceType=" + sServiceType
				+ ", sOpen=" + sOpen + ", sClose=" + sClose + ", sStatus=" + sStatus + "]";
	}
	
}
