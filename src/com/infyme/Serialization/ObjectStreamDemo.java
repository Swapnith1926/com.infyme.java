package com.infyme.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	// using ObjectStream
	public static void main(String[] args) {

		try(ObjectOutputStream objStreamOut = new ObjectOutputStream(new FileOutputStream(EmployeeData.txt));
				(ObjectInputStream objStreamIn = new ObjectInputStream(new FileInputStream(EmployeeData.txt));)
		{
					EmployeeDemo Emp = new EmployeeDemo("Swapnith", 19, "DSE", "19/08/2000", 21);
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
