package com.expedia.domain;

public class UserInfo {
	public UserInfo(Persona persona, String userId) {
		super();
		this.persona = persona;
		this.userId = userId;
	}

	private Persona persona;

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	private String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
