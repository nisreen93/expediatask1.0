package com.expedia.domain;

public class GeneralResponse {

	public GeneralResponse() {
		super();
	}
	public GeneralResponse(String title, String value) {
		super();
		this.title = title;
		this.value = value;
	}
	private String title;
	private String value;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
