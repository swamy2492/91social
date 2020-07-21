package com.ninetyonesocial.cyclecalc.dao.pricelist;

import java.util.ArrayList;
import java.util.List;

public class WheelPriceList {
	private List<GenericPricingModel> spokesAlloyList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> rimAlloyList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> tubeList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> tyreQualityList = new ArrayList<GenericPricingModel> ();
	
	public List<GenericPricingModel> getSpokesAlloyList() {
		GenericPricingModel gpm = new GenericPricingModel("iron","2019",300);
		spokesAlloyList.add(gpm);
		gpm = new GenericPricingModel("iron","2020",400);
		spokesAlloyList.add(gpm);
		gpm = new GenericPricingModel("steel","2019",600);
		spokesAlloyList.add(gpm);
		gpm = new GenericPricingModel("steel","2020",700);
		spokesAlloyList.add(gpm);
		gpm = new GenericPricingModel("aluminum","2019",200);
		spokesAlloyList.add(gpm);
		gpm = new GenericPricingModel("aluminum","2020",300);
		spokesAlloyList.add(gpm);
		
		return spokesAlloyList;
	}
	public List<GenericPricingModel> getRimAlloyList() {
		GenericPricingModel gpm = new GenericPricingModel("iron","2019",300);
		rimAlloyList.add(gpm);
		gpm = new GenericPricingModel("iron","2020",400);
		rimAlloyList.add(gpm);
		gpm = new GenericPricingModel("steel","2019",600);
		rimAlloyList.add(gpm);
		gpm = new GenericPricingModel("steel","2020",700);
		rimAlloyList.add(gpm);
		gpm = new GenericPricingModel("aluminum","2019",200);
		rimAlloyList.add(gpm);
		gpm = new GenericPricingModel("aluminum","2020",300);
		rimAlloyList.add(gpm);
		
		return rimAlloyList;
	}
	
	public List<GenericPricingModel> getTubeList() {
		GenericPricingModel gpm = new GenericPricingModel("tube","2019",300);
		tubeList.add(gpm);
		gpm = new GenericPricingModel("tube","2020",400);
		tubeList.add(gpm);
	
		
		return tubeList;
	}
	
	
	public List<GenericPricingModel> getTyreQualityList(){
		GenericPricingModel gpm = new GenericPricingModel("decent","2019",300);
		tyreQualityList.add(gpm);
		gpm = new GenericPricingModel("decent","2020",300);
		tyreQualityList.add(gpm);
		gpm = new GenericPricingModel("good","2019",300);
		tyreQualityList.add(gpm);
		gpm = new GenericPricingModel("good","2020",300);
		tyreQualityList.add(gpm);
		gpm = new GenericPricingModel("excellent","2019",300);
		tyreQualityList.add(gpm);
		gpm = new GenericPricingModel("excellent","2020",300);
		tyreQualityList.add(gpm);
		
		return tyreQualityList;
	}
	
}
