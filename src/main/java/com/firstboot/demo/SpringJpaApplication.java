package com.firstboot.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.firstboot.demo.dao.BookRepository;
import com.firstboot.demo.entity.Author;
import com.firstboot.demo.entity.Book;


@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJpaApplication.class, args);
		BookRepository bookDao = ctx.getBean(BookRepository.class);

}
}
