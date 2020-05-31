/**
 * 
 */
package com.example.javaagent.gettingstarted;

import java.lang.instrument.Instrumentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author vkumar
 *
 */
public class Agent {
	
	private static final Logger LOGGER = LogManager.getLogger();

	public static void premain(String agentArgs, Instrumentation instrumentation) {
		LOGGER.info("[Agent] In premain method");
	}
	
	public static void agentmain(String agentArgs, Instrumentation instrumentation) {
		LOGGER.info("[Agent] In agentmain method");
	}
}
