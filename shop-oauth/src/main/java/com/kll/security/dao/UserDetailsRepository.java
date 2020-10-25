package com.kll.security.dao;

import com.kll.entities.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDetailsRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
