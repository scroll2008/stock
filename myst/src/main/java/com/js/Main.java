package com.js;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import js.test.StockDataManager;
import js.test.TecentStockInfo;

import com.js.stock.loader.StockDataTask;
import com.js.stock.loader.StockListManager;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		List<String> codeList = StockListManager.getCodeList();
//		List<String> codeList = new ArrayList<String>();

//		codeList.add("600004");
		
		List<Thread> threadList = new ArrayList<Thread>();
		
		System.out.println(codeList.size());
		long startTime = System.currentTimeMillis();
		
		for (String code : codeList) {
			Thread t = new Thread(new StockDataTask(code));
			t.setName(code);
			t.start();
			threadList.add(t);
		}
		
		for (Thread t : threadList) {
			t.join();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println((endTime - startTime)/1000);
		System.out.println(StockDataManager.getSize());
		
//		for (String code : codeList) {
//			Map<String, String> info = StockDataManager.getStockInfo(code);
//			
//			StringBuffer strBuf = new StringBuffer();
//			strBuf.append(code).append("\t").append(info.get(TecentStockInfo.HEAD_NAMES[1])).append("     \t").append(info.get(TecentStockInfo.HEAD_NAMES[45]));
//			System.out.println(strBuf.toString());
//		}
	}

}
