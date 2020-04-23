package org.railway.ticketbooking.Schemas;

import org.springframework.stereotype.Component;


public class Status extends APIResponse {

	private String statusMessage;
	private int statusCode;
	private String additionalInfo;
	
	public Status(int statusCode, String statusMessage, String additionalInfo) {
		super();
		this.statusMessage = statusMessage;
		this.statusCode = statusCode;
		this.additionalInfo = additionalInfo;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	
	
}
