package com.atlas.model;

import java.io.Serializable;

public class Result<T> implements Serializable {
	
	private static final long serialVersionUID = -7111957128464290110L;
	
	private String code;
	private String desc;
	private T resultData;
	
	public Result(){}
	
	public Result(ErrorCode errorCode, T resultData){
		this.code = errorCode.getCode();
		this.desc = errorCode.getDesc();
		this.resultData = resultData;
	}
	
	public Result(ErrorCode errorCode){
		this.code = errorCode.getCode();
		this.desc = errorCode.getDesc();
		this.resultData = null;
	}
	
	public void instanceResult(ErrorCode errorCode){
		this.code = errorCode.getCode();
		this.desc = errorCode.getDesc();
		this.resultData = null;
	}
	public void instanceResult(ErrorCode errorCode, T resultData){
		this.code = errorCode.getCode();
		this.desc = errorCode.getDesc();
		this.resultData = resultData;
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

	public T getResultData() {
		return resultData;
	}

	public void setResultData(T resultData) {
		this.resultData = resultData;
	}

}
