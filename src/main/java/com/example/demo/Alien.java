package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") // by default its singleton(will create one object before creating)
// for prototype it will create obj in runtime
public class Alien {

	private int aId;
	private String aName;
	private String tech;
	
	@Autowired
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("Object created..");
	}
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("Yes its working");
		laptop.compile();
	}
	
}
