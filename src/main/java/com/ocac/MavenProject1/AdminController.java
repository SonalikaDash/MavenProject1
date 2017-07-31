package com.ocac.MavenProject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping(value={"/index","/"})
	public ModelAndView view()
	{
		ModelAndView mov=new ModelAndView("index");
		return mov;
	}
	@RequestMapping(value={"/about"})
	public ModelAndView view1()
	{
		ModelAndView mov=new ModelAndView("aboutus");
		return mov;
	}
	@RequestMapping(value={"/reg"})
	public ModelAndView view2()
	{
		ModelAndView mov=new ModelAndView("register");
		return mov;
	}
	
}
