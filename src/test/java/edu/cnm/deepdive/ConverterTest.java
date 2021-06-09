package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

class ConverterTest {

  static double[] celsiusValues = {-40, 0, 100, 37.1};
  static double[] fahrenheitValues = {-40, 32, 212, 98.78};
  static final double Tolerance = 0.0001;   // TODO how does this work again, does assert automatically know?

  @Test
  void convertC2F() {

    for (int i = 0; i < celsiusValues.length; i++) {

      double celsius = celsiusValues[i];

      double expectedFahrenheit = fahrenheitValues[i];
      double actualFahrenheit = Converter.convertC2F(celsius);

      assertEquals(expectedFahrenheit, actualFahrenheit, Tolerance);

    }


  }

  @Test
  void convertF2C() {

    for (int i = 0; i < fahrenheitValues.length; i++) {

      double fahrenheit = fahrenheitValues[i];

      double expectedCelsius = celsiusValues[i];
      double actualCelsius = Converter.convertF2C(fahrenheit);

      assertEquals(expectedCelsius, actualCelsius, Tolerance);

    }

  }
}