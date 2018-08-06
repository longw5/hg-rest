package com.sky.hg.entity;

import java.io.Serializable;

import com.sky.hg.StringUtils;

public class CebPayGoodsInfo implements Serializable{

	private static final long serialVersionUID = 5L;
	
	
	private String payerIdNumber;
	private String areaName;
	private String itemNo;
	private String itemName;
	private int qtyNum;
	private String totalPrice;
	
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
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQtyNum() {
		return qtyNum;
	}
	public void setQtyNum(int qtyNum) {
		this.qtyNum = qtyNum;
	}
	
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String get_payerIdNumber() {
		return _payerIdNumber;
	}
	@Override
	public String toString() {
		return "CebPayGoodsInfo [payerIdNumber=" + payerIdNumber + ", areaName=" + areaName + ", itemNo=" + itemNo
				+ ", itemName=" + itemName + ", qtyNum=" + qtyNum + ", totalPrice=" + totalPrice + ", _payerIdNumber="
				+ _payerIdNumber + "]";
	}
	
}
