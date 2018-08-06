package com.sky.hg.entity;

import java.io.Serializable;

import com.sky.hg.StringUtils;

public class OdsBuyerInfoFxEntity implements Serializable{

	private static final long serialVersionUID = 6L;
	
	private String buyerIdNumber; 
	private String areaName; 
	private int buyerAge; 
	private String ageSeg; 
	private int buyerNameCount; 
	private String buyerNameSeg; 
	private int buyerTelephoneCount; 
	private String buyerTelephoneSeg; 
	private int consigneeTelephoneCount; 
	private String consigneeTelephoneSeg;
	private int consigneeAddressCount; 
	private String consigneeAddressSeg; 
	private int orderNoCount; 
	private String acturalPaid; 
	private int buyerFxScore;
	
	private String _buyerIdNumber;
	
	public String getBuyerIdNumber() {
		return buyerIdNumber;
	}
	public void setBuyerIdNumber(String buyerIdNumber) {
		this.buyerIdNumber = buyerIdNumber;
		this._buyerIdNumber = StringUtils.convertIdNumber(buyerIdNumber);
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public int getBuyerAge() {
		return buyerAge;
	}
	public void setBuyerAge(int buyerAge) {
		this.buyerAge = buyerAge;
	}
	public String getAgeSeg() {
		return ageSeg;
	}
	public void setAgeSeg(String ageSeg) {
		this.ageSeg = ageSeg;
	}
	public int getBuyerNameCount() {
		return buyerNameCount;
	}
	public void setBuyerNameCount(int buyerNameCount) {
		this.buyerNameCount = buyerNameCount;
	}
	public String getBuyerNameSeg() {
		return buyerNameSeg;
	}
	public void setBuyerNameSeg(String buyerNameSeg) {
		this.buyerNameSeg = buyerNameSeg;
	}
	public int getBuyerTelephoneCount() {
		return buyerTelephoneCount;
	}
	public void setBuyerTelephoneCount(int buyerTelephoneCount) {
		this.buyerTelephoneCount = buyerTelephoneCount;
	}
	public String getBuyerTelephoneSeg() {
		return buyerTelephoneSeg;
	}
	public void setBuyerTelephoneSeg(String buyerTelephoneSeg) {
		this.buyerTelephoneSeg = buyerTelephoneSeg;
	}
	public int getConsigneeTelephoneCount() {
		return consigneeTelephoneCount;
	}
	public void setConsigneeTelephoneCount(int consigneeTelephoneCount) {
		this.consigneeTelephoneCount = consigneeTelephoneCount;
	}
	public String getConsigneeTelephoneSeg() {
		return consigneeTelephoneSeg;
	}
	public void setConsigneeTelephoneSeg(String consigneeTelephoneSeg) {
		this.consigneeTelephoneSeg = consigneeTelephoneSeg;
	}
	public int getConsigneeAddressCount() {
		return consigneeAddressCount;
	}
	public void setConsigneeAddressCount(int consigneeAddressCount) {
		this.consigneeAddressCount = consigneeAddressCount;
	}
	public String getConsigneeAddressSeg() {
		return consigneeAddressSeg;
	}
	public void setConsigneeAddressSeg(String consigneeAddressSeg) {
		this.consigneeAddressSeg = consigneeAddressSeg;
	}
	public int getOrderNoCount() {
		return orderNoCount;
	}
	public void setOrderNoCount(int orderNoCount) {
		this.orderNoCount = orderNoCount;
	}
	public String getActuralPaid() {
		return acturalPaid;
	}
	public void setActuralPaid(String acturalPaid) {
		this.acturalPaid = acturalPaid;
	}
	public int getBuyerFxScore() {
		return buyerFxScore;
	}
	public void setBuyerFxScore(int buyerFxScore) {
		this.buyerFxScore = buyerFxScore;
	}
	public String get_buyerIdNumber() {
		return _buyerIdNumber;
	}
	@Override
	public String toString() {
		return "OdsBuyerInfoFxEntity [buyerIdNumber=" + buyerIdNumber + ", areaName=" + areaName + ", buyerAge="
				+ buyerAge + ", ageSeg=" + ageSeg + ", buyerNameCount=" + buyerNameCount + ", buyerNameSeg="
				+ buyerNameSeg + ", buyerTelephoneCount=" + buyerTelephoneCount + ", buyerTelephoneSeg="
				+ buyerTelephoneSeg + ", consigneeTelephoneCount=" + consigneeTelephoneCount
				+ ", consigneeTelephoneSeg=" + consigneeTelephoneSeg + ", consigneeAddressCount="
				+ consigneeAddressCount + ", consigneeAddressSeg=" + consigneeAddressSeg + ", orderNoCount="
				+ orderNoCount + ", acturalPaid=" + acturalPaid + ", buyerFxScore=" + buyerFxScore + ", _buyerIdNumber="
				+ _buyerIdNumber + "]";
	}
	
	
}
