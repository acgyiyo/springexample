package com.endava.springexample.service;

import com.endava.springexample.model.User;
import com.endava.springexample.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> findUsers() {
    return userRepository.findAll();
  }
}
