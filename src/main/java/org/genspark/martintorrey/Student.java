package org.genspark.martintorrey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class Student {
	 
	@Autowired
	private int id;
	 
	@Autowired
	private String name;
	 
	@Autowired
	private List<Phone> ph;
	 
	@Autowired
	private Address add;

	
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

	public List<Phone> getPh() {
		return ph;
	}

	public void setPh(List<Phone> ph) {
		this.ph = ph;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	
	public Student() {
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ph=" + ph + ", add=" + add + "]";
	}
	
	
}
