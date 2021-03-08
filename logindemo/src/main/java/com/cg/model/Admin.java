package com.cg.model;

import org.springframework.stereotype.Component;

@Component
public class Admin {
	private String firstname;
    private String lastname;
    private String emailid;
    private String password=new String("admin");
    
    public String getEmailid() {
		return emailid;
	}
    
    public String getFirstname() {
		return firstname;
	}
    
    public String getLastname() {
		return lastname;
    }
    
    public String getPassword() {
		return password;
	}
    
    public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
    
    public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
    
    public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    
    public void setPassword(String password) {
		this.password = password;
	}

}
