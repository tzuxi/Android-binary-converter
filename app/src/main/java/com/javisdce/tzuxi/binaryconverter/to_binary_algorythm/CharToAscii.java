package com.javisdce.tzuxi.binaryconverter.to_binary_algorythm;

/**
 * The class {@code CharToAscii} provides the function to convert any letter included in ASCII table or digit into ASCII
 * @author tzuxi
 *
 */
public class CharToAscii {

	/**
	 * The state if the character has been identified
	 */
	private boolean identified;
	
	/**
	 * The character as ASCII
	 */
	private int ascii;
	
	/**
	 * Converts a character into ASCII
	 * @param _letter	the character to convert
	 * @return	the ASCII referring to the character given
	 *
	 */
	public int getASCII(char _letter) {
		
		identified = false;
		ascii = -1;
		
		for(int i = 0; i < Database.UPALPHABET.length; i++) {
			if(_letter == Database.UPALPHABET[i]) {		
				ascii = i+65;
				identified = true;
			}else if(_letter == Database.LOWALPHABET[i]) {				
				ascii = i+97;
				identified = true;
			}
		}
		
		if (!identified) {
			for(int i = 0; i < Database.NUMBERS.length; i++) {
				if (_letter == Database.NUMBERS[i]) {
					ascii = i+48;
					identified = true;
				}
			}	
		}
		
		switch(_letter) {
		case 32: ascii = ' '; 
		identified = true; break;
		case 44: ascii = ','; 
		identified = true; break;
		case 46: ascii = '.'; 
		identified = true; break;
		case 63: ascii = '?'; 
		identified = true; break;
		}
		
		if(!identified) {
			ascii = 63;
		}
		return ascii;
	}
}
