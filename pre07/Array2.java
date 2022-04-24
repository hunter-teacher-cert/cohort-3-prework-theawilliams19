//Prework Assignment 7
//ThinkJava Chapter 8
//Exercise 1

import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Array2 { 

  public static void main(String[] args) {
    double size=100;
    
    double[] a = powArray(size); 
    }

    public static double[] powArray(double size){
          Random random = new Random();

        double[] a = double [size];
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Math.pow(a[i], 3.0);

          a[i] = random.nextDouble(100);
            System.out.println(Arrays.toString(b));
        }
        return b;
      
    }
}