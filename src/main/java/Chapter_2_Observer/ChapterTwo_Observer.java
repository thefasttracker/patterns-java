/*
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state,
all of its dependents are notified and updated automatically.

Design Principle
Strive for loosely coupled designs between objects that interact.
*/
package Chapter_2_Observer;

// WeatherStation class
public class ChapterTwo_Observer {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}