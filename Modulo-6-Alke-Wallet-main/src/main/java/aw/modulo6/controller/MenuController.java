package aw.modulo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public ModelAndView Login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("menu");
		return mav;
	}

}
