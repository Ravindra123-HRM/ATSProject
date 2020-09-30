package com.ats.qa.base;

import org.apache.log4j.Logger;





public class Log {
	
	
	
	
     static Logger logger=Logger.getLogger(Log.class.getName());
	
	public static  void info(String msg)
	{
		logger.info(msg);
	  	
	}
	
	public static void debug(String msg)
	{
		logger.debug(msg);
		
	}
	
	public static void error(String msg)
	{
		logger.error(msg);
		
	}
	
	public static void fatal(String msg)
	{
		logger.fatal(msg);
		
	}

	
}
