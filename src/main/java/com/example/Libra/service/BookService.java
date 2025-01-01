package com.example.Libra.service;

import com.example.Libra.model.dto.BookDTO;
import com.example.Libra.model.entity.Book;
import com.example.Libra.model.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

  @Autowired
  private BookRepo bookRepository;

  public List<BookDTO> getAllBooks() {
    return bookRepository.findAll().stream().map(BookDTO::toDto).collect(Collectors.toList());
  }

  public BookDTO getBookById(Integer id) {
    return bookRepository.findById(id).map(BookDTO::toDto).orElse(null);
  }

  public BookDTO saveBook(Book book) {
    return BookDTO.toDto(bookRepository.save(book));
  }

  public void deleteBook(Integer id) {
    bookRepository.deleteById(id);
  }

  public BookDTO updateBook(Book book) {
    return BookDTO.toDto(bookRepository.save(book));
  }

  public BookDTO addBook(String title, String author, String genre, Boolean availabilityStatus) {
    Book book = new Book();
    book.setTitle(title);
    book.setAuthor(author);
    book.setGenre(genre);
    book.setAvailabilityStatus(availabilityStatus);
    book.setDueDate(null); // Default to null if not set
    return BookDTO.toDto(bookRepository.save(book));
  }
}

