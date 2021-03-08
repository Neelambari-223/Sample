package com.Login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Login.entity.user;
import com.Login.idclass.Userid;

@Repository	
public interface LoginRepository extends JpaRepository<user,Userid>{

	@Query("select t from User t where t.emailid=emailid and t.usertype=usertype")
    user findByCid(String emailid,String usertype);
}
