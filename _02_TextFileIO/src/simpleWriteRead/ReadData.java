package simpleWriteRead;

import java.io.File;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws Exception {
		// Create a File instance

		Scanner inputthing = null;

		try {
			File file;
			// Create a Scanner for the file

			file = new File("thisNonexistantFile.txt");
			inputthing = new Scanner(file);
			// Read data from a file
			while (inputthing.hasNext()) {
				String firstName = inputthing.next();
				String mi = inputthing.next();
				String lastName = inputthing.next();
				// int score = inputthing.nextInt();
				System.out.println(firstName + " " + mi + " " + lastName + " "); // + score);

			}

		} catch (Exception e) {
			System.err.println(e);
			System.out.println("yep, you gave us a bad file");
		} 

		System.out.println("this is a thousand line of code");

		// Close the file
		inputthing.close();
	}
}
