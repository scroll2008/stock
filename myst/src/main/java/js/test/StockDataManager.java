package js.test;

import java.util.HashMap;
import java.util.Map;

public class StockDataManager {
	
	private static Map<String, Map<String, String>> stockData = new HashMap<String, Map<String, String>>();
	
	public static synchronized void addStockData(Map<String, String> info) {
		stockData.put(info.get(TecentStockInfo.HEAD_NAMES[2]), info);
	}
	
	public static synchronized Map<String, String> getStockInfo(String code) {
		return stockData.get(code);
	}
	
	public static synchronized int getSize() {
		return stockData.size();
	}
}
