package com.example.Libra.model.entity;

import com.example.Libra.model.dto.BookDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "book")
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  @Setter
  private Integer bookId;
  @Getter
  @Setter
  private String title;
  @Getter
  @Setter
  private String author;
  @Getter
  @Setter
  private String genre;
  @Getter
  @Setter
  private Boolean availabilityStatus;
  @Getter
  @Setter
  private String dueDate;

  public Book() {}

  public Book(Integer bookId, String title, String author, String genre, Boolean availabilityStatus, String dueDate) {
    this.bookId = bookId;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.availabilityStatus = availabilityStatus;
    this.dueDate = dueDate;
  }

  public Book(BookDTO bookDTO) {
  }
}
