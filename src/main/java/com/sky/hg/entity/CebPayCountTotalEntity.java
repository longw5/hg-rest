package com.sky.hg.entity;

import java.io.Serializable;

import com.sky.hg.StringUtils;

public class CebPayCountTotalEntity  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String payerIdNumber;
	private String areaName;
	private int ebcNum;
	private int buyerIdNumberNum;
	private int ordNoNum;
	private String payAmount;
	private String acturalPaid;
	
	private String _payerIdNumber;
	
	public String getPayerIdNumber() {
		return payerIdNumber;
	}
	public void setPayerIdNumber(String payerIdNumber) {
		this.payerIdNumber = payerIdNumber;
		this._payerIdNumber = StringUtils.convertIdNumber(payerIdNumber);
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public int getEbcNum() {
		return ebcNum;
	}
	public void setEbcNum(int ebcNum) {
		this.ebcNum = ebcNum;
	}
	public int getBuyerIdNumberNum() {
		return buyerIdNumberNum;
	}
	public void setBuyerIdNumberNum(int buyerIdNumberNum) {
		this.buyerIdNumberNum = buyerIdNumberNum;
	}
	public int getOrdNoNum() {
		return ordNoNum;
	}
	public void setOrdNoNum(int ordNoNum) {
		this.ordNoNum = ordNoNum;
	}
	
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
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
	@Override
	public String toString() {
		return "CebPayCountTotalEntity [payerIdNumber=" + payerIdNumber + ", areaName=" + areaName + ", ebcNum="
				+ ebcNum + ", buyerIdNumberNum=" + buyerIdNumberNum + ", ordNoNum=" + ordNoNum + ", payAmount="
				+ payAmount + ", acturalPaid=" + acturalPaid + ", _payerIdNumber=" + _payerIdNumber + "]";
	}
	
}
