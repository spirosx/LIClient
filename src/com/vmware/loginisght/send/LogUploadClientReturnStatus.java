package com.vmware.loginisght.send;

public enum LogUploadClientReturnStatus {
	FAIL(-1),
	SUCCESS(1);
	
	int value;
	private LogUploadClientReturnStatus(int value) {
		this.value = value;
	}
	
}