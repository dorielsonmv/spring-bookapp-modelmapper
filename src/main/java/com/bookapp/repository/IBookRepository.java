package com.bookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookapp.model.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> {

	//deruved query
	List<Book> findByAuthor(String author);
}
