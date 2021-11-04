package com.ivanti.main;

import java.util.ArrayList;
import java.util.List;

import com.ivanti.impl.Dog;
import com.ivanti.impl.Frog;

public class TestDemo {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.bark();
		
		Frog frog1 = new Frog();
		frog1.croak();
		
		dog1.jump();
		frog1.jump();
		
		List<String> ls = new ArrayList<>();
		ls.add("poodle");
		ls.add("doberman");
		ls.add("golden retriever");
		
		//Arbitrary number of unique fields using RandomField Class
		
		Dog dog2 = new Dog();
		dog2.setAnimal(true);
		dog2.setIndex(1);
		dog2.setMessage("Hi this is Tommy");
		dog2.setLs(ls);
		
		System.out.println(dog2.toString());
		
		
		
	}

}
