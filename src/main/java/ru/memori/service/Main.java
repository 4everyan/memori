package ru.memori.service;

public class Main {

	public static void main(String[] args) {
		org.springframework.security.authentication.encoding.Md5PasswordEncoder encoder = 
				new org.springframework.security.authentication.encoding.Md5PasswordEncoder();
		
		System.out.println(encoder.encodePassword("admin", "admin"));
		System.out.println(encoder.encodePassword("111", "user1"));
		System.out.println(encoder.encodePassword("222", "user2"));
	}
}
