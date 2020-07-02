package waq.hbwl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class FirstController {

//	@RequestMapping(value = "/firstController")
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("msg", "这是第一个springmvc小程序");
//		mav.setViewName("/WEB-INF/jsp/first.jsp");
//		return mav;	
//		
//	}

	@RequestMapping(value = "/firstController")
	public String handleRequest(HttpServletRequest request, HttpServletResponse response, Model model)
			throws Exception {

		model.addAttribute("msg", "一个spring mvc程序");
		return "first";

	}

}
