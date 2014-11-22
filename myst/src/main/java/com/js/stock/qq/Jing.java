package com.js.stock.qq;

public enum Jing {
	
	J("jing", TypeEnum.LONG),
	S("sheng", TypeEnum.DOUBLE);
	
	private String name;
	
	private TypeEnum type;

	private Jing(String name, TypeEnum type) {
		this.name = name;
		this.type = type;
	}
	
	private Jing(String name) {
		
	}
}
