package ru.memori.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import ru.memori.model.User;


class GrantedAuthorityImpl implements GrantedAuthority {
	
	private static final long serialVersionUID = 7253899107155525836L;
	private String authority;

	public GrantedAuthorityImpl(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		return authority;
	}
}

public class UserAuthDetailsService implements UserDetailsService {
	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userDao.getByName(username);
		String[] roles = user.getAuthorities().split("[ ,;]+");
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role: roles)
			authorities.add(new GrantedAuthorityImpl(role));
		
		return new org.springframework.security.core.userdetails.User(
				username, user.getPasswordHash(), authorities);
	}
}
