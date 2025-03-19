package com.example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OurWorkFrame_CodeFusionWebsite {
    private WebDriver driver;
    private Variable_CodeFusionWebsite variables_codefusionwebsite;

    public OurWorkFrame_CodeFusionWebsite(WebDriver driver) throws Exception {
        if (driver == null) {
            throw new Exception("Driver cannot be null.");
        }
        this.driver = driver;
        this.variables_codefusionwebsite = new Variable_CodeFusionWebsite();
    }

    public void ViewOurWork() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath(variables_codefusionwebsite.ourworkButton)).click();
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1500);
        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");

        WebElement nextButton = driver.findElement(By.xpath(variables_codefusionwebsite.slideshowButon));
        Actions actions = new Actions(driver);
        actions.moveToElement(nextButton).click().perform();
        ;

    }

    public void PorjectSlider() throws Exception {

        try {
            driver.findElement(By.xpath(variables_codefusionwebsite.MRIurl)).click();
            String originalTab = driver.getWindowHandle();

            Set<String> allTabs = driver.getWindowHandles();
            for (String tabMRI : allTabs) {
                if (!tabMRI.equals(originalTab)) {
                    driver.switchTo().window(tabMRI);
                    break;
                }
            }
            Thread.sleep(500);

            try {
                driver.findElement(By.xpath(variables_codefusionwebsite.persnoalblogUrl)).click();
                for (String TabPB : allTabs) {
                    if (!TabPB.equals(originalTab)) {
                        driver.switchTo().window(TabPB);
                        break;
                    }
                }
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Error interacting with Personal Blog URL: " + e.getMessage());
            }

            try {
                driver.findElement(By.xpath(variables_codefusionwebsite.travelappUrl)).click();
                for (String TabTA : allTabs) {
                    if (!TabTA.equals(originalTab)) {
                        driver.switchTo().window(TabTA);
                        break;
                    }
                }
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Error interacting with Travel App URL: " + e.getMessage());
            }

            try {
                driver.findElement(By.xpath(variables_codefusionwebsite.snakegamePlay)).click();
                for (String TabSGG : allTabs) {
                    if (!TabSGG.equals(originalTab)) {
                        driver.switchTo().window(TabSGG);
                        break;
                    }
                }
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Error interacting with Snake Game Play URL: " + e.getMessage());
            }

            try {
                driver.findElement(By.xpath(variables_codefusionwebsite.snakegameUrl)).click();
                for (String TabSGU : allTabs) {
                    if (!TabSGU.equals(originalTab)) {
                        driver.switchTo().window(TabSGU);
                        break;
                    }
                }
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Error interacting with Snake Game URL: " + e.getMessage());
            }

            try {
                driver.findElement(By.xpath(variables_codefusionwebsite.snakegameUrl)).click();
                for (String TabEP : allTabs) {
                    if (!TabEP.equals(originalTab)) {
                        driver.switchTo().window(TabEP);
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error interacting with second Snake Game URL: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error during execution: " + e.getMessage());
        }

    }
}