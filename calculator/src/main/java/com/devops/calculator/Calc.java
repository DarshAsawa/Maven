package com.devops.calculator; 	
import java.util.Scanner;
import java.lang.Math;
import java.util.Scanner;

public class Calc {
	
	//function to add two numbers.
	public int add(int x,int y) {
		return x+y;
	}
	 
	//function to find difference between two numbers.
	public int subt(int x,int y) {
		//Math.abs will return absolute value.
		return Math.abs(x-y);
	}
	
	//function to find multiplied result of two numbers.
	public int Multi(int x,int y) {
		return x*y;
	}
	
	//function to divide two numbers.
	public float Div(int x,int y) {
		return x/y;
	}
	
	//function to find modulo of two numbers.
	public int modulo(int x,int y) {
		return x%y;
	}
	
	//Main 
	public static void main(String args[]) {
		
		int number1,number2;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		number1=scan.nextInt();
		
		System.out.println("Enter the second number:");
		number2=scan.nextInt();
		
		Calc obj=new Calc();
		int a,b,c,e;
		float d;
		a=obj.add(number1, number2);
		b=obj.subt( number1, number2);
		c=obj.Multi(number1, number2);
		d=obj.Div(number1, number2);
		e=obj.modulo(number1, number2);
		
		System.out.println("Sum is : "+a
				+"\nDifference is : "+b
				+"\nMultiplied result is : "+c
				+"\nDivison result is : "+d
				+"\nModulo is : " +e );
		
		
	}
}
