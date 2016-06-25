package org.wsc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class baidu {

	@FindBy(id="kw" )
    private WebElement chaxun;


    public void chaxun(WebDriver dr,String content){

           dr.get("http://www.baidu.com");

           this.chaxun.sendKeys(content);


    }
}
