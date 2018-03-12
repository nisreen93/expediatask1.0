package com.expedia.domain;

public class HotelInfo {
	public HotelInfo(String hotelId, String hotelName, String localizedHotelName, String hotelDestination,
			String hotelDestinationRegionID, String hotelLongDestination, String hotelStreetAddress, String hotelCity,
			String hotelProvince, String hotelCountryCode, double hotelLatitude, double hotelLongitude,
			String hotelStarRating, double hotelGuestReviewRating, int hotelReviewTotal, String hotelImageUrl,
			boolean vipAccess, boolean isOfficialRating) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.localizedHotelName = localizedHotelName;
		this.hotelDestination = hotelDestination;
		this.hotelDestinationRegionID = hotelDestinationRegionID;
		this.hotelLongDestination = hotelLongDestination;
		this.hotelStreetAddress = hotelStreetAddress;
		this.hotelCity = hotelCity;
		this.hotelProvince = hotelProvince;
		this.hotelCountryCode = hotelCountryCode;
		this.hotelLatitude = hotelLatitude;
		this.hotelLongitude = hotelLongitude;
		this.hotelStarRating = hotelStarRating;
		this.hotelGuestReviewRating = hotelGuestReviewRating;
		this.hotelReviewTotal = hotelReviewTotal;
		this.hotelImageUrl = hotelImageUrl;
		this.vipAccess = vipAccess;
		this.isOfficialRating = isOfficialRating;
	}

	private String hotelId;

	public String getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	private String hotelName;

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	private String localizedHotelName;

	public String getLocalizedHotelName() {
		return this.localizedHotelName;
	}

	public void setLocalizedHotelName(String localizedHotelName) {
		this.localizedHotelName = localizedHotelName;
	}

	private String hotelDestination;

	public String getHotelDestination() {
		return this.hotelDestination;
	}

	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	private String hotelDestinationRegionID;

	public String getHotelDestinationRegionID() {
		return this.hotelDestinationRegionID;
	}

	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	private String hotelLongDestination;

	public String getHotelLongDestination() {
		return this.hotelLongDestination;
	}

	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	private String hotelStreetAddress;

	public String getHotelStreetAddress() {
		return this.hotelStreetAddress;
	}

	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	private String hotelCity;

	public String getHotelCity() {
		return this.hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	private String hotelProvince;

	public String getHotelProvince() {
		return this.hotelProvince;
	}

	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	private String hotelCountryCode;

	public String getHotelCountryCode() {
		return this.hotelCountryCode;
	}

	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	private double hotelLatitude;

	public double getHotelLatitude() {
		return this.hotelLatitude;
	}

	public void setHotelLatitude(double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	private double hotelLongitude;

	public double getHotelLongitude() {
		return this.hotelLongitude;
	}

	public void setHotelLongitude(double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	private String hotelStarRating;

	public String getHotelStarRating() {
		return this.hotelStarRating;
	}

	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	private double hotelGuestReviewRating;

	public double getHotelGuestReviewRating() {
		return this.hotelGuestReviewRating;
	}

	public void setHotelGuestReviewRating(double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	private int hotelReviewTotal;

	public int getHotelReviewTotal() {
		return this.hotelReviewTotal;
	}

	public void setHotelReviewTotal(int hotelReviewTotal) {
		this.hotelReviewTotal = hotelReviewTotal;
	}

	private String hotelImageUrl;

	public String getHotelImageUrl() {
		return this.hotelImageUrl;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	private boolean vipAccess;

	public boolean getVipAccess() {
		return this.vipAccess;
	}

	public void setVipAccess(boolean vipAccess) {
		this.vipAccess = vipAccess;
	}

	private boolean isOfficialRating;

	public boolean getIsOfficialRating() {
		return this.isOfficialRating;
	}

	public void setIsOfficialRating(boolean isOfficialRating) {
		this.isOfficialRating = isOfficialRating;
	}
}
