package com.sky.hg.entity;

import java.io.Serializable;

public class DmEbpBuyerIdScoreFxTotalEntity implements Serializable{

	private static final long serialVersionUID = 14L;
	
	private String ebpCode;
	private String ebpName;
	private int buyerIdNumberCount;
	private int orderNoCount;
	private String acturalPaid;
	private int fxBuyerIdNumberCount;
	private int fxOrderNoCount;
	private String fxActuralPaid;
	private String fxBuyerIdNumberCountRate;
	private String fxOrderNoCountRate;
	private String fxActuralPaidRate;
	public String getEbpCode() {
		return ebpCode;
	}
	public void setEbpCode(String ebpCode) {
		this.ebpCode = ebpCode;
	}
	public String getEbpName() {
		return ebpName;
	}
	public void setEbpName(String ebpName) {
		this.ebpName = ebpName;
	}
	public int getBuyerIdNumberCount() {
		return buyerIdNumberCount;
	}
	public void setBuyerIdNumberCount(int buyerIdNumberCount) {
		this.buyerIdNumberCount = buyerIdNumberCount;
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
	public int getFxBuyerIdNumberCount() {
		return fxBuyerIdNumberCount;
	}
	public void setFxBuyerIdNumberCount(int fxBuyerIdNumberCount) {
		this.fxBuyerIdNumberCount = fxBuyerIdNumberCount;
	}
	public int getFxOrderNoCount() {
		return fxOrderNoCount;
	}
	public void setFxOrderNoCount(int fxOrderNoCount) {
		this.fxOrderNoCount = fxOrderNoCount;
	}
	public String getFxActuralPaid() {
		return fxActuralPaid;
	}
	public void setFxActuralPaid(String fxActuralPaid) {
		this.fxActuralPaid = fxActuralPaid;
	}
	public String getFxBuyerIdNumberCountRate() {
		return fxBuyerIdNumberCountRate;
	}
	public void setFxBuyerIdNumberCountRate(String fxBuyerIdNumberCountRate) {
		this.fxBuyerIdNumberCountRate = fxBuyerIdNumberCountRate;
	}
	public String getFxOrderNoCountRate() {
		return fxOrderNoCountRate;
	}
	public void setFxOrderNoCountRate(String fxOrderNoCountRate) {
		this.fxOrderNoCountRate = fxOrderNoCountRate;
	}
	public String getFxActuralPaidRate() {
		return fxActuralPaidRate;
	}
	public void setFxActuralPaidRate(String fxActuralPaidRate) {
		this.fxActuralPaidRate = fxActuralPaidRate;
	}
	@Override
	public String toString() {
		return "DmEbpBuyerIdScoreFxTotalEntity [ebpCode=" + ebpCode + ", ebpName=" + ebpName + ", buyerIdNumberCount="
				+ buyerIdNumberCount + ", orderNoCount=" + orderNoCount + ", acturalPaid=" + acturalPaid
				+ ", fxBuyerIdNumberCount=" + fxBuyerIdNumberCount + ", fxOrderNoCount=" + fxOrderNoCount
				+ ", fxActuralPaid=" + fxActuralPaid + ", fxBuyerIdNumberCountRate=" + fxBuyerIdNumberCountRate
				+ ", fxOrderNoCountRate=" + fxOrderNoCountRate + ", fxActuralPaidRate=" + fxActuralPaidRate + "]";
	}
	
}
