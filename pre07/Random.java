//ThinkJava Chapter 8
//Section 8.7 Random Numbers - Test
//Not part of prework assignments

import java.io.*;
import java.util.*;
import java.util.Random.*;

public class Random {

   public static void main(String[] args){
    int numValues = 8;
    int[] array = randomArray(numValues);
    printArray(array);
     }

   public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
       }
    return a;
    }
  
}