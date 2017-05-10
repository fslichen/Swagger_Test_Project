package com.evolution.controller.dto.example.properties;

import evolution.annotation.ApiExamples;

public class AnotherDto {
	@ApiExamples(keys = {"ExamplePropertiesController.post"}, stringValues = {"M"})
	private String gender;
	private String hobby;

	public String getGender() {
		return gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "AnotherDto [gender=" + gender + ", hobby=" + hobby + "]";
	}
}
