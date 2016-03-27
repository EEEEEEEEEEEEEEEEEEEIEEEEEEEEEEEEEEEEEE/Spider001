package com.demo.bean.bytype;

public class MoreInfor {
	private double cylinderBore;//缸径
	private double route;//行程
	private double maxTorque;//最大扭矩
	private double torqueSpeed;//扭矩转速
	private int cylinderNum;//气缸数目
	private int valvoleNum;//气门数
	private String Alimentazione;//电力供应
	private String Disposizione;//布局
	private String Carburante;//燃料
	private String AlberoACamme;//凸轮轴
	public double getCylinderBore() {
		return cylinderBore;
	}
	public void setCylinderBore(double cylinderBore) {
		this.cylinderBore = cylinderBore;
	}
	public double getRoute() {
		return route;
	}
	public void setRoute(double route) {
		this.route = route;
	}
	public double getMaxTorque() {
		return maxTorque;
	}
	public void setMaxTorque(double maxTorque) {
		this.maxTorque = maxTorque;
	}
	public double getTorqueSpeed() {
		return torqueSpeed;
	}
	public void setTorqueSpeed(double torqueSpeed) {
		this.torqueSpeed = torqueSpeed;
	}
	public int getCylinderNum() {
		return cylinderNum;
	}
	public void setCylinderNum(int cylinderNum) {
		this.cylinderNum = cylinderNum;
	}
	public int getValvoleNum() {
		return valvoleNum;
	}
	public void setValvoleNum(int valvoleNum) {
		this.valvoleNum = valvoleNum;
	}
	public String getAlimentazione() {
		return Alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		Alimentazione = alimentazione;
	}
	public String getDisposizione() {
		return Disposizione;
	}
	public void setDisposizione(String disposizione) {
		Disposizione = disposizione;
	}
	public String getCarburante() {
		return Carburante;
	}
	public void setCarburante(String carburante) {
		Carburante = carburante;
	}
	public String getAlberoACamme() {
		return AlberoACamme;
	}
	public void setAlberoACamme(String alberoACamme) {
		AlberoACamme = alberoACamme;
	}
	@Override
	public String toString() {
		return "MoreInfor [cylinderBore=" + cylinderBore + ", route=" + route
				+ ", maxTorque=" + maxTorque + ", torqueSpeed=" + torqueSpeed
				+ ", cylinderNum=" + cylinderNum + ", valvoleNum=" + valvoleNum
				+ ", Alimentazione=" + Alimentazione + ", Disposizione="
				+ Disposizione + ", Carburante=" + Carburante
				+ ", AlberoACamme=" + AlberoACamme + "]";
	}
	
}
