package Conditional;

import java.util.Scanner;
public class Switch_case{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the fruit name:");
    String fruits = in.nextLine();
    switch(fruits){
        case "apple":
        System.out.println("Apple is red");
        break;

        case "banana":
        System.out.println("Banana is yellow");
        break;

        case "orange":
        System.out.println("Orange is orange");
        break;

        default:
        System.out.println("Fruit not found");
        
    }
  }
}