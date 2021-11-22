package com.library.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.models.Book;

public interface BookDao extends JpaRepository<Book, Long>{
	
}
