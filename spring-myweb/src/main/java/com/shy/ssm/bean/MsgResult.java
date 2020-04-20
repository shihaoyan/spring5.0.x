package com.shy.ssm.bean;

/**
 * @author 石皓岩
 * @create 2020-03-09 17:28
 * 描述：
 */
public class MsgResult {
	private Integer code;
	private String message;
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MsgResult(Integer code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public MsgResult(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public MsgResult() {
	}

	@Override
	public String toString() {
		return "MsgResult{" +
				"code=" + code +
				", message='" + message + '\'' +
				", data=" + data +
				'}';
	}
}
