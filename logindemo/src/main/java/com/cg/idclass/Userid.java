package com.cg.idclass;

import java.io.Serializable;

public class Userid implements Serializable {
    private String emailid;
    private String usertype;

    // default constructor

    public Userid(String emailid, String usertype) {
        this.emailid = emailid;
        this.usertype = usertype;
    }
   
}
