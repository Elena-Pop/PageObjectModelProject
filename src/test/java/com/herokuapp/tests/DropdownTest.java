package com.herokuapp.tests;

import com.herokuapp.pages.DropdownPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.DropdownPage.DROPDOWN_URL;

public class DropdownTest extends BaseTests{
    @Test (testName ="selectOption 1")
    public void selectFirstOptionIdDropdown(){
        driver=new ChromeDriver();
        driver.get(DROPDOWN_URL);
        DropdownPage dropdownPage= new DropdownPage(driver);
       // dropdownPage.selectFirstOption();
        dropdownPage.slectOption("Option 1");
        Assert.assertTrue(dropdownPage.checkThatFirstOptionIsSelected());
    }

      @Test (testName ="selectOption 2")
    public void selecSecondOptionIdDropdown(){
            driver=new ChromeDriver();
            driver.get(DROPDOWN_URL);
            DropdownPage dropdownPage= new DropdownPage(driver);
            // dropdownPage.selectFirstOption();
            dropdownPage.slectOption("Option 2");
            Assert.assertTrue(dropdownPage.checkThatSecondOptionIsSelected());




    }


}
