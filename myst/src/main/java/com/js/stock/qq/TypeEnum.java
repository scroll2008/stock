package com.js.stock.qq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import antlr.StringUtils;

public enum TypeEnum {
	
	LONG, DOUBLE, STRING, DATE;
	
	public String getDefineString(String columnName) {
		
		String defStr = "";
		defStr += columnName;
		try {
			switch (this) {
			case DATE:
				defStr += " date";
				break;
			case DOUBLE:
				defStr += " numeric(19,2)";
				break;
			case LONG:
				defStr += " numeric(19)";
				break;
			case STRING:
				defStr += " varchar2(255)";
				break;
			default:
				throw new Exception("Invalid columnName: " + columnName) ;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return defStr;
	}

	public String getDBString(String dataStr) {

		try {
			switch (this) {
			case DATE:
				SimpleDateFormat dataSDF = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat dbSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date date = dataSDF.parse(dataStr);
				String dbstr = "to_date('" + dbSDF.format(date) + "','yyyy-mm-dd hh24:mi:ss')";
				return dbstr;
			case DOUBLE:
				if(dataStr==null||dataStr.isEmpty()) {
					return "-1.0";
				}
				return dataStr;
			case LONG:
				if(dataStr==null||dataStr.isEmpty()) {
					return "-1";
				}
				return dataStr;
			case STRING:
				if(dataStr==null||dataStr.isEmpty()) {
					return "null";
				}
				return "'" + dataStr + "'";
			default:
				throw new Exception("Invalid dataStr: " + dataStr) ;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
