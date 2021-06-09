package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

class ConverterTest {

  static double[] celsiusValues = {-40, 0, 100, 37.1};
  static double[] fahrenheitValues = {-40, 32, 212, 98.78};
  static final double Tolerance = 0.0001;

  static final double[][] temperaturePairs = {
      {-40, -40}, {0, 32}, {100, 212}, {37.1, 98.78}
  };


  @Test
  void convertC2F() {

    for (double[] testCase : temperaturePairs) {

      double celsius = testCase[0];
      double expectedFahrenheit = testCase[1];

      double actualFahrenheit = Converter.convertC2F(celsius);

      assertEquals(expectedFahrenheit, actualFahrenheit, Tolerance);



    }


  }

  @Test
  void convertF2C() {

      for (double[] testCase : temperaturePairs) {

      // double[] testCase = temperaturePairs[1];

      double fahrenheit = testCase[1];
      double expectedCelsius = testCase[0];
      double actualCelsius = Converter.convertF2C(fahrenheit);

      assertEquals(expectedCelsius, actualCelsius, Tolerance);

    }

  }
}