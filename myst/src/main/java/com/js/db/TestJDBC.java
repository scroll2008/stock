package com.js.db;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.js.stock.qq.QQStock;

public class TestJDBC {
	
	private static Connection conn = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:js", "scott",
					"oracle");
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	private static <T> boolean isExist(Map<Integer, String> data, Class<T> claz) {
		
		String sql = "select count(*) recNum from " + claz.getSimpleName() + " where ";
		
		if (QQStock.class.getName().equals(claz.getName())) {
			boolean isFirst = true;
			for (QQStock item : QQStock.values()) {
				if (item.isKey()) {
					if (!isFirst) {
						sql += " and ";
					}
					String dataStr = data.get(item.ordinal());
					sql += item.name() + "=" + item.getType().getDBString(dataStr);
					isFirst = false;
				}
			}
		}
		
		Statement stmt = null;
		ResultSet rs = null;
		try {
			int count = 0;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				count = rs.getInt(1);
				break;
			}
			
			if (count > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	
	public static <T> void insertTable(Map<Integer, String> data, Class<T> claz) {
		
		if (isExist(data, claz)) {
			return;
		}
		
		Statement stmt = null;
		String insert_sql = "";
		try {
			boolean isFirst = true;
			insert_sql = "insert into " + claz.getSimpleName() + " values(";
			
			if (QQStock.class.getName().equals(claz.getName())) {
				for (QQStock item : QQStock.values()) {
					String dataStr = data.get(item.ordinal());
					String dbStr = item.getType().getDBString(dataStr);
					if (! isFirst) {
						insert_sql += ", ";
					}
					insert_sql += dbStr;
					isFirst = false;
				}
			}
			insert_sql += ")";
			
			stmt = conn.createStatement();
			stmt.executeUpdate(insert_sql);
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(insert_sql);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static <T> void createTable(Class<T> claz) {
		boolean isFirst = true;
		List<String> keyList = new ArrayList<String>();
		String sql = "create table " + claz.getSimpleName() +"(";
		
		if (QQStock.class.getName().equals(claz.getName())) {
			for (QQStock item: QQStock.values()) {
				if (!isFirst) {
					sql += ", ";
				}
				sql += item.getType().getDefineString(item.name());
				isFirst = false;
				
				if (item.isKey()) {
					keyList.add(item.name());
				}
			}
		}
		
		if (!keyList.isEmpty()) {
			sql += ", primary key(";
			boolean isFirstKey = true;
			for (String key : keyList) {
				if (!isFirstKey) {
					sql += ", ";
				}
				sql += key;
				isFirstKey = false;
			}
			sql += ")";
		}
		sql +=")";
		
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("unused")
	private static ResultSet search(Map<Integer, String> data, String sql) {
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	
	public static void main(String[] args) {
		createTable(QQStock.class);
//		Map<Integer, String> data = new HashMap<Integer, String>();
//		data.put(QQStock.STOCK_DATE.ordinal(), "2014-10-22");
//		data.put(QQStock.CODE.ordinal(), "11");
//		
//		insertTable(data, QQStock.class);
	}

}