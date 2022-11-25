package com.restapi.restdemo1;

import java.util.ArrayList;
import java.util.List;

//import com.restapi.restdemo1.Book;

public class BookRepository {
	List<Book> book;
	public BookRepository()
	{
		book=new ArrayList<>();
		Book b1=new Book();
		
		 b1.setName("The Adventure Stories");
		 b1.setId(50);
		 
		 Book b2=new Book();
			
		 b2.setName("The kids Stories");
		 b2.setId(60);
		
		 
		 book.add(b1);
		 book.add(b2);
	}
	public List<Book> getBooks(){
		System.out.println("Hello");
		return book;
		
	}
	public Book getBook(int id) {
		for(Book b:book) {
			if(b.getId()== id) {
				return b;
			}
		}
		return new Book();
	}
	public void create(Book b) {
		book.add(b);
		
	}
}

