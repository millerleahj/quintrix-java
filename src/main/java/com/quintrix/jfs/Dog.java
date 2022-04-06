package com.quintrix.jfs;

public class Dog {

	private String breed;
	private int age;
	private String color;

	public Dog() {

	}

	public Dog(String breed, int age, String color) {
		super();
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public static int NUM_OF_LEGS = 4;

	SpecialDog specialDog; // Composition: has-a

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void barking() {
		int i;
	}

	void hungry() {
	}

	void sleeping() {
	}

	@Override
	public String toString() {
		return "ExtendEx [breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}

	public void DogNotes() {
		/*
		 * 
		 * Instance Variables: typically PRIVATE to keep others from using elsewhere;
		 * defined at the top of the class to be used throughout
		 * 
		 * CREATE GETTERS/SETTERS: this allows to change/act on private variables using
		 * Source: Generate Getters and Setters to quick complete
		 * 
		 * 
		 * CREATE CONSTRUCTORS: create constructors using Source to build an object
		 * 
		 * 
		 * CREATE A toSTRING method using Source; returns the value of the object rather
		 * than memory location
		 * 
		 * 
		 */
	}

}
