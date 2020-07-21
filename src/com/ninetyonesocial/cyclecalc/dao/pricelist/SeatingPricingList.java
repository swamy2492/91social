package com.ninetyonesocial.cyclecalc.dao.pricelist;

import java.util.ArrayList;
import java.util.List;

public class SeatingPricingList {

	private List<GenericPricingModel> saddleQualityList = new ArrayList<GenericPricingModel> ();
	private List<GenericPricingModel> seatQualityList = new ArrayList<GenericPricingModel> ();
	
	
	public List<GenericPricingModel> getSaddleQualityList(){
		GenericPricingModel gpm = new GenericPricingModel("decent","2019",300);
		saddleQualityList.add(gpm);
		gpm = new GenericPricingModel("decent","2020",300);
		saddleQualityList.add(gpm);
		gpm = new GenericPricingModel("good","2019",300);
		saddleQualityList.add(gpm);
		gpm = new GenericPricingModel("good","2020",300);
		saddleQualityList.add(gpm);
		gpm = new GenericPricingModel("excellent","2019",300);
		saddleQualityList.add(gpm);
		gpm = new GenericPricingModel("excellent","2020",300);
		saddleQualityList.add(gpm);
		
		return saddleQualityList;
	}
	
	public List<GenericPricingModel> getSeatQualityList(){
		GenericPricingModel gpm = new GenericPricingModel("decent","2019",300);
		seatQualityList.add(gpm);
		gpm = new GenericPricingModel("decent","2020",300);
		seatQualityList.add(gpm);
		gpm = new GenericPricingModel("good","2019",300);
		seatQualityList.add(gpm);
		gpm = new GenericPricingModel("good","2020",300);
		seatQualityList.add(gpm);
		gpm = new GenericPricingModel("excellent","2019",300);
		seatQualityList.add(gpm);
		gpm = new GenericPricingModel("excellent","2020",300);
		seatQualityList.add(gpm);
		
		return seatQualityList;
	}
}
