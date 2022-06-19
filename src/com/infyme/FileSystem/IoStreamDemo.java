package com.infyme.FileSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IoStreamDemo {

	public static void main(String[] args) {

		try (FileOutputStream outFile = new FileOutputStream("OutFile.txt"); // For Byte Stream
				FileInputStream inFile = new FileInputStream("InFile.txt"); // For Byte Stream
				FileReader readFile = new FileReader("ReadFrom.txt"); // For Character Stream
				FileWriter writeFile = new FileWriter("WriteTo.txt");) // For Character Stream
		{
			// Byte Stream
			int a = inFile.read();
			while (a != -1) {
				outFile.write(a);
				a = inFile.read();
			}

			// Character Stream
			int b = readFile.read();
			while (b != -1) {
				writeFile.write(b);
				b = readFile.read();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}

}
