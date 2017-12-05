package org.pragmatic.demoqa.tests;

import org.openqa.selenium.support.PageFactory;
import org.pragmatic.demoqa.pages.ProductCategoryPage;
import org.pragmatic.demoqa.util.DemoQADomainConstraint;
import org.pragmatic.demoqa.util.DemoQATestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductCategoryPageTest extends DemoQATestBase{

    @Test
    public void addCartTest(){
        ProductCategoryPage productCategoryPage = PageFactory.initElements(driver,ProductCategoryPage.class);
        driver.get(DemoQADomainConstraint.BASEURL);
        productCategoryPage.clicProductTab();
        productCategoryPage.clickAdd();
        productCategoryPage.setBtnChekOut();
        String ActualLbl =  productCategoryPage.getlblIphone();
        Assert.assertEquals(ActualLbl,"iPhone 5");
    }

}
