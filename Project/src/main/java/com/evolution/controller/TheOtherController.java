package com.evolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evolution.controller.dto.AlphaDto;

@RestController
public class TheOtherController {
	@GetMapping("/get")
	public AlphaDto get() {
		return null;
	}
}
