package com.demo.bean.byid;

/*
 * 产品信息
 */

public class ProductInformation {
	
	private String productCode;//产品编号
	
	private String description;//产品描述
	
	private String applications; //应用
	
	private String dimensions;//外形尺寸
	
	private String imageUrl;//图片路径

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApplications() {
		return applications;
	}

	public void setApplications(String applications) {
		this.applications = applications;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "ProductInformation [productCode=" + productCode
				+ ", description=" + description + ", applications="
				+ applications + ", dimensions=" + dimensions + ", imageUrl="
				+ imageUrl + "]";
	}
	
	
	
}
