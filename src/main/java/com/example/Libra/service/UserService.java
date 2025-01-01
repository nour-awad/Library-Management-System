package com.example.Libra.service;

import com.example.Libra.model.dto.UserDTO;
import com.example.Libra.model.entity.User;
import com.example.Libra.model.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

  @Autowired
  private UserRepo userRepository;

  public List<UserDTO> getAllUsers() {
    return userRepository.findAll().stream().map(UserDTO::toDto).collect(Collectors.toList());
  }

  public UserDTO getUserById(Integer id) {
    return userRepository.findById(id).map(UserDTO::toDto).orElse(null);
  }

  public UserDTO saveUser(User user) {
    return UserDTO.toDto(userRepository.save(user));
  }

  public void deleteUser(Integer id) {
    userRepository.deleteById(id);
  }

  public UserDTO updateUser(User user) {
    return UserDTO.toDto(userRepository.save(user));
  }

  public UserDTO addUser(String name, String email, String password, String phoneNumber) {
    User user = new User();
    user.setName(name);
    user.setEmail(email);
    user.setPassword(password);
    user.setPhoneNumber(phoneNumber);
    return UserDTO.toDto(userRepository.save(user));
  }
}
