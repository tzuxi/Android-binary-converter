package com.javisdce.tzuxi.binaryconverter.to_char_algorythm;

public class AsciiToChar {

	char character;
	
	public char getChar(int _ascii) {
		if(_ascii > 96 && _ascii < 123) {
			character = Database.LOWALPHABET[_ascii-97];
			
		}else if(_ascii > 64 && _ascii < 91) {
			character = Database.UPALPHABET[_ascii-65];
			
		}else if(_ascii > 47 && _ascii < 58) {
			character = Database.NUMBERS[_ascii-48];
		}
		switch(_ascii) {
		case 32: character = ' '; break;
		case 44: character = ','; break;
		case 46: character = '.'; break;
		case 63: character = '?'; break;
		}
		return character;
	}
}
