package com.demo.bean.bytype;

public class ProductInfor {
	private ProductType productType;
	
	public ProductInfor() {
		// TODO Auto-generated constructor stub
		productType = new ProductType();
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	public ProductType getProductType() {
		return productType;
	}
}
