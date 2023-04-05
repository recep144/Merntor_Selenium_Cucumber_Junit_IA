package com.krafttech.steps_defs;

import com.krafttech.utulities.BrowserUtils;
import com.krafttech.utulities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        // Driver.get().manage().window().setPosition(new Point(-1000,0));
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        BrowserUtils.waitFor(4);
        Driver.closeDriver();
    }

    @Before("@db")
    public void setUpDB(){
        System.out.println("\t Connecting DB");
    }
    @After("@db")
    public void tearDownDB(){
        System.out.println("\tDisconnecting DB");
    }
}
