package com.bookstores.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@org.springframework.stereotype.Controller
public class Controller {
@RequestMapping(value = "/index", method = RequestMethod.GET)
	
	public String index() {
		return "index";
	}
	
	@RequestMapping(value ="/myAcc", method = RequestMethod.GET)
	public String myAccount() {
		return "myAccount";
	}
}
