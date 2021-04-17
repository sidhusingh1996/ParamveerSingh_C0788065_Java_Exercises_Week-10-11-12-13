package com.lambton.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    public static String currencyFormater(double d){
        Locale india = new Locale("hi","IN");
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        return defaultFormat.format(d);
    }
}
