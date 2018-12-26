package cn.exfox.domain;

public class Customer {
	private String id;
	private String custName;
	private String address;
	/** 
	 * @return custId 
	 */
	public String getId() {
		return id;
	}
	/** 
	 * @return custName 
	 */
	public String getCustName() {
		return custName;
	}
	/** 
	 * @return address 
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
