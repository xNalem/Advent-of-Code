package adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Stream;

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
		while(line != null) {
			if(!line.equals("")) {
				calories = calories + Integer.valueOf(line);
			} else {
				setThreeMaxCalories(calories);
				calories = 0;
			}
			
			line=br.readLine();
		}
		
		System.out.println(maxCalories);
		System.out.println(secondCalories);
		System.out.println(thirdCalories);
		
		System.out.println(maxCalories + secondCalories + thirdCalories);
	
		br.close();
	}
	
	private static void setThreeMaxCalories(Integer calo) {
		if(maxCalories < calo) {
			thirdCalories = secondCalories;
			secondCalories = maxCalories;
			maxCalories = calo;
			
		} else if(secondCalories < calo) {
			thirdCalories = secondCalories;
			secondCalories = calo;
		} else if(thirdCalories < calo) {
			thirdCalories = calo;
		}
	

	}
}
