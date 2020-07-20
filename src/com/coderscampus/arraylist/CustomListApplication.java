package com.coderscampus.arraylist;

import java.util.Random;
import java.util.Scanner;

public class CustomListApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random randomNumber = new Random();
		
		
		CustomList<Integer> integers = new CustomArrayList<>(); 
		
		System.out.print("Enter number of elements to be added: ");
		Integer numberOfElements = scanner.nextInt();

		for (int i = 0; i < numberOfElements; i++) {
			integers.add(randomNumber.nextInt(1000));
		}
		
		System.out.println("\nElements in CustomArrayList (Integers):\n");
		for (int i = 0; i < integers.getSize(); i++) {
			System.out.println("index " +i + " : " + integers.get(i));
		}
		
		System.out.println("\n--------\n");
		System.out.println("Elements in another CustomArrayList (Strings):\n");
		
		CustomList<String> strings = new CustomArrayList<>(); 
		
		for (int i = 0; i < numberOfElements; i++) {
			strings.add("element " + i);
		}
		
		for (int j = 0; j < strings.getSize(); j++) {
			System.out.println("index " +j + " : " + strings.get(j));
		}	
		
		scanner.close();
	}

}
