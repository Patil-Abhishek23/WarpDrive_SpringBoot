package com.example.warpdrive.controller;

import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

public class NavController {

   

	@GetMapping("/registration")
	public String registration(HttpSession session) {
		session.invalidate();
		return "registration";
	}
	@GetMapping("/login")
	public String login(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
