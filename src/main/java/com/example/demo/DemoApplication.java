package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class DemoApplication {


//test
	@GetMapping("/")
	public String home() {
//		return "Spring is here!";

		String data = "";
		data = "<html><body>"; 

		String data1 = "[<font color=red>" + getServerName() + "</font>] <b>"+ getServerIp() + "</b> " + "springmvc loaded!!";
		
		data = data1 + "</body></html>";
		//data = "[" + getServerName() + "] "+ getServerIp() + " " + "springmvc loaded!!";

		return data;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public static String getServerIp() {
		InetAddress local = null;
		try {
			local = InetAddress.getLocalHost();
		} catch ( UnknownHostException e ) {
			e.printStackTrace();
		}
		if( local == null ) {
			return "";
		} else {
			String ip = local.getHostAddress();
			return ip;
		}
	}

	public static String getServerName() {
		InetAddress local = null;
		try {
			local = InetAddress.getLocalHost();
			local.getHostName();
		} catch ( UnknownHostException e ) {
			e.printStackTrace();
		}
		if( local == null ) {
			return "";
		} else {
			String hostName = local.getHostName();
			return hostName;
		}
	}
}
