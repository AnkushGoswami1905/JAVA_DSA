package Conditional;

import java.util.Scanner;
public class While_loop{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number:");
    int a = scan.nextInt();
    int i = 1;
    while(i<=a){
      System.out.println(+i);
      i++;
    }
  }
}