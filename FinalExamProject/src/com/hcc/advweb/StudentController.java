package com.hcc.advweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
@RequestMapping
public class StudentController {
	
	public StudentController() {
		// TODO Auto-generated constructor stub
	}	
	
	@GetMapping("/newUser")
	public ModelAndView newSpringStudent(ModelAndView modelView) {
		Student student = new Student();
		modelView.addObject("student",student);
		modelView.setViewName("signUp");
		return modelView;
	}
	
	@GetMapping("/addNewUser")
	public ModelAndView addSpringStudent(@ModelAttribute Student student) {
		return new ModelAndView("usersList", "student", student);
	}
	
}
