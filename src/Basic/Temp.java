package Basic;

import java.util.Scanner;

public class Temp {
  public static void main(String[] args){
    Scanner cel = new Scanner (System.in);
    System.out.println("Enter temp in celsius:");
    float celsius = cel.nextFloat();
    float fahrenheit = (celsius * 9/5) + 32;
    System.out.println("Temp in fahrenheit is: " +
                       fahrenheit);
  }
}