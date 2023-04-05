package com.krafttech.pages;

import com.krafttech.utulities.BrowserUtils;
import com.krafttech.utulities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaucedemoYourCardPage extends SaucedemoBasePage{

   public void urunDogrulama(String urun){
       WebElement secilenUrun = Driver.get().findElement(By.xpath("//div[text()='"+urun+"']"));
        String expectedSecilenUrun = urun;
        String actualSecilenUrun = secilenUrun.getText();
       Assert.assertEquals(expectedSecilenUrun,actualSecilenUrun);
   }
   @FindBy(css = "#checkout")
    public WebElement checkOutButton;

   public void checkOutButton(){
       WebElement checkOut = Driver.get().findElement(By.cssSelector("#finish"));
       BrowserUtils.waitForClickablility(checkOut,9);
       BrowserUtils.clickWithJS(checkOut);
   }
}
