package com.js.stock.loader;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import js.test.StockDataManager;
import js.test.TecentStockInfo;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

import com.js.db.TestJDBC;
import com.js.stock.qq.QQStock;

/**
 * Hello world!
 * 
 */
public class StockDataTask implements Runnable{

	private String code = null;
	
	public StockDataTask(String code) {
		this.code = code;
	}

	private String getDoGetURL(String url, String charset)
			throws Exception {

		HttpClient client = new HttpClient();
		GetMethod method1 = new GetMethod(url);

		if (null == url || !url.startsWith("http")) {
			throw new Exception("请求地址格式不对");
		}

		// 设置请求的编码方式
		if (null != charset) {
			method1.addRequestHeader("Content-Type",
					"application/x-www-form-urlencoded; charset=" + charset);
		} else {
			method1.addRequestHeader("Content-Type",
					"application/x-www-form-urlencoded; charset=" + "utf-8");
		}
		int statusCode = client.executeMethod(method1);

		if (statusCode != HttpStatus.SC_OK) {// 打印服务器返回的状态
			System.out.println("Method failed: " + method1.getStatusLine());
		}
		// 返回响应消息
		byte[] responseBody = method1.getResponseBodyAsString().getBytes(
				method1.getResponseCharSet());
		// 在返回响应消息使用编码(utf-8或gb2312)
		String response = new String(responseBody, "GBK");
		// 释放连接
		method1.releaseConnection();
		return response;
	}
	
	private Map<Integer,String> parseHQ(String hq) {
		String[] v = hq.split("\"");
		String[] v2 = v[1].split("~");
		
		Map<Integer,String> info = new HashMap<Integer,String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = sdf.format(new Date());
		info.put(0, dateStr);
		for (int i=0;i<v2.length; i++) {
			info.put(i+1, v2[i]);
		}
		return info;
	}

//	@SuppressWarnings("unused")
//	private void printInfo(Map<Integer,String> info) {
//		
//		StringBuffer strBuf = new StringBuffer();
//		for(int i=0;i<TecentStockInfo.HEAD_NAMES.length; i++) {
//			strBuf.append(TecentStockInfo.HEAD_NAMES[i]).append("=").append(info.get(TecentStockInfo.HEAD_NAMES[i])).append("\n");
//		}
//		strBuf.append("\n");
//		System.out.println(strBuf.toString());
//	}
	
	public void run() {
		
		String hq;
		try {
			String url = TecentStockInfo.URL_BASE + code;
			hq = getDoGetURL(url, "UTF-8");
			Map<Integer,String> info = parseHQ(hq);
//			StockDataManager.addStockData(info);
			TestJDBC.insertTable(info, QQStock.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
