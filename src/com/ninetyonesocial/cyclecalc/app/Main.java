package com.ninetyonesocial.cyclecalc.app;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


import com.ninetyonesocial.cyclecalc.model.Cycle;
import com.ninetyonesocial.cyclecalc.service.ReadData;
import com.ninetyonesocial.cyclecalc.service.WriteOutput;

public class Main{

	
	
	public static void main(String args[]){
		
		BlockingQueue<Cycle> blockingQueue = new ArrayBlockingQueue<>(10);
		
		ReadData readData = new ReadData(blockingQueue);
		WriteOutput writeOutput = new WriteOutput(blockingQueue);
		
		new Thread(readData).start();
		
		new Thread(writeOutput).start();
		
		
	}

	
	
	
}
