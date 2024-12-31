package com.example.Libra.controller;

import com.example.Libra.model.dto.TransactionDTO;
import com.example.Libra.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/transactions")
public class TransactionController {

  @Autowired
  private TransactionService transactionService;

  @GetMapping
  public String getAllTransactions(Model model) {
    List<TransactionDTO> transactions = transactionService.getAllTransactions();
    model.addAttribute("transactions", transactions);
    return "Transactions";
  }

  @PostMapping("/create")
  public String createTransaction(@ModelAttribute("transaction") Integer userID, Integer bookID) {
    transactionService.createTransaction(userID, bookID);
    return "redirect:/transactions";
  }

  @GetMapping("/close")
  public String closeTransaction(@RequestParam("transactionID") Integer transactionID, Model model) {
    transactionService.closeTransaction(transactionID);
    return "redirect:/transactions";
  }
}