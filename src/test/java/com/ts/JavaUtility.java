package com.ts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public static String getCurrentTimeStamp() {

		SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm");//dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}
	
	public int getRandomNumber() {
		Random random = new Random();
		int intRandom = random.nextInt(1000);
		return intRandom;
	}
}
