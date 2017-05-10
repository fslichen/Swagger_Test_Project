package com.evolution.controller.dto.example.properties;

public class TheOtherDto {
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
