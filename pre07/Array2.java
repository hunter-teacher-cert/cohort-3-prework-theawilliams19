//Prework Assignment 7
//ThinkJava Chapter 8
//Exercise 1

import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Array2 { 

  public static void main(String[] args) {
        double[] squareArry = powArray(new double[]{2, 3, 4, 5});
    }

    public static double[] powArray(double a[]){
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Math.pow(a[i], 3.0);
            System.out.println(Arrays.toString(b));
        }
        return b;
      
    }
}