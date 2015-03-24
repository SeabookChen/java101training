package au.com.fujitsu.java101.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
	/**
	 * An example of Checked Exception
	 * @param filename
	 * @return
	 */
	public String readSimpleFile(String filename) {
		FileReader fr = null;
		BufferedReader br = null;
		StringBuffer sb = new StringBuffer();
		
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String line = br.readLine();
			
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			  if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return sb.toString();
	}
	
	/**
	 * An example of runtime exception
	 * @param a
	 * @param b
	 */
	public int[] arrayOutOfBound(int size) {
		int[] numbers = new int[size];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[3] = 3;
		numbers[4] = 4;
		
		return numbers;
	}
}