package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class OrderTable {
	
	@Id
	private String custNo;
	private String custName;
	private String custAddr;
	private String custCity;
	private String custEmail;
	private String custPassword;
	private String spName;
	private String custDate;
	private String custTime;
	private String custDescription;
	private String custStatus = "Pending";
	
	
	
	
	public OrderTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	public OrderTable(String custNo, String custName, String custAddr, String custCity, String custEmail,
			String custPassword, String spName, String custDate, String custTime, String custDescription,
			String custStatus) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.custAddr = custAddr;
		this.custCity = custCity;
		this.custEmail = custEmail;
		this.custPassword = custPassword;
		this.spName = spName;
		this.custDate = custDate;
		this.custTime = custTime;
		this.custDescription = custDescription;
		this.custStatus = custStatus;
	}




	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	public String getSpName() {
		return spName;
	}
	public void setSpName(String spName) {
		this.spName = spName;
	}
	public String getCustDate() {
		return custDate;
	}
	public void setCustDate(String custDate) {
		this.custDate = custDate;
	}
	public String getCustTime() {
		return custTime;
	}
	public void setCustTime(String custTime) {
		this.custTime = custTime;
	}
	public String getCustDescription() {
		return custDescription;
	}
	public void setCustDescription(String custDescription) {
		this.custDescription = custDescription;
	}
	public String getCustStatus() {
		return custStatus;
	}
	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}
	@Override
	public String toString() {
		return "OrderTable [custNo=" + custNo + ", custName=" + custName + ", custAddr=" + custAddr + ", custCity="
				+ custCity + ", custEmail=" + custEmail + ", custPassword=" + custPassword + ", spName=" + spName
				+ ", custDate=" + custDate + ", custTime=" + custTime + ", custDescription=" + custDescription
				+ ", custStatus=" + custStatus + "]";
	}
	
	
	
	

}
