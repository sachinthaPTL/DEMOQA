package org.pragmatic.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pragmatic.demoqa.util.DemoQATestBase;

public class HomePage extends DemoQATestBase{

    @FindBy(xpath = "//*[@title='My Account']")
    WebElement myaccount;

    public String getTitle(){
        return driver.getTitle();
    }

    public String getLabelText(){
        return myaccount.getText();
    }

}
