package com.java.intrfc;

import com.java.intrfc.HdfcATM;
import com.java.intrfc.IBankATM;
import com.java.intrfc.KotakATM;

public class App {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		getCash2("hdfc");
		getCash2("kotak");

		getCash1("hdfc");
		
		getCash("kotak");
	
	}

	public static void getCash2(String bankType)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = "";
		if (bankType.equals("hdfc")) {
			className = "com.java.intrfc.HdfcATM";
		} else {
			className = "com.java.intrfc.KotakATM";
		}

		IBankATM atm = (IBankATM) Class.forName(className).newInstance();

		atm.retrieveCash();

	}

	public static void getCash1(String bankType)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = "";
		if (bankType.equals("hdfc")) {
			className = "com.java.intrfc.HdfcATM";
		} else {
			className = "com.java.intrfc.KotakATM";
		}

		HdfcATM hdfc = (HdfcATM) Class.forName(className).newInstance();

		hdfc.retrieveCash();

	}

	public static void getCash(String bankType)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = "";
		if (bankType.equals("hdfc")) {
			className = "com.java.intrfc.HdfcATM";
		} else {
			className = "com.java.intrfc.KotakATM";
		}

		KotakATM kotak = (KotakATM) Class.forName(className).newInstance();

		kotak.retrieveCash();

	}
}
