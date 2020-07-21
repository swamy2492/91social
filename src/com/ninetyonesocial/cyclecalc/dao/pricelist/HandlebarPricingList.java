package com.ninetyonesocial.cyclecalc.dao.pricelist;

import java.util.ArrayList;
import java.util.List;

public class HandlebarPricingList {

	private List<GenericPricingModel> brakeQualityList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> brakeAlloyList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> brakeTypeList = new ArrayList<GenericPricingModel>();
	
	
	public List<GenericPricingModel> getBrakeQualityList(){
		GenericPricingModel gpm = new GenericPricingModel("decent","2019",300);
		brakeQualityList.add(gpm);
		gpm = new GenericPricingModel("decent","2020",300);
		brakeQualityList.add(gpm);
		gpm = new GenericPricingModel("good","2019",300);
		brakeQualityList.add(gpm);
		gpm = new GenericPricingModel("good","2020",300);
		brakeQualityList.add(gpm);
		gpm = new GenericPricingModel("excellent","2019",300);
		brakeQualityList.add(gpm);
		gpm = new GenericPricingModel("excellent","2020",300);
		brakeQualityList.add(gpm);
		
		return brakeQualityList;
	}
	
	public List<GenericPricingModel> getBrakeAlloyList() {
		GenericPricingModel gpm = new GenericPricingModel("iron","2019",300);
		brakeAlloyList.add(gpm);
		gpm = new GenericPricingModel("iron","2020",400);
		brakeAlloyList.add(gpm);
		gpm = new GenericPricingModel("steel","2019",600);
		brakeAlloyList.add(gpm);
		gpm = new GenericPricingModel("steel","2020",700);
		brakeAlloyList.add(gpm);
		gpm = new GenericPricingModel("aluminum","2019",200);
		brakeAlloyList.add(gpm);
		gpm = new GenericPricingModel("aluminum","2020",300);
		brakeAlloyList.add(gpm);
		
		return brakeAlloyList;
	}
	

	public List<GenericPricingModel> getBrakeTypeList() {
		GenericPricingModel gpm = new GenericPricingModel("disc","2019",300);
		brakeAlloyList.add(gpm);
		gpm = new GenericPricingModel("disc","2020",400);
		brakeAlloyList.add(gpm);
		gpm = new GenericPricingModel("drum","2019",600);
		brakeAlloyList.add(gpm);
		gpm = new GenericPricingModel("drum","2020",700);
		brakeAlloyList.add(gpm);
		
		
		return brakeAlloyList;
	}
	
	
}
