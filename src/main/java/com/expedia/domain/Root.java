package com.expedia.domain;

public class Root {
	private Offers offers;
	private OfferInfo offerInfo;
	private UserInfo userInfo;
	
	
	public OfferInfo getOfferInfo() {
		return this.offerInfo;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Offers getOffers() {
		return this.offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}
}
