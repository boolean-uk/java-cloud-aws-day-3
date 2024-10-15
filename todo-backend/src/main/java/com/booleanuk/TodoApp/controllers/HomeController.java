package com.booleanuk.TodoApp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("")
public class HomeController {

	@GetMapping
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Go to: http://dagawsbucket.s3-website-eu-west-1.amazonaws.com/");
	}
}
