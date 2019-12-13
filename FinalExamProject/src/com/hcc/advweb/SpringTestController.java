package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SpringTestController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String viewHome(ModelMap model) {
	    return "home";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String viewAbout(ModelMap model) {
	    return "about";
	}
	
	@RequestMapping(value = "/directToSignup", method = RequestMethod.GET)
	public String viewDirectSignup(ModelMap model) {
	    return "directToSignup";
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String viewSignUp(ModelMap model) {
	    return "signUp";
	}
		
}
