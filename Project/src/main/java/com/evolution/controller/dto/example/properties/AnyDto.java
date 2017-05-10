package com.evolution.controller.dto.example.properties;

import java.util.List;

import evolution.annotation.ApiExamples;

public class AnyDto {
	@ApiExamples(keys = {"ExamplePropertiesController.post"}, stringValues = {"Chen"})
	private String name;
	private AnotherDto anotherDto;
	private List<TheOtherDto> theOtherDtos;
	
	public List<TheOtherDto> getTheOtherDtos() {
		return theOtherDtos;
	}
	public void setTheOtherDtos(List<TheOtherDto> theOtherDtos) {
		this.theOtherDtos = theOtherDtos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "AnyDto [name=" + name + ", anotherDto=" + anotherDto + ", theOtherDtos=" + theOtherDtos + "]";
	}
	public AnotherDto getAnotherDto() {
		return anotherDto;
	}
	public void setAnotherDto(AnotherDto anotherDto) {
		this.anotherDto = anotherDto;
	}
	
}
