package com.infyme.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnot {
	String authorName();

	String methodName();

	int id() default 1926;

}

abstract class Phone {
	String mobileName;

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	abstract double price();

}

@MyAnnot(authorName = "Sam", methodName = "price")
class Nokia extends Phone {

	@Override
	double price() {
		return 15000;
	}

	double calc() {
		return 13000;
	}

}

class CustomAnnotationDemo {
	public static void main(String[] args) throws Exception {
		Phone ph = new Nokia();
		@SuppressWarnings("rawtypes")
		Class c = ph.getClass();

		// Fetches the list of annotations of the class, Nokia
		Annotation annotations[] = c.getDeclaredAnnotations();
		for (Annotation annotation : annotations) {
			// Print the name of the annotation
			System.out.println(annotation.annotationType().getName());
			ph.setMobileName("Nokia 9");
			System.out.println("Mobile Name : " + ph.getMobileName());
			// Fetches the list of attributes of the annotation
			Method[] fields = annotation.annotationType().getDeclaredMethods();
			for (Method field : fields) {
				// print the attribute name
				System.out.print(field.getName());
				// fetch the value for the attribute
				Object value = field.invoke(annotation, (Object[]) null);
				System.out.println("\t" + value);
			}
		}
	}
}