package com.js.stock.qq;

public enum QQStock {
	
	STOCK_DATE("日期", TypeEnum.DATE, true),
	A("未知", TypeEnum.STRING),      //0
	NAME("名字", TypeEnum.STRING),      //1
	CODE("代码", TypeEnum.STRING, true),      //2
	CURRENT_PRICE("当前价格"),      //3
	YEST_CLOSING_PRICE("昨收"),      //4
	TODAY_OPENING_PRICE("今开"),      //5
	VOLUME("成交量（手）", TypeEnum.LONG),      //6
	OUTSIZE("外盘", TypeEnum.LONG),      //7
	INSIZE("内盘", TypeEnum.LONG),      //8
	BUY_ONE_PRICE("买一价格"),      //9
	BUY_ONE_VOL("买一量（手）", TypeEnum.LONG),      //10
	BUY_TWO_PRICE("买二价格"),      //11
	BUY_TWO_VOL("买二量（手）", TypeEnum.LONG),      //12：
	BUY_THREE_PRICE("买三价格"),      //13
	BUY_THREE_VOL("买三量（手）", TypeEnum.LONG),      //14
	BUY_FOUR_PRICE("买四价格"),      //15
	BUY_FOUR_VOL("买四量（手）", TypeEnum.LONG),      //16
	BUY_FIVE_PRICE("买五价格"),      //17
	BUY_FIVE_VOL("买五量（手）", TypeEnum.LONG),      //18
	SELL_ONE_PRICE("卖一价格"),      //19
	SELL_ONE_VOL("卖一量（手）", TypeEnum.LONG),      //20
	SELL_TWO_PRICE("卖二价格"),      //21
	SELL_TWO_VOL("卖二量（手）", TypeEnum.LONG),      //22
	SELL_THREE_PRICE("卖三价格"),      //23
	SELL_THREE_VOL("卖三量（手）", TypeEnum.LONG),      //24
	SELL_FOUR_PRICE("卖四价格"),      //25
	SELL_FOUR_VOL("卖四量（手）", TypeEnum.LONG),      //26
	SELL_FIVE_PRICE("卖五价格"),      //27
	SELL_FIVE_VOL("卖五量（手）", TypeEnum.LONG),      //28
	RECENT_DEALS("最近逐笔成交", TypeEnum.STRING),      //29
	STOCK_TIME("时间", TypeEnum.STRING),      //30
	PRICE_CHANGE("涨跌"),      //31
	PRICE_CHANGE_PERCENT("涨跌%"),      //32
	HIGHEST_PRICE("最高"),      //33
	LOWEST_PRICE("最低"),      //34
	PRICE_VOL_AMOUNT("价格/成交量（手）/成交额", TypeEnum.STRING),      //35
	VOLUME2("成交量（手）"),      //36
	AMOUNT("成交额（万）"),      //37
	TURNOVER_RATE("换手率"),      //38
	PE("市盈率"),      //39
	UNKNOWN("unknown", TypeEnum.STRING),      //40
	HIGHEST_2("最高"),      //41
	LOWEST_2("最低"),      //42
	AMPLITUDE("振幅"),      //43
	CIRCULATED_MACKET_VALUE("流通市值"),      //44
	TOTAL_MACKET_VALUE("总市值"),      //45
	PB("市净率"),      //46
	HIGH_LIMIT("涨停价"),      //47
	LOW_LIMIT("跌停价"),      //48;
	;
	
	private String name;
	private TypeEnum type;
	private boolean isKey;
	
	public String getName() {
		return name;
	}
	
	public TypeEnum getType() {
		return type;
	}
	
	public boolean isKey() {
		return isKey;
	}
	
	private QQStock(String name, TypeEnum type, boolean isKey) {
		this.name = name;
		this.type = type;
		this.isKey = isKey;
	}
	
	private QQStock(String name, TypeEnum type) {
		this.name = name;
		this.type = type;
		this.isKey = false;
	}
	
	private QQStock(String name) {
		this.name = name;
		this.type = TypeEnum.DOUBLE;
		this.isKey = false;
	}
}
