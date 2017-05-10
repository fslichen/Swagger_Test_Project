package com.evolution.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evolution.controller.dto.example.properties.AnyDto;

@RestController
public class ExamplePropertiesController {
	@PostMapping("/example/properties/post")
	public AnyDto post(@RequestBody List<AnyDto> anyDtos) {
		return null;
	}
}
