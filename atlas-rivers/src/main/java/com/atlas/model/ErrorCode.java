package com.atlas.model;

public enum ErrorCode {
	
	//
	SUCCESS("000000", "操作成功"), 
	FAILED("000001", "操作失败"), 
	AUTH_ERROR("000002", "认证失败"), 
	UNKNOWN_ERROR("000003", "未知错误"),
	PARAM_ERROR("0000004", "参数错误"),
	SYS_ERROR("000005", "系统错误"),
	//----------------以上系统固定返回错误码
	//以下非固定不以00开头
	//每个系统使用前俩位如user系统用01 后补的系统数值递增 最高允许99个系统
	//3-6位为本系统内错误码区分 与上述相同递增 每个系统最高允许9999个错误码,相同返回错误不能新增
	USER_USERNAME_EMPTY_ERROR("010001","用户名为空"),
	USER_ID_EMPTY_ERROR("010002","用户id为空"),
	
	
	
	

	;
	private String code;
	private String desc;

	private ErrorCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
