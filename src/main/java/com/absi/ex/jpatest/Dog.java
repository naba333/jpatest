package com.absi.ex.jpatest;

import com.absi.ex.jpatest.Citizen;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

@Entity
public class Dog
{
	private String name = "Rex";

	@Id
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	Dog()
	{
	}

	Dog(String name)
	{
		this.name = name;
	}

}