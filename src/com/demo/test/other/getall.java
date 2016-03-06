package com.demo.test.other;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.bean.byid.ProductInformation;

public class getall {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/work/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://web.daycogarage.com/catalogue/zh-cn/search-product-by-code?t=2&c=90499401&a=1");
       
        ProductInformation pInformation = new ProductInformation();
        WebDriverWait wait = new WebDriverWait(webDriver,10);  
        wait.until(new ExpectedCondition<WebElement>(){  
            @Override  
            public WebElement apply(WebDriver d) {  
                return d.findElement(By.id("ContainerInformationProducts"));  
            }});  

        WebElement webElement = webDriver.findElement(By.id("DettagliProdotto")); 
        System.out.println(webElement.getAttribute("outerHTML"));
        WebElement imageElement = webElement.findElement(By.className("imgProductDetails"));
        //System.out.println(webElement.findElement(By.xpath("//img")).getAttribute("src"));
        System.out.println(imageElement.getAttribute("src"));
        //System.out.println(imageElement.getAttribute("outerHTML"));
        webDriver.close();
	}
}

