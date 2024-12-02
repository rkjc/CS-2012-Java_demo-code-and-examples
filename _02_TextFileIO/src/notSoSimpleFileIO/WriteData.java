package notSoSimpleFileIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class WriteData {
	public static void main(String[] args) {
		// this will expect the file to exist in the default location
		String pathString = "random_int_list.txt";
		Random rand = new Random();
		  
        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
        int randArr[] = new int[10];
        for (int i = 0; i<10;i++) {
        	randArr[i] = rand.nextInt(1000);
        }

		try {
			File aFile = new File(pathString);
			PrintWriter prtout = new PrintWriter(aFile);

			prtout.println("printing an array of random numbers");
			for (int i = 0; i<10;i++) {
				prtout.println(randArr[i]);
	        }
			
			prtout.flush();
			prtout.close();
			
			System.out.println("finished making random list");

		} catch (Exception e) {
			// if something breaks catch and print out what went wrong
			System.err.println(e);
		}
	}
}
