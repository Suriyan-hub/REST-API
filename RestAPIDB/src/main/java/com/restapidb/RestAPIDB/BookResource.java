package com.restapidb.RestAPIDB;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;

//import javax.print.attribute.standard.Media;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("books")
public class BookResource
{
	BookRepository br=new BookRepository();
	
@GET
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})//Using both format is called content negotiation
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
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Book createBook(Book b)
{
	System.out.println("created book"+b);
	br.create(b);
	return b;
}

@PUT
@Path("book")
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Book updateBook(Book b)
{
	System.out.println("Updated book"+b);
	if(br.getBook(b.getId()).getId()==0)
	{
		br.create(b);
	}
	else
	{
		br.update(b);
	}
	return b;
}
@Path("bookk/{id}")
@DELETE
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Book deleteBook(@PathParam("id") int id)
{
	 Book b = br.getBook(id);
	  if(b.getId()!=0)
	  {
		  br.delete(id);
	  }
	 return b;
} 
}


