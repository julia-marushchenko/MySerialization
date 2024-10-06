package com.example.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Main class to run java program
public class Main {

	public static void main(String str []) throws IOException {
		
		// Creating object Book
		Book book = new Book(1, "Mitch Elbom", "Tuesdays with Morrie", 2007, "Life of a nice man.");
		
		//Serialization of the object with type Book
		try {
			FileOutputStream fos = new FileOutputStream("Book.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(book);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Deserialization of the object with type Book
		FileInputStream fis = new FileInputStream("Book.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Book book1 = new Book();
		try {
			book1 = (Book)ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		ois.close();
		
		
		//Printing information of book object
		System.out.println("Object of a book to serialize and deserialize " + book.toString());
		//Printing information of serialized book
		System.out.println("Desirealized object " + book1.toString());
	}
}
