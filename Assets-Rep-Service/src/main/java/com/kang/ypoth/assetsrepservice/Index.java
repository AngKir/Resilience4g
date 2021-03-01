package com.kang.ypoth.assetsrepservice;

import org.springframework.hateoas.RepresentationModel;

public class Index extends RepresentationModel<Index>{
	
	private long id;
	private String firstName;
	private String lastName;
	private String socialSecNum;
	private String identityNum;
	

	
	

	
	
	
	public String getIdentityNum() {
		return identityNum;
	}
	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecNum() {
		return socialSecNum;
	}
	public void setSocialSecNum(String socialSecNum) {
		this.socialSecNum = socialSecNum;
	}
	

}
