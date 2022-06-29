//Prework Assignment 7
//ThinkJava Chapter 8
//Exercise 5
//The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes. Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.

import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Sieve1 { 
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		  int i=0,j=0;
		  int n; 
		
	
		System.out.println("\nWelcome to the Prime Calculator!"); 
    System.out.print("\nThe Sieve of Eratosthenes is “an ancient algorithm for finding all prime numbers up to any “given limit.” A prime number is a positive integer that has exactly 2 factors: 1 and itself. \n\n \n\nThink of any number larger than 1 and type it. Try a large number to discover many prime numbers.\n\nThis Eratosthenes’ calculator will give you all the prime numbers between 0 and the number you chose.\n");

    n= in.nextInt();
    
    System.out.print("The Sieve of Eratosthenes searched between 1 and " + n + " for all prime numbers possible and found: ");
    }

public static boolean[] sieve(int n){
      boolean result [] = new boolean[n];
      for (int i=2;i<n;i++)
         result[i] = true;
      for (int number=2;number<=(int)Math.sqrt(n);number++){
         if (result[number] == true){
            for (int indexInSeries = number*number;indexInSeries < n;indexInSeries += number){
               result[indexInSeries] = false;
            }
         }
      }
      return result;
   }
}