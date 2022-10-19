package com.example.miniprojdbsqlthyme.model;

public class Book {
  private String year;
  private String name;
  private int id;

  public Book(String name, String year) {
    this.name = name;
    this.year = year;
  }

  public Book(int id, String name, String year) {
    this.id = id;
    this.name = name;
    this.year = year;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


}
