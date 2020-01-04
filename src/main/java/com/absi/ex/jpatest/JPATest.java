package com.absi.ex.jpatest;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import com.absi.ex.jpatest.Person;
import com.absi.ex.jpatest.Car;
import com.absi.ex.jpatest.Citizen;
import com.absi.ex.jpatest.Dog;


public class JPATest
{
	public static void main(String args[])
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
		EntityManager em = emf.createEntityManager();


		Car myCar = new Car("Mazda CX7", "Pink", null);
		Person boss = new Person("Boss", 33, myCar);
		myCar.setOwner(boss);

		Car bmwCar = new Car("BMW 530i", "Yellow", boss);
		boss.addCar(bmwCar);

		Car jeepCar = new Car("Jeep Cherokee", "Green", boss);
		boss.addCar(jeepCar);

		//Dog newDog = new Dog("Trevor");
		//Citizen citizen = new Citizen("Al", 23, newDog);

		//temporary
		em.getTransaction().begin();
		//System.out.println((String)(em.createNativeQuery("select version()").getSingleResult()));
		em.persist(myCar);
		em.persist(boss);
		em.persist(bmwCar);
		em.persist(jeepCar);
		//em.persist(newDog);
		//em.persist(citizen);
		em.getTransaction().commit();
		em.getTransaction().begin();
		myCar.setColor("White");
		bmwCar.setColor("Blue");

		em.getTransaction().commit();
		em.close();

		

	}
}