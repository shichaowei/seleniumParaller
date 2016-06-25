package org.wsc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class mail163 {
      @FindBy(id="idInput" )
      private WebElement username;

      
 

      @FindBy(id="pwdInput" )
      private WebElement password;
 

      @FindBy(id="loginBtn" )
      private WebElement loginBtn;
 

      public void login(WebDriver dr,String username,String pwd){

             dr.get("http://mail.163.com");

             this.username.sendKeys(username);

             this.password.sendKeys(pwd);
            loginBtn.click();

      }
}