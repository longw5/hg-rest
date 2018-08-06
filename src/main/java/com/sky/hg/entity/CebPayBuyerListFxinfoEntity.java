package com.sky.hg.entity;

import java.io.Serializable;

import com.sky.hg.StringUtils;

public class CebPayBuyerListFxinfoEntity implements Serializable{

	private static final long serialVersionUID = 3L;
	
	private String payerIdNumber;
	private int buyerNum;
	private int fxBuyerNum;
	private int mulBuyerName;
	private int mulBuyerTel;
	private int mulConsigneeTel;
	private int mulAddress;
	
	private String _payerIdNumber;
	
	public String getPayerIdNumber() {
		return payerIdNumber;
	}
	public void setPayerIdNumber(String payerIdNumber) {
		this.payerIdNumber = payerIdNumber;
		this._payerIdNumber = StringUtils.convertIdNumber(payerIdNumber);
	}
	public int getBuyerNum() {
		return buyerNum;
	}
	public void setBuyerNum(int buyerNum) {
		this.buyerNum = buyerNum;
	}
	public int getFxBuyerNum() {
		return fxBuyerNum;
	}
	public void setFxBuyerNum(int fxBuyerNum) {
		this.fxBuyerNum = fxBuyerNum;
	}
	public int getMulBuyerName() {
		return mulBuyerName;
	}
	public void setMulBuyerName(int mulBuyerName) {
		this.mulBuyerName = mulBuyerName;
	}
	public int getMulBuyerTel() {
		return mulBuyerTel;
	}
	public void setMulBuyerTel(int mulBuyerTel) {
		this.mulBuyerTel = mulBuyerTel;
	}
	public int getMulConsigneeTel() {
		return mulConsigneeTel;
	}
	public void setMulConsigneeTel(int mulConsigneeTel) {
		this.mulConsigneeTel = mulConsigneeTel;
	}
	public int getMulAddress() {
		return mulAddress;
	}
	public void setMulAddress(int mulAddress) {
		this.mulAddress = mulAddress;
	}
	
	public String get_payerIdNumber() {
		return _payerIdNumber;
	}
	@Override
	public String toString() {
		return "CebPayBuyerListFxinfoEntity [payerIdNumber=" + payerIdNumber + ", buyerNum=" + buyerNum
				+ ", fxBuyerNum=" + fxBuyerNum + ", mulBuyerName=" + mulBuyerName + ", mulBuyerTel=" + mulBuyerTel
				+ ", mulConsigneeTel=" + mulConsigneeTel + ", mulAddress=" + mulAddress + ", _payerIdNumber="
				+ _payerIdNumber + "]";
	}
	
}
