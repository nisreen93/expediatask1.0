package com.expedia.domain;

import java.util.ArrayList;
import java.util.List;

public class Offers {
	public Offers(List<com.expedia.domain.Hotel> hotel) {
		super();
		Hotel = hotel;
	}

	private List<Hotel> Hotel;

	public List<Hotel> getHotel() {
		return this.Hotel;
	}

	public void setHotel(ArrayList<Hotel> Hotel) {
		this.Hotel = Hotel;
	}
}
