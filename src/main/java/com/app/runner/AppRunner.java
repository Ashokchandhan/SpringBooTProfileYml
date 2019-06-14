package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

	@Value("${my.massage}")
	private String Msg;

	@Value("${my.code}")
	private String code;

	@Value("${my.mode}")
	private String mode;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "AppRunner [Msg=" + Msg + ", code=" + code + ", mode=" + mode + "]";
	}

}
