package com.js.stock.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StockListManager {
	
	private static String FILE_NAME = "C:/同花顺软件/同花顺/realtime/market.txt";
	private static String SECTION = "Market_16_17";
	private static String KEY = "CodeList";
	
	public static List<String> getCodeList() {
		
		String codeStr = getCodeStr(FILE_NAME, SECTION, KEY);
		return getCodeList(codeStr);
	}
	
	private static String getCodeStr(String filePath, String section, String key) {

		String codeList = null;

		try {
			String encoding = "GBK";
			File file = new File(filePath);

			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;

				boolean foundSection = false;
				while ((lineTxt = bufferedReader.readLine()) != null) {

					if (foundSection && lineTxt.contains("[")) {
						foundSection = false;
						break;
					}

					if (lineTxt.contains(section)) {
						foundSection = true;
					}

					if (foundSection) {
						System.out.println(lineTxt);
						if (lineTxt.contains("CodeList")) {
							codeList = lineTxt;
						}
					}
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
		if (codeList == null || codeList.isEmpty()) {
			return codeList;
		} else {
			String[] arr = codeList.split("=");
			return arr[1];
		}
	}

	private static List<String> getCodeList(String codeStr) {

		List<String> codeList = new ArrayList<String>();

		String[] vec = codeStr.split(",");
		for (String str : vec) {
			if (!str.contains("-")) {
				codeList.add(str);
				continue;
			}

			String[] v = str.split("-");
			int start = Integer.parseInt(v[0]);
			int end = Integer.parseInt(v[1]);
			for (int i = start; i < end; i++) {
				codeList.add(i + "");
			}
		}

		return codeList;
	}
	
//	public static void main(String args[]) {
//		List<String> codeList = getCodeList();
//		for (String str : codeList) {
//			System.out.println(str);
//		}
//	}
}
