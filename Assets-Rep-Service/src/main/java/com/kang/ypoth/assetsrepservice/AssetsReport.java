package com.kang.ypoth.assetsrepservice;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

public class AssetsReport extends RepresentationModel<AssetsReport>{
	
	
	//private String assetsID;
	
	//private String address;
	
	//private String posetionType;
	
	//private String location;

	
	//private String socialSecNum;
	
	//private String firstName;
	
	//private String lastName;
	

	//private String identityNum;
	
	private List<Assets> assets;
	
	private Index index;
	
	
	
	

	/**private ArrayList<Assets> assets;


	public List<Assets> getAssets() {
		return assets;
	}


	public void setAssets(List<Assets> assets) {
		this.assets = assets;
	}*/


	public Index getIndex() {
		return index;
	}


	public void setIndex(Index index) {
		this.index = index;
	}


	/**public String getAssetsID() {
		return assetsID;
	}


	public void setAssetsID(String assetsID) {
		this.assetsID = assetsID;
	}*/


	public List<Assets> getAssets() {
		return assets;
	}


	public void setAssets(List<Assets> assets) {
		this.assets = assets;
	}


	/**public String getAddress() {
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
	}*/


	/**public String getSocialSecNum() {
		return socialSecNum;
	}


	public void setSocialSecNum(String socialSecNum) {
		this.socialSecNum = socialSecNum;
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


	public String getIdentityNum() {
		return identityNum;
	}


	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}*/


}
