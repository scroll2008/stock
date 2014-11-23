package com.js;

import java.util.ArrayList;
import java.util.List;

import com.js.stock.loader.StockDataTask;
import com.js.stock.loader.StockListManager;
import com.js.stock.qq.MarketTypeEnum;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		List<String> codeList = StockListManager.getCodeList(StockListManager.SECTION_SH_A);
//		List<String> codeList = new ArrayList<String>();

//		codeList.add("600004");
		
		List<Thread> threadList = new ArrayList<Thread>();
		
		System.out.println(codeList.size());
		long startTime = System.currentTimeMillis();
		
		for (String code : codeList) {
			Thread t = new Thread(new StockDataTask(code, MarketTypeEnum.QQ_SH_A));
			t.setName(code);
			t.start();
			threadList.add(t);
		}
		
		for (Thread t : threadList) {
			t.join();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println((endTime - startTime)/1000);
	}

}
