package com.ninetyonesocial.cyclecalc.dao.pricelist;

import java.util.ArrayList;
import java.util.List;

public class FramePriceList {
	private List<GenericPricingModel> alloyTypeList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> frameSizeList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> forkList = new ArrayList<GenericPricingModel> ();
	
	
	public List<GenericPricingModel> getAlloyTypeList() {
		GenericPricingModel gpm = new GenericPricingModel("iron","2019",300);
		alloyTypeList.add(gpm);
		gpm = new GenericPricingModel("iron","2020",400);
		alloyTypeList.add(gpm);
		gpm = new GenericPricingModel("steel","2019",600);
		alloyTypeList.add(gpm);
		gpm = new GenericPricingModel("steel","2020",700);
		alloyTypeList.add(gpm);
		gpm = new GenericPricingModel("aluminum","2019",200);
		alloyTypeList.add(gpm);
		gpm = new GenericPricingModel("aluminum","2020",300);
		alloyTypeList.add(gpm);
		
		return alloyTypeList;
	}
	
	public List<GenericPricingModel> getFrameSizeList(){
		
		GenericPricingModel gpm = new GenericPricingModel("small","2019",300);
		frameSizeList.add(gpm);
		gpm = new GenericPricingModel("small","2020",400);
		frameSizeList.add(gpm);
		gpm = new GenericPricingModel("medium","2019",600);
		frameSizeList.add(gpm);
		gpm = new GenericPricingModel("medium","2020",700);
		frameSizeList.add(gpm);
		gpm = new GenericPricingModel("big","2019",200);
		frameSizeList.add(gpm);
		gpm = new GenericPricingModel("big","2020",300);
		frameSizeList.add(gpm);
		
		return frameSizeList;
	}
	
	public List<GenericPricingModel> getForkList(){
		GenericPricingModel gpm = new GenericPricingModel("small","2019",300);
		forkList.add(gpm);
		gpm = new GenericPricingModel("small","2020",400);
		forkList.add(gpm);
		gpm = new GenericPricingModel("medium","2019",600);
		forkList.add(gpm);
		gpm = new GenericPricingModel("medium","2020",700);
		forkList.add(gpm);
		gpm = new GenericPricingModel("big","2019",200);
		forkList.add(gpm);
		gpm = new GenericPricingModel("big","2020",300);
		forkList.add(gpm);
		
		return forkList;
	}

}
