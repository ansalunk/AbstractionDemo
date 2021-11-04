package com.ivanti.impl;

import java.util.List;

public abstract class RandomField {

	int index;
	String message;
	boolean isAnimal;
	List<String> ls;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isAnimal() {
		return isAnimal;
	}
	public void setAnimal(boolean isAnimal) {
		this.isAnimal = isAnimal;
	}
	public List<String> getLs() {
		return ls;
	}
	public void setLs(List<String> ls) {
		this.ls = ls;
	}
	
	@Override
	public String toString() {
		return "RandomField [index=" + index + ", message=" + message + ", isAnimal=" + isAnimal + ", ls=" + ls + "]";
	}
	
	
	
	
	
}
