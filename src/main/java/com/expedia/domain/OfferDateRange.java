package com.expedia.domain;

import java.util.ArrayList;
import java.util.List;

public class OfferDateRange {
	
	public OfferDateRange(List<Integer> travelStartDate, List<Integer> travelEndDate, int lengthOfStay) {
		super();
		this.travelStartDate = travelStartDate;
		this.travelEndDate = travelEndDate;
		this.lengthOfStay = lengthOfStay;
	}

	private List<Integer> travelStartDate;
	private List<Integer> travelEndDate;
	private int lengthOfStay;
	
	
	
	public List<Integer> getTravelStartDate() {
		return this.travelStartDate;
	}

	public void setTravelStartDate(List<Integer> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public List<Integer> getTravelEndDate() {
		return this.travelEndDate;
	}

	public void setTravelEndDate(ArrayList<Integer> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}


	public int getLengthOfStay() {
		return this.lengthOfStay;
	}

	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
}