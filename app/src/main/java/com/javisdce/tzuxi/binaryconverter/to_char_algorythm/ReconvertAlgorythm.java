package com.javisdce.tzuxi.binaryconverter.to_char_algorythm;

/**
 * Created by maxfr on 08.04.2018.
 */

public class ReconvertAlgorythm {
    public static String convert(String _binary){
        BinaryToText btt = new BinaryToText();
        return btt.convert(_binary);
    }
}
