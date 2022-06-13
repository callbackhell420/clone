package com.jira.clone.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jira.clone.vo.ResponseVO;

@RestController
@RequestMapping("user")
public class UserController {

	@PostMapping("login")
	public ResponseVO login() {
		
		final ResponseVO loginResponse = new ResponseVO(200, "LOGIN_SUCCESS", null, null); 
		
		return loginResponse;
	}
	
}
