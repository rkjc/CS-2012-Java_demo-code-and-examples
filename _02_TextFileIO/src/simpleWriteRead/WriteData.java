package simpleWriteRead;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) {
		// this will expect the file to exist in the default location
		String pathString = "thisTestWriteOutput.txt";

		try {
			File aFile = new File(pathString);

			PrintWriter prtout = new PrintWriter(aFile);

			prtout.println("did this change");
			
			prtout.flush();
			prtout.close();
			
			System.out.println("made it this far");

		} catch (Exception e) {
			// if something breaks catch and print out what went wrong
			System.err.println(e);
			System.out.println("yep, you brok it");
		}
	}
}
