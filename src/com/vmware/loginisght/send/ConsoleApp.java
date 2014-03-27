package com.vmware.loginisght.send;

import java.util.Random;

public class ConsoleApp {

	public static void main (String[] args) {
		Random r = new Random();
		LogUploadClient client = new LogUploadClient("10.148.104.186", 514, LogUploadClient.LogInsigntProtocol.SYSLOG_TCP);
		client.sendMessage("test " + String.valueOf(r.nextInt()));
	}
	
}
