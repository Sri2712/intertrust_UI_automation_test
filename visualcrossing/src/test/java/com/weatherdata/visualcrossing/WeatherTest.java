package com.weatherdata.visualcrossing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.weatherdata.visualcrossing.pages.HomePage;
import com.weatherdata.visualcrossing.pages.WeatherDataPage;

public class WeatherTest {

	private WebDriver driver;
	private HomePage homePage;
	private WeatherDataPage weatherDataPage;
	
	@Before
	public void webSetup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Sriram's test\\chromedriver.exe");
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		weatherDataPage = new WeatherDataPage(driver);
	}
	
	@After
	public void webPageClose() {
		driver.quit();
	}
	
	@Test
	public void weatherForecast() {
		homePage.launchUrl();
		driver.manage().window().maximize();

		homePage.clickCookiesBtn();
       
        homePage.clickWeatherDataMenu();
       
        String cityName = "Salem"; 
        weatherDataPage.searchWeatherData(cityName);

        String weatherForecast = weatherDataPage.getWeatherForecast();
        assertTrue("Weather forecast shown for " + cityName, weatherForecast.contains(cityName));
        System.out.println("***Successfully Verified***");
	}
	
}
