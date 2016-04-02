package com.demo.Manager;

import java.util.List;

import org.junit.experimental.theories.FromDataPoints;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.bean.bytype.ProductInfor;

public class TypeInforSend {
	private WebElement productInforElement;
	private ProductInfor productInfor;

	public TypeInforSend(ProductInfor productInfor) {
		// TODO Auto-generated constructor stub
		this.productInfor = productInfor;
	}

	public void setProductInforElement(WebElement productInforElement) {
		this.productInforElement = productInforElement;
	}

	public void sendInfor() {
		// System.out.println(productInfor.getProductType());
		// System.out.println(productInforElement.getAttribute("outerHTML"));
		productInfor.setBrand(productInforElement.findElement(
				By.xpath("//th[@id='title1']/span[@title='品牌']")).getText());
		productInfor.setSeries(productInforElement.findElement(
				By.xpath("//th[@id='model']/span[@title='系列']")).getText());
		productInfor.setModello(productInforElement.findElement(
				By.xpath("//th[@id='model']/span[@title='代']")).getText());
		productInfor.setMotortype(productInforElement.findElement(
				By.xpath("//th[@id='version']/span[@title='车型']")).getText());
		productInfor.setVersion(productInforElement.findElement(
				By.xpath("//th[@id='version']/span[@title='版本']")).getText());
		// productInfor.getMoreInfor().setCylinderBore(Double.parseDouble(
		// productInforElement.findElement(By.xpath("//th[@id='version']/span[@title='版本']")).getText()));
		WebElement moreInfor =
			productInforElement.findElement(By.xpath("//table[@class='greyLightTable']"));

		//System.out.println(productInforElement.findElement(By
			//	.cssSelector("data-bind='text: selectedMotoreDetails()'")));
		System.out.println(moreInfor.getAttribute("outerHTML"));
		List<WebElement> listWebElements = moreInfor.findElements(By.xpath("//td[@*]"));//moreInfor.findElement(By.xpath("//td[@*]"));
		System.out.println(listWebElements.get(1).getText());
		System.out.println(productInfor);
	}
}
