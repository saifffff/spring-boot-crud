package com.firstboot.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.firstboot.demo.dao.BookRepository;
import com.firstboot.demo.entity.Book;


@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJpaApplication.class, args);
		BookRepository bs = ctx.getBean(BookRepository.class);
		
//		Book hp = new Book();
//		hp.setName("Harry Potter");
//		hp.setWriter("j.k.rowling");
//		bs.save(hp);
//		System.out.println("saved harry potter");
		
//		System.out.println("book deleted");
//		bs.deleteById(102);
		
//		List<Book> allBooks = bs.findAll();
//		for(Book book : allBooks) {
//			System.out.println(book);
//		}
		
	}

}
