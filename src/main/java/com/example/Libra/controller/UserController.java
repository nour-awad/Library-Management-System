package com.example.Libra.controller;

import com.example.Libra.model.dto.UserDTO;
import com.example.Libra.model.entity.User;
import com.example.Libra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public String getAllUsers(Model model) {
    List<UserDTO> users = userService.getAllUsers();
    model.addAttribute("users", users);
    model.addAttribute("user", new User());
    return "User";
  }

  @GetMapping("/{id}")
  public String getUserById(@PathVariable Integer id, Model model) {
    UserDTO userDTO = userService.getUserById(id);
    model.addAttribute("user", userDTO);
    return "User";
  }

  @PostMapping("/saveuser")
  public String saveUser(@ModelAttribute("user") User user) {
    userService.saveUser(user);
    return "redirect:/users";
  }

  @PostMapping("/delete")
  public String deleteUser(@RequestParam("userId") Integer userId, Model model) {
    userService.deleteUser(userId);
    return "redirect:/users";
  }
}
