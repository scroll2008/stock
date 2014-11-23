package com.js.stock.qq;

public enum MarketTypeEnum {
	QQ_SH_A("腾讯_上海A股", "http://qt.gtimg.cn/q=sh", "sh_a"),
	QQ_SZ_A("腾讯_上海A股", "http://qt.gtimg.cn/q=sz", "sz_a");

	private String name;
	private String url;
	private String value;
	
	private MarketTypeEnum(String name, String url, String value) {
		this.name = name;
		this.url = url;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}
	
	public String getValue() {
		return value;
	}
}
