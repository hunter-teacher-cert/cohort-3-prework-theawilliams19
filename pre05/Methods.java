import java.io.*;
import java.util.*;

public class Methods {

  public static void main(String[] args) {
    System.out.println(isDivisible(10,5));
    }
  public static boolean isDivisible (int n,int m){ 

    if (m!=0 && n%m==0) {
        return true;
    } 
        else {
        return false;
}
  }
}