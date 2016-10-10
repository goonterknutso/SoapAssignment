package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by gunther on 10/10/16.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal celciusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("Celcius to Fahrenheit conversion failed", celciusToFahrenheitResult, BigDecimal.valueOf(32));

        BigDecimal fahrenheitToCelcius = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));
        assertEquals("Fahrenheit to celcius conversion failed", fahrenheitToCelcius, BigDecimal.valueOf(0));

        BigDecimal windChillInCelsius = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(6));
        assertEquals("Wind chill in celcius conversion failed", windChillInCelsius, BigDecimal.valueOf(-5.1156));

        BigDecimal windChillInFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(32), BigDecimal.valueOf(6));
        assertEquals("Wind chill in fahrenheit conversion failed", windChillInFahrenheit, BigDecimal.valueOf(22.79192));

    }

}