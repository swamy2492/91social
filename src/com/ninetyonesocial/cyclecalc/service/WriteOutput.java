package com.ninetyonesocial.cyclecalc.service;

import java.util.concurrent.BlockingQueue;

import com.ninetyonesocial.cyclecalc.dao.Database;
import com.ninetyonesocial.cyclecalc.dao.pricelist.GenericPricingModel;
import com.ninetyonesocial.cyclecalc.model.ChainAssembly;
import com.ninetyonesocial.cyclecalc.model.Cycle;
import com.ninetyonesocial.cyclecalc.model.Frame;
import com.ninetyonesocial.cyclecalc.model.HandleBar;
import com.ninetyonesocial.cyclecalc.model.Seating;
import com.ninetyonesocial.cyclecalc.model.Wheel;

public class WriteOutput implements Runnable{

	private BlockingQueue<Cycle> queue;
	private int i=0;
	private int totalPrice = 0;
	
	public WriteOutput(BlockingQueue<Cycle> queue) {
		super();
		this.queue = queue;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Cycle cycle = new Cycle();
		
		try {
		
			
			while((cycle=queue.take())!=null) {
				Thread.sleep(10);
				printPrice(cycle);
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void printPrice(Cycle cycle) {
		// TODO Auto-generated method stub
		System.out.println("Cycle Billed Number - " + (i+1));
		printFramePrice(cycle);
		printWheelPrice(cycle);
		printHandlePrice(cycle);
		printSeatingPrice(cycle);
		printChainPrice(cycle);
		
		System.out.println("Total Price of Cycle = "+ totalPrice);
		System.out.println("------------------------------------------------");
		i++;
		totalPrice = 0;
	}


	private void printChainPrice(Cycle cycle) {
		// TODO Auto-generated method stub
		int chainPrice=0;
		Database database = new Database();
		ChainAssembly chain = cycle.getChainAssembly();
		for(GenericPricingModel gpm : database.getChainAssemblyPriceList().getGearsList()) {
			if(gpm.getName().equals(chain.getGears()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					chainPrice = chainPrice + gpm.getPrice();
				}
			}
		}
		for(GenericPricingModel gpm : database.getChainAssemblyPriceList().getChainSizeList()) {
			if(gpm.getName().equals(chain.getChainSize()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					chainPrice = chainPrice + gpm.getPrice();
				}
			}
		}
		for(GenericPricingModel gpm : database.getChainAssemblyPriceList().getCrankSizeList()) {
			if(gpm.getName().equals(chain.getCrankSize()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					chainPrice = chainPrice + gpm.getPrice();
				}
			}
		}
		
		for(GenericPricingModel gpm : database.getChainAssemblyPriceList().getFrontRailList()) {
			if(gpm.getName().equals(chain.getFrontRail()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					chainPrice = chainPrice + gpm.getPrice();
				}
			}
		}
		
		for(GenericPricingModel gpm : database.getChainAssemblyPriceList().getBackRailList()) {
			if(gpm.getName().equals(chain.getBackRail()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					chainPrice = chainPrice + gpm.getPrice();
				}
			}
		}
		
		System.out.println("Price of Chain Assembly = " + chainPrice );
		totalPrice = totalPrice + chainPrice;
	}


	private void printSeatingPrice(Cycle cycle) {
		// TODO Auto-generated method stub
		int seatingPrice=0;
		Database database = new Database();
		Seating seating = cycle.getSeating();
		for(GenericPricingModel gpm : database.getSeatingPricingList().getSaddleQualityList()) {
			if(gpm.getName().equals(seating.getSaddleQuality()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					seatingPrice = seatingPrice + gpm.getPrice();
				}
			}
		}
		for(GenericPricingModel gpm : database.getSeatingPricingList().getSeatQualityList()) {
			if(gpm.getName().equals(seating.getSeatQuality()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					seatingPrice = seatingPrice + gpm.getPrice();
				}
			}
		}
		
		System.out.println("Price of Seating  = " + seatingPrice );
		totalPrice = totalPrice + seatingPrice;
	}


	private void printHandlePrice(Cycle cycle) {
		// TODO Auto-generated method stub
		int handlePrice=0;
		Database database = new Database();
		HandleBar handleBar = cycle.getHandleBar();
		for(GenericPricingModel gpm : database.getHandlebarPricingList().getBrakeQualityList()) {
			if(gpm.getName().equals(handleBar.getBrakeQuality()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					handlePrice = handlePrice + gpm.getPrice();
				}
			}
		}
		for(GenericPricingModel gpm : database.getHandlebarPricingList().getBrakeAlloyList()) {
			if(gpm.getName().equals(handleBar.getHandleAlloy()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					handlePrice = handlePrice + gpm.getPrice();
				}
			}
		}
		
		for(GenericPricingModel gpm : database.getHandlebarPricingList().getBrakeTypeList()) {
			if(gpm.getName().equals(handleBar.getBrakeType()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					handlePrice = handlePrice + gpm.getPrice();
				}
			}
		}
		System.out.println("Price of Handle Bar Assembly = " + handlePrice );
		totalPrice = totalPrice + handlePrice;
	}


	private void printWheelPrice(Cycle cycle) {
		// TODO Auto-generated method stub
		int wheelPrice = 0;
		Database database = new Database();
		Wheel wheel = cycle.getWheel();
		for(GenericPricingModel gpm : database.getWheelPriceList().getRimAlloyList()) {
			if(gpm.getName().equals(wheel.getRimAllow()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					wheelPrice = wheelPrice + gpm.getPrice();
				}
			}
		}
		
		for(GenericPricingModel gpm : database.getWheelPriceList().getSpokesAlloyList()) {
			if(gpm.getName().equals(wheel.getSpokesAlloy()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					wheelPrice = wheelPrice + gpm.getPrice();
				}
			}
		}
		
		for(GenericPricingModel gpm : database.getWheelPriceList().getTubeList()) {
			if(gpm.getName().equals(wheel.getTube()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					wheelPrice = wheelPrice + gpm.getPrice();
				}
			}
		}
		
		for(GenericPricingModel gpm : database.getWheelPriceList().getTyreQualityList()) {
			if(gpm.getName().equals(wheel.getTyreQuality()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					wheelPrice = wheelPrice + gpm.getPrice();
				}
			}
		}
		
		System.out.println("Price of Wheel Assembly = " + wheelPrice );
		totalPrice = totalPrice + wheelPrice;
		
	}


	private void printFramePrice(Cycle cycle) {
		// TODO Auto-generated method stub
		int framePrice = 0;
		Database database = new Database();
		Frame frame = cycle.getFrame();
		for(GenericPricingModel gpm : database.getFramePriceList().getAlloyTypeList()) {
			if(gpm.getName().equals(frame.getAlloyType()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					framePrice = framePrice + gpm.getPrice();
				}
			}
		}
		
		for(GenericPricingModel gpm : database.getFramePriceList().getFrameSizeList()) {
			if(gpm.getName().equals(frame.getFrameSize()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					framePrice = framePrice + gpm.getPrice();
				}
			}
		}
		
		for(GenericPricingModel gpm : database.getFramePriceList().getForkList()) {
			if(gpm.getName().equals(frame.getFork()+"")) {
				if(gpm.getYear().equals(cycle.getYear())) {
					framePrice = framePrice + gpm.getPrice();
				}
			}
		}
		
	
		System.out.println("Price of Frame Assembly = " + framePrice );
		totalPrice = totalPrice + framePrice;
	}

}
