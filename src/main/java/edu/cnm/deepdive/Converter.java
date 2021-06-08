package edu.cnm.deepdive;
import java.util.Scanner;

public class Converter {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please type a Celsius temperature(blank to quit)");
    String userInput = scan.nextLine();
    while (!userInput.isEmpty()) {

      try {
        System.out.printf("Fahrenheit temperature: %,.2f degrees%nPlease type a Celsius temperature(blank to quit):", convertC2F(Double.parseDouble(userInput)));
      } catch (NumberFormatException e) {
        System.out.printf("unable to parse \"%s\". Please try again: ", userInput);
      }
      userInput = scan.nextLine();

    }

  }


  public static double convertC2F(double celsius) {


    return celsius * 9 / 5 + 32;

  }

}
