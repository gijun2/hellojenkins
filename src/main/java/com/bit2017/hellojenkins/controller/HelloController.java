package com.bit2017.hellojenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping( "/hello2" )
	public String hello() {
		return "<h1>Hello2 Jenkins</h1>";
	}
}
