package com.infyme.FileSystem;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlerDemo {

	public static void main(String[] args) throws IOException {
		// For File Handler Demo
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter name of File or Directory - Eg D:\\InfosysTraining ");
		String inFilename = sc.nextLine().trim();
		File f = new File(inFilename);
		System.out.println("File Or Directory Name - " + f.getName());
		System.out.println("Given file is Already Existing - " + f.exists());
		System.out.println("File Created - " + f.createNewFile());
		System.out.println("File Path - " + f.getPath());
		System.out.println("Given file is Directory - " + f.isDirectory());
		System.out.println("File List - " + f.list());
		System.out.println("Details of File or Directory :");
		String[] s = f.list(); // To Display Files i
		if (s == null) {
			System.out.println("The Given input is a file and there are no subfolders to List");
		} else {
			for (String str : s) {
				System.out.println(str);
			}
			System.out.println("Total Count of Files - " + s.length);
			sc.close();
		}

	}
}
