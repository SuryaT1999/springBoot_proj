package com.example.springBootProj.model;


public class ProductModel {
	
	private int productCode;
	
	private String productName;
	
	private String productDesc;
	
	private String productCatagery;
	
	private Boolean productAvailability;
	
	private int productPrice;

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Boolean getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(Boolean productAvailability) {
		this.productAvailability = productAvailability;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCatagery() {
		return productCatagery;
	}

	public void setProductCatagery(String productCatagery) {
		this.productCatagery = productCatagery;
	}
	
	
}
