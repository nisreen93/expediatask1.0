package com.expedia.domain;

public class Destination {
	public Destination(String regionID, String associatedMultiCityRegionId, String longName, String shortName,
			String country, String province, String city, String tla, String nonLocalizedCity) {
		super();
		this.regionID = regionID;
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
		this.longName = longName;
		this.shortName = shortName;
		this.country = country;
		this.province = province;
		this.city = city;
		this.tla = tla;
		this.nonLocalizedCity = nonLocalizedCity;
	}

	private String regionID;

	public String getRegionID() {
		return this.regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	private String associatedMultiCityRegionId;

	public String getAssociatedMultiCityRegionId() {
		return this.associatedMultiCityRegionId;
	}

	public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
	}

	private String longName;

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	private String shortName;

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	private String country;

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String province;

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	private String city;

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private String tla;

	public String getTla() {
		return this.tla;
	}

	public void setTla(String tla) {
		this.tla = tla;
	}

	private String nonLocalizedCity;

	public String getNonLocalizedCity() {
		return this.nonLocalizedCity;
	}

	public void setNonLocalizedCity(String nonLocalizedCity) {
		this.nonLocalizedCity = nonLocalizedCity;
	}
}
