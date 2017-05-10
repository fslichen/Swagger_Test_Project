package com.evolution.controller.dto.example.properties;

import evolution.annotation.ApiExamples;

public class TheOtherDto {
	@ApiExamples(keys = {"ExamplePropertiesController.post"}, stringValues = {"Illinois"})
	private String address;

	@Override
	public String toString() {
		return "TheOtherDto [address=" + address + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
