package au.com.fujitsu.java101.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class CommonUsageExample {

	@Test
	public void testStringUsage() {
		String fruits = "apple,mongo,pear,lemon,peach,cherry";
		
		// fruits.substring(beginIndex)
		// fruits.split(regex);
		// fruits.startsWith(prefix)
		// others
	}
	
	@Test
	public void testDate(){
		Date date = new Date();		
		new Date(System.currentTimeMillis());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String formattedDate = sdf.format(date);		
		System.out.println(formattedDate);
		
		try {
			Date myDate = sdf.parse("11/11/2011 12:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// Calendar.getInstance().getTime();
		
	}
}
