package com.infyme.Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Practice {
	public static void main(String args[]) throws IllegalAccessException, InvocationTargetException {
		@SuppressWarnings("unused")

		Cat mycat = new Cat("Mine");
		Dog d = new Dog("Tanco");
		if (mycat.getClass().isAnnotationPresent(CustomAnnot.class)) {
			System.out.println("Custom Annotation is Applied");
		} else {
			System.out.println("Custom Annotation is Not Applied");
		}

		// For Dog Class
		System.out.println();
		for (Method method : d.getClass().getDeclaredMethods()) {

			if (method.isAnnotationPresent(RetentionDemo.class)) {
				method.invoke(d);
			}
		}

		// For Cat Class
		System.out.println();
		for (Method method : mycat.getClass().getDeclaredMethods()) {

			if (method.isAnnotationPresent(RetentionDemo.class)) {
				method.invoke(mycat);
			}
		}

	}

}
