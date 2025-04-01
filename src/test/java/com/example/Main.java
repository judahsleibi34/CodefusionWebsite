package com.example;

import org.openqa.selenium.WebDriver;
import org.testng.TestNG;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {

    private static WebDriver driver;
    private beforeClass beforeclass;
    private Variables variables;
    private frameOne frameone;
    private frameTwo frametwo;
    private frameThree framethree;

    @BeforeTest
    public void setUpTest() throws Exception {
        System.out.println("Initializing CodeFusion Website Tests...");

        beforeclass = beforeClass.getInstance();
        beforeclass.Setup();
        driver = beforeClass.getDriver();

        if (driver == null) {
            throw new IllegalStateException("WebDriver could not be initialized");
        }

        variables = new Variables();
        frameone = new frameOne(driver);
        frametwo = new frameTwo(driver);
        framethree = new frameThree(driver);
    }

    @Test(priority = 1)
    public void webprojectSecttionOne() throws Exception {

        if (variables.counter == 0) {
            frameone.URLOpenning();
            frameone.mainFrameScrolling();
            frameone.homeMainBarClick();
            frameone.projectsMainBarClick();
            frameone.aboutMainBarClick();
            frameone.topScreen();
            frameone.instagramIcon();
            frameone.twitterXIcon();
            frameone.ourworkIcon();
            variables.counter += 1;
        }
    }

    @Test(priority = 2)
    public void webprojectSecttionTwo() throws Exception {
        if (variables.counter == 1) {
            frametwo.allProjects();
            frametwo.belowBar();
            frametwo.webDevtab();
            frametwo.belowBar();
            frametwo.aiML_projects();
            frametwo.belowBar();
            frametwo.games();
            frametwo.belowBar();
            frametwo.Upcoming();
            frametwo.belowBar();
            variables.counter += 1;
        }
    }

    @Test(priority = 3)
    public void aboutus() throws Exception {
        if (variables.counter == 3) {
            framethree.aboutUs();
            frametwo.belowBar();
    }
    }
    

    public static void main(String[] args) {

        System.out.println("Starting TestNG tests...");
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { Main.class });
        testng.run();
        System.out.println("Test execution completed.");
    }
}
