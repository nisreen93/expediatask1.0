package com.expedia.domain;

public class Hotel {
	public Hotel() {
		super();
	}

	public Hotel(OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo,
			HotelPricingInfo hotelPricingInfo, HotelUrls hotelUrls) {
		super();
		this.offerDateRange = offerDateRange;
		this.destination = destination;
		this.hotelInfo = hotelInfo;
		this.hotelPricingInfo = hotelPricingInfo;
		this.hotelUrls = hotelUrls;
	}

	private OfferDateRange offerDateRange;
	private Destination destination;
	private HotelInfo hotelInfo;
	private HotelPricingInfo hotelPricingInfo;
	private HotelUrls hotelUrls;

	public OfferDateRange getOfferDateRange() {
		return this.offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public Destination getDestination() {
		return this.destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public HotelInfo getHotelInfo() {
		return this.hotelInfo;
	}

	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return this.hotelPricingInfo;
	}

	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public HotelUrls getHotelUrls() {
		return this.hotelUrls;
	}

	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	@Override
	public String toString() {
		return "Hotel [offerDateRange=" + offerDateRange + ", destination=" + destination + ", hotelInfo=" + hotelInfo
				+ ", hotelPricingInfo=" + hotelPricingInfo + ", hotelUrls=" + hotelUrls + "]";
	}
}
