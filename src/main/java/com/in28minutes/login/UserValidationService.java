package com.in28minutes.login; 

/*
 * UserValidationService hardcodes the name and password of 
 * a user to login
 * */

public class UserValidationService {

	public boolean isUserValid(String name, String password) {
		if (name.equals("aika") && password.equals("j2ee")) return true;
		
		return false;
	}
} 
