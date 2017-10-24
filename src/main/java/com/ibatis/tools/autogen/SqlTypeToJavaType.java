/**
 * 
 */
package com.ibatis.tools.autogen;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class SqlTypeToJavaType {
	private final static Logger logger = Logger.getLogger(SqlTypeToJavaType.class);
	
	private static Map<Integer,String> sqlType2JavaType = new HashMap<Integer,String>();
	
	static {
		sqlType2JavaType.put(Types.VARCHAR, "String");
		sqlType2JavaType.put(Types.DATE, "Date");	//java.util.Date
		sqlType2JavaType.put(Types.BIT, "Integer");
		sqlType2JavaType.put(Types.TINYINT, "Integer");
		sqlType2JavaType.put(Types.SMALLINT, "Integer");
		sqlType2JavaType.put(Types.INTEGER, "Integer");
		sqlType2JavaType.put(Types.BIGINT, "Long");
		sqlType2JavaType.put(Types.REAL, "Float");
		sqlType2JavaType.put(Types.DOUBLE, "Double");
		
		sqlType2JavaType.put(Types.CHAR, "String");
		sqlType2JavaType.put(Types.LONGVARCHAR, "String");
		
		sqlType2JavaType.put(Types.BINARY, "Blob");	//java.sql.Blob
		sqlType2JavaType.put(Types.VARBINARY, "Blob");	//java.sql.Blob
		sqlType2JavaType.put(Types.LONGVARBINARY, "Blob");	//java.sql.Blob
		
		sqlType2JavaType.put(Types.TIME, "Date");	//java.sql.Time
		sqlType2JavaType.put(Types.TIMESTAMP, "Date");	//java.sql.Timestamp
		//oracle
		sqlType2JavaType.put(Types.NUMERIC, "Long");
		sqlType2JavaType.put(Types.FLOAT, "BigDecimal");	//java.math.BigDecimal
		sqlType2JavaType.put(Types.DECIMAL, "BigDecimal");	//java.math.BigDecimal
		sqlType2JavaType.put(Types.CLOB, "Clob");	//java.sql.Clob
	}


	public static String mapJavaType(int sqltype) {
		String javaType = sqlType2JavaType.get(sqltype);
		if(StringUtils.isNotBlank(javaType)){
			return javaType;
		}else{
			logger.error("字段没有对应的Java类型，SQL_TYPE：" + sqltype);
			return "String";
		}
	}
	
}
