package com.example;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeClass_CodeFusionWebsite {

    private static WebDriver driver;
    public Actions actions;
    public SoftAssert softAssert;
    public WebDriverWait wait;
    public JavascriptExecutor jsExecutor;

    private Variable_CodeFusionWebsite variables_codefusionwebsite;

    public BeforeClass_CodeFusionWebsite() throws Exception {
        variables_codefusionwebsite = new Variable_CodeFusionWebsite();
        System.out.println("Before testing...");
    }

    public void Setup() throws Exception {
        try {
            if (driver == null) {
                System.out.println("Setting up ChromeDriver...");
                WebDriverManager.chromedriver().setup();
    
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-debugging-port=9222");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
    
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
                driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
                System.out.println("Driver initialized successfully.");
            }
    
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            actions = new Actions(driver);
            softAssert = new SoftAssert();
            jsExecutor = (JavascriptExecutor) driver;
    
            System.out.println("Navigating to: " + variables_codefusionwebsite.URL);
            driver.get(variables_codefusionwebsite.URL);
    
            wait.until(ExpectedConditions.urlToBe(variables_codefusionwebsite.URL));
    
            if (driver.getCurrentUrl().equals(variables_codefusionwebsite.URL)) {
                System.out.println("URL opened successfully!");
            } else {
                System.out.println("Warning: URL did not open correctly.");
            }
    
        } catch (Exception e) {
            System.err.println("Error in Setup(): " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.err.println("Driver not initialized yet.");
        } else {
            System.out.println("Driver is ready...");
        }
        return driver;
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver closed successfully.");
        }
    }
}
