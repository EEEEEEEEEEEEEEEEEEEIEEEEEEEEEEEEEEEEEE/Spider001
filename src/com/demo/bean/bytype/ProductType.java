package com.demo.bean.bytype;

public class ProductType {
	
	private String type; //类型
	private String brand;
	private String form;
	private String year;
	private String version;
	private String engine;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "ProductType [type=" + type + ", bradn=" + brand + ", form="
				+ form + ", year=" + year + ", version=" + version
				+ ", engine=" + engine + "]";
	}
	
	
	
}
