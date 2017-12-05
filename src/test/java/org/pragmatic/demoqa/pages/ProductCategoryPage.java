package org.pragmatic.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCategoryPage {

    @FindBy(xpath = "//*[@id='menu-item-33']/a")
    WebElement tabProductC;

    @FindBy(xpath = "//*[@action='http://store.demoqa.com/products-page/product-category/n/']/div[2]/div[1]")
    WebElement btnAdd;

    @FindBy(xpath = "//*[@title='Checkout']")
    WebElement btnChekOut;

    @FindBy(xpath = "//*[text()='iPhone 5']")
    WebElement lblIphone;

    public void clicProductTab(){
        tabProductC.click();
    }

    public void clickAdd(){
        btnAdd.click();
    }

    public void setBtnChekOut(){
        btnChekOut.click();
    }

    public String getlblIphone(){
        return lblIphone.getText();
    }
}
