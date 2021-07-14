package com.logigear.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utility {

	public static String getProjectPath() {
		return System.getProperty("user.dir");
	}

	public static void writeToFile(String path, String data, boolean append) {
		try {
			File file = new File(Utility.getProjectPath() + path);
			file.createNewFile();
			
			FileWriter myWriter = new FileWriter(file, append);
			myWriter.write(data);
			
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public static void writeToFile(String path, String data) {
		Utility.writeToFile(path, data, false);
	}

	public static String readFromFile(String path) {
		String data = "";
		
		try {
			File myObj = new File(Utility.getProjectPath() + path);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				data += myReader.nextLine();
			}
			
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		return data;
	}
}
