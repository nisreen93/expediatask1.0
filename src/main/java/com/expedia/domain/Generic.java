package com.expedia.domain;

import java.util.List;

public class Generic {
	
	Integer id;
	String url;
	String text;
	Hotel hotel;
	List<GeneralResponse> list=null;
	public Generic() {}
	public Generic(Integer id, String url, String text, Hotel hotel, List<GeneralResponse> list) {
		super();
		this.id = id;
		this.url = url;
		this.text = text;
		this.hotel = hotel;
		this.list = list;
	}
	
	public Integer getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public List<GeneralResponse> getList() {
		return list;
	}
	public void setList(List<GeneralResponse> list) {
		this.list = list;
	}

}
