package com.endava.springexample.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Data
public class User {

  @Id
  private int id;

  @Column(name = "user_name")
  private String userName;

  @Column
  private String password;
}
