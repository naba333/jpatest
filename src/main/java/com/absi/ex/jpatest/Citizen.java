package com.absi.ex.jpatest;

import com.absi.ex.jpatest.Dog;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Citizen
{
	private String name = "Name";
	private int age = 1;
	private Dog dog = null;

	@Id
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	public int getAge() { return this.age; }
	public void setAge(int age) { this.age = age; }

	@OneToOne
	public Dog getDog() { return this.dog; }
	public void setDog(Dog dog) { this.dog = dog; }


	Citizen()
	{
	}

	Citizen(String name, int age, Dog dog)
	{
		this.name = name;
		this.age = age;
		this.dog = dog;
	}
}