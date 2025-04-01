package com.example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class frameTwo {
    private WebDriver driver;
    private Variables variables;

    public frameTwo(WebDriver driver) throws Exception {
        if (driver == null) {
            throw new Exception("Driver cannot be null.");
        }
        this.driver = driver;
        this.variables = new Variables();
    }

    public void allProjects() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");
        Thread.sleep(1000);

        // Personal blog:
        WebElement presonalblogImage = driver.findElement(By.xpath(variables.personalblogImage));
        if (presonalblogImage.isDisplayed()) {
            System.out.println("Personal blog image is presented.");
        }

        driver.findElement(By.xpath(variables.sourceCodePersonalblogPage)).click();
        Thread.sleep(1000);
        String originalTab = driver.getWindowHandle();

        Set<String> firstTab = driver.getWindowHandles();

        for (String tab : firstTab) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("personal blog source code oppend.");

        // MRI:
        WebElement mriImage = driver.findElement(By.xpath(variables.mriImage));
        if (mriImage.isDisplayed()) {
            System.out.println("MRI image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeMRIbraintumoredetection)).click();
        Thread.sleep(1000);

        Set<String> secondTab_sourceCode = driver.getWindowHandles();

        for (String tab : secondTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("MRI source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveMRIbraintumoredetection)).click();
        Thread.sleep(1000);

        Set<String> secondTab_viewLive = driver.getWindowHandles();

        for (String tab : secondTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("MRI view live link oppend.");
        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");

        // Snake game:
        WebElement snakegameImage = driver.findElement(By.xpath(variables.snakegameImage));
        if (snakegameImage.isDisplayed()) {
            System.out.println("Snake game image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeSnakegame)).click();
        Thread.sleep(1000);

        Set<String> thirdTab_sourceCode = driver.getWindowHandles();

        for (String tab : thirdTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Snake game source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveSnakegame)).click();
        Thread.sleep(1000);

        Set<String> thirdTab_viewLive = driver.getWindowHandles();

        for (String tab : thirdTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Snake game view live link oppend.");

        // Travel app:
        WebElement travelappImage = driver.findElement(By.xpath(variables.travelappImage));
        if (travelappImage.isDisplayed()) {
            System.out.println("Travel app image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeTravelapp)).click();
        Thread.sleep(1000);

        Set<String> fourthTab_sourceCode = driver.getWindowHandles();

        for (String tab : fourthTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Travel app source code oppend.");
        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");

        // Early predection:
        WebElement EarlyPredictionofKDImage = driver.findElement(By.xpath(variables.EarlyPredictionofKDImage));
        if (EarlyPredictionofKDImage.isDisplayed()) {
            System.out.println("Early Prediction image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeEarlypredectionKD)).click();
        Thread.sleep(1000);

        Set<String> fifthTab_sourceCode = driver.getWindowHandles();

        for (String tab : fifthTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Early prediction source code oppend.");
        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");

        // Dungeon escape:
        WebElement dungeonescapeImage = driver.findElement(By.xpath(variables.dungeonescapeImage));
        if (dungeonescapeImage.isDisplayed()) {
            System.out.println("Dungeon escape image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeDungenescape)).click();
        Thread.sleep(1000);

        Set<String> sithTab_sourceCode = driver.getWindowHandles();

        for (String tab : sithTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Dungeon escape source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveDungenescape)).click();
        Thread.sleep(1000);

        Set<String> sithTab_viewLive = driver.getWindowHandles();

        for (String tab : sithTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Dungeon escape view live link oppend.");

        // Treasure hunter:
        WebElement treasurehunterImage = driver.findElement(By.xpath(variables.treasurehunterImage));
        if (treasurehunterImage.isDisplayed()) {
            System.out.println("Treasure hunter image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeTreasurehunter)).click();
        Thread.sleep(1000);

        Set<String> seventhTab_sourceCode = driver.getWindowHandles();

        for (String tab : seventhTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Treasure hunter source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveTreasurehunter)).click();
        Thread.sleep(1000);

        Set<String> seventhTab_viewLive = driver.getWindowHandles();

        for (String tab : seventhTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Treasure hunter view live link oppend.");

        // Space explorer:
        WebElement spaceexplorerImage = driver.findElement(By.xpath(variables.spaceexplorerImage));
        if (spaceexplorerImage.isDisplayed()) {
            System.out.println("Treasure hunter image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeSpaceexplorer)).click();
        Thread.sleep(1000);

        Set<String> eighthTab_sourceCode = driver.getWindowHandles();

        for (String tab : eighthTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Space explorer source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveSpaceexplorer)).click();
        Thread.sleep(1000);

        Set<String> eighthTab_viewLive = driver.getWindowHandles();

        for (String tab : eighthTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Space explorer view live link oppend.");
        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");

        // Fruit basket:
        WebElement fruitbasketfrenzyImage = driver.findElement(By.xpath(variables.fruitbasketfrenzyImage));
        if (fruitbasketfrenzyImage.isDisplayed()) {
            System.out.println("Fruit basket image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeTreasurehunter)).click();
        Thread.sleep(1000);

        Set<String> ninethTab_sourceCode = driver.getWindowHandles();

        for (String tab : ninethTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Fruit basket source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveFruitbasket)).click();
        Thread.sleep(1000);

        Set<String> ninethTab_viewLive = driver.getWindowHandles();

        for (String tab : ninethTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Fruit basket view live link oppend.");

        // TMDB:
        Thread.sleep(1000);
        // WebElement TMDBimage = driver.findElement(By.xpath(variables.TMDBimage));
        // if (TMDBimage.isDisplayed()) {
        // System.out.println("MRI image is presented.");
        // }
        driver.findElement(By.xpath(variables.sourceCodeTMDBimage)).click();
        Thread.sleep(1000);

        Set<String> tenthTab_viewLive = driver.getWindowHandles();

        for (String tab : tenthTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("TMDB source code oppend.");

    }

    public void belowBar() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");

        driver.findElement(By.xpath(variables.endframeHomebutton)).click();
        driver.navigate().back();
        Thread.sleep(500);

        driver.findElement(By.xpath(variables.endframeProjectsbutton)).click();
        driver.navigate().back();
        Thread.sleep(500);

        driver.findElement(By.xpath(variables.endframeAboutbutton)).click();
        driver.navigate().back();
        Thread.sleep(500);

        driver.findElement(By.xpath(variables.endframeTwitter)).click();
        String originalTab = driver.getWindowHandle();

        Set<String> allTabs = driver.getWindowHandles();

        for (String Twittertab : allTabs) {
            if (!Twittertab.equals(originalTab)) {
                driver.switchTo().window(Twittertab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        
        // driver.findElement(By.xpath(variables.endframeEmail)).click();
        js.executeScript("window.scrollTo(0, 0);");
    }

    public void webDevtab() throws Exception {
        String originalTab = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath(variables.projectsMainBarClick)).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(variables.webprojectsButton)).click();
        Thread.sleep(500);

        WebElement presonalblogImage = driver.findElement(By.xpath(variables.personalblogImage));
        if (presonalblogImage.isDisplayed()) {
            System.out.println("Personal blog image is presented.");
        }

        driver.findElement(By.xpath(variables.sourceCodePersonalblogPage)).click();
        Thread.sleep(1000);

        Set<String> firstTab = driver.getWindowHandles();

        for (String tab : firstTab) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("personal blog source code oppend.");

        // MRI:
        WebElement mriImage = driver.findElement(By.xpath(variables.mriImage));
        if (mriImage.isDisplayed()) {
            System.out.println("MRI image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeMRIbraintumoredetection)).click();
        Thread.sleep(1000);

        Set<String> secondTab_sourceCode = driver.getWindowHandles();

        for (String tab : secondTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("MRI source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveMRIbraintumoredetection)).click();
        Thread.sleep(1000);

        Set<String> secondTab_viewLive = driver.getWindowHandles();

        for (String tab : secondTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("MRI view live link oppend.");
        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");

        // Travel app:
        WebElement travelappImage = driver.findElement(By.xpath(variables.travelappImage));
        if (travelappImage.isDisplayed()) {
            System.out.println("Travel app image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeTravelapp)).click();
        Thread.sleep(1000);

        Set<String> thirdTab_sourceCode = driver.getWindowHandles();

        for (String tab : thirdTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Travel app source code oppend.");
        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");

        js.executeScript("window.scrollTo(0, 1000);");
    }

    public void aiML_projects() throws Exception {
        String originalTab = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath(variables.projectsMainBarClick)).click();
        driver.findElement(By.xpath(variables.aiMLProjectsButton)).click();
        Thread.sleep(500);

        // Early predection:
        WebElement EarlyPredictionofKDImage = driver.findElement(By.xpath(variables.EarlyPredictionofKDImage));
        if (EarlyPredictionofKDImage.isDisplayed()) {
            System.out.println("Early Prediction image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeEarlypredectionKD)).click();
        Thread.sleep(1000);

        Set<String> firstTab_sourceCode = driver.getWindowHandles();

        for (String tab : firstTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Early prediction source code oppend.");
        js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");

        // TMDB:
        Thread.sleep(500);
        // WebElement TMDBimage = driver.findElement(By.xpath(variables.TMDBimage));
        // if (TMDBimage.isDisplayed()) {
        //     System.out.println("MRI image is presented.");
        // }
        driver.findElement(By.xpath(variables.sourceCodeTMDBimage)).click();
        Thread.sleep(1000);

        Set<String> secondTab_viewLive = driver.getWindowHandles();

        for (String tab : secondTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("TMDB source code oppend.");

        js.executeScript("window.scrollTo(0, 0);");
    }

    public void games() throws Exception {
        String originalTab = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath(variables.projectsMainBarClick)).click();
        driver.findElement(By.xpath(variables.gamesButton)).click();
        Thread.sleep(500);

        // Snake game:
        WebElement snakegameImage = driver.findElement(By.xpath(variables.snakegameImage));
        if (snakegameImage.isDisplayed()) {
            System.out.println("Snake game image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeSnakegame)).click();
        Thread.sleep(1000);

        Set<String> firstTab_sourceCode = driver.getWindowHandles();

        for (String tab : firstTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Snake game source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveSnakegame)).click();
        Thread.sleep(1000);

        Set<String> firstTab_viewLive = driver.getWindowHandles();

        for (String tab : firstTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Snake game view live link oppend.");

        // Dungeon escape:
        WebElement dungeonescapeImage = driver.findElement(By.xpath(variables.dungeonescapeImage));
        if (dungeonescapeImage.isDisplayed()) {
            System.out.println("Dungeon escape image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeDungenescape)).click();
        Thread.sleep(1000);

        Set<String> secondTab_sourceCode = driver.getWindowHandles();

        for (String tab : secondTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Dungeon escape source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveDungenescape)).click();
        Thread.sleep(1000);

        Set<String> secondTab_viewLive = driver.getWindowHandles();

        for (String tab : secondTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Dungeon escape view live link oppend.");

        // Treasure hunter:
        WebElement treasurehunterImage = driver.findElement(By.xpath(variables.treasurehunterImage));
        if (treasurehunterImage.isDisplayed()) {
            System.out.println("Treasure hunter image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeTreasurehunter)).click();
        Thread.sleep(1000);

        Set<String> thirdTab_sourceCode = driver.getWindowHandles();

        for (String tab : thirdTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Treasure hunter source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveTreasurehunter)).click();
        Thread.sleep(1000);

        Set<String> thirdTab_viewLive = driver.getWindowHandles();

        for (String tab : thirdTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Treasure hunter view live link oppend.");

        // Space explorer:
        WebElement spaceexplorerImage = driver.findElement(By.xpath(variables.spaceexplorerImage));
        if (spaceexplorerImage.isDisplayed()) {
            System.out.println("Treasure hunter image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeSpaceexplorer)).click();
        Thread.sleep(1000);

        Set<String> fourthTab_sourceCode = driver.getWindowHandles();

        for (String tab : fourthTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Space explorer source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveSpaceexplorer)).click();
        Thread.sleep(1000);

        Set<String> fourthTab_viewLive = driver.getWindowHandles();

        for (String tab : fourthTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Space explorer view live link oppend.");
        js.executeScript("window.scrollBy({top: 400, behavior: 'smooth'});");

        // Fruit basket:
        WebElement fruitbasketfrenzyImage = driver.findElement(By.xpath(variables.fruitbasketfrenzyImage));
        if (fruitbasketfrenzyImage.isDisplayed()) {
            System.out.println("Fruit basket image is presented.");
        }
        driver.findElement(By.xpath(variables.sourceCodeTreasurehunter)).click();
        Thread.sleep(1000);

        Set<String> fivethTab_sourceCode = driver.getWindowHandles();

        for (String tab : fivethTab_sourceCode) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Fruit basket source code oppend.");

        driver.findElement(By.xpath(variables.viewLiveFruitbasket)).click();
        Thread.sleep(1000);

        Set<String> fivethTab_viewLive = driver.getWindowHandles();

        for (String tab : fivethTab_viewLive) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(originalTab);
        System.out.println("Fruit basket view live link oppend.");

        js.executeScript("window.scrollTo(0, 0);");
    }

    public void Upcoming() throws Exception {
        driver.findElement(By.xpath(variables.projectsMainBarClick)).click();
        driver.findElement(By.xpath(variables.upcomingButton)).click();
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