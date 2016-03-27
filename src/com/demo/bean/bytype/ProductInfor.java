package com.demo.bean.bytype;

import java.util.ArrayList;
import java.util.List;;

public class ProductInfor {
	//private ProductType productType;
	//第一行信息
	private String brand;//品牌  ABARTH
	private String series; //系列 500
	private String modello;//代 08/2008 > 06/2012
	private String motortype;//车型 Nuova 500
	private String version; //版本 1.4T
	//第二行信息
	//更多信息
	private MoreInfor moreInfor;//更多信息
	private String Label_Engine;//发动机
	private String Label_CC;//
	private String Label_KwHp;//马力
	private String Label_Year;//年份
	private List TecDoclist;
	//最后一行信息
	private List productIdlist;
	public ProductInfor() {
		// TODO Auto-generated constructor stub
		//productType = new ProductType();
		moreInfor = new MoreInfor();
		TecDoclist = new ArrayList<Integer>();
		productIdlist = new ArrayList<String>();
	}
	/*public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	public ProductType getProductType() {
		return productType;
	}*/
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getMotortype() {
		return motortype;
	}
	public void setMotortype(String motortype) {
		this.motortype = motortype;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public MoreInfor getMoreInfor() {
		return moreInfor;
	}
	public void setMoreInfor(MoreInfor moreInfor) {
		this.moreInfor = moreInfor;
	}
	public String getLabel_Engine() {
		return Label_Engine;
	}
	public void setLabel_Engine(String label_Engine) {
		Label_Engine = label_Engine;
	}
	public String getLabel_CC() {
		return Label_CC;
	}
	public void setLabel_CC(String label_CC) {
		Label_CC = label_CC;
	}
	public String getLabel_KwHp() {
		return Label_KwHp;
	}
	public void setLabel_KwHp(String label_KwHp) {
		Label_KwHp = label_KwHp;
	}
	public String getLabel_Year() {
		return Label_Year;
	}
	public void setLabel_Year(String label_Year) {
		Label_Year = label_Year;
	}
	public List getTecDoclist() {
		return TecDoclist;
	}
	public void setTecDoclist(List tecDoclist) {
		TecDoclist = tecDoclist;
	}
	public List getProductIdlist() {
		return productIdlist;
	}
	public void setProductIdlist(List productIdlist) {
		this.productIdlist = productIdlist;
	}
	@Override
	public String toString() {
		return "ProductInfor [brand=" + brand
				+ ", series=" + series + ", modello=" + modello
				+ ", motortype=" + motortype + ", version=" + version
				+ ", moreInfor=" + moreInfor + ", Label_Engine=" + Label_Engine
				+ ", Label_CC=" + Label_CC + ", Label_KwHp=" + Label_KwHp
				+ ", Label_Year=" + Label_Year + ", TecDoclist=" + TecDoclist
				+ ", productIdlist=" + productIdlist + "]";
	}
	
}
