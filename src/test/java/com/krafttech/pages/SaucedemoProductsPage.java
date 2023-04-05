package com.krafttech.pages;

import com.krafttech.utulities.BrowserUtils;
import com.krafttech.utulities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SaucedemoProductsPage extends SaucedemoBasePage{

    public void secilenUrun(String secilenUrun){
//        WebElement urun = Driver.get().findElement(By.xpath("//div[text()='"+secilenUrun+"']"));
//        BrowserUtils.waitForClickablility(urun,9);
//        BrowserUtils.clickWithJS(urun);

        WebElement addToCardButton = Driver.get().findElement
                (By.xpath("//div[text()='"+secilenUrun+"']/../../..//button"));
        BrowserUtils.waitForClickablility(addToCardButton,9);
        BrowserUtils.clickWithJS(addToCardButton);
    }

    public void assertTheBasketNumber(String urunSayisi){
        WebElement sayı = Driver.get().findElement(By.xpath("//span[text()='"+urunSayisi+"']"));
        String expectedSayi = urunSayisi;
        String actualSayi = sayı.getText();
        Assert.assertEquals(expectedSayi,actualSayi);
    }
    public void sepetButton(){
        WebElement sepet = Driver.get().findElement(By.xpath("//a[@class='shopping_cart_link']"));
        BrowserUtils.waitForClickablility(sepet,9);
        BrowserUtils.clickWithJS(sepet);

    }

}
