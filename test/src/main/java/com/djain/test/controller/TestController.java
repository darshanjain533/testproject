package com.djain.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djain.test.model.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/data")
public class TestController {
	
	@PostMapping("/add")
	public User getdetails(@RequestBody User u) {
		log.info("entered controller");
		u.getLoc().getLat();
		
		return u;
	}
}
