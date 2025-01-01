package com.example.Libra.model.dto;

import com.example.Libra.model.entity.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
  private Integer userId;
  private String name;
  private String email;
  private String phoneNumber;

  public UserDTO() {}

  public UserDTO(Integer userId, String name, String email, String phoneNumber) {
    this.userId = userId;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public static UserDTO toDto(User user) {
    return new UserDTO(user.getUserId(), user.getName(), user.getEmail(), user.getPhoneNumber());
  }
}
