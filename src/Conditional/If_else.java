package Conditional;

import java.util.Scanner;
public class If_else{
  public static void main(String[] args){
    // int a = 10;
    // int b = 20;
    // int c = 30;
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter the first number:");
    int a = scan.nextInt();
  System.out.print("Enter the second number:");
    int b = scan.nextInt();
  System.out.print("Enter the third number:");
    int c = scan.nextInt();
    if(a>b && a>c){
      System.out.println("a is greatest");
    }
    else if(b>c){
      System.out.println("b is greatest");
    }
    else{
      System.out.println("c is greatest");
    }
  }
}