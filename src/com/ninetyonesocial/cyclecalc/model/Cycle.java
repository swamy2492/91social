package com.ninetyonesocial.cyclecalc.model;

public class Cycle {

	 private ChainAssembly chainAssembly;
	 private Frame frame;
	 private HandleBar handleBar;
	 private Seating seating;
	 private Wheel wheel;
	 private String year;
	 
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public ChainAssembly getChainAssembly() {
		return chainAssembly;
	}
	public void setChainAssembly(ChainAssembly chainAssembly) {
		this.chainAssembly = chainAssembly;
	}
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public HandleBar getHandleBar() {
		return handleBar;
	}
	public void setHandleBar(HandleBar handleBar) {
		this.handleBar = handleBar;
	}
	public Seating getSeating() {
		return seating;
	}
	public void setSeating(Seating seating) {
		this.seating = seating;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	 
	 
	
}
