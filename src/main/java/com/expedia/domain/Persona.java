package com.expedia.domain;

public class Persona {
	public Persona(String personaType) {
		super();
		this.personaType = personaType;
	}

	private String personaType;

	public String getPersonaType() {
		return this.personaType;
	}

	public void setPersonaType(String personaType) {
		this.personaType = personaType;
	}
}