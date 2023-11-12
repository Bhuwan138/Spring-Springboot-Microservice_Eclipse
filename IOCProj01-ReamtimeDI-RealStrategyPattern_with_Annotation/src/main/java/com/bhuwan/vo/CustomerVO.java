package com.bhuwan.vo;

public class CustomerVO {
	private String custName;
	private String custAddrs;
	private String pamt;
	private String time;
	private String rate;
	
//	setter/getter
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddrs() {
		return custAddrs;
	}
	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
//	toString 
	@Override
	public String toString() {
		return "CustomerVO [custName=" + custName + ", custAddrs=" + custAddrs + ", pamt=" + pamt + ", time=" + time
				+ ", rate=" + rate + "]";
	}
	
	
	
}
