package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.entity.user;
import com.cg.idclass.Userid;

@Repository	
public interface LoginRepository extends JpaRepository<user,Userid>{

	@Query("select t from User t where t.emailid=emailid and t.usertype=usertype")
    user findByCid(String emailid,String usertype);
}
