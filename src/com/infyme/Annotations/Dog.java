package com.infyme.Annotations;

public class Dog {

	String name;
	int num;

	public Dog(String name) {
		this.name = name;
	}

	@RetentionDemo // Custom Annotation For Method
	public void Bark() {
		System.out.println("Bow Bow Sound by Dog");
	}

	public void Eat() {
		System.out.println("Eating Sound by Dog");
	}
}
