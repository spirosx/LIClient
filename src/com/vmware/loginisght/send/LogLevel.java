package com.vmware.loginisght.send;

public enum LogLevel {
	DEBUG("debug"), CRITICAL("critical"), ERROR("error"), ALERT("alert"), INFO("info"), WARN("warn");

	private String level;

	private LogLevel(String level) {
		this.level = level;
	}

	public String getValue() {
		return level;
	}
}