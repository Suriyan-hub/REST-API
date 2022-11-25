package com.restapidb.RestAPIDB;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	private String name;
	private int id;
	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + "]";
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
