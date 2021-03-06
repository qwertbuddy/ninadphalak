package mergesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String args[]) {

		System.out.println("The first argument is the input file path, currently it is" + args[0]);
		Path inputFilePath = Paths.get(args[0]);
		int[] numList = null;
		numList = new int[100000];
		int index = 0;
		try {
			BufferedReader reader = Files.newBufferedReader(inputFilePath);
			String line = null;
			while ((line = reader.readLine()) != null) {
				numList[index] = Integer.parseInt(line);
				index++;
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// We have now all the input integers from file stored in array numList
		long countInversions = MergeSort.countInversions(numList);
		System.out.println("Number of inversions are: " + countInversions);
	}
}
