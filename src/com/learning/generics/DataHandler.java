package com.learning.generics;

public class DataHandler<T> {

	T t;
	String name;
	String dept;

	public DataHandler(T t,String name,String dept) {
		this.t = t;
		this.name=name;
		this.dept=dept;
	}

	public T getT() {
		return t;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}
	
	

}
