package com.example.Libra.service;

import com.example.Libra.model.dto.TransactionDTO;
import com.example.Libra.model.entity.Transaction;
import com.example.Libra.model.repository.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TransactionService {

  @Autowired
  private TransactionRepo transactionRepository;

  public void createTransaction(Integer userID, Integer bookID) {
    Transaction transaction = new Transaction();
    transaction.setUserID(userID);
    transaction.setBookID(bookID);
    transaction.setIssueDate(new Date());
    transaction.setDueDate(Date.from(Instant.now().plus(14, ChronoUnit.DAYS)));
    transactionRepository.save(transaction);
  }

  public void closeTransaction(Integer transactionID) {
    transactionRepository.deleteById(transactionID);
  }

  public List<TransactionDTO> getAllTransactions() {
    return transactionRepository.findAll().stream().map(TransactionDTO::toDto).collect(Collectors.toList());
  }
}
