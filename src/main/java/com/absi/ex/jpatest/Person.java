package com.absi.ex.jpatest;

import com.absi.ex.jpatest.Car;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Person
{
	private String name = "Name";
	private int age = 1;
	private List<Car> cars = new ArrayList<>();

	@Id
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	public int getAge() { return this.age; }
	public void setAge(int age) { this.age = age; }

	@OneToMany(mappedBy="owner")
	public List<Car> getCars() { return this.cars; }
	public void setCars(List<Car> cars) { this.cars = cars; }

	public void addCar(Car newCar) { this.cars.add(newCar); }


	Person()
	{
	}

	Person(String name, int age, Car car)
	{
		this.name = name;
		this.age = age;
		this.cars.add(car);
	}
}