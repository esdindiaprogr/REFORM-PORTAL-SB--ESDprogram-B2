package com.rpsb.util;

import java.nio.charset.Charset;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class Password extends Random {
	
	

	private static final long serialVersionUID = 1L;
	
	public String getRandomPassowrd() {
		String hash;
		byte[] array = new byte[8]; // length is bounded by 8
	    new Random().nextBytes(array);
	     hash = new String(array, Charset.forName("UTF-8"));
	    return hash;
	}

	
	public String getRandomStringPassword() {
		 
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    return buffer.toString();
	}
	
	/**
	 * 
	 *  
     *
	 * @return
	 */
	public String apacheCommonRandomPassword() {
	    String generatedString = RandomStringUtils.randomAlphanumeric(10);
	    return generatedString;
	}
}
