//Prework Assignment 7
//ThinkJava Chapter 8
//Exercise 5
//The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes. Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.

import java.io.*;
import java.util.*;

public class Seive { 

public static void main(String[] args) {
         int a[]= {2,3,4,5,6,7,8,9,10,44,15,75,60,12,51,19};

    System.out.println((indexOfMax(a)));
  }
 public static int indexOfMax(int[] a) {
        int l = 0;
        for (int i = a.length - 1; i > 0; i--) {
            if (a[l] < a[i]) {
                l = i;
            }
        }
        return l;
    }
}