package com.krafttech.pages;

import com.krafttech.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SaucedemoOverwiewPage extends SaucedemoBasePage{

    public void assertPriceOfItems(String urun){
        WebElement price = Driver.get().findElement(By.xpath("(//div[@class='inventory_item_price'])[./../../a[.='"+urun+"']]"));
        System.out.println(urun+" fiyatı : "+price.getText());
    }
}
