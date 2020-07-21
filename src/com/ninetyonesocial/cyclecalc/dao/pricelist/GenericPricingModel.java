package com.ninetyonesocial.cyclecalc.dao.pricelist;

public class GenericPricingModel {

	private String name;
	private String year;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public GenericPricingModel(String name, String year, int price) {
		super();
		this.name = name;
		this.year = year;
		this.price = price;
	}
	public GenericPricingModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
