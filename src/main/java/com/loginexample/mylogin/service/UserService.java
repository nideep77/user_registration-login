package com.loginexample.mylogin.service;

import com.loginexample.mylogin.dto.UserDto;
import com.loginexample.mylogin.model.User;

import java.util.List;

public interface UserService {
  void saveUser(UserDto userDto);

  User findByEmail(String email);

  List<UserDto> findAllUsers();
}
