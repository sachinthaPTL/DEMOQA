package org.pragmatic.demoqa.tests;

import org.openqa.selenium.support.PageFactory;
import org.pragmatic.demoqa.pages.HomePage;
import org.pragmatic.demoqa.util.DemoQADomainConstraint;
import org.pragmatic.demoqa.util.DemoQATestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends DemoQATestBase{


    @Test
    public void homePageTitleTest(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        driver.get(DemoQADomainConstraint.BASEURL);
        String title = homePage.getTitle();
        Assert.assertEquals(title,"ONLINE STORE | Toolsqa Dummy Test site");
    }

    @Test
    public void iphoneLabelTest(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        driver.get(DemoQADomainConstraint.BASEURL);
        String lbltext = homePage.getLabelText();
        Assert.assertEquals(lbltext,"Account\n" +
                "My Account");
    }

}
