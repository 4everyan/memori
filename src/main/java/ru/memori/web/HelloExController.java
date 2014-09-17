package ru.memori.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/hi")
public class HelloExController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(Model model) {
		return "printHelloEx";
	}
}
