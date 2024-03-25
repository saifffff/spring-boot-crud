package com.firstboot.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.firstboot.demo.dao.BookRepository;
import com.firstboot.demo.entity.Book;

@Controller
public class MainController {
	@Autowired
	private BookRepository bookDao;
	
	@RequestMapping("/home")
	public String goHome(Model model) {
		System.out.println("taking you to homepage..");
		// getting all books
		List<Book> allBooks = this.bookDao.findAll();
		model.addAttribute("allBooks", allBooks);
		
		return "home";
	}
	
	@RequestMapping("/submit")
	public RedirectView handleForm(@ModelAttribute Book book) {
		Book saved = this.bookDao.save(book);
		System.out.println("added book : "+book.getName());
		return new RedirectView("home");
	}
	
	
}
