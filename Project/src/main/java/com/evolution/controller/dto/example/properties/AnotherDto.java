package com.evolution.controller.dto.example.properties;

import evolution.annotation.ApiExamples;

public class AnotherDto {
	@ApiExamples(keys = {"ExamplePropertiesController.post"}, stringValues = {"M"})
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "GammaDto [gender=" + gender + "]";
	}
}
