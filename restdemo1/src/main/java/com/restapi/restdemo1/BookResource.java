package com.restapi.restdemo1;

import java.util.List;


//import javax.print.attribute.standard.Media;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("books")
public class BookResource
{
	BookRepository br=new BookRepository();
@GET
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public List<Book> getBooks()
	{
	 System.out.println("Book Called.....");
	 
	 List<Book> book = br.getBooks();
	 return book;
	}


@Path("bookk/{id}")
@GET
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Book getBook(@PathParam("id") int id)
{
	System.out.println("hi" +id);
	
   return br.getBook(id);
  
}

@POST
@Path("book")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Book createBook(Book b)
{
	System.out.println("created book"+b);
	br.create(b);
	return b;
}
}

