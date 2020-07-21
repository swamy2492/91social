package com.ninetyonesocial.cyclecalc.dao.pricelist;

import java.util.ArrayList;
import java.util.List;

public class ChainAssemblyPriceList {
	private List<GenericPricingModel> chainSizeList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> crankSizeList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> frontRailList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> backRailList = new ArrayList<GenericPricingModel>();
	private List<GenericPricingModel> gearsList = new ArrayList<GenericPricingModel>();
	
	
	public List<GenericPricingModel> getChainSizeList() {
		GenericPricingModel gpm = new GenericPricingModel("small","2019",300);
		chainSizeList.add(gpm);
		gpm = new GenericPricingModel("small","2020",400);
		chainSizeList.add(gpm);
		gpm = new GenericPricingModel("medium","2019",600);
		chainSizeList.add(gpm);
		gpm = new GenericPricingModel("medium","2020",700);
		chainSizeList.add(gpm);
		gpm = new GenericPricingModel("big","2019",200);
		chainSizeList.add(gpm);
		gpm = new GenericPricingModel("big","2020",300);
		chainSizeList.add(gpm);
		
		return chainSizeList;
	}
	
	public List<GenericPricingModel> getCrankSizeList(){
		
		GenericPricingModel gpm = new GenericPricingModel("small","2019",300);
		crankSizeList.add(gpm);
		gpm = new GenericPricingModel("small","2020",400);
		crankSizeList.add(gpm);
		gpm = new GenericPricingModel("medium","2019",600);
		crankSizeList.add(gpm);
		gpm = new GenericPricingModel("medium","2020",700);
		crankSizeList.add(gpm);
		gpm = new GenericPricingModel("big","2019",200);
		crankSizeList.add(gpm);
		gpm = new GenericPricingModel("big","2020",300);
		crankSizeList.add(gpm);
		
		return crankSizeList;
	}
	
	public List<GenericPricingModel> getFrontRailList(){
		GenericPricingModel gpm = new GenericPricingModel("small","2019",300);
		frontRailList.add(gpm);
		gpm = new GenericPricingModel("small","2020",400);
		frontRailList.add(gpm);
		gpm = new GenericPricingModel("medium","2019",600);
		frontRailList.add(gpm);
		gpm = new GenericPricingModel("medium","2020",700);
		frontRailList.add(gpm);
		gpm = new GenericPricingModel("big","2019",200);
		frontRailList.add(gpm);
		gpm = new GenericPricingModel("big","2020",300);
		frontRailList.add(gpm);
		
		return frontRailList;
	}
	
	public List<GenericPricingModel> getBackRailList(){
		GenericPricingModel gpm = new GenericPricingModel("small","2019",300);
		backRailList.add(gpm);
		gpm = new GenericPricingModel("small","2020",400);
		backRailList.add(gpm);
		gpm = new GenericPricingModel("medium","2019",600);
		backRailList.add(gpm);
		gpm = new GenericPricingModel("medium","2020",700);
		backRailList.add(gpm);
		gpm = new GenericPricingModel("big","2019",200);
		backRailList.add(gpm);
		gpm = new GenericPricingModel("big","2020",300);
		backRailList.add(gpm);
		
		return backRailList;
	}
	
	public List<GenericPricingModel> getGearsList(){
		GenericPricingModel gpm = new GenericPricingModel("4","2019",300);
		gearsList.add(gpm);
		gpm = new GenericPricingModel("4","2020",400);
		gearsList.add(gpm);
		gpm = new GenericPricingModel("8","2019",600);
		gearsList.add(gpm);
		gpm = new GenericPricingModel("8","2020",700);
		gearsList.add(gpm);
		gpm = new GenericPricingModel("12","2019",200);
		gearsList.add(gpm);
		gpm = new GenericPricingModel("12","2020",300);
		gearsList.add(gpm);
		
		return backRailList;
	}
}
