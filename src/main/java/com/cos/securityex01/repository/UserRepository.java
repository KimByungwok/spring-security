package com.cos.securityex01.repository;

import com.cos.securityex01.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//일케 하면 JpaRepository가 CRUD를 들고 있음
// @Repository 라는 어노테이션이 없어도 loc 된다
// 그 이유는 JpaRepository를 상속해서
public interface UserRepository extends JpaRepository<User, Integer> {
    // findBy규칙 -> Username 문법
    // select * from user where username =1?
    public User findByUsername(String username); //Jpa Query Method

}
