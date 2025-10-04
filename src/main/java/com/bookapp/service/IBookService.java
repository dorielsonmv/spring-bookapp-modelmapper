package com.bookapp.service;

import java.util.List;

import com.bookapp.model.BookRequest;
import com.bookapp.model.BookResponse;

public interface IBookService {

	void addBook(BookRequest bookRequest);
	void updateBook(BookRequest bookRequest);
	void deleteBook(int bookId);
	//querying 
	BookResponse getById(int bookId);
	List<BookResponse> getAll();
	List<BookResponse> getByAuthor(String author);
	
}
