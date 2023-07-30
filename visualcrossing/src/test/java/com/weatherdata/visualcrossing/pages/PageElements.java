package com.weatherdata.visualcrossing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageElements {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public PageElements(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public WebElement rejectCookies() {
        return driver.findElement(By.xpath("//button[@class='btn btn-sm btn-secondary col-lg-3']"));
    }
    
    public WebElement weatherDataLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Weather Data')][position()=1]"));
    }


    public WebElement cityTextField() {
        return driver.findElement(By.xpath("//div[@class='input-group input-group-lg border-end-md']/input"));
    }

    public WebElement searchBtn() {
        return driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
    }

    public WebElement weatherForecastHeader() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Historical weather data for Salem')]")));
    }
}