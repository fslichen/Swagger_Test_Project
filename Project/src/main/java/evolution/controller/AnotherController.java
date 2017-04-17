package evolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import evolution.controller.dto.RequestDto;
import evolution.controller.dto.ResponseDto;

@Controller
public class AnotherController {
	@RequestMapping(value = "/evolution/5/{name}/{gender}", method = RequestMethod.POST)
	public ResponseDto evolution5(@PathVariable("name") String name, 
			@PathVariable("gender") String gender,
			@RequestBody RequestDto dto) {
		return null;
	}
	
	@RequestMapping(value = "/evolution/6/{name}/{gender}", method = RequestMethod.POST)
	public void evolution6(@PathVariable("name") String name, 
			@PathVariable("gender") String gender,
			@RequestBody RequestDto dto) {
	}
	
	@RequestMapping(value = "/evolution/7", method = RequestMethod.GET)
	public void evolution7() {
		
	}
	
	@PostMapping("/evolution/8")
	public ResponseDto evolution8(@RequestBody RequestDto dto) {
		return null;
	}
}
