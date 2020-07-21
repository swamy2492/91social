package com.ninetyonesocial.cyclecalc.model;

public class ChainAssembly {
	private int gears; //  4 - 8 - 12
	private String chainSize; //small - medium - big
	private String crankSize; //small - medium - big
	private String frontRail;
	private String backRail;
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public String getChainSize() {
		return chainSize;
	}
	public void setChainSize(String chainSize) {
		this.chainSize = chainSize;
	}
	public String getCrankSize() {
		return crankSize;
	}
	public void setCrankSize(String crankSize) {
		this.crankSize = crankSize;
	}
	public String getFrontRail() {
		return frontRail;
	}
	public void setFrontRail(String frontRail) {
		this.frontRail = frontRail;
	}
	public String getBackRail() {
		return backRail;
	}
	public void setBackRail(String backRail) {
		this.backRail = backRail;
	}
	
	
	
}
