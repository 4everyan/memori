package ru.memori.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HttpErrorController {

	@RequestMapping(value = "/error403", method = RequestMethod.GET)
	public String forbidden(Model model) {		
		return "error403";
	}
}
