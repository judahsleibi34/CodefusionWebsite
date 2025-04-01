package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class frameThree {

    private WebDriver driver;
    private Variables variables;

    public frameThree(WebDriver driver) throws Exception {
        if (driver == null) {
            throw new Exception("Driver cannot be null.");
        }
        this.driver = driver;
        this.variables = new Variables();
    }

    public void aboutUs() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath(variables.aboutMainBarClick)).click();

        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");
        Thread.sleep(1000);

    }
}
