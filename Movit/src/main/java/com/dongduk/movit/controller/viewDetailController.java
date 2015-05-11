package com.dongduk.movit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dongduk.movit.domain.StorageMv;
import com.dongduk.movit.jdbc.JdbcMvSelectDao;
import com.dongduk.movit.service.MovitImpl;

@Controller
public class viewDetailController {
	
	MovitImpl movit = new MovitImpl();
	
	//처음 상세정보 띄울때는 평가하기폼(get), 한번 평가하면 자신이 매김 평점과 다시평가하기(post)
	@RequestMapping("/detail.do")
	public ModelAndView detail(HttpServletRequest request,
			@ModelAttribute("command")StorageMv command
			//@RequestParam(value="rating", required=false) String rating,
			) throws Exception {
		
		System.out.println("viewDetailController 들어옴");
		ModelAndView mav = new ModelAndView();
		
		if (request.getMethod().equalsIgnoreCase("post")) {
			System.out.println("post로 들어옴");
			System.out.println(command.getS_rating());
			System.out.println(command.getS_img());
			System.out.println(command.getS_title());
			
			mav.setViewName("afterRatingDetail");
			movit.insertStorage(command);
		}
		else 
			mav.setViewName("detail");
		return mav;
	}
	
	//선택한 영화 제목과 감독으로 세부사항 뽑아오는 알고리즘 
	
	//영화 평점 넘어와서 mvStorage에 영화와 함께 저장 

}
