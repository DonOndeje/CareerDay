package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class JobsController {

	@RequestMapping(value="/jobs")
	
	public String jobs() {
          return "jobs";		
	}
	
}
