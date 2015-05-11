package com.dongduk.movit.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dongduk.movit.domain.StorageMv;

@Controller
public class viewDetailController {
	
	//처음 상세정보 띄울때는 평가하기폼(get), 한번 평가하면 자신이 매김 평점과 다시평가하기(post)
	@RequestMapping("/detail.do")
	public ModelAndView detail(HttpServletRequest request, 
			//@RequestParam(value="rating", required=false) String rating,
			@ModelAttribute("StorageCommand") StorageMv storage) throws Exception {
		System.out.println(storage.getS_rating());
		System.out.println(storage.getS_img());
		System.out.println(storage.getS_title());
		ModelAndView mav = new ModelAndView();
		if (request.getMethod().equalsIgnoreCase("post")) {
			mav.setViewName("afterRatingDetail");
		//	mav.addObject("rating", rating);
		}
		else 
			mav.setViewName("detail");
		return mav;
	}
	
	//선택한 영화 제목과 감독으로 세부사항 뽑아오는 알고리즘 
	
	//영화 평점 넘어와서 mvStorage에 영화와 함께 저장 

}
