package com.jisan.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jisan.blog.entities.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
