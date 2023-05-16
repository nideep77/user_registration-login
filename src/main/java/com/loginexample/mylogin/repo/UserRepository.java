package com.loginexample.mylogin.repo;

import com.loginexample.mylogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email);

}
