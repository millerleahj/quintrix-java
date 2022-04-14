package com.quintrix.jfs;

public class Dog implements Comparable<Dog> { // added compare (to see if they are the same)

	private int dogID;
	private String breed;
	private int age;
	private String color;

	public Dog() {

	}

	public Dog(int dogID, String breed, int age, String color) { // added dogID
		super();
		this.dogID = dogID;
		this.breed = breed;
		this.age = age;
		this.color = color;

	}

	public static int NUM_OF_LEGS = 4;

	SpecialDog specialDog; // Composition: has-a

	public int getDogID() {
		return dogID;
	}

	public void setDogID(int dogID) {
		this.dogID = dogID;
	}

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
		return "Dog [breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dogID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (dogID != other.dogID)
			return false;
		return true;
	}

	/*
	 *
	 * Hash and equals must go together; contract there are rules for how they work
	 * 
	 * when generate: what is chosen is what has to be equal to be seen as same (if
	 * age, breed, and dogID are all equal they are the same) OR (if dogID is equal
	 * they are the same)
	 *
	 *
	 */

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

	// Tried Comparator

//	@Override
//	public int compare(Dog o1, Dog o2) {
//		// TODO Auto-generated method stub
//		return o1.getBreed().compareToIgnoreCase(o2.getBreed()); 
//		
//	}

	@Override
	public int compareTo(Dog d) {
		// return Integer.compare(getDogID(), d.getDogID());

		// create two compares for sort
		if (Integer.compare(getDogID(), d.getDogID()) == 0) {
			return Integer.compare(getAge(), d.getAge());
		} else {
			return Integer.compare(getDogID(), d.getDogID());
		}

	}

}
