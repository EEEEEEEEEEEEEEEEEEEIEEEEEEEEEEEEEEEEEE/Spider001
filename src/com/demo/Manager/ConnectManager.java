package com.demo.Manager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.bean.byid.ProductInformation;
import com.demo.dao.iddao.IdInforDaoIpmMysql;

public class ConnectManager {
	private IdInforDaoIpmMysql infor;
	
	private WebDriver webDriver;
	//private WebElement webEle;
	public ConnectManager() {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", "E:/work/chromedriver.exe");
		
        webDriver = new ChromeDriver();
	}
	
	public void getWebeleByType(){
		TypeInforSend inforSend = new TypeInforSend();
		
		webDriver.get("http://web.daycogarage.com/catalogue/zh-cn/search-model?a=1&t=1");

	    JavascriptExecutor js = (JavascriptExecutor) webDriver;
	    js.executeScript("document.getElementById('ddlTipologia').style.display='list-item';");
	    js.executeScript("document.getElementById('TipologiaMobile').style.display='list-item';");
	    
	     /*WebElement webElement = webDriver.findElement(By.xpath
	    		 ("//div[@id='TipologiaMobile']"));
	     webElement = webElement.findElement(By.xpath("//select[@id='ddlTipologia' and not(contains(@style,'display:none'))]"));*/
	    
	     //WebDriverWait wait = new WebDriverWait(webDriver,10);
		//WebDriverWait wait = new WebDriverWait(webDriver,10);  
/*	  wait.until(new ExpectedCondition<String>(){  
	    	 @Override  
	    	 public String apply(WebDriver d) {  
	    		 WebElement temp = d.findElement(By.xpath("//select[@id='ddlTipologia']"));
	    		 Select select = new Select(temp);
	    		 //select.getFirstSelectedOption().getTagName();
	    		 return select.getFirstSelectedOption().getTagName() ;
	    		 }}); */
	    
	    //WebElement selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formLevel:levels_input")))
	  /*  try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/

	    new WebDriverWait(webDriver, 15).until(
	    	    ExpectedConditions.presenceOfElementLocated(By.xpath("//option[@value='0']"))
	    	);
	    
	    By by = By.xpath("//select[@id='ddlTipologia']");
	    
	    selectOption(webDriver,by,1);
	     
	}

	
	public void getWebeleByID(){
        
        IdInforSend inforSend = new IdInforSend();
        
        webDriver.get("http://web.daycogarage.com/catalogue/zh-cn/search-product-by-code?t=2&c=90499401&a=1");

        WebDriverWait wait = new WebDriverWait(webDriver,10);  
        wait.until(new ExpectedCondition<WebElement>(){  
            @Override  
            public WebElement apply(WebDriver d) {  
                return d.findElement(By.id("ContainerInformationProducts"));  
            }});  
        
        WebElement webElement = webDriver.findElement(By.id("ContainerInformationProducts")); 
		
        inforSend.setWebElement(webElement);

        inforSend.sendProductInfor();
	}
	
	public void release(){
        webDriver.close();
	}
	

	private void selectOption(WebDriver webDriver,By by,int index){
		int i = 0;
		try{
			
			WebElement webElement = webDriver.findElement(by); 
			
			System.out.println(webElement.getAttribute("outerHTML"));
			Select selectType = new Select(webElement);
	     
	        List<WebElement> listweb = selectType.getOptions();
	     
	        for(i=index; i<listweb.size(); i++){
	        	
	    		    listweb.get(i).click();
	    		    new WebDriverWait(webDriver, 15).until(
	    		    	    ExpectedConditions.presenceOfElementLocated(By.xpath("//option[@value='4']"))
	    		    	);
	    		    WebElement e = webDriver.findElement(By.xpath("//select[@id='ddlMarca']"));
	    		    System.out.println(i+e.getAttribute("outerHTML"));
	    	    
	        }
		}catch(StaleElementReferenceException e){
			selectOption(webDriver,by,i);
		}
	}
}
