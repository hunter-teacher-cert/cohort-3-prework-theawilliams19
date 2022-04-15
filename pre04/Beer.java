import java.io.*;
import java.util.*;

public class Beer {
  
  public static void lyrics (int beer){
    if (beer>0){  
    System.out.print(beer+" 99 bottles of beer on the wall,");
    System.out.print(beer+" 99 bottles of beer,ya’ take one down, ya’ pass it around, ");
    System.out.println(beer-1+" bottles of         beer on the wall.");
    lyrics(beer-1);}     
      else {
         System.out.println("No bottles of              beer on the wall, no bottles of beer,          ya' can't take one down, ya' can't             pass it around, 'cause there are no            more bottles of beer on the wall!");
  }
}
public static void main(String[] args){
    lyrics(99);
}
}