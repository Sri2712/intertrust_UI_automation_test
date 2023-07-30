package com.weatherdata.visualcrossing.pages;

import org.openqa.selenium.WebDriver;

public class WeatherDataPage {
	 private final WebDriver driver;
	    private final PageElements elements;

	    public WeatherDataPage(WebDriver driver) {
	        this.driver = driver;
	        this.elements = new PageElements(driver);
	    }

	    public void searchWeatherData(String city) {
	        elements.cityTextField().sendKeys("Salem");
	        elements.searchBtn().click();
	    }

	    public String getWeatherForecast() {
	        return elements.weatherForecastHeader().getText();
	    }
	}