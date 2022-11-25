package com.restapidb.RestAPIDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//import com.restapi.restdemo1.Book;

public class BookRepository {
	Connection con=null;
	public BookRepository()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restdb","root","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected");
	}
	public List<Book> getBooks(){
		List<Book> book=new ArrayList<>();
		String sql="select * from book";
		try {
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Book b=new Book();
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				
				book.add(b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fetch the data");
		return book;
		
	}
	public Book getBook(int id) {
		String sql="select * from book where id="+id;
		Book b=new Book();
		try {
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) 
			{
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
	public void create(Book b) {
		String sql="insert into book values(?,?)";
		try {
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, b.getId());
			st.setString(2, b.getName());
			st.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Book Inserted");
	}
	public void update(Book b) {
		String sql="update book set name=? where id=?";
		try {
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, b.getName());
			st.setInt(2, b.getId());
			st.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Book Updated");
	}
	public void delete(int id) {
		String sql="delete from book where id=?";
		try {
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Book Deleted");
		
	}
}

