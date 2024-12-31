package com.example.Libra.model.dto;

import com.example.Libra.model.entity.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class TransactionDTO {
  private Integer transactionID;
  private Integer userID;
  private Integer bookID;
  private Date issueDate;
  private Date dueDate;
  private Date returnDate;

  public TransactionDTO() {}

  public TransactionDTO(Integer transactionID, Integer userID, Integer bookID, Date issueDate, Date dueDate, Date returnDate) {
    this.transactionID = transactionID;
    this.userID = userID;
    this.bookID = bookID;
    this.issueDate = issueDate;
    this.dueDate = dueDate;
    this.returnDate = returnDate;
  }

  public static TransactionDTO toDto(Transaction transaction) {
    return new TransactionDTO(transaction.getTransactionID(), transaction.getUserID(), transaction.getBookID(), transaction.getIssueDate(), transaction.getDueDate(), transaction.getReturnDate());
  }
}
