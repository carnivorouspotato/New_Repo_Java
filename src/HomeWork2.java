import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
    Scanner currentTemperature = new Scanner(System.in);
    System.out.println("What is your current temperature in fahrenheit?");

    int userTemperature = currentTemperature.nextInt();
    int celsiusFahrenheit = (userTemperature - 32) * 5/9;
        System.out.println("Your current temperature in celsius is: " + celsiusFahrenheit);
        if (celsiusFahrenheit >= 25)
            System.out.println("Its getting warm.");
        else
            System.out.println("That is just right.");


    double fahrenheitKelvin = (userTemperature + 459.67) * 5/9;
        if (fahrenheitKelvin != 0);
        System.out.println("Your temperature in Kelvin is: " + fahrenheitKelvin);
            System.out.println("Is Kelvin necessary?");

    double kelvinCelsus = fahrenheitKelvin - 273.15;
        System.out.println("Your temprature from kelvin to celsius is now: " + kelvinCelsus + "in celsius");
        if (kelvinCelsus != -1 );
        System.out.println("Why are we still using Kelvin?");

    double kelvinFahrenheit = fahrenheitKelvin * 9/5 - 459.67;
        System.out.println("Your temprature from kelvin to fahrenheit is: " + kelvinFahrenheit + " degrees" );
            if (kelvinFahrenheit != 0);
        System.out.println("Once again, why the Kelvin?");

    double celsiusKelvin = userTemperature + 273.15;
        System.out.println("Your curren't temprature from celsius to Kelvin is now: " + celsiusKelvin + " Kelvin");
            if (celsiusKelvin >= 2000);
        System.out.println("All done.");


    }
}
