package edu.cnm.deepdive;
import java.util.Scanner;

public class Converter {

  private static final String INPUT_PROMPT = "Please type a Celsius temperature(blank to quit)";
  private static final String FAHRENHEIT_OUTPUT_FORMAT = "Fahrenheit temperature: %,.2f degrees%nPlease type a Celsius temperature(blank to quit):";
  private static final String PARSE_EXCEPTION_FORMAT = "unable to parse \"%s\". Please try again: ";

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(INPUT_PROMPT);
    String userInput = scan.nextLine().trim();
    while (!userInput.isEmpty()) {

      try {

        // TODO Check last character of userInput; if f treat as farenheight, otherwise celcius.

        System.out.printf(FAHRENHEIT_OUTPUT_FORMAT, convertC2F(Double.parseDouble(userInput)));
      } catch (NumberFormatException e) {
        System.out.printf(PARSE_EXCEPTION_FORMAT, userInput);
      }
      userInput = scan.nextLine().trim();

    }

  }


  public static double convertC2F(double celsius) {


    return celsius * 9 / 5 + 32;

  }

  public static double convertF2C(double fahrenheit) {

    return fahrenheit ; // TODO Implement the Fahrenheit-to-Celsius conversion formula

  }

}
