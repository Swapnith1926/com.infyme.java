package com.infyme.FileSystem;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		// For Random Access File Demo
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter name of File or Directory - Eg D:\\InfosysTraining ");
		// String inFilename = sc.nextLine().trim();
		File f = new File("output.txt");
		System.out.println("File Or Directory Name - " + f.getName());
		System.out.println("Given file is Already Existing - " + f.exists());
		System.out.println("File Created - " + f.createNewFile());
		System.out.println("File Path - " + f.getPath());

		System.out.println("Given file is Directory - " + f.isDirectory());
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		raf.writeUTF("I am Swapnith,Im Fresher in Infosys Ltd.I am Digital Specialist Engineer and I love Shreya Baby");
		System.out.println("Current Position - " + raf.getFilePointer());
		raf.seek(0);
		System.out.println("Current Position after using seek - " + raf.getFilePointer());
		System.out.println(raf.readUTF());
		raf.close();
		sc.close();
	}
}
