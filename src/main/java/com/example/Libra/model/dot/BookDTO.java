package com.example.Libra.model.dto;
import com.example.Libra.model.entity.Book;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDTO {
  private Integer bookId;
  private String title;
  private String author;
  private String genre;
  private Boolean availabilityStatus;
  private String dueDate;

  public BookDTO() {}

  public BookDTO(Integer bookId, String title, String author, String genre, Boolean availabilityStatus, String dueDate) {
    this.bookId = bookId;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.availabilityStatus = availabilityStatus;
    this.dueDate = dueDate;
  }

  public static BookDTO toDto(Book book) {
    return new BookDTO(book.getBookId(), book.getTitle(), book.getAuthor(), book.getGenre(), book.getAvailabilityStatus(), book.getDueDate());
  }

}
