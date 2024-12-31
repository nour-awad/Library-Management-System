package com.example.Libra.controller;

import com.example.Libra.model.dto.BookDTO;
import com.example.Libra.model.entity.Book;
import com.example.Libra.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

  @Autowired
  private BookService bookService;

  @GetMapping
  public String getAllBooks(Model model) {
    List<BookDTO> books = bookService.getAllBooks();
    model.addAttribute("books", books);
    model.addAttribute("book", new Book());
    return "Book";
  }

  @GetMapping("/{id}")
  public String getBookById(@PathVariable Integer id, Model model) {
    BookDTO bookDTO = bookService.getBookById(id);
    model.addAttribute("book", bookDTO);
    return "Book";
  }

  @PostMapping("/savebook")
  public String saveBook(@ModelAttribute("book") Book book) {
    bookService.saveBook(book);
    return "redirect:/books";
  }

  @PostMapping("/delete")
  public String deleteBook(@RequestParam("bookId") Integer bookId ,Model model) {
    bookService.deleteBook(bookId);
    return "redirect:/books";
  }
}
