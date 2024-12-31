package com.example.Libra.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "transactions")
@Setter
@Getter
public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Setter
  @Getter
  private Integer transactionID;
  @Setter
  @Getter
  private Integer userID;
  @Setter
  @Getter
  private Integer bookID;
  @Setter
  @Getter
  private Date issueDate;
  @Setter
  @Getter
  private Date dueDate;
  @Setter
  @Getter
  private Date returnDate;

  public Transaction() {}

  public Transaction(Integer transactionID, Integer userID, Integer bookID, Date issueDate, Date dueDate, Date returnDate) {
    this.transactionID = transactionID;
    this.userID = userID;
    this.bookID = bookID;
    this.issueDate = issueDate;
    this.dueDate = dueDate;
    this.returnDate = returnDate;
  }
}