package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.BookRequest;
import com.bookapp.model.BookResponse;
import com.bookapp.service.IBookService;

@RestController
public class BookController {
	
	@Autowired
	private IBookService bookService;

	@PostMapping("/books")
	ResponseEntity<Void> addOneBook(@RequestBody BookRequest bookRequest) {
		bookService.addBook(bookRequest);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@PutMapping("/books")
	ResponseEntity<Void> updateOneBook(@RequestBody BookRequest bookRequest) {
		bookService.updateBook(bookRequest);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	@DeleteMapping("/books/bookId/{bookId}")
	ResponseEntity<Void> deleteBookById(@PathVariable int bookId) {
		bookService.deleteBook(bookId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping("/books/bookId/{bookId}")
	ResponseEntity<BookResponse> getBookById(@PathVariable int bookId) {
		BookResponse  bookResponse=bookService.getById(bookId);
		return ResponseEntity.ok(bookResponse);
	}

	@GetMapping("/books")
	ResponseEntity<List<BookResponse>> getAllBooks() {
		List<BookResponse> books = bookService.getAll();
		return ResponseEntity.ok(books);
	}
	@GetMapping("/books/author/{author}")
	ResponseEntity<List<BookResponse>> getBooksByAuthor(@PathVariable String author) {
		List<BookResponse> books = bookService.getByAuthor(author);
		return ResponseEntity.ok(books);
	}

}





