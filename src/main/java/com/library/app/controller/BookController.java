package com.library.app.controller;

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

import com.library.app.models.Book;
import com.library.app.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Home Page";
	}
	
	//list of books
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return this.bookService.getAllBooks();
	}
	
	//get a single book
	@GetMapping("/books/{bookCode}")
	public Book getBook(@PathVariable String bookCode) {
		return this.bookService.getBook(Long.parseLong(bookCode));
	}
	
	//add a single book
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	
	//update a book
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}
	
	
	//delete book
	@DeleteMapping("/books/{bookCode}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String bookCode) {
		try {
			this.bookService.deleteBook(Long.parseLong(bookCode));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
