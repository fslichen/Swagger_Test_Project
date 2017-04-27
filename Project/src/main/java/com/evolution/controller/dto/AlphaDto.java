package com.evolution.controller.dto;

import java.util.List;

public class AlphaDto {
	private List<AnyDto> anyDtos;

	public List<AnyDto> getAnyDtos() {
		return anyDtos;
	}

	public void setAnyDtos(List<AnyDto> anyDtos) {
		this.anyDtos = anyDtos;
	}

	@Override
	public String toString() {
		return "AlphaDto [anyDtos=" + anyDtos + "]";
	}
}
