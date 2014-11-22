package js.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.User;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.js.stock.loader.StockDataTask;
import com.js.stock.loader.StockListManager;

import util.HibernateUtil;

public class StockLoader {
	
//	public void testSave(){
//		User user = new User();
//		user.setName("apple");
//		user.setPassword("123456");
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(user);
//		tx.commit();
//		session.close();
//		HibernateUtil.shutdown();
//	}

	public static void main(String[] args) throws InterruptedException {
		List<String> codeList = StockListManager.getCodeList();
		
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
		
		for (String code : codeList) {
			Map<String, String> info = StockDataManager.getStockInfo(code);
			
			StringBuffer strBuf = new StringBuffer();
			strBuf.append(code).append("\t").append(info.get(TecentStockInfo.HEAD_NAMES[1])).append("     \t").append(info.get(TecentStockInfo.HEAD_NAMES[45]));
			System.out.println(strBuf.toString());
		}
	}
}
