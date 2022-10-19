package com.example.miniprojdbsqlthyme.service;

import com.example.miniprojdbsqlthyme.model.Book;
import com.example.miniprojdbsqlthyme.repository.BookRepository;
import com.example.miniprojdbsqlthyme.repository.DatabaseConnectionManager;
import org.springframework.web.context.request.WebRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService {
  BookRepository bookservice = new BookRepository();
  Connection conn = DatabaseConnectionManager.getConnection();


  public List<Book> getallbooks() {
    return bookservice.getallbooks();
  }

    public Book getBook(int id){
      return bookservice.getBook(id);
    }


public void create(WebRequest payload) {
Book book = new Book(
    payload.getParameter("name"),
    payload.getParameter("year"));
  bookservice.create(book);

  }
}
