package Conditional;

import java.util.Scanner;
public class For_loop{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number:");
    int a = scan.nextInt();

    for(int i = 1; i<=10; i++){
      System.out.println(+(a)+" x "+(i)+" = "+(a*i));
    }
  }
}