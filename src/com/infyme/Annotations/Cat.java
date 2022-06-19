package com.infyme.Annotations;

@CustomAnnot(name = "Swapnith", num = 190826) // Custom Annotation For Class
public class Cat {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	int num;

	public Cat(String name) {
		this.name = name;
	}

	@RetentionDemo // Custom Annotation For Method
	public void Meow() {
		System.out.println("Meow Sound by Cat");
	}

	public void Eat() {
		System.out.println("Eating Sound by Cat");
	}
}
