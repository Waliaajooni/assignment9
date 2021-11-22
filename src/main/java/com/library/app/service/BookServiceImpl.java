package com.library.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.app.dao.BookDao;
import com.library.app.models.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	public List<Book> getAllBooks() {
		return bookDao.findAll();
	}

	public Book getBook(long bookId) {
		return bookDao.findById(bookId).get();
	}

	public Book addBook(Book book) {
		bookDao.save(book);
		return book;
	}

	public Book updateBook(Book book) {
		bookDao.save(book);
		return book;
	}

	public void deleteBook(long bookId) {
		bookDao.deleteById(bookId);
	}

}
