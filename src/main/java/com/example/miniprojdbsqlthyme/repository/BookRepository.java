package com.example.miniprojdbsqlthyme.repository;

import com.example.miniprojdbsqlthyme.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
  List<Book> books = new ArrayList<>();
  Connection conn = DatabaseConnectionManager.getConnection();


  public List<Book> getallbooks(){

    try {
      PreparedStatement pst =  conn.prepareStatement("select * from bookshelf"); {
        ResultSet resultset = pst.executeQuery();
        while(resultset.next()){
        books.add(new Book(
            resultset.getInt("id"),
            resultset.getString("name"),
            resultset.getString("year")));
        }

      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return books;
  }

  public Book getBook(int id){

    try {
      PreparedStatement pst =  conn.prepareStatement("select * from bookshelf where id=?"); {
        pst.setInt(1, id);
        ResultSet resultset = pst.executeQuery();

        if (resultset.next()){
          books.add(new Book(
              resultset.getInt("id"),
              resultset.getString("name"),
              resultset.getString("year")));
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
  public void create(Book book) {

    try {
      PreparedStatement psts = conn.prepareStatement("INSERT INTO bookshelf (name, year) VALUES (?,?)");
      psts.setString(1, book.getName());
      psts.setString(2, book.getYear());
      psts.executeUpdate();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

}
