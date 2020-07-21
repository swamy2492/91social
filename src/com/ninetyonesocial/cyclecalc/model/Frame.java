package com.ninetyonesocial.cyclecalc.model;

public class Frame {
	private String alloyType; // Iron - Aluminum - Steel 
	private String frameSize; // Small - Medium - Big
	private String fork; //Small - Medium - Big 
	public String getAlloyType() {
		return alloyType;
	}
	public void setAlloyType(String alloyType) {
		this.alloyType = alloyType;
	}
	public String getFrameSize() {
		return frameSize;
	}
	public void setFrameSize(String frameSize) {
		this.frameSize = frameSize;
	}
	public String getFork() {
		return fork;
	}
	public void setFork(String fork) {
		this.fork = fork;
	}
	
	
}
