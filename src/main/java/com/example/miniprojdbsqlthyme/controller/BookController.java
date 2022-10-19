package com.example.miniprojdbsqlthyme.controller;

import com.example.miniprojdbsqlthyme.model.Book;
import com.example.miniprojdbsqlthyme.repository.BookRepository;
import com.example.miniprojdbsqlthyme.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class BookController {
//  BookRepository repository = new BookRepository();
  BookService service = new BookService();
  @GetMapping("/")
  public String index(){
    return "index";
  }

 @PostMapping("/create")
    public String create(WebRequest payload){
     service.create(payload);
   return "redirect:/";
 }

 }

/*@GetMapping("/repo")
public List<Book> repo(){
    return repository.getallbooks();
}*/

