package com.example;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainFrame_CodeFusionWebsite {

    private WebDriver driver;
    private BeforeClass_CodeFusionWebsite beforeClass_codefusionwebsite;
    Variable_CodeFusionWebsite variables_codefusionwebsite;

    public MainFrame_CodeFusionWebsite(BeforeClass_CodeFusionWebsite beforeClass) throws Exception {
        this.beforeClass_codefusionwebsite = beforeClass;
        variables_codefusionwebsite = new Variable_CodeFusionWebsite();
        this.driver = BeforeClass_CodeFusionWebsite.getDriver();
    }

    public void SetupClass() throws Exception {
        beforeClass_codefusionwebsite.Setup();  
        variables_codefusionwebsite = new Variable_CodeFusionWebsite();
    }

    public void URLOpenning() throws InterruptedException{ 
        this.driver = BeforeClass_CodeFusionWebsite.getDriver();
        System.out.println("Driver state: " + (driver != null ? "initialized" : "null"));

        if (driver != null) {
            if (variables_codefusionwebsite == null) {
                variables_codefusionwebsite = new Variable_CodeFusionWebsite();
                System.out.println("Variables initialized in URLOpenning");
            }
            
            System.out.println("Attempting to navigate to: " + variables_codefusionwebsite.URL);
            driver.get(variables_codefusionwebsite.URL);
            System.out.println("URL opened successfully");
        } else {
            System.err.println("Driver is not initialized. Cannot open URL.");
        }
    }

    public void mainFrameScrolling() throws Exception{ 
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

    public void homeMainBarClick() throws Exception{ 
        Thread.sleep(500);
        driver.findElement(By.xpath(variables_codefusionwebsite.homeMainBar)).click(); 
    }

    public void projectsMainBarClick() throws Exception{ 
        Thread.sleep(500);
        driver.findElement(By.xpath(variables_codefusionwebsite.projectsMainBarClick)).click(); 
    }

    public void aboutMainBarClick() throws Exception{ 
        Thread.sleep(500);
        driver.findElement(By.xpath(variables_codefusionwebsite.aboutMainBarClick)).click(); 
    }

    public void topScreen() throws Exception{ 
        Thread.sleep(500);
        driver.findElement(By.xpath(variables_codefusionwebsite.topScreen)).click(); 
    }

    public void instagramIcon() throws Exception{ 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
        Thread.sleep(1000); 

        driver.findElement(By.xpath(variables_codefusionwebsite.instagramIcon)).click(); 
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

    public void emailIcon() throws Exception{ 
        try{
            Thread.sleep(500);
            driver.findElement(By.xpath(variables_codefusionwebsite.emailIcon)).click(); 
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
        }
        catch (Exception e) {}
    }

    public void whatsupIcon() throws Exception{ 
        try{
            System.out.println("I am in");
            Thread.sleep(500);
            driver.findElement(By.xpath(variables_codefusionwebsite.whatsupIcon)).click(); 
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
        catch (Exception e) {}
    }

    public void twitterXIcon() throws Exception{ 
        Thread.sleep(500);
        driver.findElement(By.xpath(variables_codefusionwebsite.twitterXIcon)).click(); 
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

    public void ourworkIcon() throws Exception{ 
        Thread.sleep(500);
        driver.findElement(By.xpath(variables_codefusionwebsite.ourworkIcon)).click(); 
    }

    // Add a proper getter for the WebDriver instance
    public WebDriver getDriver() {
        return this.driver;
    }

    public static WebDriver getDriverFrameOne() {
        WebDriver driver = BeforeClass_CodeFusionWebsite.getDriver();
        if (driver == null) {
            System.err.println("Driver not initialized yet.");
        } else {
            System.out.println("Driver is ready...");
        }
        return driver;
    }
}