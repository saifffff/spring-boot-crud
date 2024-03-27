package com.firstboot.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="book_title")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Author auth;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", auth=" + auth + "]";
	}
	public Author getAuth() {
		return auth;
	}
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
