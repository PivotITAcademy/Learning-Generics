package com.learning.generics;

public class LearningGenerics2 {

	public static void main(String[] args) {

		String[] names = { "Munni", "Sheela", "Jalebi", "Chameli" };

		Integer[] ages = { 23, 22, 21, 24 };

		Character[] intial = { 'm', 's', 'j', 'c' };

		Integer lowestAge=print(ages, 45);
		System.out.println(lowestAge);

		String firstName=print(names,"Second argument");

		Character c=print(intial,"Second argument");
		
		
		Kuldeep<Integer> kuldeep=(a, b)->System.out.println(a+b);;
		
	
		kuldeep.sum(10, 5);
		

	}

	public static <T,V> T print(T[] array,V v) {

		System.out.println(v);
		return array[0];
		
		
		

	}

}
