package adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class DayOne { 
	
	static Integer maxCalories = 0;
	static Integer secondCalories = 0;
	static Integer thirdCalories = 0;
	

	public static void main(String[] args) throws IOException {
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		InputStream inputStream =  cl.getResourceAsStream("dayOne.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		String line = br.readLine();
		Integer calories = 0;
		ArrayList<Integer> values = new ArrayList<>();
		while(line != null) {
			if(!line.equals("")) {
				calories = calories + Integer.valueOf(line);
			} else {
				values.add(calories);
				calories = 0;
			}
			
			line=br.readLine();
		}
		Collections.sort(values,Collections.reverseOrder());
		
		System.out.println(values.get(0));
		System.out.println(values.get(1));
		System.out.println(values.get(2));
		
		System.out.println(values.get(0) + values.get(1) + values.get(2));
	
		br.close();
	}
}
