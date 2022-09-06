package com.bookstore.Domain;

public class Book {

	private String title, author, isbn;
	private int year;
	private Double price;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Book() {}
	
	public Book(String title) {
		super();
		this.title= title;
	}
	
	public Book(String title, String author, int year, String isbn, Double price) {
		super();
		this.title= title;
		this.author=author;
		this.year=year;
		this.isbn=isbn;
		this.price=price;
		
	}	
}
