// **********************************************
// Jesse Tripp
// COSC 211
// Assignment 3 - PE 11.2
// Program that reads in 5 numbers from user,
// stores into array list, and displays in
// increasing order
// **********************************************

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {

  static ArrayList<Double> list = new ArrayList<>();

  public static double sum(ArrayList<Double> list) {
    double sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum = sum + list.get(i);
    }
    return sum;
  }

  public static void main(String[] args) {

    System.out.print("Enter 5 numbers to be sorted: ");
    Scanner input = new Scanner(System.in);

    list.add(input.nextDouble());
    list.add(input.nextDouble());
    list.add(input.nextDouble());
    list.add(input.nextDouble());
    list.add(input.nextDouble());

    System.out.println("");

    Collections.sort(list);
    System.out.println("The Array list after being sorted: " + list);
    System.out.println("");
    System.out.println("The sum of the Array List is: " + sum(list));
  }

}
