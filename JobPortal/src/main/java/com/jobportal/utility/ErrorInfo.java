package com.jobportal.utility;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorInfo {
    private String errorMessage;
    private Integer errorcode;
    private LocalDateTime timeStamp;

    public ErrorInfo(){

    }

    public ErrorInfo(String errorMessage, Integer errorcode, LocalDateTime timeStamp) {
		super();
		this.errorMessage = errorMessage;
		this.errorcode = errorcode;
		this.timeStamp = timeStamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(Integer errorcode) {
		this.errorcode = errorcode;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}


}
