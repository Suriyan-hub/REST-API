package com.demo.restapidemo;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private String name;
	private int rno;
	private int mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
}
