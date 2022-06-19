package com.infyme.lamda_expression;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class ProductUtility {

	public static void main(String[] args) {
		Product frock = new Product(1001, "Frock", 5.0, 100);
		Product watch = new Product(2001, "Watch", 4.9, 600);
		Product shirt = new Product(3001, "Shirt", 4.5, 500);
		Product violin = new Product(4001, "Violin", 3.5, 800);
		List<Product> lst = Arrays.asList(frock, watch, shirt, violin);
		System.out.println("Product based on price");
		evaluate(lst, p -> (p.getPrice() > 500));
		System.out.println("Product based on rating");
		evaluate(lst, p -> (p.getRating() > 4));
	}

	public static void evaluate(List<Product> lst, Predicate<Product> predicate) {
		for (Product id : lst) {
			if (predicate.test(id))
				System.out.println(id.getName());
		}
	}
}
class Product {
	private Integer id;
	private String name;
	private Double rating;
	private Integer price;

	public Product() {	}

	public Product(Integer id, String name, Double rating, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}