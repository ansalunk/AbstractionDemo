package com.ivanti.impl;

import com.iavnti.ability.Jumpable;

public abstract class Animal extends RandomField implements Jumpable{

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
		System.out.println("I jump");
	}
}
