package com.expedia.domain;

public class OfferInfo {
	public OfferInfo(String siteID, String language, String currency, String userSelectedCurrency) {
		super();
		this.siteID = siteID;
		this.language = language;
		this.currency = currency;
		this.userSelectedCurrency = userSelectedCurrency;
	}

	private String siteID;

	public String getSiteID() {
		return this.siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	private String language;

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private String currency;

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	private String userSelectedCurrency;

	public String getUserSelectedCurrency() {
		return this.userSelectedCurrency;
	}

	public void setUserSelectedCurrency(String userSelectedCurrency) {
		this.userSelectedCurrency = userSelectedCurrency;
	}
}
