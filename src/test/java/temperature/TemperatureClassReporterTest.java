package temperature;

/**
 * Created by Alex on 04/11/2015.
 */

import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TemperatureClassReporterTest {
    TemperatureClassReporter tempClassReporter;

    @Before
    public void SetUp()
    {
        tempClassReporter = new TemperatureClassReporter();
    }

    @Test
    public void RunTests()
    {
        tempClassReporter.setTemperatureInFahrenheit(32.0);
        assertEquals(tempClassReporter.getTemperatureInCelsius(), 0, 0.1);

        tempClassReporter.setTemperatureInCelsius(0);
        assertEquals(tempClassReporter.getTemperatureInFahrenheit(), 32.0, 0.1);
    }
}
