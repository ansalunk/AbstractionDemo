package com.ivanti.impl;

import com.iavnti.ability.Barkable;

public class Dog extends Animal implements Barkable {

	

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("I bark");
	}

}
