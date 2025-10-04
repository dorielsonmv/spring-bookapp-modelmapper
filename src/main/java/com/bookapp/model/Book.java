package com.bookapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	private String title;
	@Id
	@GeneratedValue
	private Integer bookId;
	private String author;
	private double price;
	private String isbn;
}
