package br.com.footdata.footapi.util;

public class Util {
	
	public static final int DUMMY_INTEGER = -1;
	public static final String EMPTY_STRING = "";
	
	public static boolean isEmpty(String s) {
		return s == null || s.trim().equals(EMPTY_STRING);
	}
}
