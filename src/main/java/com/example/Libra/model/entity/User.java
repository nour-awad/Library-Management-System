package com.example.Libra.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Setter
@Getter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Setter
  @Getter
  private Integer userId;
  @Setter
  @Getter
  private String name;
  @Setter
  @Getter
  private String email;
  @Setter
  @Getter
  private String password;
  @Setter
  @Getter
  private String phoneNumber;

  public User() {}

  public User(Integer userId, String name, String email, String password, String phoneNumber) {
    this.userId = userId;
    this.name = name;
    this.email = email;
    this.password = password;
    this.phoneNumber = phoneNumber;
  }
}
