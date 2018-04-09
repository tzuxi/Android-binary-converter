/*
 * Copyright (c) 2017, 2018, Javis Development and Computer Engineering. All rights reserved.
 * 
 */
package com.javisdce.tzuxi.binaryconverter.to_char_algorythm;

/**
 * This program converts 8-bit binary code into letters
 * @author maxfr
 * @version 0.1
 */
public class BinaryToText {

	
	public String convert(String _binary) {

		BinaryToAscii b = new BinaryToAscii();
		AsciiToChar a = new AsciiToChar();
		String endtext = "";
		char[] binary = _binary.toCharArray();
		
		for(int i = 0; i < binary.length/8; i++) {
			final char[] tempbinary = {binary[0+i*8], binary[1+i*8], binary[2+i*8], binary[3+i*8], binary[4+i*8], binary[5+i*8], binary[6+i*8], binary[7+i*8]};
			
			
			int ascii = b.getASCII(tempbinary);

			char character = a.getChar(ascii);
			endtext = endtext + character;
		}
		return endtext;
	}
}
