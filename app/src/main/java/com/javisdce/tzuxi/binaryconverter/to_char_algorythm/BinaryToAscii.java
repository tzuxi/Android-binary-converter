package com.javisdce.tzuxi.binaryconverter.to_char_algorythm;

public class BinaryToAscii {
	
	int ascii;

	public int getASCII(char[] _binary) {
		ascii = 0;
		if(_binary[0] == '1') {
			ascii += 128;
			
		}
		if(_binary[1] == '1') {
			ascii += 64;
			
		}
		if(_binary[2] == '1') {
			ascii += 32;
			
		}
		if(_binary[3] == '1') {
			ascii += 16;
			
		}
		if(_binary[4] == '1') {
			ascii += 8;
			
		}
		if(_binary[5] == '1') {
			ascii += 4;
			
		}
		if(_binary[6] == '1') {
			ascii += 2;
			
		}
		if(_binary[7] == '1') {
			ascii += 1;
			
		}
		return ascii;
	}
}
