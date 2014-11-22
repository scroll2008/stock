package model.tecent;

import java.io.Serializable;


public class StockInfo implements Serializable {
	String A;   //("未知"),      //0
	String NAME; //("名字"),      //1
	String CODE; //("代码"),      //2
	float CURRENT_PRICE; //("当前价格"),      //3
	float YEST_CLOSING_PRICE; //("昨收"),      //4
	float TODAY_OPENING_PRICE; //("今开"),      //5
	long VOLUME; //("成交量（手）"),      //6
	long OUTSIZE; //("外盘"),      //7
	long INSIZE; //("内盘"),      //8
	float BUY_ONE_PRICE; //("买一价格"),      //9
	long BUY_ONE_VOL; //("买一量（手）"),      //10
	float BUY_TWO_PRICE; //("买二价格"),      //11
	long BUY_TWO_VOL; //("买二量（手）"),      //12：
	float BUY_THREE_PRICE; //("买三价格"),      //13
	long BUY_THREE_VOL; //("买三量（手）"),      //14
	float BUY_FOUR_PRICE; //("买四价格"),      //15
	long BUY_FOUR_VOL; //("买四量（手）"),      //16
	float BUY_FIVE_PRICE; //("买五价格"),      //17
	long BUY_FIVE_VOL; //("买五量（手）"),      //18
	float SELL_ONE_PRICE; //("卖一价格"),      //19
	long SELL_ONE_VOL; //("卖一量（手）"),      //20
	float SELL_TWO_PRICE; //("卖二价格"),      //21
	long SELL_TWO_VOL; //("卖二量（手）"),      //22
	float SELL_THREE_PRICE; //("卖三价格"),      //23
	long SELL_THREE_VOL; //("卖三量（手）"),      //24
	float SELL_FOUR_PRICE; //("卖四价格"),      //25
	long SELL_FOUR_VOL; //("卖四量（手）"),      //26
	float SELL_FIVE_PRICE; //("卖五价格"),      //27
	long SELL_FIVE_VOL; //("卖五量（手）"),      //28
	String RECENT_DEALS; //("最近逐笔成交"),      //29
	String TIME; //("时间"),      //30
	float PRICE_CHANGE; //("涨跌"),      //31
	float PRICE_CHANGE_PERCENT; //("涨跌%"),      //32
	float HIGHEST_PRICE; //("最高"),      //33
	float LOWEST_PRICE; //("最低"),      //34
	String PRICE_VOL_AMOUNT; //("价格/成交量（手）/成交额"),      //35
	long VOLUME2; //("成交量（手）"),      //36
	double AMOUNT; //("成交额（万）"),      //37
	float TURNOVER_RATE; //("换手率"),      //38
	float PE; //("市盈率"),      //39
	String UNKNOWN; //("unknown"),      //40
	float HIGHEST_2; //("最高"),      //41
	float LOWEST_2; //("最低"),      //42
	float AMPLITUDE; //("振幅"),      //43
	double CIRCULATED_MACKET_VALUE; //("流通市值"),      //44
	double TOTAL_MACKET_VALUE; //("总市值"),      //45
	float PB; //("市净率"),      //46
	float HIGH_LIMIT; //("涨停价"),      //47
	float LOW_LIMIT; //("跌停价"),      //48;
	
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	
	public String getCODE() {
		return CODE;
	}
	public void setCODE(String cODE) {
		CODE = cODE;
	}
	public float getCURRENT_PRICE() {
		return CURRENT_PRICE;
	}
	public void setCURRENT_PRICE(float cURRENT_PRICE) {
		CURRENT_PRICE = cURRENT_PRICE;
	}
	public float getYEST_CLOSING_PRICE() {
		return YEST_CLOSING_PRICE;
	}
	public void setYEST_CLOSING_PRICE(float yEST_CLOSING_PRICE) {
		YEST_CLOSING_PRICE = yEST_CLOSING_PRICE;
	}
	public float getTODAY_OPENING_PRICE() {
		return TODAY_OPENING_PRICE;
	}
	public void setTODAY_OPENING_PRICE(float tODAY_OPENING_PRICE) {
		TODAY_OPENING_PRICE = tODAY_OPENING_PRICE;
	}
	public long getVOLUME() {
		return VOLUME;
	}
	public void setVOLUME(long vOLUME) {
		VOLUME = vOLUME;
	}
	public long getOUTSIZE() {
		return OUTSIZE;
	}
	public void setOUTSIZE(long oUTSIZE) {
		OUTSIZE = oUTSIZE;
	}
	public long getINSIZE() {
		return INSIZE;
	}
	public void setINSIZE(long iNSIZE) {
		INSIZE = iNSIZE;
	}
	public float getBUY_ONE_PRICE() {
		return BUY_ONE_PRICE;
	}
	public void setBUY_ONE_PRICE(float bUY_ONE_PRICE) {
		BUY_ONE_PRICE = bUY_ONE_PRICE;
	}
	public long getBUY_ONE_VOL() {
		return BUY_ONE_VOL;
	}
	public void setBUY_ONE_VOL(long bUY_ONE_VOL) {
		BUY_ONE_VOL = bUY_ONE_VOL;
	}
	public float getBUY_TWO_PRICE() {
		return BUY_TWO_PRICE;
	}
	public void setBUY_TWO_PRICE(float bUY_TWO_PRICE) {
		BUY_TWO_PRICE = bUY_TWO_PRICE;
	}
	public long getBUY_TWO_VOL() {
		return BUY_TWO_VOL;
	}
	public void setBUY_TWO_VOL(long bUY_TWO_VOL) {
		BUY_TWO_VOL = bUY_TWO_VOL;
	}
	public float getBUY_THREE_PRICE() {
		return BUY_THREE_PRICE;
	}
	public void setBUY_THREE_PRICE(float bUY_THREE_PRICE) {
		BUY_THREE_PRICE = bUY_THREE_PRICE;
	}
	public long getBUY_THREE_VOL() {
		return BUY_THREE_VOL;
	}
	public void setBUY_THREE_VOL(long bUY_THREE_VOL) {
		BUY_THREE_VOL = bUY_THREE_VOL;
	}
	public float getBUY_FOUR_PRICE() {
		return BUY_FOUR_PRICE;
	}
	public void setBUY_FOUR_PRICE(float bUY_FOUR_PRICE) {
		BUY_FOUR_PRICE = bUY_FOUR_PRICE;
	}
	public long getBUY_FOUR_VOL() {
		return BUY_FOUR_VOL;
	}
	public void setBUY_FOUR_VOL(long bUY_FOUR_VOL) {
		BUY_FOUR_VOL = bUY_FOUR_VOL;
	}
	public float getBUY_FIVE_PRICE() {
		return BUY_FIVE_PRICE;
	}
	public void setBUY_FIVE_PRICE(float bUY_FIVE_PRICE) {
		BUY_FIVE_PRICE = bUY_FIVE_PRICE;
	}
	public long getBUY_FIVE_VOL() {
		return BUY_FIVE_VOL;
	}
	public void setBUY_FIVE_VOL(long bUY_FIVE_VOL) {
		BUY_FIVE_VOL = bUY_FIVE_VOL;
	}
	public float getSELL_ONE_PRICE() {
		return SELL_ONE_PRICE;
	}
	public void setSELL_ONE_PRICE(float sELL_ONE_PRICE) {
		SELL_ONE_PRICE = sELL_ONE_PRICE;
	}
	public long getSELL_ONE_VOL() {
		return SELL_ONE_VOL;
	}
	public void setSELL_ONE_VOL(long sELL_ONE_VOL) {
		SELL_ONE_VOL = sELL_ONE_VOL;
	}
	public float getSELL_TWO_PRICE() {
		return SELL_TWO_PRICE;
	}
	public void setSELL_TWO_PRICE(float sELL_TWO_PRICE) {
		SELL_TWO_PRICE = sELL_TWO_PRICE;
	}
	public long getSELL_TWO_VOL() {
		return SELL_TWO_VOL;
	}
	public void setSELL_TWO_VOL(long sELL_TWO_VOL) {
		SELL_TWO_VOL = sELL_TWO_VOL;
	}
	public float getSELL_THREE_PRICE() {
		return SELL_THREE_PRICE;
	}
	public void setSELL_THREE_PRICE(float sELL_THREE_PRICE) {
		SELL_THREE_PRICE = sELL_THREE_PRICE;
	}
	public long getSELL_THREE_VOL() {
		return SELL_THREE_VOL;
	}
	public void setSELL_THREE_VOL(long sELL_THREE_VOL) {
		SELL_THREE_VOL = sELL_THREE_VOL;
	}
	public float getSELL_FOUR_PRICE() {
		return SELL_FOUR_PRICE;
	}
	public void setSELL_FOUR_PRICE(float sELL_FOUR_PRICE) {
		SELL_FOUR_PRICE = sELL_FOUR_PRICE;
	}
	public long getSELL_FOUR_VOL() {
		return SELL_FOUR_VOL;
	}
	public void setSELL_FOUR_VOL(long sELL_FOUR_VOL) {
		SELL_FOUR_VOL = sELL_FOUR_VOL;
	}
	public float getSELL_FIVE_PRICE() {
		return SELL_FIVE_PRICE;
	}
	public void setSELL_FIVE_PRICE(float sELL_FIVE_PRICE) {
		SELL_FIVE_PRICE = sELL_FIVE_PRICE;
	}
	public long getSELL_FIVE_VOL() {
		return SELL_FIVE_VOL;
	}
	public void setSELL_FIVE_VOL(long sELL_FIVE_VOL) {
		SELL_FIVE_VOL = sELL_FIVE_VOL;
	}
	public String getRECENT_DEALS() {
		return RECENT_DEALS;
	}
	public void setRECENT_DEALS(String rECENT_DEALS) {
		RECENT_DEALS = rECENT_DEALS;
	}
	public String getTIME() {
		return TIME;
	}
	public void setTIME(String tIME) {
		TIME = tIME;
	}
	public float getPRICE_CHANGE() {
		return PRICE_CHANGE;
	}
	public void setPRICE_CHANGE(float pRICE_CHANGE) {
		PRICE_CHANGE = pRICE_CHANGE;
	}
	public float getPRICE_CHANGE_PERCENT() {
		return PRICE_CHANGE_PERCENT;
	}
	public void setPRICE_CHANGE_PERCENT(float pRICE_CHANGE_PERCENT) {
		PRICE_CHANGE_PERCENT = pRICE_CHANGE_PERCENT;
	}
	public float getHIGHEST_PRICE() {
		return HIGHEST_PRICE;
	}
	public void setHIGHEST_PRICE(float hIGHEST_PRICE) {
		HIGHEST_PRICE = hIGHEST_PRICE;
	}
	public float getLOWEST_PRICE() {
		return LOWEST_PRICE;
	}
	public void setLOWEST_PRICE(float lOWEST_PRICE) {
		LOWEST_PRICE = lOWEST_PRICE;
	}
	public String getPRICE_VOL_AMOUNT() {
		return PRICE_VOL_AMOUNT;
	}
	public void setPRICE_VOL_AMOUNT(String pRICE_VOL_AMOUNT) {
		PRICE_VOL_AMOUNT = pRICE_VOL_AMOUNT;
	}
	public long getVOLUME2() {
		return VOLUME2;
	}
	public void setVOLUME2(long vOLUME2) {
		VOLUME2 = vOLUME2;
	}
	public double getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public float getTURNOVER_RATE() {
		return TURNOVER_RATE;
	}
	public void setTURNOVER_RATE(float tURNOVER_RATE) {
		TURNOVER_RATE = tURNOVER_RATE;
	}
	public float getPE() {
		return PE;
	}
	public void setPE(float pE) {
		PE = pE;
	}
	public String getUNKNOWN() {
		return UNKNOWN;
	}
	public void setUNKNOWN(String uNKNOWN) {
		UNKNOWN = uNKNOWN;
	}
	public float getHIGHEST_2() {
		return HIGHEST_2;
	}
	public void setHIGHEST_2(float hIGHEST_2) {
		HIGHEST_2 = hIGHEST_2;
	}
	public float getLOWEST_2() {
		return LOWEST_2;
	}
	public void setLOWEST_2(float lOWEST_2) {
		LOWEST_2 = lOWEST_2;
	}
	public float getAMPLITUDE() {
		return AMPLITUDE;
	}
	public void setAMPLITUDE(float aMPLITUDE) {
		AMPLITUDE = aMPLITUDE;
	}
	public double getCIRCULATED_MACKET_VALUE() {
		return CIRCULATED_MACKET_VALUE;
	}
	public void setCIRCULATED_MACKET_VALUE(double cIRCULATED_MACKET_VALUE) {
		CIRCULATED_MACKET_VALUE = cIRCULATED_MACKET_VALUE;
	}
	public double getTOTAL_MACKET_VALUE() {
		return TOTAL_MACKET_VALUE;
	}
	public void setTOTAL_MACKET_VALUE(double tOTAL_MACKET_VALUE) {
		TOTAL_MACKET_VALUE = tOTAL_MACKET_VALUE;
	}
	public float getPB() {
		return PB;
	}
	public void setPB(float pB) {
		PB = pB;
	}
	public float getHIGH_LIMIT() {
		return HIGH_LIMIT;
	}
	public void setHIGH_LIMIT(float hIGH_LIMIT) {
		HIGH_LIMIT = hIGH_LIMIT;
	}
	public float getLOW_LIMIT() {
		return LOW_LIMIT;
	}
	public void setLOW_LIMIT(float lOW_LIMIT) {
		LOW_LIMIT = lOW_LIMIT;
	}
}
