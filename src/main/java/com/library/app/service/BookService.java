package com.library.app.service;

import java.util.List;

import com.library.app.models.Book;

public interface BookService {
	
	public List<Book> getAllBooks();
	
	public Book getBook(long bookId);
	
	public Book addBook(Book book);
	
	public Book updateBook(Book book);
	
	public void deleteBook(long bookId);

}
