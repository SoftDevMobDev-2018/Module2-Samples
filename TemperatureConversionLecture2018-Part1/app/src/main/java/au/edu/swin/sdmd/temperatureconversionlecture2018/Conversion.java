package au.edu.swin.sdmd.temperatureconversionlecture2018;

public class Conversion {

    public String toFahrenheit(String sCelsius) {
        try {
            double celsius = Double.parseDouble(sCelsius);
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            return String.format("%3.2f", fahrenheit);
        } catch (NumberFormatException nfe) {
            return "ERR";
        }
    }
}
