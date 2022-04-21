//Prework Assignment 6
//ThinkJava Chapter 7
//Exercise 3

import java.io.*;
import java.util.*;

public class Power {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    double x;
    int n;
    System.out.print ("Type base number");
    x=in.nextInt();
    System.out.print ("Type exponent");
     n=in.nextInt();
    System.out.println(result);
    }

  public static double power(double x, int n)    {
    double result=1;
      while (n>0) {
        result *=x;
        n--;
    return result;
        }
        
  
}
    }  