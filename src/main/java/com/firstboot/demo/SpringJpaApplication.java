package com.firstboot.demo;

import java.util.ArrayList;
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
//		hp.setName("The Casual Vacancy");
//		hp.setWriter("j.k.rowling");
//		
//		Book hp1 = new Book();
//		hp1.setName("Fantastic Beasts & Where to Find Them");
//		hp1.setWriter("j.k.rowling");
//		
//		Book hp2 = new Book();
//		hp2.setName("Quidditch Through the Ages");
//		hp2.setWriter("j.k.rowling");
//		
//		Book hp3 = new Book();
//		hp3.setName("The Silkworm");
//		hp3.setWriter("j.k.rowling");
//		
//		Book mb1 = new Book();
//		mb1.setName("To Con a Gentleman");
//		mb1.setWriter("Sarah Adams");
//		
//		Book mb2 = new Book();
//		mb2.setName("Practice Makes Perfect");
//		mb2.setWriter("Sarah Adams");
//		
//		Book mb3 = new Book();
//		mb3.setName("The Cheat Sheet");
//		mb3.setWriter("Sarah Adams");
//		
//		Book mb4 = new Book();
//		mb4.setName("When in Rome");
//		mb4.setWriter("Sarah Adams");
//		
//		List<Book> myreads = new ArrayList<>();
//		myreads.add(hp); myreads.add(hp1); myreads.add(hp2); myreads.add(hp3);
//		myreads.add(mb1); myreads.add(mb2); myreads.add(mb3); myreads.add(mb4);
//		
//		bs.saveAll(myreads);
//		System.out.println("save all books");
		
		
		
//		System.out.println("book deleted");
//		bs.deleteById(102);
		
//		List<Book> allBooks = bs.findAll();
//		for(Book book : allBooks) {
//			System.out.println(book);
//		}
		
//		
//		List<Book> allbyWriter = bs.findByWriter("Sarah Adams");
//		for(Book bk : allbyWriter) {
//			System.out.println(bk);
//		}
	}

}
