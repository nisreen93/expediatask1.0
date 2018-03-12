package com.expedia.domain;

public class HotelUrls {
	public HotelUrls(String hotelInfositeUrl, String hotelSearchResultUrl) {
		super();
		this.hotelInfositeUrl = hotelInfositeUrl;
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}

	private String hotelInfositeUrl;

	public String getHotelInfositeUrl() {
		return this.hotelInfositeUrl;
	}

	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

	private String hotelSearchResultUrl;

	public String getHotelSearchResultUrl() {
		return this.hotelSearchResultUrl;
	}

	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}
}
