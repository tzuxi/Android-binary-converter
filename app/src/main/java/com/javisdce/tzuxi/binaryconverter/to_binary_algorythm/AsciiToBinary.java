package com.javisdce.tzuxi.binaryconverter.to_binary_algorythm;

/**
 * The class {@code AsciiToBinary} provides the function to convert any ASCII into 8-bit binary code
 * @author maxfr
 *
 */
public class AsciiToBinary {
	
	/**
	 * The 8-bit binary code as String
	 */
	private String binary;

	/**
	 * Converts any ASCII into 8-bit binary code
	 * @param _ascii	the ASCII code
	 * @return	the 8-bit binary code
	 */
	public String getBinary(int _ascii) {
		binary = "0";
		
		if(_ascii/64 >= 1.0) {			
			_ascii = _ascii - 64;
			binary = binary + "1";		
		}else
			binary = binary + "0";
		
		if(_ascii/32 >= 1.0) {
			_ascii= _ascii - 32;
			binary = binary + "1";
		}else
			binary = binary + "0";
		
		if(_ascii/16 >= 1.0) {
			_ascii= _ascii - 16;
			binary = binary + "1";
		}else
			binary = binary+"0";
		
		if(_ascii/8 >= 1.0) {
			_ascii= _ascii - 8;
			binary = binary + "1";
		}else
			binary = binary + "0";
		
		if(_ascii/4 >= 1.0) {
			_ascii= _ascii - 4;
			binary = binary + "1";
		}else
			binary = binary + "0";
		
		if(_ascii/2 >= 1.0) {
			_ascii= _ascii - 2;
			binary = binary + "1";
		}else
			binary = binary + "0";
		
		if(_ascii/1 >= 1.0) {
			_ascii= _ascii - 1;
			binary = binary + "1";
		}else 
			binary = binary + "0";
		
		if(binary.equals("00000000")) {
			binary = "00111111";
		}
		return binary;
	}
}
