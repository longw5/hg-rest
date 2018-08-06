package com.sky.hg.entity;

import java.io.Serializable;

public class DmBuyerAgeSegTotalEntity implements Serializable{

	private static final long serialVersionUID = 7L;
	
	private int seqId; 
	private String ageSeg; 
	private int buyerIdNumberCount;
	private String buyerIdNumberCountRate;
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
	public String getAgeSeg() {
		return ageSeg;
	}
	public void setAgeSeg(String ageSeg) {
		this.ageSeg = ageSeg;
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
	
	public String getBuyerIdNumberCountRate() {
		return buyerIdNumberCountRate;
	}
	public void setBuyerIdNumberCountRate(String buyerIdNumberCountRate) {
		this.buyerIdNumberCountRate = buyerIdNumberCountRate;
	}
	@Override
	public String toString() {
		return "DmBuyerAgeSegTotalEntity [seqId=" + seqId + ", ageSeg=" + ageSeg + ", buyerIdNumberCount="
				+ buyerIdNumberCount + ", buyerIdNumberCountRate=" + buyerIdNumberCountRate + ", orderNoCount="
				+ orderNoCount + ", acturalPaid=" + acturalPaid + ", avgOrderNoCount=" + avgOrderNoCount
				+ ", avgActuralPaid=" + avgActuralPaid + "]";
	}
	

}
