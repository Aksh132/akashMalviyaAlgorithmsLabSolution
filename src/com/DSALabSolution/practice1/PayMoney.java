package com.DSALabSolution.practice1;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size;
		int transcation;
		int target;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please Enter No of Elements");
		size = sc.nextInt();
		
		
		
		
		//Creating array to store all elements
		int array[] = new int[size];
		
		System.out.println("Plaese Enter "+ size +" integers");
		
		// loop to store each number in array
		
		for (transcation = 0; transcation < size; transcation++)
			array[transcation] = sc.nextInt(); //12 20 15 18
		
		
		System.out.println("Enter total no of target to be acheievd");
		int t = sc.nextInt();
		for (int i = 1; i <=t; i++) {
			
		
		System.out.println("Enter the no of target value");
		target = sc.nextInt();  // 32
		
		// Achieve our target
        int sum = 0;
		for (transcation = 0; transcation < size; transcation++) {
			sum = sum + array[transcation];
			if (sum>=target) {
				
				break;
			}
			
		}
		if (sum<target) {
			System.out.println("traget is not acheived");
		}
		else
			System.out.println("target acheived after "+ (transcation+1) + " transcation");
		}	
	}

}
