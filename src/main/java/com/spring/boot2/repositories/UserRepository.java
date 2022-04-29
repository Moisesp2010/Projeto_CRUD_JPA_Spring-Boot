package com.spring.boot2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot2.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
