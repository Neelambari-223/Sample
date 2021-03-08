package com.Login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.entity.user;
import com.Login.model.UserDTO;
import com.Login.repository.LoginRepository;
import com.Login.utils.LoginUtils;

@Service
public class LoginServices {
	@Autowired
	LoginRepository repo;
	
	@Autowired
	user appuser;
	
	public String login(String emailid,String password,String usertype) {
		appuser=repo.findByCid(emailid,usertype);

		 if(appuser.getPassword()==password)
		{
			return "Login successfully";
		}
		else
		{
			return "Invalid password or Email id or user type";
		}	
	}
	
	public String register(UserDTO userdto)
	{
		repo.saveAndFlush(LoginUtils.convertTouser(userdto));
		return "Registered successfully";
	}
	
    
	

}
