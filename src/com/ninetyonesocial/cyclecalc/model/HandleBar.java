package com.ninetyonesocial.cyclecalc.model;

public class HandleBar {
	
	private String brakeQuality; // Decent - Good - Excellent
	private String handleAlloy; //Iron - Steel - Aluminium
	private String brakeType; //Disc - Drum
	public String getBrakeQuality() {
		return brakeQuality;
	}
	public void setBrakeQuality(String brakeQuality) {
		this.brakeQuality = brakeQuality;
	}
	public String getHandleAlloy() {
		return handleAlloy;
	}
	public void setHandleAlloy(String handleAlloy) {
		this.handleAlloy = handleAlloy;
	}
	public String getBrakeType() {
		return brakeType;
	}
	public void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}
	
}
