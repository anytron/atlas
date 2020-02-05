package com.atlas.model;

public class Result<T> {
	private String code;
	private String desc;
	private T t;
	
	public Result(){}
	
	public Result(ErrorCode errorCode, T t){
		this.code = errorCode.getCode();
		this.desc = errorCode.getDesc();
		this.t = t;
	}
	
	public Result(ErrorCode errorCode){
		this.code = errorCode.getCode();
		this.desc = errorCode.getDesc();
		this.t = null;
	}
	
	public void instanceResult(ErrorCode errorCode){
		this.code = errorCode.getCode();
		this.desc = errorCode.getDesc();
		this.t = null;
	}
	public void instanceResult(ErrorCode errorCode, T t){
		this.code = errorCode.getCode();
		this.desc = errorCode.getDesc();
		this.t = t;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	

}
