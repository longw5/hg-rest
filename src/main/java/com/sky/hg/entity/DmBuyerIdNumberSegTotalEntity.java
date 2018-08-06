package com.sky.hg.entity;

import java.io.Serializable;

public class DmBuyerIdNumberSegTotalEntity implements Serializable {

	private static final long serialVersionUID = 12L;
	
	private int seqId; 
	private String buyerIdNumberSeg; 
	private int buyerTelephoneCount;
	private String buyerTelephoneCountRate;
	private int orderNoCount; 
	private String acturalPaid; 
	private String avgOrderNoCount;
	private String avgActuralPaid;
	public int getSeqId() {
		return seqId;
	}
	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}
	public String getBuyerIdNumberSeg() {
		return buyerIdNumberSeg;
	}
	public void setBuyerIdNumberSeg(String buyerIdNumberSeg) {
		this.buyerIdNumberSeg = buyerIdNumberSeg;
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
	public String getAvgOrderNoCount() {
		return avgOrderNoCount;
	}
	public void setAvgOrderNoCount(String avgOrderNoCount) {
		this.avgOrderNoCount = avgOrderNoCount;
	}
	public String getAvgActuralPaid() {
		return avgActuralPaid;
	}
	public void setAvgActuralPaid(String avgActuralPaid) {
		this.avgActuralPaid = avgActuralPaid;
	}
	public int getBuyerTelephoneCount() {
		return buyerTelephoneCount;
	}
	public void setBuyerTelephoneCount(int buyerTelephoneCount) {
		this.buyerTelephoneCount = buyerTelephoneCount;
	}
	
	public String getBuyerTelephoneCountRate() {
		return buyerTelephoneCountRate;
	}
	public void setBuyerTelephoneCountRate(String buyerTelephoneCountRate) {
		this.buyerTelephoneCountRate = buyerTelephoneCountRate;
	}
	@Override
	public String toString() {
		return "DmBuyerIdNumberSegTotalEntity [seqId=" + seqId + ", buyerIdNumberSeg=" + buyerIdNumberSeg
				+ ", buyerTelephoneCount=" + buyerTelephoneCount + ", buyerTelephoneCountRate="
				+ buyerTelephoneCountRate + ", orderNoCount=" + orderNoCount + ", acturalPaid=" + acturalPaid
				+ ", avgOrderNoCount=" + avgOrderNoCount + ", avgActuralPaid=" + avgActuralPaid + "]";
	}
	
}
