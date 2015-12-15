package com.lm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("jsp")
public class JSPChangeController {

	@RequestMapping("")
	public String gotoPage(HttpServletRequest request) {
		String method = request.getParameter("method");
		return  method;
	}
	
}
