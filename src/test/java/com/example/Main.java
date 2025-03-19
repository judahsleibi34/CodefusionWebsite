package com.example;

import org.testng.TestNG;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {

    private BeforeClass_CodeFusionWebsite beforeClass_codefusionwebsite;
    private Variable_CodeFusionWebsite variables_codefusionwebsite;
    private MainFrame_CodeFusionWebsite mainframe_codefusionwebsite;
    private OurWorkFrame_CodeFusionWebsite ourworkframe_codefusionwebsite;

    @BeforeTest
    public void setUpTest() throws Exception {
        System.out.println("Initializing CodeFusion Website Tests...");

        beforeClass_codefusionwebsite = new BeforeClass_CodeFusionWebsite();
        variables_codefusionwebsite = new Variable_CodeFusionWebsite();

        beforeClass_codefusionwebsite.Setup();

        mainframe_codefusionwebsite = new MainFrame_CodeFusionWebsite(beforeClass_codefusionwebsite);
        ourworkframe_codefusionwebsite = new OurWorkFrame_CodeFusionWebsite(mainframe_codefusionwebsite.getDriver());
    }

    @Test(priority = 1)
    public void webprojectSecttionOne() throws Exception {

        if (variables_codefusionwebsite.counter == 0) {
            mainframe_codefusionwebsite.URLOpenning();
            mainframe_codefusionwebsite.mainFrameScrolling();
            mainframe_codefusionwebsite.homeMainBarClick();
            mainframe_codefusionwebsite.projectsMainBarClick();
            mainframe_codefusionwebsite.aboutMainBarClick();
            mainframe_codefusionwebsite.topScreen();
            mainframe_codefusionwebsite.instagramIcon();
            // mainframe_codefusionwebsite.emailIcon();
            // mainframe_codefusionwebsite.whatsupIcon();
            mainframe_codefusionwebsite.twitterXIcon();
            mainframe_codefusionwebsite.ourworkIcon();

            variables_codefusionwebsite.counter += 1;
        }
    }

    @Test(priority = 2)
    public void webprojectSecttionTwo() throws Exception {
        if (variables_codefusionwebsite.counter == 1) {

            ourworkframe_codefusionwebsite.ViewOurWork();
            ourworkframe_codefusionwebsite.PorjectSlider();
            variables_codefusionwebsite.counter += 1;
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
