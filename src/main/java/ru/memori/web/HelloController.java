package ru.memori.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.memori.service.UserService;


@Controller
@RequestMapping("/hello")
public class HelloController {
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(Model model, HttpSession session) {
				
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("username", auth.getName());
		model.addAttribute("isAuthenticated", auth.isAuthenticated());
		
		StringBuilder sb = new StringBuilder();
		for (GrantedAuthority grant: auth.getAuthorities()) {
			sb.append(grant.getAuthority());
			sb.append(", ");
		}
		model.addAttribute("authorities", sb.toString());
		return "printHello";
	}
}
