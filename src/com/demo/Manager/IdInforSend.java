package com.demo.Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.bean.byid.ProductInformation;
import com.demo.dao.iddao.IdInforDaoIpmMysql;

public class IdInforSend {
	
	private WebElement webElement;
	
	public void sendProductInfor(){
		    ProductInformation pInformation = new ProductInformation();
			
	        pInformation.setProductCode(webElement.findElement(By.className("productCode")).getText());
	        
	        pInformation.setDimensions(webElement.findElement(By.xpath("//td[@title='外形尺寸']")).getText());
	        
	        pInformation.setDescription(webElement.findElement(By.xpath("//td[@title='描述']")).getText());
	        
	        pInformation.setApplications(webElement.findElement(By.xpath("//td[@title='应用']")).getText());
	        
	        pInformation.setImageUrl(webElement.findElement(By.className("imgProductDetails")).getAttribute("src"));
			
	        IdInforDaoIpmMysql infor = new IdInforDaoIpmMysql();
	        
	        infor.setpInformation(pInformation);
	        
	        infor.addApplication();
	        
	        //System.out.println(pInformation);
	}
	
	
	
	public void setWebElement(WebElement webElement) {
		this.webElement = webElement;
	}
}
