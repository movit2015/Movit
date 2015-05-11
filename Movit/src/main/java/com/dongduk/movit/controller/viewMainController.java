package com.dongduk.movit.controller;

import java.io.OutputStream;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class viewMainController {

	@RequestMapping("/main.do")
	public ModelAndView main() {
		System.out.println("viewMainController 들어옴");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("greeting", getGreeting());
		return mav;
	}

	private String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour >= 6 && hour <= 10) {
			return "Good morning!";
		} else if (hour >= 12 && hour <= 15) {
			return "Did you have lunch?";
		} else if (hour >= 18 && hour <= 24) {
			return "Good evening!";
		}
		return "Hello!";
	}
	
	//영화 api받아와서 box office, random으로 title, img 출
}
