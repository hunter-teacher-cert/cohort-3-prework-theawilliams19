import java.util.Scanner;
/**
/Converts Celsius to Fahrenheit.
*/
public class Celsius {
  public static void main(String[] args) {
    int remainder;
    double celsius, fahrenheit;
    Scanner in = new Scanner(System.in);

  // prompt the user and get the value
  System.out.print("Enter a temperature in Celsius: ");
  celsius = in.nextDouble();


  // convert and output the result
  fahrenheit = celsius * 9/5 + 32;
  remainder = celsius * 9/5 + 32;
  System.out.printf("%.1f C = %.1f F\n",celsius,        fahrenheit, remainder);
}

}