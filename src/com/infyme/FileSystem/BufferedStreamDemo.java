package com.infyme.FileSystem;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("Current MilliSeconds : " + System.currentTimeMillis());
		BufferedInputStream inFile = new BufferedInputStream(new FileInputStream("D:\\InfosysTraining\\Demo.txt"));
		BufferedOutputStream outFile = new BufferedOutputStream(new FileOutputStream("D:\\InfosysTraining\\Demo1.txt"));

		System.out.println("Writing Data from Demo.txt to Demo1.txt");
		int a = inFile.read();
		while (a != -1) {
			outFile.write(a);
			a = inFile.read();
		}
		System.out.println("Time Taken to Finish - " + (System.currentTimeMillis() - startTime));

		System.out.println("Contents in File after Writing are in " + "D:\\InfosysTraining\\Demo1.txt");
		inFile.close();
		outFile.close();
	}

}
