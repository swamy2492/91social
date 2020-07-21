package com.ninetyonesocial.cyclecalc.dao;

import com.ninetyonesocial.cyclecalc.dao.pricelist.ChainAssemblyPriceList;
import com.ninetyonesocial.cyclecalc.dao.pricelist.FramePriceList;
import com.ninetyonesocial.cyclecalc.dao.pricelist.HandlebarPricingList;
import com.ninetyonesocial.cyclecalc.dao.pricelist.SeatingPricingList;
import com.ninetyonesocial.cyclecalc.dao.pricelist.WheelPriceList;

public class Database {
	private ChainAssemblyPriceList chainAssemblyPriceList = new ChainAssemblyPriceList();
	private FramePriceList framePriceList = new FramePriceList();
	private HandlebarPricingList handlebarPricingList = new HandlebarPricingList();
	private SeatingPricingList seatingPricingList = new SeatingPricingList();
	private WheelPriceList wheelPriceList = new WheelPriceList();
	public ChainAssemblyPriceList getChainAssemblyPriceList() {
		return chainAssemblyPriceList;
	}
	public void setChainAssemblyPriceList(ChainAssemblyPriceList chainAssemblyPriceList) {
		this.chainAssemblyPriceList = chainAssemblyPriceList;
	}
	public FramePriceList getFramePriceList() {
		return framePriceList;
	}
	public void setFramePriceList(FramePriceList framePriceList) {
		this.framePriceList = framePriceList;
	}
	public HandlebarPricingList getHandlebarPricingList() {
		return handlebarPricingList;
	}
	public void setHandlebarPricingList(HandlebarPricingList handlebarPricingList) {
		this.handlebarPricingList = handlebarPricingList;
	}
	public SeatingPricingList getSeatingPricingList() {
		return seatingPricingList;
	}
	public void setSeatingPricingList(SeatingPricingList seatingPricingList) {
		this.seatingPricingList = seatingPricingList;
	}
	public WheelPriceList getWheelPriceList() {
		return wheelPriceList;
	}
	public void setWheelPriceList(WheelPriceList wheelPriceList) {
		this.wheelPriceList = wheelPriceList;
	}
	
	
	
}
