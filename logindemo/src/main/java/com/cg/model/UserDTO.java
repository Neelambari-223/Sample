package com.cg.model;

//import javax.persistence.Column;
//import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {
	    private String emailid;
	    private String usertype;
	    private String firstname;
	    private String lastname;
	    private String dob;
	    private String phoneno;
	    private String password;
	    private String security_q=new String("What is your birth place?");
	    private String security_a;
	    
	    public String getDob() {
			return dob;
		}

	    public String getEmailid() {
			return emailid;
		}
	    
	    public String getFirstname() {
			return firstname;
		}
	    
	    public String getLastname() {
			return lastname;
	    }
	    
	    public String getPhoneno() {
			return phoneno;
		}
	    
	    public String getPassword() {
			return password;
		}
	    
	    public String getSecurity_a() {
			return security_a;
		}
	    
	    public String getSecurity_q() {
			return security_q;
		}
	    
	    public String getUsertype() {
			return usertype;
		}
	    
	    public void setDob(String dob) {
			this.dob = dob;
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
	    
	    public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}
	    
	    public void setPassword(String password) {
			this.password = password;
		}
	    
	    public void setSecurity_a(String security_a) {
			this.security_a = security_a;
		}
	    
	    public void setSecurity_q(String security_q) {
			this.security_q = security_q;
		}
	    
	    public void setUsertype(String usertype) {
			this.usertype = usertype;
		}


}
