package com.configdebug.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author sl
 * email:shileijava@sohu.com
 */
public class PropertyReader {
	private static String pathDefault = "/configdebugdefault.properties";
	private static String path = "/configdebug.properties";
	private static Properties pDefault = new Properties();
	private static Properties p = new Properties();
	InputStream inLog = null;
	static {
		InputStream pDefaultPath = PropertyReader.class.getResourceAsStream(pathDefault);
		InputStream pPath = PropertyReader.class.getResourceAsStream(path);
		try {
			if(null != pDefaultPath){
				pDefault.load(pDefaultPath);
			}
			if(null != pPath){
				p.load(pPath);
			}
		} catch (IOException e) {
			throw new ExceptionInInitializerError("read properties exception");
		} finally {
			if (pDefaultPath != null){
				try {
					pDefaultPath.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (pPath != null){
				try {
					pPath.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
				
		}
	}
	
	public static String getValue(String key) {
		return null == p.getProperty(key) || "".equals(p.getProperty(key).trim()) ? pDefault.getProperty(key) : p.getProperty(key);
	}
	
	public static void main(String[] args) {
		
		PropertyReader.getValue("xx");
		System.out.println("ok");
	}
	
}
