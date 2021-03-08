package com.cg.utils;

import com.cg.entity.user;
import com.cg.model.UserDTO;

public class LoginUtils {
	public static user convertTouser(UserDTO userdto) {
	       user User=new user();
	       User.setDob(userdto.getDob());
	       User.setEmailid(userdto.getEmailid());
	       User.setUsertype(userdto.getUsertype());
	       User.setPassword(userdto.getPassword());
	       User.setFirstname(userdto.getFirstname());
	       User.setLastname(userdto.getLastname());
	       User.setPhoneno(userdto.getPhoneno());
	       User.setSecurity_q(userdto.getSecurity_q());
	       User.setSecurity_a(userdto.getSecurity_a());
	       return User;
	}
}
