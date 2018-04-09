package com.javisdce.tzuxi.binaryconverter.to_binary_algorythm;

/**
 * The class {@code TextToBinary} combines the classes {@code CharToAscii} and {@code AsciiToBinary} and provides the function
 * to convert a String into binary code
 * @author maxfr
 *
 */
public class TextToBinary {
	/**
	 * The characters proposed to be converted into binary code
	 */
	private char[] text;
	
	/**
	 * The binary code to be printed out in the end
	 */
	private String binary = "";
	
	/**
	 * The module converting chars into ASCII
	 */
	private CharToAscii ac;
	
	/**
	 * The module converting ASCII into binary code
	 */
	private AsciiToBinary bc;

	/**
	 * Constructs the module proposed to convert a string into binary code
	 */
	public TextToBinary() {
		ac = new CharToAscii();
		bc = new AsciiToBinary();
	}
	
	/**
	 * Converts a string into binary code
	 * @param _text		the String to convert
	 * @return	a binary code
	 */
	public String convertToBinary(String _text) {
		text = _text.toCharArray();
		for(int i = 0; i < text.length; i++) {
			
			int tempascii;
			

				tempascii = ac.getASCII(text[i]);
				String tempbinary = bc.getBinary(tempascii);			
				binary = binary + tempbinary;

			
		}
		return binary;
	}
}
