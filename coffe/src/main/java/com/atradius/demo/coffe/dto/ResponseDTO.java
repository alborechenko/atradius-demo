package com.atradius.demo.coffe.dto;

import lombok.Data;

@Data
public class ResponseDTO<T> {

	private Boolean success;
	private String message;
	private T data;
	
	
	public ResponseDTO(Boolean success, String message, T data) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

}

