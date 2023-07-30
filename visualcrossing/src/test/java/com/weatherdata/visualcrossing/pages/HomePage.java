package com.weatherdata.visualcrossing.pages;


import org.openqa.selenium.WebDriver;

public class HomePage {
	private final WebDriver driver;
    private final PageElements elements;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elements = new PageElements(driver);
    }

    public void launchUrl() {
        driver.get("https://www.visualcrossing.com");
    }

    public void clickCookiesBtn() {
    	elements.rejectCookies().click();
    }
    
    public void clickWeatherDataMenu() {
        elements.weatherDataLink().click();
    }
}