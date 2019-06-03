package com.codefountain.lambda.basics;

import java.util.function.Function;

public class PersonMain {

	public static void main(String[] args) {
		
		Comparator<Person> ageComparator = (p1,p2) -> p1.getAge() - p2.getAge();
		Comparator<Person> firstNameComparator = (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Comparator<Person> lastNameComparator = (p1,p2) -> p1.getLastName().compareTo(p2.getLastName());
		
		Function<Person, Integer> ageCompFunction = person -> person.getAge();
		Function<Person, String> firstNameCompFunction = person -> person.getFirstName();
		Function<Person, String> lastNameCompFunction = person -> person.getLastName();
		
		Comparator<Person> ageComparingComparator = Comparator.comparing(Person::getAge);
		//Comparator<Person> firstNameComparingComparator = Comparator.comparing(firstNameComparator);
		//Comparator<Person> lastNameComparingComparator = Comparator.comparing(Person::getLastName);
		
	}
}
