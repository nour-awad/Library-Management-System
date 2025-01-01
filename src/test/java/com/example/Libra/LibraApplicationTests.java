package com.example.Libra;

import com.example.Libra.model.dto.BookDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Libra.service.BookService;
import com.example.Libra.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class LibraApplicationTests {

	@Autowired
	private BookService bookService;

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	void testAddBook() {
		BookDTO book = bookService.addBook("Test Title", "Test Author", "Fiction", true);
		Assertions.assertNotNull(book);
		Assertions.assertEquals("Test Title", book.getTitle());
		Assertions.assertEquals("Test Author", book.getAuthor());
		Assertions.assertEquals("Fiction", book.getGenre());
		Assertions.assertTrue(book.getAvailabilityStatus());
	}

	@Test
	void testRemoveBook() {
		BookDTO book = bookService.addBook("Test Title 2", "Test Author 2", "Non-Fiction", true);
		Integer bookId = book.getBookId();
		bookService.deleteBook(bookId);
		Assertions.assertNull(bookService.getBookById(bookId));
	}

	@Test
	void testAddUser() {
		var user = userService.addUser("Saad", "saad@example.com", "password123", "1234567890");
		Assertions.assertNotNull(user);
		Assertions.assertEquals("John Doe", user.getName());
		Assertions.assertEquals("john@example.com", user.getEmail());
	}

	@Test
	void testRemoveUser() {
		var user = userService.addUser("karim", "karim@example.com", "password456", "9876543210");
		Integer userId = user.getUserId();
		userService.deleteUser(userId);
		Assertions.assertNull(userService.getUserById(userId));
	}
}

