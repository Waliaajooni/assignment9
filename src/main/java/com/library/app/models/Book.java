package com.library.app.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	long bookCode;
	
	String bookName;
	String authName;
	Date date;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(long bookCode, String bookName, String authName) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.authName = authName;
	}


	public long getBookCode() {
		return bookCode;
	}


	public void setBookCode(long bookCode) {
		this.bookCode = bookCode;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthName() {
		return authName;
	}


	public void setAuthName(String authName) {
		this.authName = authName;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Book [bookCode=" + this.bookCode + ", bookName=" + this.bookName + ", authName=" + this.authName + ", date=" + this.date
				+ "]";
	}
	
}
