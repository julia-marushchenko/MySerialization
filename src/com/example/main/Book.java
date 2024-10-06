package com.example.main;

import java.io.Serializable;
import java.util.Objects;

// Class bean with information of a book and parameters id, name, author, int year
public class Book implements Serializable{
	
	//UID of class Book
	private static final long serialVersionUID = 475465L;
	// Book number in a library
	int id;
	// String value with name of a book
	String name;
	// String value with name of a book
	String author;
	//Integer value of year of publishing
	int YearOfpublishing;
	// Plot of the book
	transient String plot;
		
	// Constructor with required information to add it to a storage
	public Book(int id, String name, String author, int yearOfpublishing, String plot) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		YearOfpublishing = yearOfpublishing;
		this.plot = plot;
	}
	public Book(int id) {
		super();
		this.id = id;
	}
	public Book() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearOfpublishing() {
		return YearOfpublishing;
	}
	public void setYearOfpublishing(int yearOfpublishing) {
		YearOfpublishing = yearOfpublishing;
	}
	@Override
	public int hashCode() {
		return Objects.hash(YearOfpublishing, author, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return YearOfpublishing == other.YearOfpublishing && Objects.equals(author, other.author) && id == other.id
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Book [id= " + id + ", name = " + name + ", author = " + author + ", YearOfpublishing = " + YearOfpublishing
				+ "]";
	}
	
	
}
