package com.evolution.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evolution.controller.dto.AnyDto;

@RestController
public class BetaController {
	@PostMapping("/beta/post")
	public void post(@RequestBody AnyDto anyDto) {
		
	}
}
