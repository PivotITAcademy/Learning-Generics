package com.learning.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearningGenerics {

	public static void main(String[] args) {

		DataHandler<Student> nav = new DataHandler<Student>(new Student(28), "Navjot", "Math");
		DataHandler<Student> kul = new DataHandler<Student>(new Student(24), "Kuldeep", "Physic");
		DataHandler<Student> san = new DataHandler<Student>(new Student(22), "Sannil", "Biology");

		List<DataHandler<Student>> myStudentList = List.of(nav,kul,san);

		myStudentList.add(nav);
		myStudentList.add(kul);
		myStudentList.add(san);
		
		
		
		
		Comparator<DataHandler<Student>> comparator=(d1,d2)->Integer.compare(d1.t.getAge(), d2.t.getAge());
		
		Collections.sort(myStudentList,comparator );
		
		myStudentList.sort(comparator);
		
		myStudentList.forEach(c->System.out.println(c.getName()));
		

		DataHandler<Lecturer> swaroop = new DataHandler<Lecturer>(new Lecturer(1500), "Krishna", "QA");
		DataHandler<Lecturer> manvir = new DataHandler<Lecturer>(new Lecturer(1800), "mavir", "dev");

		List<DataHandler<Lecturer>> myLectList = new ArrayList<>();
		myLectList.add(swaroop);
		myLectList.add(manvir);
		
		

	}

}
