package com.example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class frameOne {

    private WebDriver driver;
    private Variables variables;

    public frameOne(WebDriver driver) {
        this.driver = driver;
        this.variables = new Variables();
    }

    @SuppressWarnings("static-access")
    public frameOne(beforeClass beforeClass) throws Exception {
        this.driver = beforeClass.getDriver();
        this.variables = new Variables();

        if (driver == null) {
            throw new Exception("Driver is not initialized correctly in frameOne.");
        }
    }

    public void URLOpenning() throws InterruptedException {
        this.driver = beforeClass.getDriver();
        System.out.println("Driver state: " + (driver != null ? "initialized" : "null"));

        if (driver != null) {
            if (variables == null) {
                variables = new Variables();
                System.out.println("Variables initialized in URLOpenning");
            }

            System.out.println("Attempting to navigate to: " + variables.URL);
            driver.get(variables.URL);
            System.out.println("URL opened successfully");
        } else {
            System.err.println("Driver is not initialized. Cannot open URL.");
        }
    }

    public void mainFrameScrolling() throws Exception {
        System.out.println("frame one..");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy({top: 500, behavior: 'smooth'});");
        Thread.sleep(1000);

        js.executeScript("window.scrollTo(0, 0);");
    }

    public void homeMainBarClick() throws Exception {
        Thread.sleep(500);
        driver.findElement(By.xpath(variables.homeMainBar)).click();
    }

    public void projectsMainBarClick() throws Exception {
        Thread.sleep(500);
        driver.findElement(By.xpath(variables.projectsMainBarClick)).click();
    }

    public void aboutMainBarClick() throws Exception {
        Thread.sleep(500);
        driver.findElement(By.xpath(variables.aboutMainBarClick)).click();
    }

    public void topScreen() throws Exception {
        Thread.sleep(500);
        driver.findElement(By.xpath(variables.topScreen)).click();
        driver.findElement(By.xpath(variables.homeMainBar)).click();
    }

    public void instagramIcon() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000);

        driver.findElement(By.xpath(variables.instagramIcon)).click();
        Thread.sleep(1000);
        String originalTab = driver.getWindowHandle();

        Set<String> allTabs = driver.getWindowHandles();

        for (String tab : allTabs) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
    }

    public void emailIcon() throws Exception {
        try {
            Thread.sleep(500);
            driver.findElement(By.xpath(variables.emailIcon)).click();
            Thread.sleep(1000);
            String originalTab = driver.getWindowHandle();
            System.out.println("222");
            Set<String> allTabs = driver.getWindowHandles();

            for (String tab : allTabs) {
                if (!tab.equals(originalTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            Thread.sleep(1000);
            driver.close();
            driver.switchTo().window(originalTab);
        } catch (Exception e) {
        }
    }

    public void whatsupIcon() throws Exception {
        try {
            System.out.println("I am in");
            Thread.sleep(500);
            driver.findElement(By.xpath(variables.whatsupIcon)).click();
            Thread.sleep(1000);
            String originalTab = driver.getWindowHandle();

            Set<String> allTabs = driver.getWindowHandles();

            for (String tab : allTabs) {
                if (!tab.equals(originalTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            Thread.sleep(1000);
            driver.close();
            driver.switchTo().window(originalTab);
        } catch (Exception e) {
        }
    }

    public void twitterXIcon() throws Exception {
        Thread.sleep(500);
        driver.findElement(By.xpath(variables.twitterXIcon)).click();
        Thread.sleep(1000);
        String originalTab = driver.getWindowHandle();

        Set<String> allTabs = driver.getWindowHandles();

        for (String tab : allTabs) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
    }

    public void ourworkIcon() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(500);
        driver.findElement(By.xpath(variables.ourworkIcon)).click();

        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1000);

        Thread.sleep(1000);
        driver.findElement(By.xpath(variables.allProjectsButton)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(variables.webprojectsButton)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(variables.aiMLProjectsButton)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(variables.gamesButton)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(variables.upcomingButton)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(variables.allProjectsButton)).click();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public static WebDriver getDriverFrameOne() {
        WebDriver driver = beforeClass.getDriver();
        if (driver == null) {
            System.err.println("Driver not initialized yet.");
        } else {
            System.out.println("Driver is ready...");
        }
        return driver;
    }

}