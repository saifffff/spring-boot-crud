package com.firstboot.demo;

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
		
		Book mybook1 = new Book();
		mybook1.setName("deep work");
		mybook1.setWriter("cal newport");
		
		bs.save(mybook1);
		System.out.println("book created");
		
	}

}
