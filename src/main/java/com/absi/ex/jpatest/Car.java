package com.absi.ex.jpatest;

import com.absi.ex.jpatest.Person;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

@Entity
public class Car
{
	private String model = "xxx";
	private String color = "black";
	private Person owner;

	@Id
	public String getModel() { return this.model; }
	public void setModel(String model) { this.model = model; }

	public String getColor() { return this.color; }
	public void setColor(String color) { this.color = color; }

	@ManyToOne
	public Person getOwner() { return this.owner; }
	public void setOwner(Person owner) { this.owner = owner; }

	Car()
	{
	}

	Car(String model, String color, Person owner)
	{
		this.model = model;
		this.color = color;
		this.owner = owner;
	}

}