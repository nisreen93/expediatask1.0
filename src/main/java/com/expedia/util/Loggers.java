package com.expedia.util;


import java.util.Date;

//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class Loggers {

	private Loggers() {
	}

	public static final Logger systemTraceDebug = (Logger) LoggerFactory.getLogger("systemTraceDebug");
	public static final Logger sysInfoWarnError = (Logger) LoggerFactory.getLogger("systemInfoWarnError");
	public static final Logger sysUserEventInfo = (Logger) LoggerFactory.getLogger("systemUserEventInfo");

	public static void debug(String txt) {
		// TODO calling logger methods
		System.out.println(new Date() + "---> " + txt);
	}
}