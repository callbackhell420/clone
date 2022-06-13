package com.jira.clone.vo;

public class ResponseVO {
	
	private int status;
	
	private String statusMessage;
	
	private Object data;
	
	private Object error;

	public ResponseVO(int status, String statusMessage, Object data, Object error) {
		super();
		this.status = status;
		this.statusMessage = statusMessage;
		this.data = data;
		this.error = error;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}
	
	

}
