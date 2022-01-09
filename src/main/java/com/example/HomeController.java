package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("/add")
	public ModelAndView home(HttpServletRequest req, HttpServletResponse resp) 
	{
		int a = Integer.parseInt(req.getParameter("t1"));
		int b = Integer.parseInt(req.getParameter("t2"));
		
		int c = a + b;
		
		System.out.println("Addition of two nums is : " + c);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", c);
		mv.setViewName("display.jsp");
		
		return mv;
		
		
	}
}
