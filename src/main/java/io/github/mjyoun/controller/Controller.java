package io.github.mjyoun.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(path = "/health_check", method = RequestMethod.GET)
	public ResponseEntity<String> checkHealth() {
		return ResponseEntity.ok("I'm here.");
	}
	
}
