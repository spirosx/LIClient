package com.vmware.loginisght.send;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ConsoleApp {

	public static void main (String[] args) {
		Random r = new Random();
//		LogUploadClient client = new LogUploadClient("10.148.104.186", 514, LogInsigntProtocol.SYSLOG_TCP);
		SyslogClient sc = null;
		try {
			sc = new SyslogClient("10.148.104.186", 514, LogInsigntProtocol.SYSLOG_UDP);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			try {
				Map<String, String> m = new HashMap<String, String>();
				m.put("hostname", "android");
				m.put("whoIsYourDaddy", "notBill");
				sc.send("test " + String.valueOf(r.nextInt()) + " " + i + 10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
