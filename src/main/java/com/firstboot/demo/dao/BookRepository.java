package com.firstboot.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstboot.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
}
