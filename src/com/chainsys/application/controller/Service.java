package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Service {
	@RequestMapping("/welcome")
	public String welcomePage() {
		return "<h1>Welcome</h1>";
	}
	@RequestMapping("/home")
	public String homepage() {
		String html="<div>Hai,How are You!!</div>";
		return html;
	}
	@RequestMapping("/getdata")
	public String getData(@RequestParam(value="city",defaultValue="Madurai")String city) {
		return "<h1>Welcome to "+city+" </h1>";
		
	}
}
