package edu.cnm.deepdive;
import java.util.Scanner;

public class Converter {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please type a Celsius temperature(blank to quit)");
    String userInput = scan.nextLine();
    while (!userInput.isEmpty()) {

      System.out.print("Fahrenheit temperature: ");

        System.out.println(convertC2F(Double.parseDouble(userInput)));
        System.out.println("Please type a Celsius temperature(blank to quit)");
        userInput = scan.nextLine();



    }

  }

  public static double convertC2F(double celsius) {


    return celsius * 9 / 5 + 32;

  }

}
