package com.sky.hg.entity;

import java.io.Serializable;

public class OdsBuyerTelephoneInfoEntity implements Serializable {

	private static final long serialVersionUID = 15L;
	
	private String buyerTelephone;
	private int buyerIdNumberCount;
	private String buyerIdNumberSeg;
	private int consigneeTelephoneCount;
	private int consigneeAddressCount;
	private int orderNoCount;
	private String acturalPaid;
	public String getBuyerTelephone() {
		return buyerTelephone;
	}
	public void setBuyerTelephone(String buyerTelephone) {
		this.buyerTelephone = buyerTelephone;
	}
	public int getBuyerIdNumberCount() {
		return buyerIdNumberCount;
	}
	public void setBuyerIdNumberCount(int buyerIdNumberCount) {
		this.buyerIdNumberCount = buyerIdNumberCount;
	}
	public String getBuyerIdNumberSeg() {
		return buyerIdNumberSeg;
	}
	public void setBuyerIdNumberSeg(String buyerIdNumberSeg) {
		this.buyerIdNumberSeg = buyerIdNumberSeg;
	}
	public int getConsigneeTelephoneCount() {
		return consigneeTelephoneCount;
	}
	public void setConsigneeTelephoneCount(int consigneeTelephoneCount) {
		this.consigneeTelephoneCount = consigneeTelephoneCount;
	}
	public int getConsigneeAddressCount() {
		return consigneeAddressCount;
	}
	public void setConsigneeAddressCount(int consigneeAddressCount) {
		this.consigneeAddressCount = consigneeAddressCount;
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
	@Override
	public String toString() {
		return "OdsBuyerTelephoneInfoEntity [buyerTelephone=" + buyerTelephone + ", buyerIdNumberCount="
				+ buyerIdNumberCount + ", buyerIdNumberSeg=" + buyerIdNumberSeg + ", consigneeTelephoneCount="
				+ consigneeTelephoneCount + ", consigneeAddressCount=" + consigneeAddressCount + ", orderNoCount="
				+ orderNoCount + ", acturalPaid=" + acturalPaid + "]";
	}
	
}
