package temperature;

/**
 * Created by Alex on 04/11/2015.
 */
import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;
import org.junit.Test;
import org.junit.Before;

import static junit.framework.Assert.assertEquals;

public class TemperatureObjectReporterTest {
    TemperatureObjectReporter tempObjectReporter;

    @Before
    public void SetUp()
    {
        tempObjectReporter = new TemperatureObjectReporter();
    }

    @Test
    public void RunTests()
    {
        tempObjectReporter.setTemperatureInCelsius(0);
        assertEquals(tempObjectReporter.getTemperatureInFahrenheit(), 32.0, 0.1);

        tempObjectReporter.setTemperatureInFahrenheit(32.0);
        assertEquals(tempObjectReporter.getTemperatureInCelsius(),0, 0.1);
    }
}
