package com.Login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import com.Login.idclass.Userid;
//import com.cg.annotation;
@Entity
@Table(name="user")
@IdClass(Userid.class)
public class user {
	@Id
	@Column(name="Email_Id")
    private String emailid;

    @Id
    @Column(name="User_type")
    private String usertype;
    
    @Column(name="First_name")
    private String firstname;
    
    @Column(name="Last_name")
    private String lastname;
    
    @Column(name="D.O.B")
    private String dob;
    
    @Column(name="Phone_no")
    private String phoneno;
    
    @Column(name="Password")
    private String password;
    
    @Column(name="Security_question")
    private String security_q;
    
    @Column(name="Security_answer")
    private String security_a ;

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
