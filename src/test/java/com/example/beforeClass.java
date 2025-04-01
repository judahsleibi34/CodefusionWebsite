package com.example;

import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class beforeClass {

    private static beforeClass instance;
    public static WebDriver driver;
    public Actions actions;
    public SoftAssert softAssert;
    public WebDriverWait wait;
    public JavascriptExecutor jsExecutor;

    private Variables variables;

    private beforeClass() throws Exception {
        variables = new Variables();
        System.out.println("Before testing...");
    }

    public static beforeClass getInstance() throws Exception {
        if (instance == null) {
            instance = new beforeClass();
        }
        return instance;
    }

    @BeforeTest
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

            System.out.println("Navigating to: " + variables.URL);
            driver.get(variables.URL);

            wait.until(ExpectedConditions.urlToBe(variables.URL));

            if (driver.getCurrentUrl().equals(variables.URL)) {
                System.out.println("URL opened successfully!");
            } else {
                System.out.println("Warning: URL did not open correctly.");
            }

        } catch (Exception e) {
            System.err.println("Error in Setup(): " + e.getMessage());
            e.printStackTrace();
            throw e; // Re-throw the exception to stop execution
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