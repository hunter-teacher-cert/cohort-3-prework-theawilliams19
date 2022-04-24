//Prework Assignment 7
//ThinkJava Chapter 8
//Exercise 5
//The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes. Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.

import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Sieve1 { 

  public static void main(String[] args) {
         int[] n = new int[121];
         n[0] = 1;
    System.out.println("Primary numbers: " + sum);;
    }

public static boolean[] sieve(int n){
      boolean[] result = new boolean[n];
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