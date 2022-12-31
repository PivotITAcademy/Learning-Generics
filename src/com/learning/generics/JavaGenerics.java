package com.learning.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JavaGenerics {

	public static void main(String[] args) {

		Person tom = new Person("Tom", 89);
		Person dick = new Person("dick", 65);
		Person harry = new Person("harry", 100);

		List<Person> person = new ArrayList<>();
		person.add(tom);
		person.add(dick);
		person.add(harry);

		Person youngestMember =  min(person,(d1,d2)->Integer.compare(d1.getAge(), d2.getAge()));
		System.out.println(youngestMember);

		// 
		
		Cars bmw=new Cars("BMW", 500, 2017, "WHITE");
		Cars audi=new Cars("audi", 1500, 2012, "black");
		Cars merc=new Cars("merc", 7500, 2015, "magenta");
		
		List<Cars> carList=new ArrayList<>();
		carList.add(bmw);
		carList.add(merc);
		carList.add(audi);
		
		Cars cheapestCar=min(carList,(c1,c2)->Integer.compare(c1.getPrice(), c2.getPrice()));
		System.out.println(cheapestCar.getName());
		
		Cars oldest=min(carList,(c1,c2)->Integer.compare(c1.getMakeYear(), c2.getMakeYear()));
		System.out.println(oldest.getName());

	}

	private static <T> T min(List<T> list,Comparator<T> comparator) {
		
		
		T lowest=list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			T lowestElementAtIndex=list.get(i);
			if(comparator.compare(lowestElementAtIndex, lowest)<0) {
				lowest=lowestElementAtIndex;
			}
		}
		
		return lowest;
	}

}
