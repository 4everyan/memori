package ru.memori.web;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String showLoginForm(Model model, HttpSession session) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		session.setAttribute("username", auth.getName());
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.GET, params="error=true")
	public String loginError(Model model) {
		model.addAttribute("error", true);
		return "login";
	}
}
