package com.ibatis.tools.autogen;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.util.*;

public class LoadTables {

	/** 日志记录 */
	private final static Logger LOGGER = Logger.getLogger(LoadTables.class);
	
	private final static String FILENAME = "tables.properties";
	
	//加载table
	public static List<String> laodingTablesFromFile(){
		String configPath = null;
		Properties prop = null;
		try {
			configPath = ClassLoader.getSystemResource("config/").getPath()+FILENAME;
			prop = new Properties();
			prop.load(new FileInputStream(configPath));
		} catch (Exception e) {
			LOGGER.info("未找到文件:"+configPath);
			LOGGER.info("不加载tables文件");
			return Collections.EMPTY_LIST;
		}
		
		String tables = prop.getProperty("tables");
		if(tables ==null || tables.length() == 0){
			LOGGER.info("tables为空");
			return Collections.EMPTY_LIST;
		}
		LOGGER.info("tables:"+tables);
		String [] tabArr = tables.split(",");
		
		return Arrays.asList(tabArr);
	}
 	
	
	public static void main(String[] args) {
		laodingTablesFromFile();
	}
	
	
}
