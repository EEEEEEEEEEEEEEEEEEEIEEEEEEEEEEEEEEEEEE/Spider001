package com.demo.dao.iddao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.bean.byid.Applications;
import com.demo.bean.byid.ProductInformation;

public class IdInforDaoIpmMysql implements IdInforDao{

	private Applications applications;

	private ProductInformation pInformation;
	
	public void addApplication() {
		// TODO Auto-generated method stub
		System.out.println(this.pInformation);
	}


	public void addProductInfo() {
		// TODO Auto-generated method stub
		
	}


	public void addSuport() {
		// TODO Auto-generated method stub
		
	}


	public void setApplications(Applications applications) {
		this.applications = applications;
	}
	
	public void setpInformation(ProductInformation pInformation) {
		this.pInformation = pInformation;
	}
	
	
}
