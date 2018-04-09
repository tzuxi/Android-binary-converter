package com.javisdce.tzuxi.binaryconverter.to_binary_algorythm;

/**
 * Created by maxfr on 08.04.2018.
 */

public class ConvertAlgorythm {
    public static String convert(String _text){
        TextToBinary tc = new TextToBinary();
        return tc.convertToBinary(_text);
    }

}
