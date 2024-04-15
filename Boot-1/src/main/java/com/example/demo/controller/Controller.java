package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/hey")
	public ModelAndView m1() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("kkf", "hello This is Pratik Deshmukh");
		mav.setViewName("index");

		return mav;

	}
	
	@GetMapping("/come")
	public ModelAndView m3() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("kkf", "Hello, Good Morning");
		mav.setViewName("index");
		System.out.println(mav);
		return mav;
	}
	
	@GetMapping("/do")
	public String m5(Model model) {
		
		model.addAttribute("kkf", "I am here to welcome you");
		
		return "index";
	}
	
	@GetMapping("/ddf")
	public String m9() {
		
		return "dash";
	}
	
	
	@GetMapping("/doing") 
	@ResponseBody
	public String m8(Model model) {
		
		return "here is Pratu";
	}

}
