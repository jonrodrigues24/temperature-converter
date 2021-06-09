package edu.cnm.deepdive;
import java.util.Scanner;

public class Converter {

  private static final String INPUT_PROMPT = "Please type a Celsius temperature or add \"f\" immediately after your number for fahrenheit (blank to quit):";
  private static final String FAHRENHEIT_OUTPUT_FORMAT = "Fahrenheit temperature: %,.2f degrees%nPlease type a Celsius temperature(blank to quit):";
  private static final String PARSE_EXCEPTION_FORMAT = "unable to parse \"%s\". Please try again: ";
  private static final String CELSIUS_OUTPUT_FORMAT = "Celsius temperature: %,.2f celsius%nPlease type a Celsius temperature or add \"f\" immediately after your number for fahrenheit (blank to quit):";
  private static final double FAHRENHEIT_PER_CELSIUS = 9.0 / 5;
  private static final int FAHRENHEIT_FREEZING_POINT = 32;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(INPUT_PROMPT);
    String userInputCelsius = scan.nextLine().trim();
    while (!userInputCelsius.isEmpty()) {

      try {

      if (userInputCelsius.endsWith("f")) {
        System.out.printf(CELSIUS_OUTPUT_FORMAT, convertF2C(Double.parseDouble(userInputCelsius)));

      }

      else {
        System.out.printf(FAHRENHEIT_OUTPUT_FORMAT, convertC2F(Double.parseDouble(userInputCelsius)));
      }

      } catch (NumberFormatException e) {
        System.out.printf(PARSE_EXCEPTION_FORMAT, userInputCelsius);
      }

      userInputCelsius = scan.nextLine().trim();
    }

  }
  public static double convertC2F(double celsius) {


    return celsius * FAHRENHEIT_PER_CELSIUS + FAHRENHEIT_FREEZING_POINT;

  }
  public static double convertF2C(double fahrenheit) {

    return (fahrenheit - FAHRENHEIT_FREEZING_POINT) / FAHRENHEIT_PER_CELSIUS; // implemented f2c conversion method

  }

}
