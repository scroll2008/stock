package model.tecent;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class StockInfoDao {
	public void save(Map<String, String> data) {
		StockInfo stockInfo = new StockInfo();
		
//		String A;   //("未知"),      //0
//		String NAME; //("名字"),      //1
//		String CODE; //("代码"),      //2
//		float CURRENT_PRICE; //("当前价格"),      //3
//		float YEST_CLOSING_PRICE; //("昨收"),      //4
//		float TODAY_OPENING_PRICE; //("今开"),      //5
//		long VOLUME; //("成交量（手）"),      //6
//		long OUTSIZE; //("外盘"),      //7
//		long INSIZE; //("内盘"),      //8
//		float BUY_ONE_PRICE; //("买一价格"),      //9
//		long BUY_ONE_VOL; //("买一量（手）"),      //10
		
		stockInfo.setA(data.get(StockName.A.name()));
		stockInfo.setNAME(data.get(StockName.NAME.name()));
		stockInfo.setCODE(data.get(StockName.CODE.name()));
		stockInfo.setCURRENT_PRICE(Float.parseFloat(data.get(StockName.CURRENT_PRICE.name())));
		stockInfo.setYEST_CLOSING_PRICE(Float.parseFloat(data.get(StockName.YEST_CLOSING_PRICE.name())));
		stockInfo.setTODAY_OPENING_PRICE(Float.parseFloat(data.get(StockName.TODAY_OPENING_PRICE.name())));
		stockInfo.setVOLUME(Long.parseLong(data.get(StockName.VOLUME.name())));
		stockInfo.setOUTSIZE(Long.parseLong(data.get(StockName.OUTSIZE.name())));
		stockInfo.setINSIZE(Long.parseLong(data.get(StockName.INSIZE.name())));
		stockInfo.setBUY_ONE_PRICE(Float.parseFloat(data.get(StockName.BUY_ONE_PRICE.name())));
		stockInfo.setBUY_ONE_VOL(Long.parseLong(data.get(StockName.BUY_ONE_VOL.name())));
		
		
		
//		float BUY_TWO_PRICE; //("买二价格"),      //11
//		long BUY_TWO_VOL; //("买二量（手）"),      //12：
//		float BUY_THREE_PRICE; //("买三价格"),      //13
//		long BUY_THREE_VOL; //("买三量（手）"),      //14
//		float BUY_FOUR_PRICE; //("买四价格"),      //15
//		long BUY_FOUR_VOL; //("买四量（手）"),      //16
//		float BUY_FIVE_PRICE; //("买五价格"),      //17
//		long BUY_FIVE_VOL; //("买五量（手）"),      //18
//		float SELL_ONE_PRICE; //("卖一价格"),      //19
//		long SELL_ONE_VOL; //("卖一量（手）"),      //20
		
		stockInfo.setBUY_TWO_PRICE(Float.parseFloat(data.get(StockName.BUY_TWO_PRICE.name())));
		stockInfo.setBUY_TWO_VOL(Long.parseLong(data.get(StockName.BUY_TWO_VOL.name())));
		stockInfo.setBUY_THREE_PRICE(Float.parseFloat(data.get(StockName.BUY_THREE_PRICE.name())));
		stockInfo.setBUY_THREE_VOL(Long.parseLong(data.get(StockName.BUY_THREE_VOL.name())));
		stockInfo.setBUY_FOUR_PRICE(Float.parseFloat(data.get(StockName.BUY_FOUR_PRICE.name())));
		stockInfo.setBUY_FOUR_VOL(Long.parseLong(data.get(StockName.BUY_FOUR_VOL.name())));
		stockInfo.setBUY_FIVE_PRICE(Float.parseFloat(data.get(StockName.BUY_FIVE_PRICE.name())));
		stockInfo.setBUY_FIVE_VOL(Long.parseLong(data.get(StockName.BUY_FIVE_VOL.name())));
		stockInfo.setSELL_ONE_PRICE(Float.parseFloat(data.get(StockName.SELL_ONE_PRICE.name())));
		stockInfo.setSELL_ONE_VOL(Long.parseLong(data.get(StockName.SELL_ONE_VOL.name())));
		
//		float SELL_TWO_PRICE; //("卖二价格"),      //21
//		long SELL_TWO_VOL; //("卖二量（手）"),      //22
//		float SELL_THREE_PRICE; //("卖三价格"),      //23
//		long SELL_THREE_VOL; //("卖三量（手）"),      //24
//		float SELL_FOUR_PRICE; //("卖四价格"),      //25
//		long SELL_FOUR_VOL; //("卖四量（手）"),      //26
//		float SELL_FIVE_PRICE; //("卖五价格"),      //27
//		long SELL_FIVE_VOL; //("卖五量（手）"),      //28
//		String RECENT_DEALS; //("最近逐笔成交"),      //29
//		String TIME; //("时间"),      //30
		
		stockInfo.setSELL_TWO_PRICE(Float.parseFloat(data.get(StockName.SELL_TWO_PRICE.name())));
		stockInfo.setSELL_TWO_VOL(Long.parseLong(data.get(StockName.SELL_TWO_VOL.name())));
		stockInfo.setSELL_THREE_PRICE(Float.parseFloat(data.get(StockName.SELL_THREE_PRICE.name())));
		stockInfo.setSELL_THREE_VOL(Long.parseLong(data.get(StockName.SELL_THREE_VOL.name())));
		stockInfo.setSELL_FOUR_PRICE(Float.parseFloat(data.get(StockName.SELL_FOUR_PRICE.name())));
		stockInfo.setSELL_FOUR_VOL(Long.parseLong(data.get(StockName.SELL_FOUR_VOL.name())));
		stockInfo.setSELL_FIVE_PRICE(Float.parseFloat(data.get(StockName.SELL_FIVE_PRICE.name())));
		stockInfo.setSELL_FIVE_VOL(Long.parseLong(data.get(StockName.SELL_FIVE_VOL.name())));
		stockInfo.setRECENT_DEALS(data.get(StockName.RECENT_DEALS.name()));
		stockInfo.setTIME(data.get(StockName.TIME.name()));
		
//		float PRICE_CHANGE; //("涨跌"),      //31
//		float PRICE_CHANGE_PERCENT; //("涨跌%"),      //32
//		float HIGHEST_PRICE; //("最高"),      //33
//		float LOWEST_PRICE; //("最低"),      //34
		
		stockInfo.setPRICE_CHANGE(Float.parseFloat(data.get(StockName.PRICE_CHANGE.name())));
		stockInfo.setPRICE_CHANGE_PERCENT(Float.parseFloat(data.get(StockName.PRICE_CHANGE_PERCENT.name())));
		stockInfo.setHIGHEST_PRICE(Float.parseFloat(data.get(StockName.HIGHEST_PRICE.name())));
		stockInfo.setLOWEST_PRICE(Float.parseFloat(data.get(StockName.LOWEST_PRICE.name())));
		
//		String PRICE_VOL_AMOUNT; //("价格/成交量（手）/成交额"),      //35
		stockInfo.setPRICE_VOL_AMOUNT(data.get(StockName.PRICE_VOL_AMOUNT.name()));
//		long VOLUME2; //("成交量（手）"),      //36
		stockInfo.setVOLUME2(Long.parseLong(data.get(StockName.VOLUME2.name())));
//		double AMOUNT; //("成交额（万）"),      //37
//		float TURNOVER_RATE; //("换手率"),      //38
//		float PE; //("市盈率"),      //39
//		String UNKNOWN; //("unknown"),      //40
		
		stockInfo.setAMOUNT(Double.parseDouble(data.get(StockName.AMOUNT.name())));
		stockInfo.setTURNOVER_RATE(Float.parseFloat(data.get(StockName.TURNOVER_RATE.name())));
		stockInfo.setPE(Float.parseFloat(data.get(StockName.PE.name())));
		stockInfo.setUNKNOWN(data.get(StockName.UNKNOWN.name()));
		
//		float HIGHEST_2; //("最高"),      //41
//		float LOWEST_2; //("最低"),      //42
//		float AMPLITUDE; //("振幅"),      //43
		
		stockInfo.setHIGHEST_2(Float.parseFloat(data.get(StockName.HIGHEST_2.name())));
		stockInfo.setLOWEST_2(Float.parseFloat(data.get(StockName.LOWEST_2.name())));
		stockInfo.setAMPLITUDE(Float.parseFloat(data.get(StockName.AMPLITUDE.name())));
		
//		double CIRCULATED_MACKET_VALUE; //("流通市值"),      //44
//		double TOTAL_MACKET_VALUE; //("总市值"),      //45
		
		stockInfo.setCIRCULATED_MACKET_VALUE(Double.parseDouble(data.get(StockName.CIRCULATED_MACKET_VALUE.name())));
		stockInfo.setTOTAL_MACKET_VALUE(Double.parseDouble(data.get(StockName.TOTAL_MACKET_VALUE.name())));
		
//		float PB; //("市净率"),      //46
//		float HIGH_LIMIT; //("涨停价"),      //47
//		float LOW_LIMIT; //("跌停价"),      //48;
		
		stockInfo.setPB(Float.parseFloat(data.get(StockName.PB.name())));
		stockInfo.setHIGH_LIMIT(Float.parseFloat(data.get(StockName.HIGH_LIMIT.name())));
		stockInfo.setLOW_LIMIT(Float.parseFloat(data.get(StockName.LOW_LIMIT.name())));
		


		// stockInfo.set
		// stockInfo.setPassword("123456");

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(stockInfo);
		tx.commit();
		session.close();
		HibernateUtil.shutdown();
	}

	public List<StockInfo> getStockInfoList() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query=session.createQuery("from StockInfo");	
		List<StockInfo> list = query.list();
		session.close();
		HibernateUtil.shutdown();
		
		return list;
	}

//	private static Object invokeMethod(Object owner, String methodName, Object[] args)
//			throws Exception {
//		Class<? extends Object> ownerClass = owner.getClass();
//		@SuppressWarnings("rawtypes")
//		Class[] argsClass = new Class[args.length];
//
//		for (int i = 0, j = args.length; i < j; i++) {
//			argsClass[i] = args[i].getClass();
//		}
//		Method method = ownerClass.getMethod(methodName, argsClass);
//
//		return method.invoke(owner, args);
//
//	}
	
	public static void main(String args[]) throws Exception {
	}
}
