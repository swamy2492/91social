package com.ninetyonesocial.cyclecalc.model;


public class Wheel {

	private String spokesAlloy; //iron - Steel - aluminum
	private String rimAlloy; //iron - steel - aluminum
	private String tube;
	private String tyreQuality; //Decent - Good - Excellent
	public String getSpokesAlloy() {
		return spokesAlloy;
	}
	public void setSpokesAlloy(String spokesAlloy) {
		this.spokesAlloy = spokesAlloy;
	}
	public String getRimAllow() {
		return rimAlloy;
	}
	public void setRimAllow(String rimAllow) {
		this.rimAlloy = rimAllow;
	}
	public String getTube() {
		return tube;
	}
	public void setTube(String string) {
		this.tube = string;
	}
	public String getTyreQuality() {
		return tyreQuality;
	}
	public void setTyreQuality(String tyreQuality) {
		this.tyreQuality = tyreQuality;
	}
	
	
}
