package com.evolution.controller.dto.example.properties;

import evolution.annotation.ApiExamples;

public class AnyDto {
	@ApiExamples(keys = {"ExamplePropertiesController.post"}, stringValues = {"Chen"})
	private String name;
	private AnotherDto anotherDto;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "AnyDto [name=" + name + ", anotherDto=" + anotherDto + "]";
	}
	public AnotherDto getAnotherDto() {
		return anotherDto;
	}
	public void setAnotherDto(AnotherDto anotherDto) {
		this.anotherDto = anotherDto;
	}
	
}
