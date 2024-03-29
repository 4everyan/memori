package ru.memori.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showMainPage(Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showIndexPage(Model model) {
		return "index";
	}
}
