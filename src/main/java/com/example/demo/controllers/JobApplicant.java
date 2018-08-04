package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JobApplicant {

	@RequestMapping(value="/applicant")
	public String registration() {
		return "index";
	}
	
	
	
	@PostMapping(value = "/savedetails")
	public void saveDetails(@RequestParam("firstname") String firstName) {
		System.out.println(firstName);
	}
}
