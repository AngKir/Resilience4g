package com.kang.ypoth.assetsrepservice;

import org.springframework.hateoas.RepresentationModel;

public class Assets extends RepresentationModel<Assets>{
	
	
	//private String assetsID;
	
	private String address;
	
	private String posetionType;
	
	private String location;

	
	//private String socialSecNum;


	
	/**public String getSocialSecNum() {
		return socialSecNum;
	}


	public void setSocialSecNum(String socialSecNum) {
		this.socialSecNum = socialSecNum;
	}


	public String getAssetsID() {
		return assetsID;
	}


	public void setAssetsID(String assetsID) {
		this.assetsID = assetsID;
	}*/


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPosetionType() {
		return posetionType;
	}


	public void setPosetionType(String posetionType) {
		this.posetionType = posetionType;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}



	
	
}
