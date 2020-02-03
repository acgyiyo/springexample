package com.endava.springexample.controller;

import com.endava.springexample.model.User;
import com.endava.springexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Main {

  @Autowired
  private UserService userService;

  @RequestMapping("/")
  public String hello() {
    return "Hola mundo";
  }

  @RequestMapping("/users")
  public List<User> findUsers() {
    return userService.findUsers();
  }

}
