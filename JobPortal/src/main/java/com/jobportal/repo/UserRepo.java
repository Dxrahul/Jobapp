package com.jobportal.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jobportal.entity.User;

public interface UserRepo extends MongoRepository<User,String> {

}
