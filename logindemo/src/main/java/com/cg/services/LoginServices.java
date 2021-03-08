package com.cg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.user;
import com.cg.model.UserDTO;
import com.cg.repository.LoginRepository;
import com.cg.utils.LoginUtils;

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
