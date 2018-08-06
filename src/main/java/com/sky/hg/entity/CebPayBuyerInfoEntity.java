package com.sky.hg.entity;

import java.io.Serializable;

import com.sky.hg.StringUtils;

public class CebPayBuyerInfoEntity implements Serializable{

	private static final long serialVersionUID = 2L;
	
	private String payerIdNumber;
	private String payerAreaName;
	private String buyerIdNumber;
	private String buyerAreaName;
	private int orderNoNum;
	private String acturalPaid;
	
	private String _payerIdNumber;
	private String _buyerIdNumber;
	
	public String getPayerIdNumber() {
		return payerIdNumber;
	}
	public void setPayerIdNumber(String payerIdNumber) {
		this.payerIdNumber = payerIdNumber;
		this._payerIdNumber = StringUtils.convertIdNumber(payerIdNumber);
	}
	public String getPayerAreaName() {
		return payerAreaName;
	}
	public void setPayerAreaName(String payerAreaName) {
		this.payerAreaName = payerAreaName;
	}
	public String getBuyerIdNumber() {
		return buyerIdNumber;
	}
	public void setBuyerIdNumber(String buyerIdNumber) {
		this.buyerIdNumber = buyerIdNumber;
		this._buyerIdNumber = StringUtils.convertIdNumber(buyerIdNumber);
	}
	public String getBuyerAreaName() {
		return buyerAreaName;
	}
	public void setBuyerAreaName(String buyerAreaName) {
		this.buyerAreaName = buyerAreaName;
	}
	public int getOrderNoNum() {
		return orderNoNum;
	}
	public void setOrderNoNum(int orderNoNum) {
		this.orderNoNum = orderNoNum;
	}
	
	public String getActuralPaid() {
		return acturalPaid;
	}
	public void setActuralPaid(String acturalPaid) {
		this.acturalPaid = acturalPaid;
	}
	public String get_payerIdNumber() {
		return _payerIdNumber;
	}
	public String get_buyerIdNumber() {
		return _buyerIdNumber;
	}
	@Override
	public String toString() {
		return "CebPayBuyerInfoEntity [payerIdNumber=" + payerIdNumber + ", payerAreaName=" + payerAreaName
				+ ", buyerIdNumber=" + buyerIdNumber + ", buyerAreaName=" + buyerAreaName + ", orderNoNum=" + orderNoNum
				+ ", acturalPaid=" + acturalPaid + ", _payerIdNumber=" + _payerIdNumber + ", _buyerIdNumber="
				+ _buyerIdNumber + "]";
	}
	
}
