package com.expedia.domain;

public class HotelPricingInfo {
	public HotelPricingInfo(double averagePriceValue, double totalPriceValue, double crossOutPriceValue,
			double originalPricePerNight, String currency, double percentSavings, boolean drr) {
		super();
		this.averagePriceValue = averagePriceValue;
		this.totalPriceValue = totalPriceValue;
		this.crossOutPriceValue = crossOutPriceValue;
		this.originalPricePerNight = originalPricePerNight;
		this.currency = currency;
		this.percentSavings = percentSavings;
		this.drr = drr;
	}

	private double averagePriceValue;

	public double getAveragePriceValue() {
		return this.averagePriceValue;
	}

	public void setAveragePriceValue(double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	private double totalPriceValue;

	public double getTotalPriceValue() {
		return this.totalPriceValue;
	}

	public void setTotalPriceValue(double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	private double crossOutPriceValue;

	public double getCrossOutPriceValue() {
		return this.crossOutPriceValue;
	}

	public void setCrossOutPriceValue(double crossOutPriceValue) {
		this.crossOutPriceValue = crossOutPriceValue;
	}

	private double originalPricePerNight;

	public double getOriginalPricePerNight() {
		return this.originalPricePerNight;
	}

	public void setOriginalPricePerNight(double originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	private String currency;

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	private double percentSavings;

	public double getPercentSavings() {
		return this.percentSavings;
	}

	public void setPercentSavings(double percentSavings) {
		this.percentSavings = percentSavings;
	}

	private boolean drr;

	public boolean getDrr() {
		return this.drr;
	}

	public void setDrr(boolean drr) {
		this.drr = drr;
	}
}
