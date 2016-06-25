package org.wsc.pageobject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.bouncycastle.crypto.modes.gcm.Tables1kGCMExponentiator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;


public class testpagetwo {

    public void chaxunFF(String content)
    {
    	try {
			DesiredCapabilities ffDesiredcap = DesiredCapabilities.firefox();
			
			DesiredCapabilities chromeDesiredcap = DesiredCapabilities.chrome();  
			DesiredCapabilities ieDesiredcap = DesiredCapabilities.internetExplorer(); 
			WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), ffDesiredcap);
			driver.manage().window().maximize();
			// 对页面元素的初始化
			baidu m=PageFactory.initElements(driver, baidu.class);
			m.chaxun(driver, content);
			Thread.sleep(10000);
			driver.quit();
		} catch (MalformedURLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    public void chaxunIE(String content)
    {
    	try {
			DesiredCapabilities ffDesiredcap = DesiredCapabilities.firefox();
			
			DesiredCapabilities chromeDesiredcap = DesiredCapabilities.chrome();  
			DesiredCapabilities ieDesiredcap = DesiredCapabilities.internetExplorer(); 
			WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), ieDesiredcap);
			driver.manage().window().maximize();
			// 对页面元素的初始化
			baidu m=PageFactory.initElements(driver, baidu.class);
			m.chaxun(driver, content);
			Thread.sleep(10000);
			driver.quit();
		} catch (MalformedURLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
    public static void main(String[] args)
    {
    	System.setProperty("webdriver.chrome.driver", "res/chromedriver");
    	
    	
    	testpagetwo tl = new testpagetwo();
    	tl.chaxunIE("chrome");
        
    }
}