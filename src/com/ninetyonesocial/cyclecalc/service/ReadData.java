package com.ninetyonesocial.cyclecalc.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

import com.ninetyonesocial.cyclecalc.model.ChainAssembly;
import com.ninetyonesocial.cyclecalc.model.Cycle;
import com.ninetyonesocial.cyclecalc.model.Frame;
import com.ninetyonesocial.cyclecalc.model.HandleBar;
import com.ninetyonesocial.cyclecalc.model.Seating;
import com.ninetyonesocial.cyclecalc.model.Wheel;

public class ReadData implements Runnable {

	private BlockingQueue<Cycle> queue;
	
	
	
	
	
	
	public ReadData(BlockingQueue<Cycle> queue) {
		super();
		this.queue = queue;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		Cycle cycle = new Cycle();
		String pathToCsv = "src/com/ninetyonesocial/cyclecalc/app/WheelPrices";
		BufferedReader csvReader = null;
		try {
			csvReader = new BufferedReader(new FileReader(pathToCsv));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String row;
		try {
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			   
			    cycle = buildCycleData(data);
			    
			    Thread.sleep(i);
			    queue.put(cycle);
			    
			    //System.out.println("Cycle object received -> "+ cycle);
			    i++;
			    // do something with the data
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			csvReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		//cycle.setWheel();
		
	}


	private Cycle buildCycleData(String[] data) {
		// TODO Auto-generated method stub
		Cycle cycle = new Cycle();
		Wheel wheel = new Wheel();
		Seating seating = new Seating();
		HandleBar handle = new HandleBar();
		Frame frame = new Frame();
		ChainAssembly chain = new ChainAssembly();
		
		for(int i =0 ; i<data.length; i++) {
			switch(i) {
				case 0: 
					wheel.setSpokesAlloy(returnFull(data[i]));
					break;
				case 1:
					wheel.setRimAllow(returnFull(data[i]));
					break;
				case 2:
					wheel.setTube(returnFull(data[i]));
					break;
				case 3: 
					wheel.setTyreQuality(returnFull(data[i]));
					break;
				case 4: 
					seating.setSaddleQuality(returnFull(data[i]));
					break;
				case 5:
					seating.setSeatQuality(returnFull(data[i]));
					break;
					
				case 6:
					handle.setBrakeQuality(returnFull(data[i]));
					break;
					
				case 7:
					handle.setHandleAlloy(returnFull(data[i]));
					break;
				
				case 8:
					handle.setBrakeType(data[i]);
					break;
					
				case 9:
					frame.setAlloyType(returnFull(data[i]));
					break;
					
				case 10:
					frame.setFrameSize(returnFull(data[i]));
					break;
					
				case 11:
					frame.setFork(returnFull(data[i]));
					break;
					
				case 12:
					chain.setGears(Integer.parseInt(data[i]));
					break;
				
				case 13: 
					chain.setChainSize(returnFull(data[i]));
					break;
				
				case 14:
					chain.setCrankSize(returnFull(data[i]));
					break;
					
				case 15: 
					chain.setFrontRail(returnFull(data[i]));
					break;
					
				case 16:
					chain.setBackRail(returnFull(data[i]));
					break;
				
				case 17:
					cycle.setYear(data[i]);
					break;
					
				default:
					break;
					
			}
			
			
		}
		cycle.setWheel(wheel);
		cycle.setSeating(seating);
		cycle.setFrame(frame);
		cycle.setHandleBar(handle);
		cycle.setChainAssembly(chain);
		
		return cycle;
	}
	
	
	private String returnFull(String s) {
		if(s.equals("i")) {
			return "iron";
		}
		if(s.equals("s")) {
			return "steel";
		}
		if(s.equals("a")) {
			return "aluminum";
		}
		if(s.equals("d")) {
			return "decent";
		}
		if(s.equals("g")) {
			return "good";
		}
		if(s.equals("e")) {
			return "excellent";
		}
		if(s.equals("sm")) {
			return "small";
		}
		if(s.equals("m")) {
			return "medium";
		}
		if(s.equals("b")) {
			return "big";
		}
		if(s.equals("t")) {
			return "tube";
		}
		if(s.equals("f")) {
			return "noTube";
		}
		return "";
		
	}

}
